package javaPractice.ch_01;

public class Ex_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for���� �̿��ؼ� 1���� 100������ ���� �߿���
		// 3�� ����� ������ ���ϴ� �ڵ带 �ۼ��� ������.
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("3�� ����� ��: " + sum);
		
		sum = 0;
		for (int i = 3; i <= 100; i+=3) {
			sum += i;
		}
		System.out.println("3�� ����� ��: " + sum);
	}

}
