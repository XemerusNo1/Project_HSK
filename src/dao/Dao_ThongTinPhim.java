package dao;

import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.MyConnection;

public class Dao_ThongTinPhim {
    private Connection con;

    public Dao_ThongTinPhim() {
        con = MyConnection.getInstance().getConnection();
    }
// lấy tiêu đề 
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
    public String getTheLoaiByMaPhim(String maPhim) {
        String theLoai = null;
        String sql = "{call sp_LayTheLoaiTheoMaPhim(?)}"; // Gọi stored procedure với tham số

        try (CallableStatement stmt = con.prepareCall(sql)) {
            // Thiết lập tham số đầu vào cho stored procedure
            stmt.setString(1, maPhim);

            // Thực thi stored procedure
            ResultSet rs = stmt.executeQuery();
            
            // Lấy kết quả nếu có
            if (rs.next()) {
            	theLoai = rs.getString("theLoai");
            }
        } catch (SQLException e) { 
            e.printStackTrace();
        }

        return theLoai;
    }
    // lấy đạo diễn
    public String getDaoDienByMaPhim(String maPhim) {
        String daoDien = null;
        String sql = "{call sp_LayDaoDienTheoMaPhim(?)}"; // Gọi stored procedure với tham số
        try (CallableStatement stmt = con.prepareCall(sql)) {
            stmt.setString(1, maPhim);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
            	daoDien = rs.getString("daoDien");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return daoDien; 
    }
    
    
    // lấy Thời lượng phim
    public String getThoiLuongByMaPhim(String maPhim) {
        String thoiluong = null;
        String sql = "{call sp_LayThoiLuongTheoMaPhim(?)}"; // Gọi stored procedure với tham số

        try (CallableStatement stmt = con.prepareCall(sql)) {
            stmt.setString(1, maPhim);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
            	thoiluong = rs.getString("ThoiLuong");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return thoiluong;
    }
    
    // lấy Lấy mô tả
    public String getMoTaByMaPhim(String maPhim) {
        String mota = null;
        String sql = "{call sp_LayMoTaTheoMaPhim(?)}"; // Gọi stored procedure với tham số

        try (CallableStatement stmt = con.prepareCall(sql)) {
            stmt.setString(1, maPhim);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
            	mota = rs.getString("moTa");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return mota;
    }
    // Lấy link ảnh
    public String getLinkAnhByMaPhim(String maPhim) {
        String linkAnh = null;
        String sql = "{call sp_LayLinkAnhTheoMaPhim(?)}"; // Gọi stored procedure với tham số

        try (CallableStatement stmt = con.prepareCall(sql)) {
            stmt.setString(1, maPhim);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                linkAnh = rs.getString("linkAnh");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return linkAnh;
    }
}
