package javaPractice.ch_04;

class ShopService{
	
	private static ShopService singleton = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return singleton;
	}
}

public class classEx08 {
	/*
	 ShopService ��ü�� �̱������� ��������Ѵ�.
	 ShopService�� getInstance() �޼���� �̱����� ���� �� �ֵ��� ShopService Ŭ������ �ۼ��϶�. */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("���� ShopService ��ü �Դϴ�.");
		}
		else {
			System.out.println("�ٸ� ShopService ��ü �Դϴ�.");			
		}
	}

}
