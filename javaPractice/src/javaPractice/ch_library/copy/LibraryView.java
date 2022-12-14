package javaPractice.ch_library.copy;

import java.util.Scanner;

public class LibraryView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryManager manager = new LibraryManager();
		Scanner input = new Scanner(System.in);
		
		while(true) {
			printmenu();
			System.out.println("����:");
			int choice = input.nextInt();
			switch(choice) {
			case 1:
				manager.registration();
				break;
			case 2:
				manager.search();
				break;
			case 3:
				manager.rental();
				break;
			case 4:
				manager.returns();
				break;
			case 5:
				manager.displayAll();
				break;
			case 6:
				manager.disConnect();
				System.out.println("�����մϴ�.");
				input.close();
				return;
			default:
				System.out.println("�߸������̽��ϴ�. \n�ٽü������ּ���.");
				break;
			}
					
		}
	}

	private static void printmenu() {
		// TODO Auto-generated method stub
		System.out.println("==============Menu=============");
		System.out.println("1.å ���");
		System.out.println("2.å �˻�");
		System.out.println("3.å �뿩");
		System.out.println("4.å �ݳ�");
		System.out.println("5.å ��ü���");
		System.out.println("6.����");
		System.out.println();
	}

}
