package javaPractice.ch_04;

public class Singleton {
	/*
	싱글턴 singleton
	전체 프로그램에서 단 하나의 객체만 만들어서 보장해야 하는 경우에 사용.
	생성자를 호출한 만큼 객체가 생성되기 때문에
	싱글턴을 만들려면 클래스 외부에서 new 연산자로 생성자를 호출할 수 없도록 만들어야 함.
	외부에서 생성자를 호출할 수 없도록 생성자 앞에 private 접근제한자를 붙여줌.
	
	그리고 자신의 타입인 정적 필드를 하나 선언하고 자신의 객체를 생성해 초기화함.
	생성자가 private 이지만 클래스 내부에서는 호출이 가능.
	정적 필드도 private 접근 제한자를 붙여 외부에서 필드값을 변경하기 못하도록 막음.
	
	대신 외부에서 호출할 수 있는 정적 메소드인 getInstance()를 선언하고
	정적 필드에서 참조하고 있는 자신의 객체를 리턴.
	*/
	
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
