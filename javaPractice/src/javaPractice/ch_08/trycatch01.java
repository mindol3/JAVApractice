package javaPractice.ch_08;

public class trycatch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		int num2 = 0;
		
		try {
			System.out.println("** �������� 0���� ������ ���� **");
			// �������� ���� ����
			System.out.println("10/0=" + (num / num2));
			System.out.println("try/catch ���� �� ���� ����");
		} catch(Exception e) {
			System.out.println(e);
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		System.out.println("���α׷��� ���� �����մϴ�.");
	}

}
