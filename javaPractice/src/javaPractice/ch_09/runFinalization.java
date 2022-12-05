package javaPractice.ch_09;

/*
 finalize() �޼���� ��ü�� ����� �� ȣ��Ǹ� �� ������ ����.
 �޸� ���� ������ �� �ʿ䰡 ������, ��ſ���, DB ���� ���� ������ �ߴٸ� ��ü�� ������� ���� �����ؾ� �� �� ���.
 ������ ������ �÷��Ͱ� ���� �������� �𸣱� ������ ���� ó�� ������� �ϴ� ���� �� ����.
 ������ �÷����� ȣ�� ������ ���� �ӽ��� �����ϸ� �Ѱ��� �� ����.
 
 System.gc() �޼���
 �޸𸮰� ������ �����ϰų� ���α׷��� �Ѱ��� �� ������ �÷��͸� �⵿�Ͽ� �����⸦ ����.
 ������ �÷��ʹ� �ý����� �Ѱ��� �ð��� �˾Ƽ� �����ϵ��� �Ǿ� �־� Ư���� ��Ȳ�� �ƴ� �� �� �޼��� ȣ���� ���� ���ƾ� ��.
 �ڵ����� �����ǵ��� �Ǿ� �ִµ� ������ ����� ������ ������ ������ ������.
 ������ �÷��Ͱ� �����ϸ� ���� �����ؾ� �� �ٸ� �۾��� �ʾ��� ������� �䱸�� ��� �������� ����.
 
 System.runFinalization() �޼���
 ������ �÷��Ϳ� ���� ��ü�� ������ �� finalize �޼��带 ȣ���ϴµ�
 �޸� ȸ�� ���ٴ� ���� �۾��� �ϰ� ���� �� ȣ��.
 �޼��带 ȣ���ϸ� ������ finalize �޼��鸦 ��� ������.
 * */

class Network2 {
	void connect() {
		System.out.println("����Ǿ����ϴ�.");
	}
	
	void disconnect() {
		System.out.println("������ ���������ϴ�.");
	}
	
	@Override
	protected void finalize() throws Throwable{
		/*
		 �ý����� ������ ���� �˾Ƽ� ȣ���ϱ� ������ public�� �ƴ϶� protected ������ ����.
		 �ڽ��� �ڿ��� �����ϱ� ���� �θ��� finalize�� ȣ���Ͽ� �θ��� �ڿ����� �����ϴ� ���� ��Ģ
		 * */
		super.finalize();
		disconnect();
	}
}


public class runFinalization {
	static void communication() {
		Network2 network = new Network2();
		network.connect();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		communication();
		System.gc(); // ������ ������ �÷��͸� ������ ����. ������ ���������ϴ�.
		
		// ������ �÷��͸� �����ص� finalize() �� �ٷ� ȣ��ȴٴ� ������ ����.
		// ���� ���� ���� �������� ���� �� �� �־ �ڿ��� �����Ϸ��� runFinalization() �޼��嵵 ���� ȣ���ؾ� ��.
		System.runFinalization();
	}

}
