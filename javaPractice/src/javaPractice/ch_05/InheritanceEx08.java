package javaPractice.ch_05;

import java.util.ArrayList;

class Product {
	int price; // 제품의 가격
	int bonusPoint; // 제품 구매시 제공하는 보너스 점수
	public Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0); // 보너스 점수는 제품 가격의 10%
	}
}

class Tv1 extends Product {
	Tv1() {
		//조상 클래스의 생성자 Product(int price)를 호출한다
		super(100); // Tv의 가격을 100만원으로 한다.
	}
	@Override
	public String toString() {
		return "Tv1";
	}
}

class Computer extends Product {
	Computer() {
		//조상 클래스의 생성자 Product(int price)를 호출한다
		super(200); // Computer의 가격을 200만원으로 한다.
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

class Buyer{//고객, 물건을 사는 사람
	int money = 1000; // 소유 금액
	int bonusPoint = 0; // 보너스 점수
//	ArrayList item = new ArrayList(); // 구입한 제품을 저장하는데 사용될 ArrayList 객체
	
	Product[] item = new Product[10]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; // Product배열에 사용될 카운터
//	
	void buy(Product p) {// 부모 클래스 타입으로 매개변수 받음.
		// 부모 클래스의 필드 사용. price, bonusPoint
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
			return;
		}
		
		money -= p.price; // 가진 돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가한다
		item[i++] = p; // 제품을 Product[] item에 저장한다
//		item.add(p); // 구입한 제품을 ArrayList에 저장한다
		System.out.println(p + "을/를 구입하셨습니다.");
	}
//	
//	void refund(Product p) { // 구입한 제품을 환불한다.
//		if(item.remove(p)) { // 제품을 ArrayList에서 제거한다
//			money += p.price;
//			bonusPoint -= p.bonusPoint;
//			System.out.println(p + "을/를 반품하셨습니다.");
//		}
//		else { // 제거실패한경우
//			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
//		}
//	}
	
	void summary() {			// 구매한 물품에 대한 정보를 요약해서 보여준다.
		int sum = 0;			// 구입한 물품의 가격합계
		String itemList ="";	// 구입한 물품목록
		// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
//		if(item.isEmpty()) { // Vector가 비어잇는지 확인한다.
//			System.out.println("구입하신 제품이 없습니다.");
//			return;
//		}
		// Vector의 i번째에 있는 객체를 얻어 온다.
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
		
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
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
		
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
	}

}
