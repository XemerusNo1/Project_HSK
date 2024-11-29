package ConnectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectThongke {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/tendatabase"; // Địa chỉ cơ sở dữ liệu
    private static final String USER = "username"; // Tên người dùng
    private static final String PASSWORD = "password"; // Mật khẩu

    public int[] getMinMaxValues() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
            String sql = "SELECT MIN(doanh_thu) AS min, MAX(doanh_thu) AS max FROM DoanhThu"; // Truy vấn SQL
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                min = resultSet.getInt("min");
                max = resultSet.getInt("max");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new int[] { min, max }; // Trả về mảng chứa giá trị min và max
    }
}
