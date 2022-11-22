package javaPractice.ch_05;

class Animal {
	void walk() {
		System.out.println("걸을 수 있음");
	}
}

class Bird extends Animal {
	void fly() {
		System.out.println("날을 수 있음");
	}
	
	void sing() {
		System.out.println("노래 부를 수 있음");
	}
	
//	void walk() {
//		System.out.println("걸을 수 있습니다");
//	}
}

public class InheritanceEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird = new Bird();
		bird.walk(); // 걸을 수 있음
		bird.fly(); // 날을 수 있음
		bird.sing(); // 노래 부를 수 있음
	}

}
