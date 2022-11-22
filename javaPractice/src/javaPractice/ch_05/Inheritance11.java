package javaPractice.ch_05;

class Pet {
	private String name; // 애완동물
	private String masterName; // 주인
	
	public Pet(String name, String masterName) { // 생성자
		super();
		this.name = name; // 애완동물
		this.masterName = masterName; // 주인
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMasterName() {
		return masterName;
	}

	public void setMasterName(String masterName) {
		this.masterName = masterName;
	}
	
	public void introduce( ) {//자기소개
		System.out.println("■ 내 이름은 " + name + "입니다!");
		System.out.println("■ 주인님은 " + masterName + "입니다!");
	}

	
}

public class Inheritance11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
