package javaPractice.ch_05;

class Car{
	String maker, model, color;
	int curSpeed;
	
	Car(String maker, String model, String color, int curSpeed){
		this.maker = maker;
		this.model = model;
		this.color = color;
		this.curSpeed = curSpeed;
	}
	
	void speedUp() {
		this.curSpeed++;
	}
	
	void speedDown() {
		this.curSpeed--;
	}

	@Override
	public String toString() {
		return "Car [maker=" + maker + ", model=" + model + ", color=" + color + ", curSpeed=" + curSpeed + "]";
	}
	
}

class SportCar extends Car{
	
	public SportCar(String maker, String model, String color, int curSpeed) {
		super(maker, model, color, curSpeed);
	}
	@Override
	void speedUp() {
		// TODO Auto-generated method stub
//		super.speedUp();
		this.curSpeed += 10;
	}

	@Override
	void speedDown() {
		// TODO Auto-generated method stub
//		super.speedDown();
		this.curSpeed -= 10;
	}
	
}

public class InheritanceEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car Car1 = new Car("º¥Ã÷", "EÅ¬·¡½º", "°ËÁ¤", 0);
		Car Car2 = new Car("±â¾Æ", "K5", "Èò»ö", 0);
		Car Car3 = new Car("BMW", "520", "ÆÄ¶û", 0);
		
		System.out.println(Car1);
		System.out.println(Car2);
		System.out.println(Car3);
	}

}
