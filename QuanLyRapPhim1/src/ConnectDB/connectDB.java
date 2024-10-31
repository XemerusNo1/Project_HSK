package ConnectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectDB {
	public static Connection con=null;
	private static connectDB instance= new connectDB();
	
	public static connectDB getInstance() {
		return instance;
	}
	
	public static Connection getConnection()
	{
		Connection con=null;
		String ulr ="jdbc:sqlserver://localhost:1433; databaseName=QuanLyRapPhim;user=sa;password=123;"
                + "encrypt=true;trustServerCertificate=true";
		try {
			con=DriverManager.getConnection(ulr);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public static void closeConnection(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	public static void main(String[] args) {
//		Connection con = getConnection();
//		if(con!=null)
//			System.out.println("Thanh cong");
//		else
//			System.out.println("Fail");
//	}

}
