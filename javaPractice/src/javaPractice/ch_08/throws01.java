package javaPractice.ch_08;

public class throws01 {
	/*
	 ���� ������� ���ܰ� �߻����� ��� ���� �޼��尡 ���ܸ� ó������ �ʰ� �ڽ��� ȣ���� ������ ���� ó���� ���� å���� �ѱ�� ��.
	 ���� ������� ȣ���� ������ å���� �ѱ�� ������ ȣ���� �ʿ� ���� ������ �������� �߻�.
	 ���ܸ� �Ѱܹ��� ���� 1) �ݵ�� ���� ����ó���� �ϰų� 2) �ڽŵ� ���ܸ� ��������.
	 */
	public static void methodA() throws Exception {
		methodB();
	}
	public static void methodB() throws Exception {
		methodC();
//		try {
//			methodC();
//		}
//		catch (Exception e) {
//			System.out.println("methodB���� ó��");
//		}
	}
	
	public static void methodC() throws Exception {
		Exception e = new Exception();
		throw e;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			methodA();
		}
		catch (Exception e) {
			System.out.println("���ο��� ó��");
		}
	}

}
