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
		System.out.println("Oracle DB에 삽입");
	}
	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색");
	}
	@Override
	public void update() {
		System.out.println("Oracle DB를 수정");
	}
	@Override
	public void delete() {
		System.out.println("Oracle DB에서 삭제");		
	}
	
}

class MySqlData implements DataAccessObject {
	@Override
	public void insert() {
		System.out.println("MySqlData DB에 삽입");
	}
	@Override
	public void select() {
		System.out.println("MySqlData DB에서 검색");
	}
	@Override
	public void update() {
		System.out.println("MySqlData DB를 수정");
	}
	@Override
	public void delete() {
		System.out.println("MySqlData DB에서 삭제");		
	}
}

public class interfaceEx01 {
	/* DataAccessObject 인터페이스와 이 인터페이스를 구현하는 OracleData, MySqlData
	 * 클래스가 있습니다. 메인클래스를 보고 출력 결과가 다음과 같을때
	 * 인터페이스와 클래스를 만들어서 완성하세요.*/
	
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
//		Oracle DB에 삽입
//		Oracle DB에서 검색
//		Oracle DB를 수정
//		Oracle DB에서 삭제
//		MySqulData DB에 삽입
//		MySqulData DB에서 검색
//		MySqulData DB를 수정
//		MySqulData DB에서 삭제
	}

}
