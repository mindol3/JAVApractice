package javaPractice.ch_01;

public class Exam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� ������
		double a = 3.14;
		double b = 5.14;
		System.out.println(a == b); // f
		System.out.println(a != b); // t
		
		// ���ڿ��� ��� equlas() �޼��带 �̿��ؼ� ���� ��
		String c1 = "Hello JAVA!";
		System.out.println(c1.equals("Hello java!")); // f
		System.out.println(c1.equals("Hello JAVA!")); // t
		
		// == �� ��ü�� �ּҰ��� ��
		System.out.println(c1 == ("Hello java!")); // f
		System.out.println(c1 == ("Hello JAVA!")); // t
	}

}
