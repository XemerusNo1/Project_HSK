package DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Entity.RevenueRecord;
public class DAO_ThongKe {
	private Connection connection;

	public DAO_ThongKe(Connection connection) {
		this.connection = connection;
	}

// xử lý năm
	public List<RevenueRecord> doanhThuCacNam() {
		List<RevenueRecord> revenueRecords = new ArrayList<>();
		String sql = "{call laydoanhthucacnam()}"; // New stored procedure

		try (CallableStatement cstmt = connection.prepareCall(sql)) {
			ResultSet rs = cstmt.executeQuery();

			while (rs.next()) {
				int stt = rs.getInt("STT");
				String year = rs.getString("Nam");
				double totalRevenue = rs.getDouble("DoanhThu");
				RevenueRecord record = new RevenueRecord(stt, year, totalRevenue);
				revenueRecords.add(record);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return revenueRecords;
	}

	// xử lý tháng
	public List<RevenueRecord> doanhThuCacThang(String year) {

		    List<RevenueRecord> revenueRecords = new ArrayList<>();
		    String sql = "{call laydoanhthucacthang(?)}";

		    try (CallableStatement cstmt = connection.prepareCall(sql)) {
		        cstmt.setInt(1, Integer.parseInt(year)); // Đảm bảo truyền vào kiểu INT
		        ResultSet rs = cstmt.executeQuery();

		        while (rs.next()) {
		            int stt = rs.getInt("STT");
		            int thang = rs.getInt("Thang"); // Thay đổi kiểu dữ liệu về int
		            int nam = rs.getInt("Nam"); // Lấy năm
		            String thoigian = thang + "/" + nam; // Tạo chuỗi tháng/năm
		            double totalRevenue = rs.getDouble("DoanhThu");

		            RevenueRecord record = new RevenueRecord(stt, thoigian, totalRevenue);
		            revenueRecords.add(record);
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return revenueRecords;
		}


	// xử lý ngày
	public List<RevenueRecord> doanhThuCacNgayTrongThang(String year, String month) throws SQLException {
		String query = "{CALL laydoanhthucacngaytrongthang(?, ?)}"; // Thủ tục lưu trữ
		try (PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setInt(1, Integer.parseInt(year));
			statement.setInt(2, Integer.parseInt(month));

			ResultSet rs = statement.executeQuery();
			List<RevenueRecord> revenueRecords = new ArrayList<>();

			while (rs.next()) {
				int stt = rs.getInt("STT");
				 String ngay = rs.getString("Ngay"); // Thay đổi đây để lấy Ngày
				double totalRevenue = rs.getDouble("DoanhThu");

				RevenueRecord record = new RevenueRecord(stt, ngay, totalRevenue);
//                record.setStt(rs.getInt("STT"));
//                record.setThoigian(rs.getInt("Ngay")); // Ngày
//                record.setDoanhThu(rs.getDouble("DoanhThu")); // Doanh thu
				revenueRecords.add(record);
			}

			return revenueRecords;
		}
	}
	// xử lý khoảng ngày


	public List<RevenueRecord> doanhThuCacNgay(Date fromDate, Date toDate) {
		// TODO Auto-generated method stub
	    List<RevenueRecord> revenueRecords = new ArrayList<>();
	    String sql = "{call Getdoanhthugiuacacngay(?, ?)}";

	    try (CallableStatement cstmt = connection.prepareCall(sql)) {
	        cstmt.setDate(1, new java.sql.Date(fromDate.getTime()));
	        cstmt.setDate(2, new java.sql.Date(toDate.getTime()));
	        ResultSet rs = cstmt.executeQuery();

	        while (rs.next()) {
	            int stt = rs.getInt("STT");
	            Date thoiGian = rs.getDate("ThoiGian");
	            double totalRevenue = rs.getDouble("DoanhThu");

	            RevenueRecord record = new RevenueRecord(stt, thoiGian.toString(), totalRevenue);
	            revenueRecords.add(record);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return revenueRecords;
	}


}