package javaPractice.ch_04;

class User1 {
	private String name;
	private int age;
	
	User1(String name, int age) {// 매개변수를 가진 생성자
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
		User1 user1 = new User1("철수", 20);//인스턴스 생성
		User1 user2 = new User1("영희", 19);//인스턴스 생성
		
//		user2.age = 99; // 에러발생. 직접적 접근 불가
		
		System.out.println(user1.getName() + "의 나이는 " + user1.getAge());
		user2.setAge(30);
		System.out.println(user2.getName() + "의 나이는 " + user2.getAge());
	}

}
