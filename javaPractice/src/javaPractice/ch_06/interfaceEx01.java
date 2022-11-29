package javaPractice.ch_06;

interface DataAccessObject {
	void insert();
	void select();
	void update();
	void delete();
}

class OracleData implements DataAccessObject {

	@Override
	public void insert() {
		System.out.println("Oracle DB�� ����");
	}
	@Override
	public void select() {
		System.out.println("Oracle DB���� �˻�");
	}
	@Override
	public void update() {
		System.out.println("Oracle DB�� ����");
	}
	@Override
	public void delete() {
		System.out.println("Oracle DB���� ����");		
	}
	
}

class MySqlData implements DataAccessObject {
	@Override
	public void insert() {
		System.out.println("MySqlData DB�� ����");
	}
	@Override
	public void select() {
		System.out.println("MySqlData DB���� �˻�");
	}
	@Override
	public void update() {
		System.out.println("MySqlData DB�� ����");
	}
	@Override
	public void delete() {
		System.out.println("MySqlData DB���� ����");		
	}
}

public class interfaceEx01 {
	/* DataAccessObject �������̽��� �� �������̽��� �����ϴ� OracleData, MySqlData
	 * Ŭ������ �ֽ��ϴ�. ����Ŭ������ ���� ��� ����� ������ ������
	 * �������̽��� Ŭ������ ���� �ϼ��ϼ���.*/
	
	public static void dbWork(DataAccessObject dao) {
		dao.insert();
		dao.select();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dbWork(new OracleData());
		dbWork(new MySqlData());
//		Oracle DB�� ����
//		Oracle DB���� �˻�
//		Oracle DB�� ����
//		Oracle DB���� ����
//		MySqulData DB�� ����
//		MySqulData DB���� �˻�
//		MySqulData DB�� ����
//		MySqulData DB���� ����
	}

}
