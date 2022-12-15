package javaPractice.ch_11.School.copy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {

	public Connection connection = null;
	
	public void getConnection() {
		
			try {
				String url = "jdbc:mariadb://localhost:5000/school_sample";
				String user = "root";
				String password = "1234";
				
				try {
					Class.forName("org.mariadb.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				this.connection = DriverManager.getConnection(url, user, password);
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
	public void disConnet() {
		try {
			if(connection != null) {
				connection.close();
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	}

