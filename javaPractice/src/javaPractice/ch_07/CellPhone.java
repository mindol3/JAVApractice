package javaPractice.ch_07;

// Product 추상 클래스를 상속받아 구현한 CellPhone 클래스
public class CellPhone extends Product {
	String carrier;
	String company;
	public CellPhone(String pname, int price, String carrier, String company, String pcode) {
		this.pname = pname;
		this.price = price;
		this.carrier = carrier;
		this.company = company;
		this.pcode = pcode;
	}

	@Override
	public void printExtra() {
		System.out.print("통신사: "+carrier);
		System.out.println("제조사: "+company);
	}
	
}
