package javaPractice.ch_11.School.copy;

import java.util.Scanner;

public class StudentlManageView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		StudentManage manager = new StudentManage();
		SubjectManage sbManager = new SubjectManage();
		System.out.println("학생 관리 프로그램을 시작합니다.");
		
		while(true) {
			System.out.println("메뉴를 선택하세요 >> 1. 학생 추가 / 2. 학생 삭제 / 3. 수강 신청 / "
					+"4. 성적 입력 / 5. 정보 조회 / 6. 수강과목 관리 / 7. 프로그램 종료");
			int menu = input.nextInt();
			switch(menu) {
				case 1 :
					System.out.println("학생 추가 및 수정 메뉴 입니다.");
					manager.addStudent();
					break;
				case 2 :
					System.out.println("학생 삭제 메뉴 입니다.");
					manager.removeStudent();
					break;
				case 3 :
					System.out.println("수강 신청 메뉴 입니다.");
					manager.addClass();
					break;
				case 4 :
					System.out.println("성적 입력 메뉴 입니다.");
					manager.setScore();
					break;
				case 5 :
					System.out.println("정보 조회 메뉴 입니다.");
					manager.informStudent();
					break;
				case 6 :
					System.out.println("수강과목 관리 메뉴 입니다.");
					sbManager.subjectMenu();
					break;
				case 7 :
					System.out.println("프로그램을 종료 합니다.");
					return;
				default:
					System.out.println("없는 메뉴를 선택하였습니다.");
			}
		}
	}

}
