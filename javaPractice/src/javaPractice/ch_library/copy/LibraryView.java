package javaPractice.ch_library.copy;

import java.util.Scanner;

public class LibraryView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryManager manager = new LibraryManager();
		Scanner input = new Scanner(System.in);
		
		while(true) {
			printmenu();
			System.out.println("선택:");
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
				System.out.println("종료합니다.");
				input.close();
				return;
			default:
				System.out.println("잘못누르셨습니다. \n다시선택해주세요.");
				break;
			}
					
		}
	}

	private static void printmenu() {
		// TODO Auto-generated method stub
		System.out.println("==============Menu=============");
		System.out.println("1.책 등록");
		System.out.println("2.책 검색");
		System.out.println("3.책 대여");
		System.out.println("4.책 반납");
		System.out.println("5.책 전체출력");
		System.out.println("6.종료");
		System.out.println();
	}

}
