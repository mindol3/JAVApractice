package javaPractice.ch_11.School;

import java.util.Scanner;

public class SchoolManageView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		StudentManage manager = new StudentManage();
		System.out.println("�л� ���� ���α׷��� �����մϴ�.");
		
		while(true) {
			System.out.println("�޴��� �����ϼ��� >> 1. �л� �߰� / 2. �л� ����/ 3. ���� ��û / "
					+"4.���� �Է�/ 5. ���� ��ȸ/ 6. ���α׷� ����");
			int menu = input.nextInt();
			switch(menu) {
				case 1 :
					System.out.println("�л� �߰� �� ���� �޴� �Դϴ�.");
					manager.addStudent();
					break;
				case 2 :
					System.out.println("�л� ���� �޴� �Դϴ�.");
					manager.removeStudent();
					break;
				case 3 :
					System.out.println("���� ��û �޴� �Դϴ�.");
					manager.addClass();
					break;
				case 4 :
					System.out.println("���� �Է� �޴� �Դϴ�.");
					manager.setScore();
					break;
				case 5 :
					System.out.println("���� ��ȸ �޴� �Դϴ�.");
					manager.informStudent();
					break;
				case 6 :
					System.out.println("���α׷��� ���� �մϴ�.");
					return;
				default:
					System.out.println("���� �޴��� �����Ͽ����ϴ�.");
			}
		}
	}

}