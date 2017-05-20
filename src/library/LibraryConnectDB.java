package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class LibraryConnectDB {
	private Connection conn;
	private Properties pro;
	private String url ;
	private String user;
	private String password;
	public Connection getConnectMySql(){
		//nạp driver
		
		this.user="root";
		this.password="";
		this.url="jdbc:mysql://localhost:3306/trungtamyte?useUnicode=true&characterEncoding=UTF-8";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//tạo chuỗi conn
			conn=DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("không thể nạp driver");
			e.printStackTrace();
		}
		return conn;
	}
	
}
