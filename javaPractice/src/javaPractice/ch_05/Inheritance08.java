package javaPractice.ch_05;



class Car1 {
	String color;
	int door;
	
	void drive() { // �����ϴ±��
		System.out.println("drive, Brrrr~~~");
	}
	
	void stop() { // ���ߴ� ���
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car1 { // �ҹ���
	void water() { // ���� �Ѹ��� ���
		System.out.println("water!!!");
	}
}

public class Inheritance08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*�������� ����ȯ
		 * �ڽ� Ÿ�Կ��� �θ� Ÿ�����δ� �ڵ� ����ȯ������ �θ𿡼� �ڽ�Ÿ�����δ� ����� ����ȯ.*/
		
		Car1 car;
		FireEngine fe = new FireEngine();
		FireEngine fe2;
		
		fe.water();
		car = fe; // car = (Car)fe; ���� ����ȯ�� ������ ����
//		car.water(); // CArŸ���� ���������δ� water()�� ȣ���� �� ����
		fe2 = (FireEngine)car; // �θ�Ÿ�Կ��� �ڽ�Ÿ������ �����Ҷ��� ����ȯ�� �������
		fe2.water();
	}

}
