package javaPractice.ch_01;

public class continue01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0 ~ 100������ Ȧ���� �� ��
		int total = 0;
		int num;
		
		for (num = 0; num <= 100; num++) {
			if(num % 2 == 0) {
				continue;
			}
			total += num;
			/*if(num % 2 ==1) {
			 * total += num;
			 * }*/
		}
		
		
//		for (num = 1; num <= 100; num+=2) {
//			total += num;
//		}
		System.out.println("1���� 100������ Ȧ���� ����" + total + "�Դϴ�.");
	}

}
