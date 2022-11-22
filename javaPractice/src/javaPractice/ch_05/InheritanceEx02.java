package javaPractice.ch_05;

class Employee {
	protected int baseSalary = 3000000; // 기본급
	int getSalary() {
		return baseSalary;
	}
}

class Manager extends Employee {
//	private int baseSalary = 2000000;
//	@Override
//	public int getSalary() {
//		return (super.getSalary() + baseSalary);
//	}
	@Override
	int getSalary() {
		return (baseSalary + 2000000);
	}
}

class Programer extends Employee {
//	private int baseSalary = 3000000;
//	@Override
//	public int getSalary() {
//		return (super.getSalary() + baseSalary);
//	}
	@Override
	int getSalary() {
		return (baseSalary + 3000000);
	}
}
/*일반 직원은 Employee 클래스로 모델링한다.
 * Employee 클래스를 상속받아서 관리자를 나타내는 Manager 클래스와
 * 프로그래머를 나타내는 Programer 클래스를 작성한다.
 * Employee 클래스 안에는 월급을 계산하는 getSalary() 메서드가 있다.
 * 이 메서드를 Manager 클래스와 Programer 클래스에서 오버라이딩해서 각 직급별로 다른 월급을 반환하도록 한다.
 * 오버라이딩 할때 Employee 클래스의 baseSalary을 사용하라.*/
public class InheritanceEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager();
		System.out.println("관리자의 월급 : " + manager.getSalary());
		// 관리자의 월급 : 5000000
		
		Programer programer = new Programer();
		System.out.println("프로그래머의 월급 : " + programer.getSalary());
		// 프로그래머의 월급 : 6000000
	}

}
