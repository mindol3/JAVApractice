package javaPractice.ch_07;

//Product Ŭ������ ��ӹ޴� Ŭ������, ����ƮTV�� ��ǰ ������ ����ϴ� �� �ʿ�
public class SmartTV extends Product {
	String resolution; // �ػ�
	int inch; // ��ġ
	public SmartTV(String pname, int price, String resolution, int inch, String pcode) {
		this.pname = pname;
		this.price = price;
		this.resolution = resolution;
		this.inch = inch;
		this.pcode = pcode;
	}

	@Override
	public void printExtra() {
		// �߻�Ŭ������ ���ǵ� �߻� �޼��带 �������̵�.
		// �߰� ������ �ػ� ������ ���.
		System.out.print("�ػ�: "+resolution);
		System.out.print("��ġ��: "+inch+"��ġ");
		
	}
	
}
