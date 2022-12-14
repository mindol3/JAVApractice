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
	 ShopService 객체를 싱글톤으로 만들려고한다.
	 ShopService의 getInstance() 메서드로 싱글턴을 얻을 수 있도록 ShopService 클래스를 작성하라. */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 ShopService 객체 입니다.");
		}
		else {
			System.out.println("다른 ShopService 객체 입니다.");			
		}
	}

}
