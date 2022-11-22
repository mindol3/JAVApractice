package javaPractice.ch_05;

class Employee {
	protected int baseSalary = 3000000; // �⺻��
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
/*�Ϲ� ������ Employee Ŭ������ �𵨸��Ѵ�.
 * Employee Ŭ������ ��ӹ޾Ƽ� �����ڸ� ��Ÿ���� Manager Ŭ������
 * ���α׷��Ӹ� ��Ÿ���� Programer Ŭ������ �ۼ��Ѵ�.
 * Employee Ŭ���� �ȿ��� ������ ����ϴ� getSalary() �޼��尡 �ִ�.
 * �� �޼��带 Manager Ŭ������ Programer Ŭ�������� �������̵��ؼ� �� ���޺��� �ٸ� ������ ��ȯ�ϵ��� �Ѵ�.
 * �������̵� �Ҷ� Employee Ŭ������ baseSalary�� ����϶�.*/
public class InheritanceEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager();
		System.out.println("�������� ���� : " + manager.getSalary());
		// �������� ���� : 5000000
		
		Programer programer = new Programer();
		System.out.println("���α׷����� ���� : " + programer.getSalary());
		// ���α׷����� ���� : 6000000
	}

}
