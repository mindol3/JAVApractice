package javaPractice.ch_08;

public class trycatch03_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 2;
		try {
			System.out.println("�ܺη� ����");
			int c = b / a;
		}
		catch ( ArithmeticException e) {
			System.out.println("������ �߻��߽��ϴ�");
		}
		finally {
			System.out.println("���� ����");
		}
		System.out.println("���⵵ ����˴ϴ�.");
	}

}
