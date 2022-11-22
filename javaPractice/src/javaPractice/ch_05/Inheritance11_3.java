package javaPractice.ch_05;

public class Inheritance11_3 {
	// p가 참조하는 인스턴스에 자기소개를 시킨다
	static void intro(Pet p) {
		p.introduce();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 애완동물 클래스의 이용 예 (메소드의 인수로 다형성을 검증)
		Pet[] a = {
				new Pet("Kurt", "아이"),
				new RobotPet("R2D2", "루크"),
				new Pet("마이클", "영진"),
		};
		
		for(Pet p : a) {
			intro(p); // p가 참조하는 인스턴스에 자기소개를 시킨다
			System.out.println();
		}
	}

}
