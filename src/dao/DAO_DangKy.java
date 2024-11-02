package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.MyConnection;

public class DAO_DangKy {
	private Connection conn;
	public DAO_DangKy() {
		conn = MyConnection.getInstance().getConnection();
	}
	public boolean dangKyNhanVien(String hoTen, String namSinh, int sdt, boolean gioiTinh, String tenTaiKhoan, String matKhau) {
        String sql = "INSERT INTO NhanVien (tenNV, namSinh, sdt, gioiTinh, tenTaiKhoan, matKhau) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, hoTen);
            ps.setString(2, namSinh);
            ps.setString(3, String.valueOf(sdt));
            ps.setBoolean(4, gioiTinh);
            ps.setString(5, tenTaiKhoan);
            ps.setString(6, matKhau);

            int rowsInserted = ps.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean kiemTraTenDangNhap(String tenTaiKhoan) {
        String sql = "SELECT 1 FROM NhanVien WHERE tenTaiKhoan = ?";
        
        try (Connection conn = MyConnection.getInstance().getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, tenTaiKhoan);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
