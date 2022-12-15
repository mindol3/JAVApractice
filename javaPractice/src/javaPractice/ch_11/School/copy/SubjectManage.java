package javaPractice.ch_11.School.copy;

import java.util.ArrayList;
import java.util.Scanner;

public class SubjectManage {
	static ArrayList<Subject> subjects = new ArrayList();
	static Scanner input = new Scanner(System.in);
	Subject sb = new Subject();	
	// 6. 수강과목 관리 메뉴
		void subjectMenu() {
			while(true) {
				System.out.println("메뉴를 선택하세요: 1. 수강과목 등록 / 2. 수강과목 삭제 / 3. 수강과목 조회 / 4. 메인메뉴로");
				int menu = input.nextInt();
						
				switch(menu) {
					case 1:
						System.out.println("수강과목 등록 메뉴입니다.");
						addSubject();
						continue;
					case 2:
						System.out.println("수강과목 삭제 메뉴입니다.");
						removeSubject();
						continue;
					case 3:
						System.out.println("수강과목 조회 메뉴입니다.");
						printSubjectAll();
						continue;
					case 4:
						return;
				}
			}	
		}
		
		static Subject findSubject(int code) {
			for(Subject sb : subjects) {
				if(sb.getCode() == code) {
					return sb;
				}
			} return null;
		}
		
		void addSubject() {
			System.out.println("코드: ");
			int code =input.nextInt();
					
			Subject sb = findSubject(code);
			if(sb == null) {
				sb = new Subject(code);
				subjects.add(sb);
			}
			System.out.println("과목명: ");
			sb.setSubjectName(input.next());
			
			System.out.println("과목 등록이 완료되었습니다.");
			System.out.println();
			System.out.println(subjects);
		}
		
		void removeSubject() {
			System.out.println("코드: ");
			int code = input.nextInt();
			
			Subject sb = findSubject(code);
			if(sb == null) {
				System.out.println("해당 코드 과목이 존재하지 않습니다.");
				System.out.println();
				return;
			}
			subjects.remove(sb);
			System.out.println("과목이 삭제 완료되었습니다.");
			System.out.println();
			System.out.println(subjects);
		}
		
		void printSubjectAll() {
			System.out.println("과목코드\t과목명");
			for (Subject sb : subjects) {
				System.out.println(sb.getCode() + "\t" + sb.getSubjectName());
			}
			System.out.println();
		}
}
