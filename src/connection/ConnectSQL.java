package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectSQL {
    public static Connection con = null;
    private static ConnectSQL instance = new ConnectSQL();

    public static ConnectSQL getInstance() {
        return instance;
    }

    public void connect() {
        String url = "jdbc:sqlserver://VANBAOVR:1433;DatabaseName=QuanLyCuaHangQuanAo1;encrypt=true;trustServerCertificate=true";
        String user = "sa";
        String password = "sapassword";

        try {
            // Assign the connection to the static field
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void disconnect() {
        if(con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static Connection getConnection() {
        return con;
    }
    public static void main(String[] args) {
        // Lấy instance của ConnectSQL
        ConnectSQL connectSQL = ConnectSQL.getInstance();
        
        // Kết nối đến cơ sở dữ liệu
        connectSQL.connect();
        
        // Kiểm tra xem kết nối có thành công hay không
        if (ConnectSQL.getConnection() != null) {
            System.out.println("Kết nối thành công!");
        } else {
            System.out.println("Kết nối thất bại!");
        }

        // Đóng kết nối
        ConnectSQL.disconnect();
    }
}
