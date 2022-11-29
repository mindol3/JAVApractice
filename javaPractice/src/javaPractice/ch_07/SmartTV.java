package javaPractice.ch_07;

//Product 클래스를 상속받는 클래스로, 스마트TV의 제품 정보를 등록하는 데 필요
public class SmartTV extends Product {
	String resolution; // 해상도
	int inch; // 인치
	public SmartTV(String pname, int price, String resolution, int inch, String pcode) {
		this.pname = pname;
		this.price = price;
		this.resolution = resolution;
		this.inch = inch;
		this.pcode = pcode;
	}

	@Override
	public void printExtra() {
		// 추상클래스에 정의된 추상 메서드를 오버라이딩.
		// 추가 정보인 해상도 정보를 출력.
		System.out.print("해상도: "+resolution);
		System.out.print("인치수: "+inch+"인치");
		
	}
	
}
