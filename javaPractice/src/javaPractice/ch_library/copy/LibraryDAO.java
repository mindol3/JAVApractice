package javaPractice.ch_library.copy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;




public class LibraryDAO {
	
	private Connection connection = null;
	
	LibraryDAO(){
		getConnection();
	}
	
	private void getConnection() {
		try {
			String url = "jdbc:mariadb://localhost:5000/library_sample";
			String user = "root";
			String password = "1234";
			
			try {
				Class.forName("org.mariadb.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			this.connection =DriverManager.getConnection(url, user, password);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void disConnect() { // 연결 해제. 서비스 종료시에 사용.
		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public boolean isLibrary(int id) {
		int res = 0;
		
		try {
			String sql = "SELECT COUNT(*) AS cnt FROM library WHERE id = '" + id + "'";
//			System.out.println(sql);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			resultSet.next();
			res = resultSet.getInt("cnt");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res != 0 ? true : false;
	}
	public boolean insertLibrary(Library lb) {
		//계좌 생성.
		// 계좌 생성전에 동일한 계좌 번호가 존재하는지 확인
		Statement statement = null;
		if(isLibrary(lb.getId())) {
			System.out.println(lb.getId() + " 계좌가 존재합니다.");
			return false;
		}
		
		boolean res = false;
		int upd = 0;
		try {
			String sql = String.format("INSERT INTO library VALUES (%d, '%s', '%s', %d)"
					, lb.getId(), lb.getTitle(), lb.getWriter(), lb.getCount());
//			System.out.println(sql);
			statement = connection.createStatement();
			upd = statement.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		res = (upd == 0) ? false : true;
		return res;
	}
	
	public Library selectOne(int id) {
		// 계좌 번호를 받아 정보 전달
		Statement statement = null;
		Library lb = new Library();
		try {
			String sql = "SELECT * FROM library WHERE id = '" + id + "'";
//			System.out.println(sql);
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
			if (resultSet.next()) {
				lb = new Library();
				lb.setId(resultSet.getInt("id"));
				lb.setTitle(resultSet.getString("title"));
				lb.setWriter(resultSet.getString("writer"));
				lb.setCount(resultSet.getInt("count"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return lb;
	}
	
	public ArrayList<Library> selectAll(){
		Statement statement = null;
		ArrayList<Library> list = new ArrayList<>();
		try {
			String sql = "SELECT * FROM library ";
//			System.out.println(sql);
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				Library lb = new Library(resultSet.getInt("id"), resultSet.getString("title"),
						resultSet.getString("writer"), resultSet.getInt("count"));
				list.add(lb);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	public boolean updateLibrary(int id, int num, boolean flag) {
		Statement statement = null;
		boolean res = false;
		int upd = 0;
		try {
			String sql;
			if(flag) {
				sql = String.format("UPDATE library SET count = count + %d WHERE (id = %d)", num, id);
			}
			else {
				sql = String.format("UPDATE library SET count = count - %d WHERE (id = %d)", num, id);
			}
//			System.out.println(sql);
			statement = connection.createStatement();
			upd = statement.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		res = (upd == 0) ? false : true;
		return res;
	}
	
	// 책검색
	public ArrayList<Library> searchBook (String title){
		Statement statement = null;
		ArrayList<Library> books = new ArrayList<>();
		
		try {
			String sql = "SELECT * FROM library WHERE title LIKE '%" + title + "%'";
			 statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
			while(resultSet.next()) {
				Library lb = new Library();
				lb.setId(resultSet.getInt("id"));
				lb.setTitle(resultSet.getString("title"));
				lb.setWriter(resultSet.getString("writer"));
				lb.setCount(resultSet.getInt("count"));
				books.add(lb);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(statement != null) {
					statement.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return books;
	}
	
}
