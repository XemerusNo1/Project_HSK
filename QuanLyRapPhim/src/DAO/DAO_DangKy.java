package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import ConnectDB.connectDB;
import Entity.DangKy;

public class DAO_DangKy {

    // Thêm một tài khoản mới vào bảng NhanVien
    public boolean themTaiKhoan(DangKy dangKy) {
        String sql = "INSERT INTO NhanVien (tenDangNhap, hoTen, sdt, gioiTinh, namSinh, matKhau) VALUES (?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = connectDB.getInstance().getConnection();  // sửa chỗ này
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, dangKy.getTenDangNhap());
            ps.setString(2, dangKy.getHoTen());
            ps.setInt(3, dangKy.getSDT());
            ps.setBoolean(4, dangKy.isGioiTinh());
            ps.setDate(5, java.sql.Date.valueOf(dangKy.getNamSinh()));
            ps.setString(6, dangKy.getMatKhau());

            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0; // Trả về true nếu thêm thành công
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    // Kiểm tra xem tên đăng nhập đã tồn tại trong bảng NhanVien chưa
    public boolean kiemTraTenDangNhap(String tenDangNhap) {
        String sql = "SELECT 1 FROM NhanVien WHERE tenDangNhap = ?";
        
        try (Connection conn = connectDB.getInstance().getConnection(); // sửa chỗ này
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, tenDangNhap);
            ResultSet rs = ps.executeQuery();
            return rs.next(); // Trả về true nếu tồn tại, ngược lại là false
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
