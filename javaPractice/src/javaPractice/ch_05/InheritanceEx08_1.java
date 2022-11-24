package javaPractice.ch_05;

class Product3 {
	int price;
	int bonusPoint;
	public Product3(int price) {
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
}

class Tv3 extends Product3{
	Tv3(){
		super(300);
	}

	@Override
	public String toString() {
		return "티비";
	}
	
}

class Computer3 extends Product3{
	Computer3(){
		super(500);
	}
	@Override
	public String toString() {
		return "컴퓨터";
	}
}

class Buyer3{
	int money = 1000;
	int bonusPoint = 0;
	
	Product3[] item = new Product3[10];
	int i = 0;
	
	void buy(Product3 p) {
		
	}
}
public class InheritanceEx08_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
