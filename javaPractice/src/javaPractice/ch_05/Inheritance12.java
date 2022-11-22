package javaPractice.ch_05;

class Animal1{
	void breath() {
		System.out.println("숨쉬기");
	}
}

class Lion extends Animal1{
	@Override
	public String toString() {
		return "사자";
	}
}

class Zookeeper {// 사육사 클래스
//	void feed(Lion lion) {//사자에게 먹이 주는 메서드
//		System.out.println(lion + "에게 고기 주기");
//	}
//	void feed(Rabbit rabbit) {//사자에게 먹이 주는 메서드
//		System.out.println(rabbit + "에게 고기 주기");
//	}
//	void feed(Monkey monkey) {//사자에게 먹이 주는 메서드
//		System.out.println(monkey + "에게 고기 주기");
//	}
	void feed(Animal1 animal) {
		System.out.println(animal + "에게 고기 주기");
	}
}

class Rabbit extends Animal1{
	public String toString() {
		return "토끼";
	}
}
class Monkey extends Animal1{
	public String toString() {
		return "원숭이";
	}
}

public class Inheritance12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal1 lion = new Lion(); //Lion 인스턴스 생성
		Animal1 rabbit = new Rabbit();
		Animal1 monkey = new Monkey();
		Zookeeper james = new Zookeeper(); // james 라는 이름의 사육사 인스턴스 생성
		james.feed(lion); // james가 lion에게 먹이를 줌
		james.feed(rabbit);
		james.feed(monkey);
	}

}
