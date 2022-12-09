package javaPractice.ch_11.School;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage {
	static Scanner input = new Scanner(System.in);
	static ArrayList<Student> students = new ArrayList();
//	static String[] className = {"JAVA", "PYTHON", "C"};
	
	static Student findStudentInform(int studentNumber) {
		for (Student student : students) {
			if(student.getStudentNumber() == studentNumber) {
				System.out.println("해당 학생의 정보는 다음과 같습니다");
				System.out.println("이름 :" + student.getName());
				System.out.println("전화번호 :" + student.getPhoneNumber());
				System.out.println("메모 :" + student.getMemo());
				return student;
			}
		} return null;
	}
	
	// 1. 학생 추가 및 수정
	void addStudent() {
		System.out.println("학생의 학번을 입력 하세요. >>>");
		int studentNumber = input.nextInt(); // 학번 입력받음
		
		// 입력한 학번으로 새로운 학생을 생성
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) {
			newStudent = new Student(studentNumber);
			students.add(newStudent); // 학생 객체를 ArrayList에 저장
		}
		
		System.out.println("이름을 입력 하세요. >>>");
		newStudent.setName(input.next()); // 문자열 입력받아서 setName 에 전달
		System.out.println("전화 번호를 입력 하세요. >>>");
		newStudent.setPhoneNumber(input.next());
		System.out.println("메모를 입력 하세요. >>>");
		newStudent.setMemo(input.next());
		
		System.out.println("학생 추가가 완료 되었습니다." + "\n");
	}

	// 2. 학생 삭제 메뉴
	void removeStudent() {
		System.out.println("학생의 학번을 입력 하세요. >>>");
		int studentNumber = input.nextInt(); // 학번 입력받음
		
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) { //만약 기본에 학생의 정보가 없다면
			System.out.println("Error : 학생이 존재하지 않습니다!!!");
			return; // 메소드 종료
		}
		
		students.remove(newStudent); // 해당 학생을 삭제
		System.out.println("학생 삭제가 완료되었습니다.");
	}

	// 3.수강신청 메뉴
	void addClass() {
		System.out.println("학생의 학번을 입력 하세요. >>>");
		int studentNumber = input.nextInt(); // 학번 입력받음
		
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) { //만약 기본에 학생의 정보가 없다면
			System.out.println("Error : 학생이 존재하지 않습니다!!!");
			return; // 메소드 종료
		}
		
		while(true) {
			System.out.println("메뉴를 선택하세요: 1. 수강신청 / 2. 수강포기 / 3. 종료");
			int classMenu = input.nextInt();
			switch(classMenu) {
				case 1:
					setClass("수강신청 할 과목을 선택하세요" , newStudent, true);
					break;
				case 2:
					setClass("수강포기 할 과목을 선택하세요" , newStudent, false);
					break;
				case 3:
					return;
			}
		}

	}

	void setClass(String message, Student newStudent, boolean check) {
		System.out.println(message);
		System.out.println("1. JAVA / 2. PYTHON / 3. C");
		int index = input.nextInt() - 1;
		newStudent.setClassCheck(index, check);
		
		if(!check) { // 수강포기 한 과목이라면
			newStudent.setClassScore(index, 0); // 성적을 0으로 되돌림
		}
	}

	// 4. 성적 입력 메뉴
	void setScore() {
		System.out.println("학생의 학번을 입력 하세요. >>>");
		int studentNumber = input.nextInt(); // 학번 입력받음
		
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) { //만약 기본에 학생의 정보가 없다면
			System.out.println("Error : 학생이 존재하지 않습니다!!!");
			return; // 메소드 종료
		}
		
		while(true) {
			System.out.println("성적을 입력/수정할 과목을 선택하세요.");
//			System.out.println("성적을 입력/수정할 과목을 선택하세요. 1. JAVA / 2. PYTHON / 3. C / 4. 종료");
			for(int i = 0; i < Student.getClassName().length; i++) {
				System.out.println(i+1 + ". " + Student.getClassName()[i] + " / ");
			}
			System.out.println((Student.getClassName().length+1) + ". 종료 >>> ");
			int classMenu = input.nextInt();
			if(classMenu == Student.getClassName().length+1) { // 종료 체크
				break; // While문 종료
			}
			if(!newStudent.getClassCheck()[classMenu-1]) {//미신청 체크
				System.out.println(Student.getClassName()[classMenu-1] + "과목은 미신청 과목입니다!");
				continue; // 미신청이기 때문에 처음으로 되돌아간다
			}
			System.out.println("성적을 입력하세요 >>>");
			int score = input.nextInt();
			if(score < 0 || score > 100) { // 성적이 0 - 100 까지인지 체크
				System.out.println("Error : 성적은 0부터 100사이에 숫자만 입력해주세요");
				continue; // 처음으로 돌아감
			}
			// 정상적인 괌고과 성적이 입력이 된 경우
			newStudent.setClassScore(classMenu-1, score); // 해당 학생의 Score 를 업데이트 한다.
			System.out.println(Student.getClassName()[classMenu-1] + "성적 입력이 완료 되었습니다."); // 출력
		}
	}

	//5. 학생 정보 조회 메뉴
	void informStudent() {
		System.out.println("메뉴를 선택 해 주세요. 1. 특정 학생만 / 2. 전체 학생");
		int menu = input.nextInt();
		switch(menu) {
		 case 1: // 특정 학생의 성적 정보
			 One();
			 break;
		 case 2: // 전체 학생의 성적 정보
			 All();
			 break;
		
		}
	}

	

	private void One() {
		System.out.println("학생의 학번을 입력 하세요");
		int studentNumber = input.nextInt(); // 학번 입력 받음
//		Student newStudent = Studnet(studentNumber);
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) { //만약 기본에 학생의 정보가 없다면
			System.out.println("Error : 학생이 존재하지 않습니다!!!");
			return; // 메소드 종료			
		}
		info(newStudent);
	}
//		boolean[] classCheck = newStudent.getClassCheck();
//		int[] classScore = newStudent.getClassScore();
//		info2(newStudent.getClasscheck(), newStudent.getClassScore());


	private void All() {
		for (Student student : students) {
			info(student);
		}
	}
//			boolean[] classCheck = student.getClassCheck();
//			int[] classScore = student.getClassScore();
//			info2(student.getClasscheck(), student.getClassScore());
	
	
	
//	void info2(boolean[] classCheck, int[] classScore) {
//		for (int i = 0; i < classCheck.length; i++) {
//			if (classCheck[i]) {
//				System.out.println("과목명: " + className[i] + " / 성적 : " + classScore[i]);
//			}
//		}
//	}
	
	void info(Student student) {
		System.out.println("학번 : " + student.getStudentNumber());
		System.out.println("이름 : " + student.getName());
		System.out.println("전화번호 : " + student.getPhoneNumber());
		System.out.println("메모 : " + student.getMemo());
		System.out.println("현재 수강중인 과목과 성적 >>>");
		boolean[] classCheck = student.getClassCheck();
		int[] classScore = student.getClassScore();
		for (int i = 0; i < classCheck.length; i++) {
			if (classCheck[i]) {
				System.out.println("과목명: " + Student.getClassName()[i] + " / 성적 : " + classScore[i]);
			}
		}
	}


	
	
	

//	void info(boolean[] classCheck, int[] classScore) { //학생조회메서드
//		for (int i = 0; i < classCheck.length; i++) {
//			if(classCheck[i]) {
//				System.out.println("과목명 : " + className[i] + "/ 성적 : " + classScore[i]);				
//			}
//		}
//	}

}
