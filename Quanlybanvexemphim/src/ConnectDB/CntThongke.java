package ConnectDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CntThongke {
    private static final String DB_URL = "jdbc:mysql://localhost:1433/tendatabase"; // Địa chỉ cơ sở dữ liệu
    private static final String USER = "sa"; // Tên người dùng
    private static final String PASSWORD = "sapassword"; // Mật khẩu

    public List<Double> getDoanhThuTheoThang(int nam, int thang) {
        List<Double> doanhThuList = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
            String sql = "{call sp_GetDoanhThuTheoThang(?, ?)}";
            CallableStatement statement = connection.prepareCall(sql);
            statement.setInt(1, nam);
            statement.setInt(2, thang);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                doanhThuList.add(resultSet.getDouble("TongDoanhThu"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doanhThuList;
    }
}
