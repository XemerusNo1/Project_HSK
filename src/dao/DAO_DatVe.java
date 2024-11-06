package dao;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connection.MyConnection;

public class DAO_DatVe {
    private Connection con;

    public DAO_DatVe() {
        con = MyConnection.getInstance().getConnection();
    }

    public String getTenPhimByMaPhim(String maPhim) {
        String tieuDe = null;
        String sql = "{call sp_LayTenPhimTheoMaPhim(?)}"; // Gọi stored procedure với tham số

        try (CallableStatement stmt = con.prepareCall(sql)) {
            stmt.setString(1, maPhim);

            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                tieuDe = rs.getString("tenPhim");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tieuDe;
    }

    // Lấy giá phim theo mã phim
    public double getGiaPhimByMaPhim(String maPhim) {
        double giaPhim = 0.0;
        String sql = "{call sp_LayGiaPhimTheoMaPhim(?)}"; 

        try (CallableStatement stmt = con.prepareCall(sql)) {
            stmt.setString(1, maPhim);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                giaPhim = rs.getDouble("giaphim"); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return giaPhim;
    }

    // Lấy giá ghế theo mã ghế
    public double getGiaGheByMaGhe(String maGhe) {
        double giaGhe = 0.0;
        String sql = "{call sp_LayGiaGheTheoMaGhe(?)}"; // Gọi stored procedure để lấy giá ghế

        try (CallableStatement stmt = con.prepareCall(sql)) {
            stmt.setString(1, maGhe);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                giaGhe = rs.getDouble("giaGhe"); // Lấy giá trị từ cột giaGhe
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return giaGhe;
    }
    
    public int insertHoaDon(BigDecimal tongTien, Date ngayBan) {
        String sql = "INSERT INTO HoaDon (maNV, tongTien, ngayBan) VALUES (NULL, ?, ?)";
        int generatedId = -1; 

        try (PreparedStatement pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setBigDecimal(1, tongTien);
            pstmt.setDate(2, new java.sql.Date(ngayBan.getTime())); // Chuyển đổi Date thành java.sql.Date

            int rowsAffected = pstmt.executeUpdate(); // Thực hiện chèn

            // Lấy maHoaDon mới được tạo
            if (rowsAffected > 0) {
                try (ResultSet rs = pstmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        generatedId = rs.getInt(1); // Lấy giá trị ID vừa tạo
                    }
                }
            }
            System.out.println(rowsAffected + " rows inserted into HoaDon.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return generatedId; 
    }
    public void insertSanPhamOrder(String maSP, BigDecimal thanhTien, int soLuong, int maHoaDon) {
        String sql = "INSERT INTO SanPhamOrder (maSP, maHoaDon, SoLuong, thanhTien) VALUES (?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, maSP);
            pstmt.setInt(2, maHoaDon); // Sử dụng maHoaDon đã được truyền vào
            pstmt.setInt(3, soLuong);
            pstmt.setBigDecimal(4, thanhTien);

            int rowsAffected = pstmt.executeUpdate(); // Thực hiện chèn
            System.out.println(rowsAffected + " rows inserted into SanPhamOrder.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public int insertThoiGianChieu(String maPhim, String maPhong, String gioChieu, String ngayChieu) {
        String sql = "INSERT INTO ThoiGianChieu (maPhim, maPhong, GioChieu, NgayChieu) VALUES (?, ?, ?, ?)";
        int generatedId = -1;

        try (PreparedStatement pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, maPhim);
            pstmt.setString(2, maPhong);
            pstmt.setString(3, gioChieu);
            pstmt.setString(4, ngayChieu);

            int rowsAffected = pstmt.executeUpdate(); // Thực hiện chèn

            // Lấy maGioChieu mới được tạo
            if (rowsAffected > 0) {
                try (ResultSet rs = pstmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        generatedId = rs.getInt(1); // Lấy giá trị ID vừa tạo
                    }
                }
            }
            System.out.println(rowsAffected + " thêm thành công 1 cột dữ liệu vào bảng ThoiGianChieu.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return generatedId; // Trả về maGioChieu vừa được tạo
    }

    public void insertVePhim(int maGioChieu, int maHoaDon, double giaVe, int soLuongGheDaDat, String danhSachGhe) {
        String sql = "INSERT INTO VePhim (maGioChieu, maHoaDon, giaVe, SoLuongGheDaDat, danhSachGhe) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, maGioChieu);
            pstmt.setInt(2, maHoaDon);
            pstmt.setDouble(3, giaVe);  // Đổi thành setDouble
            pstmt.setInt(4, soLuongGheDaDat);
            pstmt.setString(5, danhSachGhe);

            int rowsAffected = pstmt.executeUpdate(); // Thực hiện chèn
            System.out.println(rowsAffected + " thêm thành công 1 cột dữ liệu vào bảng VePhim.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }




}
