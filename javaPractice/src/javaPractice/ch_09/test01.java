package javaPractice.ch_09;

/*
 getClass() �޼���� ��ü�� Ŭ���� ������ �����ϴ� Class ��ü�� ����
 * */

class Human {
	int age;
	String name;
	Human(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	void intro() {
		System.out.println("�ȳ�" + age + "��" + name + "�Դϴ�.");
	}

	
}
public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human kim = new Human(29, "��Լ�");
		System.out.println("Ŭ���� �̸�" + kim.getClass());
	}

}
