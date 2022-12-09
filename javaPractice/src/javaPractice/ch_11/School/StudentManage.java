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
				System.out.println("�ش� �л��� ������ ������ �����ϴ�");
				System.out.println("�̸� :" + student.getName());
				System.out.println("��ȭ��ȣ :" + student.getPhoneNumber());
				System.out.println("�޸� :" + student.getMemo());
				return student;
			}
		} return null;
	}
	
	// 1. �л� �߰� �� ����
	void addStudent() {
		System.out.println("�л��� �й��� �Է� �ϼ���. >>>");
		int studentNumber = input.nextInt(); // �й� �Է¹���
		
		// �Է��� �й����� ���ο� �л��� ����
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) {
			newStudent = new Student(studentNumber);
			students.add(newStudent); // �л� ��ü�� ArrayList�� ����
		}
		
		System.out.println("�̸��� �Է� �ϼ���. >>>");
		newStudent.setName(input.next()); // ���ڿ� �Է¹޾Ƽ� setName �� ����
		System.out.println("��ȭ ��ȣ�� �Է� �ϼ���. >>>");
		newStudent.setPhoneNumber(input.next());
		System.out.println("�޸� �Է� �ϼ���. >>>");
		newStudent.setMemo(input.next());
		
		System.out.println("�л� �߰��� �Ϸ� �Ǿ����ϴ�." + "\n");
	}

	// 2. �л� ���� �޴�
	void removeStudent() {
		System.out.println("�л��� �й��� �Է� �ϼ���. >>>");
		int studentNumber = input.nextInt(); // �й� �Է¹���
		
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) { //���� �⺻�� �л��� ������ ���ٸ�
			System.out.println("Error : �л��� �������� �ʽ��ϴ�!!!");
			return; // �޼ҵ� ����
		}
		
		students.remove(newStudent); // �ش� �л��� ����
		System.out.println("�л� ������ �Ϸ�Ǿ����ϴ�.");
	}

	// 3.������û �޴�
	void addClass() {
		System.out.println("�л��� �й��� �Է� �ϼ���. >>>");
		int studentNumber = input.nextInt(); // �й� �Է¹���
		
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) { //���� �⺻�� �л��� ������ ���ٸ�
			System.out.println("Error : �л��� �������� �ʽ��ϴ�!!!");
			return; // �޼ҵ� ����
		}
		
		while(true) {
			System.out.println("�޴��� �����ϼ���: 1. ������û / 2. �������� / 3. ����");
			int classMenu = input.nextInt();
			switch(classMenu) {
				case 1:
					setClass("������û �� ������ �����ϼ���" , newStudent, true);
					break;
				case 2:
					setClass("�������� �� ������ �����ϼ���" , newStudent, false);
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
		
		if(!check) { // �������� �� �����̶��
			newStudent.setClassScore(index, 0); // ������ 0���� �ǵ���
		}
	}

	// 4. ���� �Է� �޴�
	void setScore() {
		System.out.println("�л��� �й��� �Է� �ϼ���. >>>");
		int studentNumber = input.nextInt(); // �й� �Է¹���
		
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) { //���� �⺻�� �л��� ������ ���ٸ�
			System.out.println("Error : �л��� �������� �ʽ��ϴ�!!!");
			return; // �޼ҵ� ����
		}
		
		while(true) {
			System.out.println("������ �Է�/������ ������ �����ϼ���.");
//			System.out.println("������ �Է�/������ ������ �����ϼ���. 1. JAVA / 2. PYTHON / 3. C / 4. ����");
			for(int i = 0; i < Student.getClassName().length; i++) {
				System.out.println(i+1 + ". " + Student.getClassName()[i] + " / ");
			}
			System.out.println((Student.getClassName().length+1) + ". ���� >>> ");
			int classMenu = input.nextInt();
			if(classMenu == Student.getClassName().length+1) { // ���� üũ
				break; // While�� ����
			}
			if(!newStudent.getClassCheck()[classMenu-1]) {//�̽�û üũ
				System.out.println(Student.getClassName()[classMenu-1] + "������ �̽�û �����Դϴ�!");
				continue; // �̽�û�̱� ������ ó������ �ǵ��ư���
			}
			System.out.println("������ �Է��ϼ��� >>>");
			int score = input.nextInt();
			if(score < 0 || score > 100) { // ������ 0 - 100 �������� üũ
				System.out.println("Error : ������ 0���� 100���̿� ���ڸ� �Է����ּ���");
				continue; // ó������ ���ư�
			}
			// �������� ����� ������ �Է��� �� ���
			newStudent.setClassScore(classMenu-1, score); // �ش� �л��� Score �� ������Ʈ �Ѵ�.
			System.out.println(Student.getClassName()[classMenu-1] + "���� �Է��� �Ϸ� �Ǿ����ϴ�."); // ���
		}
	}

	//5. �л� ���� ��ȸ �޴�
	void informStudent() {
		System.out.println("�޴��� ���� �� �ּ���. 1. Ư�� �л��� / 2. ��ü �л�");
		int menu = input.nextInt();
		switch(menu) {
		 case 1: // Ư�� �л��� ���� ����
			 One();
			 break;
		 case 2: // ��ü �л��� ���� ����
			 All();
			 break;
		
		}
	}

	

	private void One() {
		System.out.println("�л��� �й��� �Է� �ϼ���");
		int studentNumber = input.nextInt(); // �й� �Է� ����
//		Student newStudent = Studnet(studentNumber);
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) { //���� �⺻�� �л��� ������ ���ٸ�
			System.out.println("Error : �л��� �������� �ʽ��ϴ�!!!");
			return; // �޼ҵ� ����			
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
//				System.out.println("�����: " + className[i] + " / ���� : " + classScore[i]);
//			}
//		}
//	}
	
	void info(Student student) {
		System.out.println("�й� : " + student.getStudentNumber());
		System.out.println("�̸� : " + student.getName());
		System.out.println("��ȭ��ȣ : " + student.getPhoneNumber());
		System.out.println("�޸� : " + student.getMemo());
		System.out.println("���� �������� ����� ���� >>>");
		boolean[] classCheck = student.getClassCheck();
		int[] classScore = student.getClassScore();
		for (int i = 0; i < classCheck.length; i++) {
			if (classCheck[i]) {
				System.out.println("�����: " + Student.getClassName()[i] + " / ���� : " + classScore[i]);
			}
		}
	}


	
	
	

//	void info(boolean[] classCheck, int[] classScore) { //�л���ȸ�޼���
//		for (int i = 0; i < classCheck.length; i++) {
//			if(classCheck[i]) {
//				System.out.println("����� : " + className[i] + "/ ���� : " + classScore[i]);				
//			}
//		}
//	}

}
