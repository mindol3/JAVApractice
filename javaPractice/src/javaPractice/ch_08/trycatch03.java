package javaPractice.ch_08;

public class trycatch03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 2;
		try {
			System.out.println("�ܺη� ����");
			int c = b / a;
			System.out.println("���� ����");
		}
		catch ( ArithmeticException e) {
			System.out.println("������ �߻��߽��ϴ�");
			System.out.println("���� ����");
		}
	}

}
