package javaPractice.ch_04;

public class class03_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1.toString()����" + t1.toString() + "�Դϴ�.");
		// t1.toString()����javaPractice.ch_04.Tv@1c4af82c�Դϴ�.
		System.out.println("t2.toString()����" + t2.toString() + "�Դϴ�.");
		// t2.toString()����javaPractice.ch_04.Tv@379619aa�Դϴ�.
		System.out.println();
		
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�."); // 0
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�."); // 0
		System.out.println();
		
		t1.channel = 7; // channel ���� 7���� �Ѵ�.
		System.out.println("t1�� channel���� 7�� �����Ͽ����ϴ�.");
		
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�."); // 7
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�."); // 0
		System.out.println();
		
		t1 = t2; // t1�� ������ �ּҰ��� t2�� ����. ���� ������ ������ �ּҸ� ����Ŵ.
		System.out.println("t1.toString()����" + t1.toString() + "�Դϴ�.");
		System.out.println("t2.toString()����" + t2.toString() + "�Դϴ�.");
		System.out.println();
		
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�."); // 0
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�."); // 0
		System.out.println();
		
		t1.channel = 27;
		System.out.println("t1�� channel���� 27�� �����Ͽ����ϴ�.");
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�."); // 27
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�."); // 27
	}

}
