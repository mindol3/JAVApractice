package javaPractice.ch_04;

public class class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tv t; // Tv�ν��Ͻ��� �����ϱ� ���� ���� t�� ����
		t = new Tv(); // Tv�ν��Ͻ��� �����Ѵ�.
		t.channel = 7; // Tv�ν��Ͻ��� ������� channel�� ���� 7�� �Ѵ�.
		t.channelDown(); // Tv�ν��Ͻ��� �޼��� channelDown()�� ȣ���Ѵ�.
		System.out.println("���� ä���� " + t.channel + " �Դϴ�."); // ���� ä���� 6 �Դϴ�.

	}

}
