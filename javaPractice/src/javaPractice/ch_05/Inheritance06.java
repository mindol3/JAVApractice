package javaPractice.ch_05;

class Car2 {
	// �����ڰ� ������ �ڵ����� �Ű������� ���� �����ڰ� ���������,
	// �����ڸ� �����ϸ� �Ű������� ���� �����ڰ� ��������� ����.
	int wheel;
	int speed;
	String color;
	
	public Car2(String color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
}

class SportsCar extends Car2{
	int speedLimit; // ���Ѽӵ� km
	
	SportsCar(String color, int speedLimit){
		super(color);
	// �ڽ� Ŭ������ ��ü�� ��������� �ڽ� Ŭ������ �����ڰ� �ڵ����� ������ �ǰ�,
	// �ڽ� Ŭ������ �����ڰ� ����Ǳ� ���� �θ� Ŭ������ �����ڰ� �ڵ����� ����.
	// �θ� Ŭ������ �����ڸ� �ڵ����� ������, �θ� Ŭ������ �Ű������� ���� �����ڰ� �ڵ����� ����.
	this.speedLimit = speedLimit;
	}
}
public class Inheritance06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SportsCar sportsCar = new SportsCar("red", 330);
		
		System.out.println(sportsCar.color);
		System.out.println(sportsCar.speedLimit);
		}
	}

