package javaPractice.ch_04.student;

// �����ڿ��� �ٸ� ������ ȣ���ϱ�

public class class04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		Car car2 = new Car("blue");
		
		System.out.println("c1�� color=" + car1.color + ", gearType=" + car1.gearType+ ", door=" + car1.door);
		// c1�� color=white, gearType=auto, door=4
		System.out.println("c2�� color=" + car2.color + ", gearType=" + car2.gearType+ ", door=" + car2.door);
		// c2�� color=blue, gearType=auto, door=4
	}

}
