package javaPractice.ch_04;

class Car {
	boolean powerOn; // �õ�
	String color; // ������ ����
	int wheel; // ������ ��
	int speed; // �ӷ�
	boolean wiperOn; // ������
	
	void power() {
		powerOn = !powerOn; // �õ� �޼���
	}
	void speedUp() {
		speed++; //���� �޼���
	}
	void speedDown() {
		speed--;//�극��ũ �޼���
	}
	void wiper() {
		wiperOn = !wiperOn; // ������ �޼���
	}
}

public class class01 {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
