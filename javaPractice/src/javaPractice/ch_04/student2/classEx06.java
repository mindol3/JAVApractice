package javaPractice.ch_04.student2;

class Student {
	String name;
	private String rollno;
	int age;
	
	Student(String name, String rollno, int age){
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		System.out.println("학생의 이름 : " + name);
		System.out.println("학생의 학번 : " + rollno);
		System.out.println("학생의 나이 : " + age);
		System.out.println("Student 객체가 생성되었습니다.");
	}
}

public class classEx06 {
	/*
	 학생을 나타내는 클래스 Student를 만든다.
	 학생은 이름(name)과 학번(rollno), 나이(age)를 가진다.
	 학번은 private로 선언한다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("Kim", "0001", 20);
		/*
		  학생의 이름 : Kim
		  학생의 학번 : 0001
		  학생의 나이 : 20
		  Student 객체가 생성되었습니다.
		 * */
	}

}
