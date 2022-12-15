package javaPractice.ch_11.School.copy;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDAO extends DAO {
	
	public StudentDAO() {
		getConnection();
	}
	
	private boolean isStudent(int studentNumber) {
		int res = 0;
		
		try {
			String sql = "SELECT COUNT(*) AS cnt FROM student WHERE studentNumber = '"+studentNumber+"'";
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			resultSet.next();
			res = resultSet.getInt("cnt");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res != 0 ? true : false;
	}
	
	// 학생추가
	public boolean insertStudent(Student student) {
		Statement statement = null;
		
		if(isStudent(student.getStudentNumber())) {
			System.out.println(student.getStudentNumber() + "학번의 학생이 존재합니다.");
			return false;
		}
		boolean res = false;
		int upd = 0;
		try {
			String sql = String.format("INSERT INTO student VALUES (%d, '%s', '%s', '%s')"
					, student.getStudentNumber(), student.getName(), student.getPhoneNumber(), student.getMemo());
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
	
	public boolean deleteStudent(Student student) {
		Statement statement = null;
		
		if(!isStudent(student.getStudentNumber())) {
			System.out.println(student.getStudentNumber() + "학번의 학생이 없습니다.");
			return false;
		}
		boolean res = false;
		int upd = 0;
		try {
			String sql = String.format("DELETE FROM student WHERE studentNumber = %d"
					, student.getStudentNumber());
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
}
