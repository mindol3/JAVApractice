package javaPractice.ch_11.account;

import java.util.Scanner;

public class AccountView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountManager manager = new AccountManager();
		Scanner stdIn = new Scanner(System.in);
		
		while(true) {
			printMenu();
			System.out.println("����:");
			int choice = stdIn.nextInt();
			switch(choice) {
			case 1:
				manager.makeAccount();
				break;
			case 2:
				manager.deposit();
				break;
			case 3:
				manager.withdraw();
				break;
			case 4:
				System.out.println("���¹�ȣ\t����\t�ܾ�");
				manager.inquire();
				break;
			case 5:
				System.out.println("���¹�ȣ\t����\t�ݾ�");
				manager.display();
				break;
			case 6:
				System.out.println("�����մϴ�.");
				stdIn.close();
				return;
			default:
				System.out.println("�߸������̽��ϴ�. \n�ٽü������ּ���.");
				break;
			}
		}
	}

	private static void printMenu() {
		// TODO Auto-generated method stub
		System.out.println("==============Menu=============");
		System.out.println("1.���°���");
		System.out.println("2.�Ա�");
		System.out.println("3.���");
		System.out.println("4.�ܾ���ȸ");
		System.out.println("5.��ü���");
		System.out.println("6.���α׷�����");
		System.out.println();
		
	}
}

