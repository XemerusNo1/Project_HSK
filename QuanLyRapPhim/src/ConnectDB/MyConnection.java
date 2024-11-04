package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	private static MyConnection instance;
	private static Connection connection;
	private MyConnection() {
//     String url = "jdbc:sqlserver://VANBAOVR:1433;DatabaseName=QuanLyCuaHangQuanAo;trustServerCertificate=true;integratedSecurity=true;";
      String url = "jdbc:sqlserver://localhost:1433;DatabaseName=QuanLyRapPhim;encrypt=true;trustServerCertificate=true";
      String user = "sa";
      String password = "123";

       try {       	
           connection = DriverManager.getConnection(url,user, password);
           System.out.println("Kết nối database thành công");
       } catch (SQLException e1) {
       	System.out.println("Kết nối database không thành công");
           e1.printStackTrace();
       }
   }
	public synchronized static MyConnection getInstance() {
        if(instance == null)
            instance = new MyConnection();
        return instance;
    }
	public Connection getConnection() {
        return connection;
    }


}
