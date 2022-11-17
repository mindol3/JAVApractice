package javaPractice.ch_04.student;

public class class05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		Car car2 = new Car(car1); // c1의 복사본 c2를 생성한다.
		
		System.out.println("c1의 color=" + car1.color + ", gearType=" + car1.gearType+ ", door=" + car1.door);
		// c1의 color=white, gearType=auto, door=4
		System.out.println("c2의 color=" + car2.color + ", gearType=" + car2.gearType+ ", door=" + car2.door);
		// c2의 color=blue, gearType=auto, door=4
		
		car1.door = 100; // c1의 인스턴스변수 door의 값을 변경한다.
		System.out.println("c1.door=100; 수행 후");
		System.out.println("c1의 color=" + car1.color + ", gearType=" + car1.gearType+ ", door=" + car1.door);
		System.out.println("c2의 color=" + car2.color + ", gearType=" + car2.gearType+ ", door=" + car2.door);
	}

}
