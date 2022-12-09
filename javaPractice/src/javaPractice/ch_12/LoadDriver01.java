package javaPractice.ch_12;

/*
  JDBC�� �̿��ϴ� ���α׷� �ۼ� ����.
  1. ����ϰ��� �ϴ� RDBMS���� �����ϴ� JDBC ����̹��� ��ġ.
  2. JDBC ����̹��� �ε�.
  ����̹��� �ε��� ������ Ŭ������ ���� ���ε��� �����ϴ� Class Ŭ������ static �޼����� forName() �޼��带 ���.
  3. DBMS�� ������ ����.
  java.sql ��Ű���� �����ϴ� Connection ��ü�� ���.
  4. SQL�� ����
  select ������ ������ ������ java.sql ��Ű���� �����ϴ� Statement ��ü�� ResulSet ��ü�� ���.
  Statement ��ü�� SQL ������ ���� ���̰� ResultSet�� select ������ ������ ����� �ٷ�� ���� ��ü.
 * */

public class LoadDriver01 {
	// ����̹� Ŭ������ �ε�
	public static void loadDriver() {
		try {
			Class.forName("org.mariadb.jdbc.Driver"); // org.mariadb.jdbc.Driver Ŭ������ �޸𸮿� �ε�.
			System.out.println("Driver Load Success!");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loadDriver();
	}

}
