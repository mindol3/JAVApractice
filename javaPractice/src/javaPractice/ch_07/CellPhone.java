package javaPractice.ch_07;

// Product �߻� Ŭ������ ��ӹ޾� ������ CellPhone Ŭ����
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
		System.out.print("��Ż�: "+carrier);
		System.out.println("������: "+company);
	}
	
}
