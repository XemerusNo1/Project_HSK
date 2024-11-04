-- Tạo cơ sở dữ liệu
USE [master];
GO
CREATE DATABASE QuanLyRapPhim;
GO
USE QuanLyRapPhim;
GO

-- Table Phim
CREATE TABLE Phim (
    maPhim VARCHAR(50) PRIMARY KEY,
    tenPhim NVARCHAR(255),
	theLoai NVARCHAR(255),
    daoDien VARCHAR(100),
    ThoiLuong INT,
    moTa NVARCHAR(MAX),
	linkAnh VARCHAR(255),
	giaphim DECIMAL(10, 2)
);

GO









-- Table Phong
CREATE TABLE Phong (
    maPhong VARCHAR(50) PRIMARY KEY,
    tongSoGhe INT
);
GO

-- Table ThoiGianChieu
CREATE TABLE ThoiGianChieu (
    maGioChieu VARCHAR(50) PRIMARY KEY,
    maPhim VARCHAR(50),
    maPhong VARCHAR(50),
    GioChieu DATETIME,
    gioKetThuc DATETIME,
    giaXemPhim DECIMAL(18, 2),
    FOREIGN KEY (maPhim) REFERENCES Phim(maPhim),
    FOREIGN KEY (maPhong) REFERENCES Phong(maPhong) -- Liên kết Phòng với ThoiGianChieu
);
GO

-- Table Ghe
CREATE TABLE Ghe (
    maGhe VARCHAR(50) PRIMARY KEY,
    maPhong VARCHAR(50),
	loaiGhe NVARCHAR(50),
	giaGhe DECIMAL(10, 2),
    FOREIGN KEY (maPhong) REFERENCES Phong(maPhong)
);


GO

-- Table NhanVien
CREATE TABLE NhanVien (
    maNV INT IDENTITY(1,1) PRIMARY KEY,
    tenNV NVARCHAR(255),
    namSinh VARCHAR(15), -- Đổi kiểu dữ liệu thành DATE
    sdt VARCHAR(15),
    gioiTinh BIT,
	tenTaiKhoan VARCHAR(80),
	matKhau VARCHAR(30),
);

GO

-- Table HoaDon
CREATE TABLE HoaDon (
    maHoaDon VARCHAR(50) PRIMARY KEY,
    maNV INT,
    tongTien DECIMAL(18, 2),
    ngayBan DATE,
    FOREIGN KEY (maNV) REFERENCES NhanVien(maNV) -- Liên kết HoaDon với NhanVien
);
GO

-- Table VePhim
CREATE TABLE VePhim (
    maVe VARCHAR(50) PRIMARY KEY,
    maGioChieu VARCHAR(50),
    maHoaDon VARCHAR(50),
    giaVe DECIMAL(18, 2),
    SoLuongGheDaDat INT, -- Sửa lỗi chính tả
    FOREIGN KEY (maGioChieu) REFERENCES ThoiGianChieu(maGioChieu),
    FOREIGN KEY (maHoaDon) REFERENCES HoaDon(maHoaDon) -- Liên kết VePhim với HoaDon
);

GO

-- Table SanPham
CREATE TABLE SanPham (
    maSP VARCHAR(50) PRIMARY KEY,
    tenSP VARCHAR(100),
    giaBan DECIMAL(18, 2)
);
GO

-- Table SanPhamOrder
CREATE TABLE SanPhamOrder (
    maOrderSP VARCHAR(50) PRIMARY KEY,
    maSP VARCHAR(50),
    maHoaDon VARCHAR(50),
    SoLuong INT,
    thanhTien DECIMAL(18, 2),
    FOREIGN KEY (maSP) REFERENCES SanPham(maSP),
    FOREIGN KEY (maHoaDon) REFERENCES HoaDon(maHoaDon) -- Liên kết SanPhamOrder với HoaDon
);
GO

-- Table BaoCaoDoanhThu
CREATE TABLE BaoCaoDoanhThu (
    maBaoCao VARCHAR(50) PRIMARY KEY,
    TongDoanhThu DECIMAL(18, 2),
    maNV INT,
    FOREIGN KEY (maNV) REFERENCES NhanVien(maNV)
);
GO
--- in insert dữ liêu và viết hàm store sau phần tạo table tránh có khả năng gây ra lỗi 
--insert dữ liệu viết ở đây
--DELETE FROM Phim;

GO
INSERT INTO Phim (maPhim, tenPhim,theLoai, daoDien, ThoiLuong, moTa,linkAnh,giaphim)
VALUES 
	(N'P01',	N'Mộ Đom Đóm',		N'Hoạt hình',	N'Takahata Isao',89,		N'Hai anh em Seita và Setsuko mất mẹ sau cuộc thả bom dữ dội của \n\nkhông quân Mỹ. Cả hai phải vật lộn để tồn tại ở Nhật Bản hậu Thế chiến II. \n\nNhưng xã hội khắc nghiệt và chúng vật lộn tìm kiếm thức ăn cũng như \n\nthoát khỏi những khó khăn giữa chiến tranh.',N'src\\Images\\MoDomDom.jpg', 70000.00 ),
	(N'P02',	N'KUMANTHONG',	N'Kinh dị',		N'Xian Lim',121,	N'Sau cái chết của con trai, Sarah tìm đến vùng đất tâm linh Thái Lan, khẩn cần một thầy tu nổi tiếng sử dụng tro cốt đứa bé để tạo nên bức tượng Kumanthong. Bức tượng làm sống lại tình mẫu tử, nhưng triệu hồi những oan hồn ngạ quỷ đến đoạt xác cả gia đình Sarah.',N'src\\Images\\MoDomDom.jpg', 60000.00),
	(N'P03',	N'Qủy Ăn Tạng 2',	N'Kinh dị',		N'Taweewat Wantha',	143,	N'Ba năm sau cái chết của Yam, Yak vẫn tiếp tục săn lùng linh hồn bí ẩn mặc áo choàng đen. Gặp một cô gái có triệu chứng giống Yam, Yak phát hiện ra người bảo vệ linh hồn, pháp sư ẩn dật Puang, sống trong một khu rừng đầy nguy hiểm. Giữa những phép thuật ma quỷ và những sinh vật nguy hiểm...',N'src\\Images\\MoDomDom.jpg', 75000.00),
	(N'P04',	N'JOKER: FOLIE À DEUX',		N'Tâm lý',		N'Todd Phillips',123,		N'Joker: Folie à Deux" đưa Arthur Fleck đến trại tâm thần Arkham trong khi chờ xét xử cho những tội ác của hắn với tư cách là Joker. Trong lúc vật lộn với hai bản ngã của mình, Arthur không chỉ tìm thấy tình yêu đích thực mà còn khám phá ra âm nhạc luôn tồn tại trong con người hắn.',N'src\\Images\\MoDomDom.jpg', 80000.00),
	(N'P05',	N'CÁM - CHUYỆN CHƯA KỂ ',	N'Kinh dị',		N'Trần Hữu Tấn',	111,	N'Câu chuyện phim là dị bản kinh dị đẫm máu lấy cảm hứng từ truyện cổ tích nổi tiếng Tấm Cám, nội dung chính của phim xoay quanh Cám - em gái cùng cha khác mẹ của Tấm đồng thời sẽ có nhiều nhân vật và chi tiết sáng tạo, gợi cảm giác vừa lạ vừa quen cho khán giả.',N'src\\Images\\MoDomDom.jpg', 55000.00),
	(N'P06',	N'TRANSFORMERS MỘT',	N'Hoạt hình',	N'Josh Cooley',	113,		N'Câu chuyện về nguồn gốc chưa từng được hé lộ của Optimus Prime và Megatron. Hai nhân vật được biết đến như những kẻ thù truyền kiếp, nhưng cũng từng là những người anh em gắn bó, đã thay đổi vận mệnh của Cybertron mãi mãi.',N'src\\Images\\MoDomDom.jpg', 70000.00),
	(N'P07',	N'HAI MUỐI',	N'Tình cảm',	N'Josh Cooley',			118,	N'Muối – một cô gái mất mẹ từ khi vừa lọt lòng và lớn lên trong tình yêu thương của cha tại vùng đất xã đảo Thiềng Liềng. Bước ngoặt của hai cha con bắt đầu khi Muối trưởng thành, quyết định lên thành phố học tập và làm việc với ước mơ đổi đời để phụ giúp cha.',N'src\\Images\\MoDomDom.jpg', 65000.00),
	(N'P08',	N'LOOK BACK',	N'Hoạt hình',	N'Kiyotaka Oshiyama',	98,		N'Fujino tự tin thái quá, trong khi Kyomoto lại sống khép kín, cả hai dường như không thể khác biệt hơn, nhưng tình yêu mãnh liệt dành cho manga đã trở thành sợi dây duy nhất kết nối họ. Thế nhưng, một ngày nọ, một biến cố đã xảy ra, khiến thế giới của họ hoàn toàn thay đổi…',N'src\\Images\\MoDomDom.jpg', 50000.00),
	(N'P09',	N'ROBOT HOANG DÃ',		N'Hoạt hình',	N'Chris Sanders',128,		N'Cuộc phiêu lưu hoành tráng theo chân hành trình của một robot — đơn vị ROZZUM 7134, gọi tắt là Roz.Roz vô tình dạt vào hoang đảo sau một sự cố và nơi đây trở thành địa điểm sống mới của cô. Tại đây, Roz kết thân và nhận nuôi một chú ngỗng con, đặt tên là Brightbill..',N'src\\Images\\MoDomDom.jpg', 85000.00);
-- insert dữ liệu cho table phòng
Go
	INSERT INTO Phong (maPhong, tongSoGhe) VALUES 
	('Phong01', 50),
	('Phong02', 50),
	('Phong03', 50),
	('Phong04', 50),
	('Phong05', 50);
Go
INSERT INTO Ghe (maGhe, maPhong, loaiGhe, giaGhe) VALUES
    ('A01', 'Phong01', N'Ghế thường', 0.00),
    ('A02', 'Phong01', N'Ghế thường', 0.00),
    ('A03', 'Phong01', N'Ghế thường', 0.00),
    ('A04', 'Phong01', N'Ghế thường', 0.00),
    ('A05', 'Phong01', N'Ghế thường', 0.00),
    ('A06', 'Phong01', N'Ghế thường', 0.00),
    ('A07', 'Phong01', N'Ghế thường', 0.00),
    ('A08', 'Phong01', N'Ghế thường', 0.00),
    ('A09', 'Phong01', N'Ghế thường', 0.00),

    ('B01', 'Phong01', N'Ghế thường', 0.00),
    ('B02', 'Phong01', N'Ghế thường', 0.00),
    ('B03', 'Phong01', N'Ghế thường', 0.00),
    ('B04', 'Phong01', N'Ghế thường', 0.00),
    ('B05', 'Phong01', N'Ghế thường', 0.00),
    ('B06', 'Phong01', N'Ghế thường', 0.00),
    ('B07', 'Phong01', N'Ghế thường', 0.00),
    ('B08', 'Phong01', N'Ghế thường', 0.00),
    ('B09', 'Phong01', N'Ghế thường', 0.00),

    ('C01', 'Phong01', N'Ghế thường', 0.00),
    ('C02', 'Phong01', N'Ghế thường', 0.00),
    ('C03', 'Phong01', N'Ghế thường', 0.00),
    ('C04', 'Phong01', N'Ghế thường', 0.00),
    ('C05', 'Phong01', N'Ghế thường', 0.00),
    ('C06', 'Phong01', N'Ghế thường', 0.00),
    ('C07', 'Phong01', N'Ghế thường', 0.00),
    ('C08', 'Phong01', N'Ghế thường', 0.00),
    ('C09', 'Phong01', N'Ghế thường', 0.00),

    ('D01', 'Phong01', N'Ghế thường', 0.00),
    ('D02', 'Phong01', N'Ghế thường', 0.00),
    ('D03', 'Phong01', N'Ghế thường', 0.00),
    ('D04', 'Phong01', N'Ghế thường', 0.00),
    ('D05', 'Phong01', N'Ghế thường', 0.00),
    ('D06', 'Phong01', N'Ghế thường', 0.00),
    ('D07', 'Phong01', N'Ghế thường', 0.00),
    ('D08', 'Phong01', N'Ghế thường', 0.00),
    ('D09', 'Phong01', N'Ghế thường', 0.00),

    ('E01', 'Phong01', N'Ghế thường', 0.00),
    ('E02', 'Phong01', N'Ghế thường', 0.00),
    ('E03', 'Phong01', N'Ghế thường', 0.00),
    ('E04', 'Phong01', N'Ghế thường', 0.00),
    ('E05', 'Phong01', N'Ghế thường', 0.00),
    ('E06', 'Phong01', N'Ghế thường', 0.00),
    ('E07', 'Phong01', N'Ghế thường', 0.00),
    ('E08', 'Phong01', N'Ghế thường', 0.00),
    ('E09', 'Phong01', N'Ghế thường', 0.00),

    ('F01', 'Phong01', N'Ghế Đôi', 50000.00),
    ('F02', 'Phong01', N'Ghế Đôi', 50000.00),
    ('F03', 'Phong01', N'Ghế Đôi', 50000.00),
    ('F04', 'Phong01', N'Ghế Đôi', 50000.00),
    ('F05', 'Phong01', N'Ghế Đôi', 50000.00);


Go
INSERT INTO SanPham (maSP, tenSP, giaBan) VALUES
	('SP01', N'Bắp caramel', 25000.00),
	('SP02', N'Bắp Phô mai', 25000.00),
	('SP03', N'Snack', 10000.00),
	('SP04', N'CoCaCoLa', 10000.00);



GO
-- store viết ở đây 
--store NhanVien
CREATE PROCEDURE sp_KiemTraDangNhap
    @tenTaiKhoan VARCHAR(80),
    @matKhau VARCHAR(30)
AS
BEGIN
    SET NOCOUNT ON;

    SELECT * 
    FROM dbo.NhanVien
    WHERE tenTaiKhoan = @tenTaiKhoan AND matKhau = @matKhau;
END;
--store lấy dữ liệu phim lên thông tin phim
GO
CREATE PROCEDURE sp_LayThongTinPhimTheoMaPhim
    @maPhim VARCHAR(50)
AS
BEGIN
    -- Lấy thông tin phim theo mã phim
    SELECT 
        maPhim,
		theLoai,
        tenPhim,
        daoDien,
        ThoiLuong,
        moTa,
        namPhatHanh
    FROM 
        Phim
    WHERE 
        maPhim = @maPhim;
END;
-- lấy tiêu đề theo mã phim
GO
CREATE PROCEDURE sp_LayTenPhimTheoMaPhim
    @maPhim VARCHAR(50)
AS
BEGIN
    SELECT 
        tenPhim
    FROM 
        Phim
    WHERE 
        maPhim = @maPhim;
END;
--
GO
-- lấy Thể loại  
CREATE PROCEDURE sp_LayTheLoaiTheoMaPhim
    @maPhim VARCHAR(50)
AS
BEGIN
    SELECT 
        theLoai
    FROM 
        Phim
    WHERE 
        maPhim = @maPhim;
END;
GO
-- lấy đạo diễn  
CREATE PROCEDURE sp_LayDaoDienTheoMaPhim
    @maPhim VARCHAR(50)
AS
BEGIN
    SELECT 
        daoDien
    FROM 
        Phim
    WHERE 
        maPhim = @maPhim;
END;
GO
-- lấy Thời lượng  
CREATE PROCEDURE sp_LayThoiLuongTheoMaPhim
    @maPhim VARCHAR(50)
AS
BEGIN
    SELECT 
        ThoiLuong
    FROM 
        Phim
    WHERE 
        maPhim = @maPhim;
END;
Go
-- lấy mo ta 
CREATE PROCEDURE sp_LayMoTaTheoMaPhim
    @maPhim VARCHAR(50)
AS
BEGIN
    SELECT 
        moTa
    FROM 
        Phim
    WHERE 
        maPhim = @maPhim;
END;
GO
--Lấy link ảnh
CREATE PROCEDURE sp_LayLinkAnhTheoMaPhim
    @maPhim VARCHAR(50)
AS
BEGIN
    SELECT 
        linkAnh
    FROM 
        Phim
    WHERE 
        maPhim = @maPhim;
END;
EXEC sp_LayLinkAnhTheoMaPhim @maPhim = 'P01';
