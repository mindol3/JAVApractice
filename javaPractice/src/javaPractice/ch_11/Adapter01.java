package javaPractice.ch_11;
/* ����͸� �����ϸ� ��ȯ�� converter��� �� �� ����.
 * ��ȯ���� ������ ���� �ٸ� �� �������̽� ���̿� ����� �����ϰ� �ϴ� ��
 */
class ServiceA{
	void runWork() {
		System.out.println("work");
	}
}

class ServiceB{
	void runStudy() {
		System.out.println("study");
	}
}

class AdapterServiceA{
	ServiceA serviceA = new ServiceA();
	void runService() {
		serviceA.runWork();
	}
}

class AdapterServiceB{
	ServiceB serviceB = new ServiceB();
	void runService() {
		serviceB.runStudy();
	}
}

public class Adapter01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdapterServiceA asa1 = new AdapterServiceA();
		AdapterServiceB asb1 = new AdapterServiceB();
		
		// ������ �޼��� ���� ����� �� ����
		asa1.runService();
		asb1.runService();
	}

}
