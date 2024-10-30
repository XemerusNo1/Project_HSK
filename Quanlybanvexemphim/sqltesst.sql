CREATE DATABASE thong_ke_db;

-- Sử dụng cơ sở dữ liệu vừa tạo
USE thong_ke_db;

-- Tạo bảng thống kê
CREATE TABLE thong_ke (
    ma_bao_cao INT IDENTITY(1,1) PRIMARY KEY,  -- Mã báo cáo tự động tăng
    ma_hoa_don INT NOT NULL,                     -- Mã hóa đơn
    tong_tien DECIMAL(10, 2) NOT NULL,           -- Tổng tiền
    ngay INT NOT NULL,                            -- Ngày
    thang INT NOT NULL,                           -- Tháng
    nam INT NOT NULL                              -- Năm
);
INSERT INTO thong_ke (ma_hoa_don, tong_tien, ngay, thang, nam)
VALUES (12345, 150000.00, 30, 10, 2024);
GO
INSERT INTO thong_ke (ma_hoa_don, tong_tien, ngay, thang, nam)
VALUES (12346, 200000.00, 31, 10, 2024);
GO
INSERT INTO thong_ke (ma_hoa_don, tong_tien, ngay, thang, nam)
VALUES (12347, 300000.00, 1, 11, 2024);
GO

CREATE PROCEDURE sp_GetDoanhThuTheoThang
    @Nam INT,
    @Thang INT
AS
BEGIN
    SELECT 
        ma_hoa_don, 
        SUM(tong_tien) AS TongDoanhThu
    FROM 
        thong_ke
    WHERE 
        nam = @Nam AND thang = @Thang
    GROUP BY 
        ma_hoa_don
END;

