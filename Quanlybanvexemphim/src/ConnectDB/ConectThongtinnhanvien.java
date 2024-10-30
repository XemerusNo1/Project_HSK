package ConnectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JLabel; // Import JLabel nếu bạn sử dụng nó

public class ConectThongtinnhanvien {
    
    private JLabel txtmanv;  // Giả sử bạn đã định nghĩa các JLabel ở nơi khác
    private JLabel txtten;
    private JLabel txtnamsinh;
    private JLabel txtsdt;
    private JLabel txtvaitro;

    public void ConectThongtinnhanvien(int employeeId) {
        // Thông tin kết nối cơ sở dữ liệu
        String url = "jdbc:mysql://localhost:3306/your_database"; // Chú ý sửa port nếu cần
        String user = "your_username"; // Thay thế bằng tên người dùng của bạn
        String password = "your_password"; // Thay thế bằng mật khẩu của bạn

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
            // Kết nối đến cơ sở dữ liệu
            conn = DriverManager.getConnection(url, user, password);

            // Truy vấn dữ liệu
            String sql = "SELECT ma_nv, ten_nv, nam_sinh, sdt, vai_tro FROM nhan_vien WHERE ma_nv = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, employeeId); // Thay thế employeeId bằng ID bạn muốn tìm
            rs = pstmt.executeQuery();

            // Xử lý kết quả
            if (rs.next()) {
                txtmanv.setText(rs.getString("ma_nv"));
                txtten.setText(rs.getString("ten_nv"));
                txtnamsinh.setText(rs.getString("nam_sinh"));
                txtsdt.setText(rs.getString("sdt"));
                txtvaitro.setText(rs.getString("vai_tro"));
            } else {
                System.out.println("Không tìm thấy nhân viên với ID: " + employeeId);
            }
        } catch (Exception e) {
            e.printStackTrace(); // In ra lỗi nếu có
        } finally {
            // Đóng kết nối và giải phóng tài nguyên
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (Exception ex) {
                ex.printStackTrace(); // In ra lỗi nếu có
            }
        }
    }
}
