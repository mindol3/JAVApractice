package javaPractice.ch_04;

public class Singleton_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������� ���������ڰ� private���� ������ �ȵ�.
		//Singleton singleton1 = new Singleton(); //������ ����
		//Singleton singleton2 = new Singleton(); //������ ����
		
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		if (singleton1 == singleton2) {
			System.out.println("���� Singleton ��ü�Դϴ�.");
		}
		else {
			System.out.println("�ٸ� Singleton ��ü�Դϴ�.");
		}
	}

}
