package javaPractice.ch_08;

public class trycatch02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] a = {2, 0};
			int b = 4;
			System.out.println("���� ó�� ���� �� 1");
			int c = b / a[0];
			System.out.println("���� ó�� ���� �� 2");
			System.out.println(c);
		}
		catch (ArithmeticException e) {
			System.out.println("��� ���� �߻�");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ���� ���� �߻�");
		}
		System.out.println("���� ó�� ���� �� 3");
	}

}
