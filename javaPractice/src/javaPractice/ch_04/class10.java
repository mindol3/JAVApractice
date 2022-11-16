package javaPractice.ch_04;

class Cellphone {
	String model = "Galaxy 8";
	String color;
	int capacity;
	
	// 생성자의 특징 1) 클래스의 이름과 같다 2) 반환형이 없다 3) 인스턴스 생성시 단 한번만 자동 실행된다
	
	// 생성자를 정의하지 않으면 void 생성자가 기본으로 제공
	// 생성자를 정의하면 자바가 제공이 되는 void 생성자가 사라짐
	// void 생성자를 사용하려면 따로 정의를 내려줘야 함
	
	Cellphone(String color, int capacity) {// 매개변수가 있는 생성자
		this.color = color; // this는 같은 이름의 변수를 구분하기 위해서 사용
		this.capacity = capacity;
		
	}
}
public class class10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Cellphone myphone1 = new Cellphone(); // 에러 발생
		Cellphone myphone = new Cellphone("Silver", 64);
		
		System.out.println(myphone.model);
		System.out.println(myphone.color);
		System.out.println(myphone.capacity);
		}
	
}
