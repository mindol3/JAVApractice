package javaPractice.ch_05;

class Student2 {
	void learn() {
		System.out.println("배우기");
	}
	
	void eat() {
		System.out.println("밥먹기");
	}
	
	void say() {
		System.out.println("말하기");
	}
}

class Leader extends Student2{
	void lead() {
		
	}
	// 오버라이딩은 자손 클래스에서 부모 클래스로부터 물려받은 메서드를 다시 작성하는 것

	@Override
	void say() {
		// TODO Auto-generated method stub
		System.out.println("선생님께 인사"); // 오버라이딩
		//super.say(); // 부모클래스의 메서드 실행
	}
	
}

public class Overriding01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leader leader = new Leader();
		leader.eat(); // 상속 받은 메서드 사용
		leader.say(); // 오버 라이딩한 메서드 사용
		
	}

}
