package javaPractice.ch_04;

class Check {
	// instanceVariable : iv
	// classVariable : cv
	// instanceMethod : im
	// classMethod : cm
	
	static int cv = 5; // 클래스 변수
	int iv = 4; // 인스턴스 변수
	
	static void cm() {// 클래스 메서드
		
	}
	
	void im() {// 인스턴스 메서드
		
	}
	
	static void cm_Imember() {//클래스 메서드가 인스턴스 멤버에 접근
//		System.out.println(iv); //에러발생
//		im();// 에러발생
	}
	
	void im_Cmember() {
		//인스턴스 메서드가 클래스 멤버에 접근
		System.out.println(cv);
		cm();
	}
	
	static void cm_Cmemrber() {
		//클래스 메서드가 클래스 멤버에 접근
		System.out.println(cv);
		cm();
	}
	
	void im_Imember() {
		// 인스턴스 메서드가 인스턴스 멤버에 접근
		System.out.println(iv);
		im();
	}
}

public class class07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check a = new Check();
//		Check.im_Imember(); // 에러 
		a.im_Imember(); // 성공
		Check.cm_Cmemrber(); // 성공
		
		Check myinstance = new Check();
		myinstance.im_Cmember(); // 성공
		myinstance.im_Imember(); // 성공
	}

}
