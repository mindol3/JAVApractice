package javaPractice.ch_04;

public class class01_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� Ŭ������ ������ ���� �� ��ü�� ������ ���������� ���� �ٸ� ��������� ����.
		Car mycar1 = new Car(); // car �ν��Ͻ� ����
		Car mycar2 = new Car(); // car �ν��Ͻ� �ϳ� �� ����
		
		mycar1.color = "red"; // mycar1�� ���� ����
		mycar2.color = "black"; // mycar1�� ���� ����
		mycar1.speedUp(); // mycar1 ���� �޼��� ȣ��
		mycar2.wiper(); // mycar2 ������ �޼��� ȣ��
		
		System.out.println("mycar1�� �� : " + mycar1.color);
		System.out.println("mycar2�� �� : " + mycar2.color);
		System.out.println("mycar1�� �ӵ� : " + mycar1.speed);
		System.out.println("mycar2�� �ӵ� : " + mycar2.speed);
		System.out.println("mycar1�� ������ �۵� ���� : " + mycar1.wiperOn);
		System.out.println("mycar2�� ������ �۵� ���� : " + mycar2.wiperOn);
		
	}

}
