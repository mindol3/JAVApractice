package javaPractice.ch_06;

interface Player { // �÷��̾� �������̽�
	void play(); // ���
	void stop(); // ����
}

class VideoPlayer implements Player { // ���� �÷��̾�
	private int id; // ������ȣ
	private static int count = 0; // ������� �Ҵ�� ������ȣ
	
	public VideoPlayer() { //������
		id = ++count;
	}

	@Override
	public void play() { // ���
		System.out.println("�� ���� �������!");
		
	}

	@Override
	public void stop() { // ����
		System.out.println("�� ���� �������!");
		
	}
	
	public void printInfo() { // ������ȣ ǥ��
		System.out.println("�� ����� ������ȣ�� [" + id + "]�Դϴ�.");
	}
	
	
}

class CDPlayer implements Player {// CD �÷��̾�

	@Override
	public void play() {
		System.out.println("�� CD �������!");
		
	}

	@Override
	public void stop() {
		System.out.println("�� CD �������!");
		
	} 
	
	public void cleaning() { // ��� û��
		System.out.println("��带 û���߽��ϴ�.");
	}
	
}

public class interface01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player[] a = new Player[2]; // �������̽��� ������ Ÿ������ �ϴ� �迭 ����.
		a[0] = new VideoPlayer(); // ���� �÷��̾�
		a[1] = new CDPlayer(); // CD �÷��̾�
		
		for(Player p : a) {
			p.play(); // ���
			p.stop(); // ����
			System.out.println();
		}
		
		VideoPlayer[] b = new VideoPlayer[4];
		for (int i = 0; i < b.length; i++) {
			b[i] = new VideoPlayer();
		}
		b[b.length - 1].printInfo(); // �� ����� ������ȣ�� [5]�Դϴ�.
	}

}
