package javaPractice.ch_04;
class MyMath {
	int add(int value1, int value2) {
		return value1 + value2;
	}
	int subtract(int value1, int value2) {
		return value1 - value2;
	}
	int multiply(int value1, int value2) {
		return value1 * value2;
	}
	double divide(double value1, double value2) {
		return value1 / value2;
	}
}
public class classEx03 {
	/*Ŭ���� �޼��� ���� ��*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath mm = new MyMath();
		int result1 = mm.add(5, 3);
		int result2 = mm.subtract(5, 3);
		int result3 = mm.multiply(5, 3);
		double result4 = mm.divide(5, 3);
		// double ��� int ������ ȣ��. �� ���� �ڵ����� double�� �ڵ� ����ȯ
		System.out.println("add(5, 3) = " + result1);
		System.out.println("subtract(5, 3) = " + result2);
		System.out.println("multiply(5, 3) = " + result3);
		System.out.println("divide(5, 3) = " + result4);
	}

}
