package javaPractice.ch_05;

public class Chick {
	int x;
	int y;
	
	//������
	Chick() {
		x = 100;
		y = 100;
	}
	void display() {System.out.println("���Ƹ�");}
	void walk() {System.out.println("�ȴ�");}
	void ppick() {System.out.println("���");}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GeneralChick generalChick = new GeneralChick();
		generalChick.display();
		RedChick redChick = new RedChick();
		redChick.display();
		System.out.println(redChick.x);
	}

}
class GeneralChick extends Chick {
	
}

class RedChick extends Chick {
	
}


	
