package javaPractice.ch_05;

public class Inheritance09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*instanceof ������
		 * a instanceof B : a �� B�� ��ü�̴�.*/
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) { // fe�� FireEngine�� ��ü�̴�.
			System.out.println("This is a FireEngine instance.");
		}
		
		if(fe instanceof Car1) { // fe�� Car1�� ��ü�̴�.
			System.out.println("This is a Car1 instance.");
		}
		if(fe instanceof Object) { // fe�� Object�� ��ü�̴�.
			System.out.println("This is a Object instance.");
		}
		System.out.println();
		
		Car1 polyFe = new FireEngine(); // ������ ����ؼ� ���� ���� ����.
		if(polyFe instanceof FireEngine) { // polyFe�� FireEngine�� ��ü�̴�.
			System.out.println("This is a FireEngine instance.");
		}
		if(polyFe instanceof Car1) { // polyFe�� Car1�� ��ü�̴�.
			System.out.println("This is a Car1 instance.");
		}
		if(polyFe instanceof Object) { // polyFe�� Object�� ��ü�̴�.
			System.out.println("This is a Object instance.");
		}
		System.out.println();
		
		Car1 car = new Car1(); // �θ� Ŭ������ ��ü ����
		if(car instanceof FireEngine) { 
			System.out.println("This is a FireEngine instance.");
		}
		if(car instanceof Car1) { // car�� Car1�� ��ü�̴�.
			System.out.println("This is a Car1 instance.");
		}
		if(car instanceof Object) { // car�� Object�� ��ü�̴�.
			System.out.println("This is a Object instance.");
		}
	}

}
