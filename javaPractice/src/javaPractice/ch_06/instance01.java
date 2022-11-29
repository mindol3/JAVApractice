package javaPractice.ch_06;

class A {
	
	class InstanceInner{} // 내부 클래스
	
	static class Staticlnner{} // static 내부 클래스. 스태틱 멤버간의 접근 가능
	
	
	Staticlnner st1 = new Staticlnner();
	
	// 인스턴스 멤버간의 접근 가능
	InstanceInner ii1 = new InstanceInner();
	
	static void StaticMethod() {
		// 스태틱 멤버가 스태틱 내부 클래스에 접근 가능
		Staticlnner st2 = new Staticlnner();
		
		// 스태틱 멤버는 인스턴스 멤버에 접근 불가
//		 InstanceInner ii2 = new InstanceInner(); // 에러 발생
	}
	
	void instanceMethod() {
		// 인스턴스 멤버는 모두 접근 가능
		Staticlnner st3 = new Staticlnner();
		InstanceInner ii3 = new InstanceInner();
		
	}
}

public class instance01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
