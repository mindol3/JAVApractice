package javaPractice.ch_09_test;

public class ShopProduct {
	Product[] products = new Product[3];
	
	ShopProduct() {
		 products[0] = new Product(1, "���� Ŀ��", 5000);
		 products[1] = new Product(2, "�ĳ��� ���̻�", 15000);
		 products[2] = new Product(3, "�̵���Ǿ� Ŀ��", 10000);
		
	}

	public void printProduct() {
		for(Product p:products) {
			
			System.out.println("��ǰ �ڵ�:" + p.getProductID() + "," 
			+ "��ǰ �̸�:" + p.getProductName()+ "," + "����:" + p.getPrice());
		}
		
	}

}
