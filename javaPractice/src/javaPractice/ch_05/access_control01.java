package javaPractice.ch_05;

class User{
	private String name;
	private int age;
	
	User(String name, int age){ // �Ű������� ���� ������
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}

public class access_control01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User("ö��", 20); // �ν��Ͻ� ����
		User user2 = new User("����", 19); // �ν��Ͻ� ����
		
		System.out.println(user1.getName() + "�� ���̴� " + user1.getAge());
		user2.setAge(1000);
		System.out.println(user2.getName() + "�� ���̴� " + user2.getAge());
	}

}
