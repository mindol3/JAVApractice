package javaPractice.ch_09_test;

public class Cart {
	ShopProduct p ;
	int prductID, cnt;
	String name;
	Cart(int prductID, int cnt, String name){
		this.prductID = prductID; // 상품코드
		this.cnt = cnt; // 구매 개수
		this.name = name;
		p = new ShopProduct();
	}
	
	@Override
	public String toString() {
		return "상품번호: " + prductID + " 갯수: " + cnt +" 상품이름: " + p.products[prductID-1].getProductName()
				+ " 합계 금액: "+ cnt*p.products[prductID-1].getPrice();
	}
}
