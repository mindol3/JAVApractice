package javaPractice.ch_05;

/*static �����ڴ� ������ �޼��� �տ� �پ �� ����� Ŭ���� ������ ���� �ǹ�.
 * Ŭ���� ����� ó�� Ŭ������ �޸𸮿� �ε� �� �� �����Ǳ� ������ �ν��ϸ��� �������� �ʾƵ� ��� ����.*/

class StaticPractice {
	public static int number = 3;
	
	public static void say() {
		System.out.println("�ν��Ͻ� ���� ���� ��� �����մϴ�.");
	}
}

public class access_control02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticPractice.number);
		StaticPractice.say();
	}

}
