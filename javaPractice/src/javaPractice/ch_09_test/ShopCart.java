package javaPractice.ch_09_test;

import java.util.Scanner;

public class ShopCart {
	Cart[] carts = new Cart[10];
	int count=0;
	int productID; int cnt;
	String name;
	public void printCart() {
		for(Cart cart:carts) {
			if(cart !=null) {
				System.out.println(cart);
			}
		}
		
	}
	public void selectProduct() {
		while(true) {
			Scanner stdIn = new Scanner(System.in);
			System.out.println("구매할 상품의 번호를 입력해 주십시요.>>");
			int a = Integer.parseInt(stdIn.nextLine());	
			if(productID != a) {
				System.out.println("상품번호를 재입력 해주십시요.>>");
				continue;
			}
//			int productID = stdIn.nextInt();
			System.out.println("상품의 구매 갯수를 입력해 주십시요.>>");
			cnt = Integer.parseInt(stdIn.nextLine());
//			int cnt = stdIn.nextInt();
			carts[count++]=new Cart(productID, cnt, name);
			
			System.out.println("상점에서 상품을 더 구매 하시겠습니까?");
			System.out.println("더 구매를 원하시면 Y, 그만 쇼핑하실려면 N을 입력해 주십시요.>>>");
			String buy = stdIn.nextLine();
			
				if(buy.equals("Y")) {
					continue;
				}
				else if(buy.equals("N")) {
					break;
				}
		}
		
	}


}
