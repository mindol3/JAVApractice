package javaPractice.ch_06;

// �������̽� ��� ��� ��
interface Skinnable {
	int BLACK = 0; // ���� // public static final
	int RED = 1; // ����
	int GREEN = 2; // ���
	int BLUE = 3; // �Ķ�
	int LEOPARD = 4; // ǥ�� ����
	void changeSkin(int skin); // ��Ų���� public abstract
}

class PortablePlayer implements Player, Skinnable {
	private int skin = BLACK;
	
	public PortablePlayer() { } // ������


	@Override
	public void play() {
		System.out.println("�� �������!");
		
	}

	@Override
	public void stop() {
		System.out.println("�� �������!");
		
	}
	@Override
	public void changeSkin(int skin) { // ��Ų����
		System.out.println("��Ų�� ");
		switch (skin) {
		case BLACK: System.out.println("����"); break;
		case RED: System.out.println("����"); break;
		case GREEN: System.out.println("���"); break;
		case BLUE: System.out.println("�Ķ�"); break;
		case LEOPARD: System.out.println("ǥ������"); break;
		default : System.out.println("�⺻��"); break;
		}
		System.out.println("(��)�� �����߽��ϴ�.");
		
	}
	
}

public class interface02 {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		PortablePlayer a = new PortablePlayer();
		a.play(); // ���
		a.stop(); // ����
		System.out.println(Skinnable.LEOPARD);
		a.changeSkin(Skinnable.LEOPARD);
	}

}
