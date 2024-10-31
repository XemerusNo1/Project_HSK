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
    tieuDe NVARCHAR(255),
    daoDien VARCHAR(100),
    ThoiLuong INT,
    moTa TEXT,
    namPhatHanh INT
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
    trangThai BIT,
	loaiGhe NVARCHAR(50),
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
