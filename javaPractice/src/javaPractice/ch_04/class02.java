package javaPractice.ch_04;

class MyStudent { // �޼���� ���� Ŭ����.
	String name; // �̸�
	int grade; // �г�
	int kor; // ���� ����
	int eng; // ���� ����
	int math; // ���� ����
	
	void printStudent() {
		// ���� �ϳ��� �л� �� ���� ���� ������ ������ �� ����.
		System.out.println(name + "�� " + grade + "�г��̰�, ���� ������ " + kor + "�� �Դϴ�.");
	}
}

public class class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStudent student1 = new MyStudent(); // class�� �𵨷� �ϴ� ��ü ����.
		// �Ϲ����� �����Ϳ� Ÿ���� �޶� ��ü��� ��.
		// ���� �ϳ��� �л� �� ���� ���� ������ ������ �� ����.
		student1.name = "��ö��";
		student1.grade = 2;
		student1.kor = 100;
		student1.eng = 90;
		student1.math = 88;
		
		MyStudent student2 = new MyStudent(); // class�� �𵨷� �ϴ� ��ü ����.
		student2.name = "�ڿ���";
		student2.grade = 1;
		student2.kor = 90;
		student2.eng = 70;
		student2.math = 98;
		
		student1.printStudent(); // ��ö���� 2�г��̰�, ���� ������ 100�� �Դϴ�.
		student2.printStudent(); // �ڿ����� 1�г��̰�, ���� ������ 90�� �Դϴ�.
		
//		printStudent(student1); // ��ö���� 2�г��̰�, ���� ������ 100�� �Դϴ�.
//		printStudent(student2); // �ڿ����� 1�г��̰�, ���� ������ 90�� �Դϴ�.
	}
//	static void printStudent(MyStudent student) {
//		// ���� �ϳ��� �л� �� ���� ���� ������ ������ �� ����.
//		System.out.println(student.name + "�� " + student.grade + "�г��̰�, ���� ������ " + student.kor + "�� �Դϴ�.");
//	}
	

}
