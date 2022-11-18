package javaPractice.ch_04;

class ShopSer {
	private static ShopSer singleton = null;
	
	private ShopSer() {}
	
	static ShopSer getInstance() {
		if(singleton == null) {
			singleton = new ShopSer();
		}
		return singleton;
	}
}

public class singleton02 {

}
