package seminarski;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection; 

public class ConnectionClass {
	
	public static Connection getConnection() {
		try {
			return (Connection) DriverManager.getConnection("jdbc:sqlite:sqlite/zoovrt.db");
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
