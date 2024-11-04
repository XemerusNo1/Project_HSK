USE QuanLyRapPhim;
GO

SELECT ngayBan
FROM [QuanLyRapPhim].[dbo].[HoaDon]

SELECT GioChieu
FROM [QuanLyRapPhim].[dbo].[ThoiGianChieu];

CREATE PROCEDURE GetRevenueWithInvoiceDate
    @Year INT
AS
BEGIN
    SELECT 
        ROW_NUMBER() OVER (ORDER BY SUM(HoaDon.tongTien) DESC) AS STT,
        YEAR(HoaDon.ngayBan) AS Nam,
        SUM(HoaDon.tongTien) AS DoanhThu
    FROM 
        HoaDon
    WHERE 
        YEAR(HoaDon.ngayBan) = @Year
    GROUP BY 
        YEAR(HoaDon.ngayBan);
END;

EXEC GetRevenueWithInvoiceDate @Year = 2023; 


DROP PROCEDURE IF EXISTS GetRevenueWithInvoiceDate;


CREATE PROCEDURE GetTotalRevenue
    @Year INT
AS
BEGIN
    SET NOCOUNT ON;

    DECLARE @TotalRevenue DECIMAL(18, 2);

    SELECT @TotalRevenue = SUM(tongTien)
    FROM HoaDon
    WHERE YEAR(ngayBan) = @Year;

    -- Kiểm tra xem đã có báo cáo cho năm này chưa
    IF EXISTS (SELECT 1 FROM BaoCaoDoanhThu WHERE maBaoCao = 'BC' + RIGHT('0' + CAST(@Year AS VARCHAR(4)), 4))
    BEGIN
        -- Cập nhật tổng doanh thu
        UPDATE BaoCaoDoanhThu
        SET TongDoanhThu = @TotalRevenue
        WHERE maBaoCao = 'BC' + RIGHT('0' + CAST(@Year AS VARCHAR(4)), 4);
    END
    ELSE
    BEGIN
        -- Thêm mới báo cáo doanh thu
        INSERT INTO BaoCaoDoanhThu (maBaoCao, TongDoanhThu, maNV)
        VALUES ('BC' + RIGHT('0' + CAST(@Year AS VARCHAR(4)), 4), @TotalRevenue, NULL); -- Thay NULL bằng mã nhân viên nếu cần
    END
END;


CREATE PROCEDURE GetRevenueForAllYears
AS
BEGIN
    SET NOCOUNT ON;

    SELECT 
        ROW_NUMBER() OVER (ORDER BY YEAR(ngayBan)) AS STT,
        YEAR(ngayBan) AS Nam,
        SUM(tongTien) AS DoanhThu
    FROM 
        HoaDon
    GROUP BY 
        YEAR(ngayBan);
END;

CREATE PROCEDURE GetRevenueForAllMonthInYear
    @Year INT
AS
BEGIN
    SET NOCOUNT ON;

    SELECT 
        ROW_NUMBER() OVER (ORDER BY MONTH(ngayBan)) AS STT,
        MONTH(ngayBan) AS Thang,
        @Year AS Nam,  
        SUM(tongTien) AS DoanhThu
    FROM 
        HoaDon
    WHERE 
        YEAR(ngayBan) = @Year
    GROUP BY 
        MONTH(ngayBan)
    ORDER BY 
        Thang;
END;


DROP PROCEDURE IF EXISTS GetRevenueForAllMonthInYear;
EXEC GetRevenueForAllMonthInYear @Year = 2024; -- Thay 2023 bằng năm bạn muốn kiểm tra

CREATE PROCEDURE GetDailyRevenueInMonth
    @Year INT,
    @Month INT
AS
BEGIN
    SET NOCOUNT ON;

    SELECT 
        ROW_NUMBER() OVER (ORDER BY DAY(ngayBan)) AS STT,
        CONVERT(VARCHAR(10), ngayBan, 103) AS Ngay, -- Định dạng ngày/tháng/năm
        SUM(tongTien) AS DoanhThu
    FROM 
        HoaDon
    WHERE 
        YEAR(ngayBan) = @Year AND MONTH(ngayBan) = @Month
    GROUP BY 
        ngayBan -- Nhóm theo ngày để có đầy đủ ngày/tháng/năm
    ORDER BY 
        ngayBan;
END;


DROP PROCEDURE IF EXISTS GetDailyRevenueInMonth;
EXEC GetDailyRevenueInMonth @Year = 2024 , @Month =1;



CREATE PROCEDURE GetRevenueBetweenDates
    @FromDate DATE,
    @ToDate DATE
AS
BEGIN
    SET NOCOUNT ON;

    SELECT 
        ROW_NUMBER() OVER (ORDER BY ngayBan) AS STT,
        ngayBan AS ThoiGian,
        SUM(tongTien) AS DoanhThu
    FROM 
        HoaDon
    WHERE 
        ngayBan BETWEEN @FromDate AND @ToDate
    GROUP BY 
        ngayBan
    ORDER BY 
        ngayBan;
END;

DECLARE @FromDate DATE = '2024-01-01';  -- Thay đổi ngày bắt đầu theo nhu cầu
DECLARE @ToDate DATE = '2024-01-31';    -- Thay đổi ngày kết thúc theo nhu cầu

EXEC GetRevenueBetweenDates @FromDate, @ToDate;
