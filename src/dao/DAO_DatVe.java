package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

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
