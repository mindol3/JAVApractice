package javaPractice.ch_04.student;

public class Car {
	String color;	//����
	String gearType; // ���ӱ� ���� auto(�ڵ�), manuel(����)
	int door;	// ���ǰ���

	Car() {
		this("white", "auto", 4);
	}
	
	Car(Car c){ // �ν��Ͻ��� ���縦 ���� ������
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
