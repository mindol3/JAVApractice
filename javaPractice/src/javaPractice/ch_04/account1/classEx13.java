package javaPractice.ch_04.account1;

import java.util.Scanner;

/*
 idx Ŭ���� ������ �߰��ؼ� �迭 ���� �� �迭 ��ȸ�� ���� �κ��� �����ؼ�
 for���� �ݺ��� �ּ�ȭ �ϼ���.*/

public class classEx13 {
	
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int idx = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("--------------------------------------------------");
			System.out.print("����> ");
			
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				
				
			}
			else if (selectNo == 2) {
				
			}
			else if (selectNo == 3) {
				
			}
			else if (selectNo == 4) {
				
			}
			else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}

}
