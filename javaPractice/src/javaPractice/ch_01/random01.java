package javaPractice.ch_01;

import java.util.Random;
import java.util.Scanner;

public class random01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int nextInt(int n) // int Ÿ���� 0 ~ �Ű��������� ������ �����մϴ�.
		/*���α׷��� ������ �ִ� ������ ����ڰ� �˾Ƹ����� ����.
		 * 1) 1���� 1000 ������ ���� �ϳ��� �����Ѵ�.
		 * 2) ����ڰ� ���� �����Ͽ� �Է��Ѵ�.
		 * 3) ������ �ƴ� ��� ������ �Է��� ������ ū�� Ȥ�� ������ �˷��ش�.
		 * 4) ������ ���, ���� �޽��� �� �õ� Ƚ�� ����� ��*/
		Random random = new Random();
		int answer = random.nextInt(999) + 1;
		Scanner scanner = new Scanner(System.in);
		int count =0;
		System.out.println(answer);
		while(true) {
			int num = scanner.nextInt();
			System.out.println("������ �����Ͽ� ���ÿ�:");
			count ++;
			if(answer < num) {
				System.out.println("������ ������ �����ϴ�.");
			}
			else if(answer > num) {
				System.out.println("������ ������ �����ϴ�.");
			}
			else{
				break;
			}
		}
		System.out.println("�����Դϴ�. �õ�ȸ����" + count + "�Դϴ�.");
	}

}
