package javaPractice.ch_01;

import java.util.Scanner;

public class Ex_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*do while ���� ����ؼ� ����ڷ� ���� ���� ��ȣ�� �Է¹޴� ���α׷��� �ۼ��� ������.
		 * ����ڰ� �ùٸ� �� ��ȣ�� �Է��� �� ���� �ݺ��� ����մϴ�.
		 * ����ڰ� �ùٸ� �� ��ȣ�� �Է��ؾ߸� ���� �������� �Ѿ�ϴ�.*/
		Scanner scanner = new Scanner(System.in);
//		int month;
//		
//		do {
//			System.out.print("�ùٸ� ���� �Է��ϼ��� [1-12]");
//			month = scanner.nextInt();
//		}while (month < 1 || month > 12);
//		System.out.println("����ڰ� �Է��� ����" + month + "�Դϴ�.");
		
		//Ex_10 ������ do while������ ��ȭ 
		int sum = 0, value;	
		do {
			System.out.print("������ �Է��ϼ���: ");
			value = scanner.nextInt();		
			if(value >=0) {
				sum += value;			
			}
		}while (value >= 0); 
			System.out.println("������ �հ��" + sum + "�Դϴ�.");
		
	}

}
