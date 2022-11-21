package javaPractice.ch_05;

class Person {// 사람클래스
	void breath() {
		System.out.println("숨쉬기");
	}
	void eat() {
		System.out.println("밥먹기");
	}
	void say() {
		System.out.println("말하기");
	}
}

class Student extends Person {// 사람 클래스를 상속한 학생 클래스
	void learn() {
		System.out.println("배우기");
	}
}

class Teacher extends Person {// 사람 클래스를 상속한 선생 클래스
	void teach() {
		System.out.println("가르치기");
	}
}
public class Inheritance01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(); // 학생 인스턴스 s1 생성
		s1.breath(); // 사람 클래스의 breath 메서드를 상속 받앗음
		s1.learn();
		s1.say(); // 사람 클래스의 say 메서드를 상속 받앗음
		System.out.println();
		
		Teacher t1 = new Teacher();
		t1.eat(); // 사람 클래스의 eat 메서드를 상속 받앗음
		t1.teach();
		t1.say(); // 사람 클래스의 say 메서드를 상속 받앗음
		System.out.println();
		
		Person person = new Person();
		person.breath();
		// person.learn(); // 자식 클래스의 메서드나 멤버 변수는 사용하지 못함.
	}

}
