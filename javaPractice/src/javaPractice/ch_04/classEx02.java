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
	/*Printer ��ü�� �����ϰ� println() �޼��带 ȣ���ؼ� �Ű����� �ֿܼ� ����Ϸ��� �Ѵ�.
	 * println() �޼����� �Ű������� int, boolean, double, String ���� �� �� �ִ�.
	 * Printer Ŭ�������� println() �޼��带 �����϶�.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("ȫ�浿");
		
//		Printer.println(10);
//		Printer.println(true);
//		Printer.println(5.7);
//		Printer.println("ȫ�浿");
	}

}
