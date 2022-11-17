package javaPractice.ch_04.student;

public class Car {
	String color;	//색상
	String gearType; // 변속기 종류 auto(자동), manuel(수동)
	int door;	// 문의개수

	Car() {
		this("white", "auto", 4);
	}
	
	Car(Car c){ // 인스턴스의 복사를 위한 새성자
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	
	Car(String color){
		this(color, "auto", 4);
	}
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
