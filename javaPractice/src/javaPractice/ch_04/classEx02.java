package javaPractice.ch_04;

class Printer {
	void println(int value) {
		System.out.println(value);
	}
	void println(boolean value) {
		System.out.println(value);
	}
	void println(double value) {
		System.out.println(value);
	}
	void println(String value) {
		System.out.println(value);
	}
	
//	public static void println(int value) {
//		System.out.println(value);
//	}
//	public static void println(boolean value) {
//		System.out.println(value);
//	}
//	public static void println(double value) {
//		System.out.println(value);
//	}
//	public static void println(String value) {
//		System.out.println(value);
//	}
}
public class classEx02 {
	/*Printer 객체를 생성하고 println() 메서드를 호출해서 매개값을 콘솔에 출력하려고 한다.
	 * println() 메서드의 매개값으로 int, boolean, double, String 값을 줄 수 있다.
	 * Printer 클래스에서 println() 메서드를 선언하라.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		
//		Printer.println(10);
//		Printer.println(true);
//		Printer.println(5.7);
//		Printer.println("홍길동");
	}

}
