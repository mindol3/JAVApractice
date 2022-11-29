package javaPractice.ch_06;

interface Buy {
	void buy ();
	void info();
	
	default void order() {
		System.out.println("���� �ֹ�");
	}
}

interface Sell {
	void sell ();
	void info();
	
	default void order() {
		System.out.println("�Ǹ� �ֹ�");
	}
}

class Customer implements Buy, Sell {

	@Override
	public void buy() {
		System.out.println("�����ϱ�");
	}
	
	@Override
	public void sell() {
		System.out.println("�Ǹ��ϱ�");		
	}

	// �� �������̽��� �̸��� ���� �޼��尡 ����Ǿ��ٰ� �ص� ������ Ŭ�������� �̷�� ���Ƿ�,
	// � �޼��带 ȣ���ؾ� �ϴ��� ��ȣ���� ����

	@Override
	public void info() {
		System.out.println("Customer �Դϴ�.");
		
	}
	
	// ����Ʈ �޼��尡 �ߺ��� �Ǿ����� �� �������̽��� �����ϴ� Customer Ŭ�������� ������ �ؾ� ��.
	@Override
	public void order() {
		System.out.println("�� �Ǹ� �ֹ�");
	}
	/*
	 �� �������̽��� ����Ʈ �޼��尡 �ߺ��Ǵ� ���.
	 �� Ŭ������ ���� ������ �������̽��� ������ ����Ʈ �޼��尡 �ִ� ���
	 �������̵��� �ؾ� ��.
	 * */
	
	
	/*
	 -�� Ŭ������ ���� �������̽��� �����ϴ� ���-
	 �� Ŭ������ ���� Ŭ������ ��� ������ �޼��� ȣ���� ��ȣ������ ������ �߻��� �� ����.
	 ������ �������̽��� �� Ŭ������ ���� �������̽��� ������ �� ����.
	 �������̽��� ���� �ڵ峪 ��� ������ ������ �ʱ� ������ ���� ���� ���ÿ� ������ �� ����.
	 �� �������̽��� �̸��� ���� �޼��尡 ����Ǿ��ٰ� �ص� ������ Ŭ�������� �̷�����Ƿ�,
	 � �޼��带 ȣ���ؾ� �ϴ��� ��ȣ���� ������
	 * */
}

public class interface04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		
		// Customer Ŭ�������� customer�� Buy �������̽����� buyer�� �����Ͽ� �� ��ȯ.
		// buyer�� Buy �������̽��� �޼��常 ȣ�� ����.
		Buy buyer = customer;
		buyer.buy();
		//buyer.sell(); // buy �������̽��� sell �޼���� ����
		buyer.order(); // �� �Ǹ� �ֹ�
		
		// Customer Ŭ�������� customer�� Sell �������̽����� seller�� �����Ͽ� �� ��ȯ.
		// buyer�� Buy �������̽��� �޼��常 ȣ�� ����.
		Sell seller = (Sell)customer; // (Sell) ��������
		seller.sell();
		//seller.buy(); // sell �������̽��� buy �޼���� ����
		seller.order(); // �� �Ǹ� �ֹ�
		buyer.order(); // �� �Ǹ� �ֹ�
	
		
		if ( seller instanceof Customer) {
			// seller�� ���� Ŭ���� ���� Customer�� �ٽ� �� ��ȯ.
			Customer customer2 = (Customer) seller;
			customer2.buy();
			customer2.sell();
		}
		customer.order(); // �� �Ǹ� �ֹ�
	}

}
