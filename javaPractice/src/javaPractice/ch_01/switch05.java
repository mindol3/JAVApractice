package javaPractice.ch_01;

import java.util.Scanner;

public class switch05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*while ���� Scanner�� �̿��ؼ� Ű����� �Էµ� �����ͷ� ����, ���, ��ȸ, ���� ����� �����ϴ� �ڵ带 �ϼ����ּ���.
		 * ���α׷� ������ �ϸ� ������ ���� ���� ����� ���;� �մϴ�. (Scanner �� nextLine()���)*/
		
		
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.println("------------------------------");
			System.out.println("1. ���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("------------------------------");
			System.out.print("����> ");
			
			/*�ڵ� ����*/
			int menuNum = Integer.parseInt(scanner.nextLine());
			switch (menuNum) {
				case 1:
					System.out.print("���ݾ�> ");
					balance += Integer.parseInt(scanner.nextLine());
					break;
				case 2:
					System.out.print("��ݾ�> ");
					balance -= Integer.parseInt(scanner.nextLine());
					break;
				case 3:
					System.out.print("�ܰ�> ");
					System.out.println(balance);
					break;
				case 4:
					run = false;
					break;
			}
		}
		System.out.println("���α׷� ����");
	}

}
