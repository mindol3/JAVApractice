package javaPractice.ch_05;
/*
 final ���� :
 final �޼��� : ������ �� �̻� ������ �� ���� �޼���. �������̵� �Ұ�
 final Ŭ���� : ������ �� �̻� ������ �� ���� Ŭ����. ��� �Ұ�
 */

final class FinalClass {
	final int number = 4; // ���
}

class Parents // extends FinalClass //�����߻� ����� �Ұ��� Ŭ����
{
	final void finalMethod() { // �������̵� �Ұ��� �޼���
		System.out.println("��� �Ұ��� �޼ҵ�");
	}
}

class Son extends Parents {
	// void finalMethod() {} // �����߻� �������̵� �Ұ��� �޼���
}

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 FinalClass member1 = new FinalClass();
		 System.out.println(member1.number);
		 Parents p = new Parents();
		 p.finalMethod();
		 // member1.number = 5; // ����� ������ �Ұ���
	}

}
