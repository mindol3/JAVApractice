package javaPractice.ch_04;

class Cars {
	static int wheel = 4; //  Ŭ���� ����
	int speed; // �ν��Ͻ� ����
}
public class class05 {
	/*
	 �ν��Ͻ� ������ ������ �ν��Ͻ����� ������ ���� ������ ������ �ֱ� ������ ������ ������ ����.
	 Ŭ���� ������ 1) �ϳ��� ���� ������ ��� �ν��Ͻ��� �Բ� �����ϱ� ������
	 �ϳ��� ���������� ���� �����ϴ��� ��� �ν��Ͻ��� ���� ���ϰ� ��.
	 2) �ν��Ͻ� �������� ���ٰ����ϱ� ������ Ŭ���� �̸����� ������ ��*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Cars.wheel); // Ŭ���� ���� ���ٰ���
//		System.out.println(Cars.speed); // �����߻�. �ν��Ͻ� ���� ���� �Ұ�
		
		Cars myCar1 = new Cars();
		
		System.out.println(Cars.wheel);
		System.out.println(myCar1.speed); // �ν��Ͻ� ���� �Ŀ��� ���� ����
		
		Cars myCar2 = new Cars();
		
		System.out.println("<���� ��>");
		System.out.println("myCar1.speed: " + myCar1.speed); // 0
		System.out.println("myCar2.speed: " + myCar2.speed); // 0
		System.out.println("myCar1.wheel: " + myCar1.wheel); // 0
		System.out.println("myCar2.wheel: " + myCar2.wheel); // 0
		
		myCar2.speed = 100;
		myCar2.wheel = 5;
		
		System.out.println("<���� ��>");
		System.out.println("myCar1.speed: " + myCar1.speed); // 0
		System.out.println("myCar2.speed: " + myCar2.speed); // 100
		System.out.println("myCar1.wheel: " + myCar1.wheel); // 5
		System.out.println("myCar2.wheel: " + myCar2.wheel); // 5
		
	}

}
