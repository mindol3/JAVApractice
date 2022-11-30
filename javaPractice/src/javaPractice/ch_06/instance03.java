package javaPractice.ch_06;

/*
 ���� ���� Ŭ������ ����
 �ܺ� Ŭ������ �޼��� ������ ���ǵ� Ŭ����.
 �޼��� ȣ�� �ÿ� �����ǰ� �����ϸ� �Ҹ�
 
 �޼����� ���������� ���ø޸𸮿��� ����ǹǷ� ȣ�� �� �����ϸ� �Ҹ�
 ������ ���� ���� Ŭ������ ��ü�� ������ ������ �ǹǷ� �޼��尡 ȣ���� ������ �����ϴ��� �������.
 ���� ���� Ŭ������ ���α׷��ֿ��� ���� ������� ����. �̷� ���� Ŭ������ �ִٴ� ������ �˾Ƶδ� ����.
 * */
class OutClass_03{
	// Runnable �������̽��� �����ϴ� Ŭ������ ���� ���� Ŭ������ ���� ����.
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {// ��ȯ���� Runnable�� �޼���
		int num = 100;
		/*
		 Runnable �������̽��� �ڹٿ��� �����带 ���� �� ����ϴ� �������̽���
		 java.lang ��Ű���� ����Ǿ� ������ �ݵ�� run() �޼��带 �����ؾ���.
		 * */
		class MyRunnable implements Runnable{
			
			int localNum = 10;
			
			@Override
			public void run() {
				/* ���� ���� Ŭ������ ����� �޼����� ���������� ������� ����.
				 num = 200; // ���� ���������� ����� �ٲ�.���� ������ ���ص� ���°��� ����
				 i = 100; // ���� �Ű� ���� ���� ��������ó�� ����� �ٲ� ���� ������ ���ص� ���� ���� ����.
				 * */
				System.out.println("i =" +i); // �� ������ ���ص� ���� ���� ����
				System.out.println("num = "+num); // �� ������ ���ص� ���� ���� ����
				System.out.println("localNum = " +localNum);
				
				System.out.println("outNum = " +outNum+ "(�ܺ� Ŭ���� �ν��Ͻ� ����)");
				System.out.println("Outter.sNum = " +OutClass_03.sNum+ "(�ܺ� Ŭ���� ���� ����)");
			}
			
		}
		return new MyRunnable();
	}
	
	
}


public class instance03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutClass_03 out = new OutClass_03();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}

}
