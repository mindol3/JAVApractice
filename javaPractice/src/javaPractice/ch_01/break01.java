package javaPractice.ch_01;

import java.util.Scanner;

public class break01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*�ݺ����� ���������� ����� 1) ���ǽ��� false�� �ǰų� 2) break���� ����.
		 * break���� �ݺ��� ���߰� ��.
		 * �ݺ����� ����Ǵٰ� break���� ������ �� �ٷ� �ݺ����� ����� �ݺ��� ������ �ڵ带 ����.*/
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int num;
		
		while(true) {
			System.out.println("���� ���ڸ� �Է��ϼ���:(�����Ϸ��� 0�Է�)");
			num = scanner.nextInt();// ���� �Է¹޾Ƽ� i�� ����
			if (num == 0) {// ���� 0�� �Է��Ѵٸ� ����
				break;
			}
			sum += num; // �Է¹��� �� �����ֱ�
		}
		System.out.println("��������� ���� = " + sum );
	}

}
