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
			System.out.println("������ ��ǰ�� ��ȣ�� �Է��� �ֽʽÿ�.>>");
			int a = Integer.parseInt(stdIn.nextLine());	
			if(productID != a) {
				System.out.println("��ǰ��ȣ�� ���Է� ���ֽʽÿ�.>>");
				continue;
			}
//			int productID = stdIn.nextInt();
			System.out.println("��ǰ�� ���� ������ �Է��� �ֽʽÿ�.>>");
			cnt = Integer.parseInt(stdIn.nextLine());
//			int cnt = stdIn.nextInt();
			carts[count++]=new Cart(productID, cnt, name);
			
			System.out.println("�������� ��ǰ�� �� ���� �Ͻðڽ��ϱ�?");
			System.out.println("�� ���Ÿ� ���Ͻø� Y, �׸� �����ϽǷ��� N�� �Է��� �ֽʽÿ�.>>>");
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
