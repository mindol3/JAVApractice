package javaPractice.ch_05;

public class Inheritance09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*instanceof 연산자
		 * a instanceof B : a 는 B의 객체이다.*/
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) { // fe는 FireEngine의 객체이다.
			System.out.println("This is a FireEngine instance.");
		}
		
		if(fe instanceof Car1) { // fe는 Car1의 객체이다.
			System.out.println("This is a Car1 instance.");
		}
		if(fe instanceof Object) { // fe는 Object의 객체이다.
			System.out.println("This is a Object instance.");
		}
		System.out.println();
		
		Car1 polyFe = new FireEngine(); // 다형성 사용해서 참조 변수 만듬.
		if(polyFe instanceof FireEngine) { // polyFe는 FireEngine의 객체이다.
			System.out.println("This is a FireEngine instance.");
		}
		if(polyFe instanceof Car1) { // polyFe는 Car1의 객체이다.
			System.out.println("This is a Car1 instance.");
		}
		if(polyFe instanceof Object) { // polyFe는 Object의 객체이다.
			System.out.println("This is a Object instance.");
		}
		System.out.println();
		
		Car1 car = new Car1(); // 부모 클래스로 객체 생성
		if(car instanceof FireEngine) { 
			System.out.println("This is a FireEngine instance.");
		}
		if(car instanceof Car1) { // car는 Car1의 객체이다.
			System.out.println("This is a Car1 instance.");
		}
		if(car instanceof Object) { // car는 Object의 객체이다.
			System.out.println("This is a Object instance.");
		}
	}

}
