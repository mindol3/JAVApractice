package javaPractice.ch_04.student2;

class Student {
	String name;
	private String rollno;
	int age;
	
	Student(String name, String rollno, int age){
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		System.out.println("�л��� �̸� : " + name);
		System.out.println("�л��� �й� : " + rollno);
		System.out.println("�л��� ���� : " + age);
		System.out.println("Student ��ü�� �����Ǿ����ϴ�.");
	}
}

public class classEx06 {
	/*
	 �л��� ��Ÿ���� Ŭ���� Student�� �����.
	 �л��� �̸�(name)�� �й�(rollno), ����(age)�� ������.
	 �й��� private�� �����Ѵ�.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("Kim", "0001", 20);
		/*
		  �л��� �̸� : Kim
		  �л��� �й� : 0001
		  �л��� ���� : 20
		  Student ��ü�� �����Ǿ����ϴ�.
		 * */
	}

}
