package javaPractice.ch_06;

class Outter2{
	/* �͸� ���� Ŭ����
	 �̸��� ������� �ʴ� Ŭ����.
	 1) �޼��带 ȣ���� �� ���� �ǰų�, 2) ���� ������ ������ �� new ���� ����Ͽ� ����
	 * */
	Runnable getRunnable(int i) { // �޼ҵ� ����
		
		int num = 100;
		
		return new Runnable() {// 1) �޼��带 ȣ���� �� ����
			// �͸� ���� Ŭ����. ���� �뵵�θ� ����� ���̶� �͸� ���� �Լ� ���. Ŭ������ �ٷ� ����
			@Override
			public void run() {
				//num = 200; // ����
				//i = 10; // ����
				System.out.println(i);
				System.out.println(num);
			} 
		};// Ŭ���� ���� ; ���
			
	} 


	Runnable runner = new Runnable() { // 2) ���� ������ ������ �� new ���� ����Ͽ� ����.
		// �͸� ���� Ŭ����. ��ü ������ run() �޼ҵ常 �������̵� �ؼ����.
		@Override
		public void run() {
			System.out.println("Runnable �� ������ �͸� Ŭ���� ����");
			}
		}; // Ŭ���� ���� ; ���
	}

public class instance04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter2 out = new Outter2();
		
		Runnable runnerble = out.getRunnable(10);
		runnerble.run();
		
		out.runner.run(); // Runnable �� ������ �͸� Ŭ���� ����. ��ü.���ΰ�ü.�޼���() �������� ����.
	}

}
