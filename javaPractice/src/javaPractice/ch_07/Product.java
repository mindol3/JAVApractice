package javaPractice.ch_07;

// ���θ� ��ǰ ���Ǹ� ���� �߻�Ŭ����,
// �پ��� ��ǰ ������ �����ϱ� ���� �⺻ ���� ���� �� ��¸� �߻�Ŭ�������� �����ϰ�
// �߰� ������ ���� Ŭ�������� �����ϵ��� ������.
public abstract class Product {
	String pname; // ��ǰ��
	int price; // ����
	String pcode; // ��ǰ�ڵ�
	
	// ��ǰ��� ������ ����ϴ� �⺻���� ��� �޼���
	// ��ǰ�� �⺻ ������ ��ǰ �̸��� ������ ���.
	// �� ������ ����Ϸ��� printExtra() �޼��带 ȣ��.
	public void printDetail() {
		System.out.print("��ǰ��: " + pname + " , ");
		System.out.print("����: " + price + " , ");
		System.out.print("��ǰ�ڵ�: " + pcode + " , ");
		printExtra();
	}
	
	// �߻� �޼���. ���� ������ ���� Ŭ�������� ��.
	// printDetail()���� �ڵ����� ȣ���ϹǷ�, printDetail()���� ������ ���뵵 �ڵ����� �Բ����.
	public abstract void printExtra();
}
