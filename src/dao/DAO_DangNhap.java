package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.MyConnection;

public class DAO_DangNhap {
    private Connection conn;

    public DAO_DangNhap() {
        conn = MyConnection.getInstance().getConnection();
    }

    // Phương thức kiểm tra đăng nhập
    public boolean kiemTraDangNhap(String tenTaiKhoan, String matKhau) {
        String sql = "{call sp_KiemTraDangNhap(?, ?)}";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, tenTaiKhoan);
            ps.setString(2, matKhau);
            ResultSet rs = ps.executeQuery();
            
            // Nếu có ít nhất một dòng dữ liệu trả về, tức là thông tin đăng nhập là chính xác
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Nếu có lỗi xảy ra, trả về false
        }
    }
}
