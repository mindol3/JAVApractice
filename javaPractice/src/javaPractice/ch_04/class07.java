package javaPractice.ch_04;

class Check {
	// instanceVariable : iv
	// classVariable : cv
	// instanceMethod : im
	// classMethod : cm
	
	static int cv = 5; // Ŭ���� ����
	int iv = 4; // �ν��Ͻ� ����
	
	static void cm() {// Ŭ���� �޼���
		
	}
	
	void im() {// �ν��Ͻ� �޼���
		
	}
	
	static void cm_Imember() {//Ŭ���� �޼��尡 �ν��Ͻ� ����� ����
//		System.out.println(iv); //�����߻�
//		im();// �����߻�
	}
	
	void im_Cmember() {
		//�ν��Ͻ� �޼��尡 Ŭ���� ����� ����
		System.out.println(cv);
		cm();
	}
	
	static void cm_Cmemrber() {
		//Ŭ���� �޼��尡 Ŭ���� ����� ����
		System.out.println(cv);
		cm();
	}
	
	void im_Imember() {
		// �ν��Ͻ� �޼��尡 �ν��Ͻ� ����� ����
		System.out.println(iv);
		im();
	}
}

public class class07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check a = new Check();
//		Check.im_Imember(); // ���� 
		a.im_Imember(); // ����
		Check.cm_Cmemrber(); // ����
		
		Check myinstance = new Check();
		myinstance.im_Cmember(); // ����
		myinstance.im_Imember(); // ����
	}

}
