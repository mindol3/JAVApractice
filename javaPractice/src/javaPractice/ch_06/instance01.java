package javaPractice.ch_06;

class A {
	
	class InstanceInner{} // ���� Ŭ����
	
	static class Staticlnner{} // static ���� Ŭ����. ����ƽ ������� ���� ����
	
	
	Staticlnner st1 = new Staticlnner();
	
	// �ν��Ͻ� ������� ���� ����
	InstanceInner ii1 = new InstanceInner();
	
	static void StaticMethod() {
		// ����ƽ ����� ����ƽ ���� Ŭ������ ���� ����
		Staticlnner st2 = new Staticlnner();
		
		// ����ƽ ����� �ν��Ͻ� ����� ���� �Ұ�
//		 InstanceInner ii2 = new InstanceInner(); // ���� �߻�
	}
	
	void instanceMethod() {
		// �ν��Ͻ� ����� ��� ���� ����
		Staticlnner st3 = new Staticlnner();
		InstanceInner ii3 = new InstanceInner();
		
	}
}

public class instance01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
