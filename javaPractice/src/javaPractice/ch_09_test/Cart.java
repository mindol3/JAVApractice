package javaPractice.ch_09_test;

public class Cart {
	ShopProduct p ;
	int prductID, cnt;
	String name;
	Cart(int prductID, int cnt, String name){
		this.prductID = prductID; // ��ǰ�ڵ�
		this.cnt = cnt; // ���� ����
		this.name = name;
		p = new ShopProduct();
	}
	
	@Override
	public String toString() {
		return "��ǰ��ȣ: " + prductID + " ����: " + cnt +" ��ǰ�̸�: " + p.products[prductID-1].getProductName()
				+ " �հ� �ݾ�: "+ cnt*p.products[prductID-1].getPrice();
	}
}
