package javaPractice.ch_08;

public class trycatch03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 2;
		try {
			System.out.println("외부로 연결");
			int c = b / a;
			System.out.println("연결 해제");
		}
		catch ( ArithmeticException e) {
			System.out.println("오류가 발생했습니다");
			System.out.println("연결 해제");
		}
	}

}
