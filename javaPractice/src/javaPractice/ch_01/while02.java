package javaPractice.ch_01;

public class while02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for���� while������ ����
		int num;
		int sum = 0;
		
		for (num = 1; num <= 10; num ++) {
			sum += num;
		}
		System.out.println("1���� 10������ ����" + sum + "�Դϴ�.");
		num = 1;
		sum = 0;
		while (num <= 10) {
			sum += num;
			num++;
		}
		System.out.println("1���� 10������ ����" + sum + "�Դϴ�.");
	}

}
