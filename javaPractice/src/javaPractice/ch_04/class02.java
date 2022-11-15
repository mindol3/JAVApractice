package javaPractice.ch_04;

class MyStudent { // 메서드는 없는 클래스.
	String name; // 이름
	int grade; // 학년
	int kor; // 국어 성적
	int eng; // 영어 성적
	int math; // 수학 성적
	
	void printStudent() {
		// 변수 하나로 학생 한 명의 여러 정보를 저장할 수 있음.
		System.out.println(name + "는 " + grade + "학년이고, 국어 성적은 " + kor + "점 입니다.");
	}
}

public class class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStudent student1 = new MyStudent(); // class를 모델로 하는 객체 생성.
		// 일반적인 데이터와 타입이 달라서 객체라고 함.
		// 변수 하나로 학생 한 명의 여러 정보를 저장할 수 있음.
		student1.name = "김철수";
		student1.grade = 2;
		student1.kor = 100;
		student1.eng = 90;
		student1.math = 88;
		
		MyStudent student2 = new MyStudent(); // class를 모델로 하는 객체 생성.
		student2.name = "박영수";
		student2.grade = 1;
		student2.kor = 90;
		student2.eng = 70;
		student2.math = 98;
		
		student1.printStudent(); // 김철수는 2학년이고, 국어 성적은 100점 입니다.
		student2.printStudent(); // 박영수는 1학년이고, 국어 성적은 90점 입니다.
		
//		printStudent(student1); // 김철수는 2학년이고, 국어 성적은 100점 입니다.
//		printStudent(student2); // 박영수는 1학년이고, 국어 성적은 90점 입니다.
	}
//	static void printStudent(MyStudent student) {
//		// 변수 하나로 학생 한 명의 여러 정보를 저장할 수 있음.
//		System.out.println(student.name + "는 " + student.grade + "학년이고, 국어 성적은 " + student.kor + "점 입니다.");
//	}
	

}
