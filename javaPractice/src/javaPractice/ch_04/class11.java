package javaPractice.ch_04;

class User {
	public String name;
	public int age;
	
	User(String name, int age) {// �Ű������� ���� ������
		this.name = name;
		this.age = age;
	}
}

public class class11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User("ö��", 20);//�ν��Ͻ� ����
		User user2 = new User("����", 19);//�ν��Ͻ� ����
		
		System.out.println(user1.name + "�� ���̴� " + user1.age);
		user2.age = 1000;
		System.out.println(user2.name + "�� ���̴� " + user2.age);
		
	}

}
