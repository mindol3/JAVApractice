package javaPractice.ch_06;

interface Anony {
	public void print();
}

public class instance05 {
	public void printB(Anony a) {// �������̽� Anony Ÿ���� ��ü�� �Ű������� �޴� �޼���
		a.print();
	}
	/*
	 �ʿ��� ������ �������̽��� ���� Ŭ������ �ν��Ͻ��� ���� �������� �߻�޼��带 ������ �Ŀ� ���.
	 �ڹٳ� �ȵ���̵忡�� ������ ������� �͸��� ���� Ŭ������ �̿��Ͽ� ȭ�鿡�� �̺�Ʈ ó���� ��.
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		instance05 t= new instance05();
		// Anony Ŭ���� �ν��Ͻ��� �� �κп��� �Ͻ������� ���Ǿ� ����.
		t.printB(new Anony() {
			@Override
			public void print() {
				System.out.println("�͸� Ŭ���� ��� ���Դϴ�.");
			}
		});
	}

}
