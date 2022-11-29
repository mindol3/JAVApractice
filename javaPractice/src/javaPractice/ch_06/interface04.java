package javaPractice.ch_06;

interface Buy {
	void buy ();
	void info();
	
	default void order() {
		System.out.println("구매 주문");
	}
}

interface Sell {
	void sell ();
	void info();
	
	default void order() {
		System.out.println("판매 주문");
	}
}

class Customer implements Buy, Sell {

	@Override
	public void buy() {
		System.out.println("구매하기");
	}
	
	@Override
	public void sell() {
		System.out.println("판매하기");		
	}

	// 두 인터페이스에 이름이 같은 메서드가 선언되었다고 해도 구현은 클래스에서 이루어 지므로,
	// 어떤 메서드를 호출해야 하는지 모호하지 않음

	@Override
	public void info() {
		System.out.println("Customer 입니다.");
		
	}
	
	// 디폴트 메서드가 중복이 되었으니 두 인터페이스를 구현하는 Customer 클래스에서 재정의 해야 함.
	@Override
	public void order() {
		System.out.println("고객 판매 주문");
	}
	/*
	 두 인터페이스의 디폴트 메서드가 중복되는 경우.
	 한 클래스가 다중 구현한 인터페이스에 동일한 디폴트 메서드가 있는 경우
	 오버라이딩을 해야 함.
	 * */
	
	
	/*
	 -한 클래스가 여러 인터페이스를 구현하는 경우-
	 한 클래스가 여러 클래스를 상속 받으면 메서드 호출이 모호해지는 문제가 발생할 수 있음.
	 하지만 인터페이스는 한 클래스가 여러 인터페이스를 구현할 수 있음.
	 인터페이스는 구현 코드나 멤버 변수를 가지지 않기 때문에 여러 개를 동시에 구현할 수 있음.
	 두 인터페이스에 이름이 같은 메서드가 선언되었다고 해도 구현은 클래스에서 이루어지므로,
	 어떤 메서드를 호출해야 하는지 모호하지 않은것
	 * */
}

public class interface04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		
		// Customer 클래스형인 customer를 Buy 인터페이스형인 buyer에 대입하여 형 변환.
		// buyer는 Buy 인터페이스의 메서드만 호출 가능.
		Buy buyer = customer;
		buyer.buy();
		//buyer.sell(); // buy 인터페이스에 sell 메서드는 없음
		buyer.order(); // 고객 판매 주문
		
		// Customer 클래스형인 customer를 Sell 인터페이스형인 seller에 대입하여 형 변환.
		// buyer는 Buy 인터페이스의 메서드만 호출 가능.
		Sell seller = (Sell)customer; // (Sell) 생략가능
		seller.sell();
		//seller.buy(); // sell 인터페이스에 buy 메서드는 없음
		seller.order(); // 고객 판매 주문
		buyer.order(); // 고객 판매 주문
	
		
		if ( seller instanceof Customer) {
			// seller를 하위 클래스 형인 Customer로 다시 형 변환.
			Customer customer2 = (Customer) seller;
			customer2.buy();
			customer2.sell();
		}
		customer.order(); // 고객 판매 주문
	}

}
