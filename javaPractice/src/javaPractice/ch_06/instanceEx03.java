package javaPractice.ch_06;

/*
 MyOuter2.test()�� ȣ���ؼ� �Ʒ��� ���� ����� �ǵ��� main()�޼��� �ۼ�.
 '������: �̸�: ȫ�浿,����: 20, �ּ�:������ ������;
 * */

class MyOuter2 {
	private String name;
	private int age;
	
	public MyOuter2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void test() {
		int num = 4;
		class Inner {
			private String address;
			public Inner(String address) {
				this.address = address;
			}
			public String getCustomerInfo() {
				System.out.println("inner_test() : " + num);
				
				return "�̸�: " +name+ ",����: " +age+ ", �ּ�: " +address;
			}
		} // end Inner.class
		Inner inner = new Inner("������ ������");
		System.out.println("������: " +inner.getCustomerInfo());
	}
}


public class instanceEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyOuter2 outer = new MyOuter2("ȫ�浿",20);
		outer.test();
	}

}
