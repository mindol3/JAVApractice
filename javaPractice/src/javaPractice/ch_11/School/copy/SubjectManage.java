package javaPractice.ch_11.School.copy;

import java.util.ArrayList;
import java.util.Scanner;

public class SubjectManage {
	static ArrayList<Subject> subjects = new ArrayList();
	static Scanner input = new Scanner(System.in);
	Subject sb = new Subject();	
	// 6. �������� ���� �޴�
		void subjectMenu() {
			while(true) {
				System.out.println("�޴��� �����ϼ���: 1. �������� ��� / 2. �������� ���� / 3. �������� ��ȸ / 4. ���θ޴���");
				int menu = input.nextInt();
						
				switch(menu) {
					case 1:
						System.out.println("�������� ��� �޴��Դϴ�.");
						addSubject();
						continue;
					case 2:
						System.out.println("�������� ���� �޴��Դϴ�.");
						removeSubject();
						continue;
					case 3:
						System.out.println("�������� ��ȸ �޴��Դϴ�.");
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
			System.out.println("�ڵ�: ");
			int code =input.nextInt();
					
			Subject sb = findSubject(code);
			if(sb == null) {
				sb = new Subject(code);
				subjects.add(sb);
			}
			System.out.println("�����: ");
			sb.setSubjectName(input.next());
			
			System.out.println("���� ����� �Ϸ�Ǿ����ϴ�.");
			System.out.println();
			System.out.println(subjects);
		}
		
		void removeSubject() {
			System.out.println("�ڵ�: ");
			int code = input.nextInt();
			
			Subject sb = findSubject(code);
			if(sb == null) {
				System.out.println("�ش� �ڵ� ������ �������� �ʽ��ϴ�.");
				System.out.println();
				return;
			}
			subjects.remove(sb);
			System.out.println("������ ���� �Ϸ�Ǿ����ϴ�.");
			System.out.println();
			System.out.println(subjects);
		}
		
		void printSubjectAll() {
			System.out.println("�����ڵ�\t�����");
			for (Subject sb : subjects) {
				System.out.println(sb.getCode() + "\t" + sb.getSubjectName());
			}
			System.out.println();
		}
}
