package javaPractice.ch_07;

public class ShopLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IShop shop = new MyShop();
		shop.setTitle("MyShop");
		shop.genUser();
		shop.genProduct();
		shop.start();
	}

}
