package javaPractice.ch_04;

public class Tv {
	// Tv�� �Ӽ�(�������)
	String color; // ����
	boolean power; // ��������(on/off)
	int channel; // ä��
	
	// Tv�� ���(�޼���)
	void power() { // TV�� �Ѱų� ���� ����� �ϴ� �޼���
		power = !power;
	}
	void channelUp() { // TV�� ä���� ���̴� ����� �ϴ� �޼���
		++channel;
	}
	void channelDown() {// TV�� ä���� ���ߴ� ����� �ϴ� �޼���
		--channel;
	}
}
