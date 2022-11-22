package javaPractice.ch_05;

import java.util.ArrayList;

class Product {
	int price; // ��ǰ�� ����
	int bonusPoint; // ��ǰ ���Ž� �����ϴ� ���ʽ� ����
	public Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0); // ���ʽ� ������ ��ǰ ������ 10%
	}
}

class Tv1 extends Product {
	Tv1() {
		//���� Ŭ������ ������ Product(int price)�� ȣ���Ѵ�
		super(100); // Tv�� ������ 100�������� �Ѵ�.
	}
	@Override
	public String toString() {
		return "Tv1";
	}
}

class Computer extends Product {
	Computer() {
		//���� Ŭ������ ������ Product(int price)�� ȣ���Ѵ�
		super(200); // Computer�� ������ 200�������� �Ѵ�.
	}
	@Override
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}
	@Override
	public String toString() {
		return "Audio";
	}
}

class Buyer{//��, ������ ��� ���
	int money = 1000; // ���� �ݾ�
	int bonusPoint = 0; // ���ʽ� ����
//	ArrayList item = new ArrayList(); // ������ ��ǰ�� �����ϴµ� ���� ArrayList ��ü
	
	Product[] item = new Product[10]; // ������ ��ǰ�� �����ϱ� ���� �迭
	int i = 0; // Product�迭�� ���� ī����
//	
	void buy(Product p) {// �θ� Ŭ���� Ÿ������ �Ű����� ����.
		// �θ� Ŭ������ �ʵ� ���. price, bonusPoint
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ ��� �����ϴ�.");
			return;
		}
		
		money -= p.price; // ���� ������ ������ ��ǰ�� ������ ����.
		bonusPoint += p.bonusPoint; // ��ǰ�� ���ʽ� ������ �߰��Ѵ�
		item[i++] = p; // ��ǰ�� Product[] item�� �����Ѵ�
//		item.add(p); // ������ ��ǰ�� ArrayList�� �����Ѵ�
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}
//	
//	void refund(Product p) { // ������ ��ǰ�� ȯ���Ѵ�.
//		if(item.remove(p)) { // ��ǰ�� ArrayList���� �����Ѵ�
//			money += p.price;
//			bonusPoint -= p.bonusPoint;
//			System.out.println(p + "��/�� ��ǰ�ϼ̽��ϴ�.");
//		}
//		else { // ���Ž����Ѱ��
//			System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�.");
//		}
//	}
	
	void summary() {			// ������ ��ǰ�� ���� ������ ����ؼ� �����ش�.
		int sum = 0;			// ������ ��ǰ�� �����հ�
		String itemList ="";	// ������ ��ǰ���
		// �ݺ����� �̿��ؼ� ������ ��ǰ�� �� ���ݰ� ����� �����.
//		if(item.isEmpty()) { // Vector�� ����մ��� Ȯ���Ѵ�.
//			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
//			return;
//		}
		// Vector�� i��°�� �ִ� ��ü�� ��� �´�.
//		for(int i = 0; i < item.size(); i++) {
//			Product p = (Product)item.get(i);
//			sum += p.price;
//			itemList += (i==0) ? "" + p : ", " + p;
//		}
		
		
		for(int i = 0; i<this.i; i++) {
			sum += item[i].price;
			itemList += item[i] +" ";
		}
//		
//		for(int i = 0; i < item.length; i++) {
//			if(item[i] == null)
//				break;
//			sum += item[i].price;
//			itemList += item[i] +" ";
//		}
//		
//		for (Product p : item) {
//			if(p == null) {
//				break;
//			}
//				sum += p.price;
//				itemList += p + " ";
//		}
		
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
	}
}

public class InheritanceEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();
		Tv1 tv = new Tv1();
		Computer com = new Computer();
		Audio aduio = new Audio();
		b.buy(tv);
		b.buy(com);
		b.buy(aduio);
		b.summary();
		System.out.println();
//		b.refund(com);
//		b.summary();
		
		System.out.println("���� ���� ���� " + b.money + "�����Դϴ�.");
		System.out.println("���� ���ʽ������� " + b.bonusPoint + "���Դϴ�.");
	}

}
