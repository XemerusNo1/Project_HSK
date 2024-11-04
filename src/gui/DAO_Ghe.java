package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
}
