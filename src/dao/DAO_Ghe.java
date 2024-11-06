package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.MyConnection;

public class DAO_Ghe {
    private Connection con;

    public DAO_Ghe() {
        con = MyConnection.getInstance().getConnection();
    }

    // Phương thức lấy giá tiền cho sản phẩm dựa trên mã sản phẩm
    public String getGiaSanPhamTheoMaSP(String maSP) {
        String sql = "SELECT giaBan FROM SanPham WHERE maSP = ?";
        String giaBan = null;

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setString(1, maSP); 
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                giaBan = resultSet.getBigDecimal("giaBan").toString(); 
            }

        } catch (SQLException e) {
            e.printStackTrace(); 
        }

        return giaBan; 
    }
    public String getTenPhimByMaPhim(String maPhim) {
        String tieuDe = null;
        String sql = "{call sp_LayTenPhimTheoMaPhim(?)}"; // Gọi stored procedure với tham số

        try (CallableStatement stmt = con.prepareCall(sql)) {
            // Thiết lập tham số đầu vào cho stored procedure
            stmt.setString(1, maPhim);

            // Thực thi stored procedure
            ResultSet rs = stmt.executeQuery();
            
            // Lấy kết quả nếu có
            if (rs.next()) {
                tieuDe = rs.getString("tenPhim");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tieuDe;
    }
 // Phương thức lấy danh sách ghế dựa trên mã phòng, giờ chiếu và ngày chiếu
//    public List<String> getDanhSachGhe(String maPhong, String gioChieu, String ngayChieu) {
//        List<String> danhSachGhe = new ArrayList<>();
//        String sql = "{call GetDanhSachGhe(?, ?, ?)}"; // Gọi stored procedure với tham số
//
//        try (CallableStatement stmt = con.prepareCall(sql)) {
//            // Thiết lập các tham số cho stored procedure
//            stmt.setString(1, maPhong);
//            stmt.setString(2, gioChieu);
//            stmt.setString(3, ngayChieu);
//
//            // Thực thi stored procedure và lấy kết quả
//            ResultSet rs = stmt.executeQuery();
//
//            // Kiểm tra và xử lý kết quả
//            if (rs.next()) {
//                String gheString = rs.getString("danhSachGhe"); // Lấy danh sách ghế dưới dạng chuỗi
//                if (gheString != null && !gheString.isEmpty()) {
//                    // Tách chuỗi thành danh sách ghế
//                    String[] gheArray = gheString.split(", ");
//                    for (String ghe : gheArray) {
//                        danhSachGhe.add(ghe.trim()); // Thêm từng ghế vào danh sách và loại bỏ khoảng trắng
//                    }
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return danhSachGhe;
//    }
}
