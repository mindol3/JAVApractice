package javaPractice.ch_04;

class User1 {
	private String name;
	private int age;
	
	User1(String name, int age) {// �Ű������� ���� ������
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
}

public class class11_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User1 user1 = new User1("ö��", 20);//�ν��Ͻ� ����
		User1 user2 = new User1("����", 19);//�ν��Ͻ� ����
		
//		user2.age = 99; // �����߻�. ������ ���� �Ұ�
		
		System.out.println(user1.getName() + "�� ���̴� " + user1.getAge());
		user2.setAge(30);
		System.out.println(user2.getName() + "�� ���̴� " + user2.getAge());
	}

}
