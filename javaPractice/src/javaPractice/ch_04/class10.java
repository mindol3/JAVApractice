package javaPractice.ch_04;

class Cellphone {
	String model = "Galaxy 8";
	String color;
	int capacity;
	
	// �������� Ư¡ 1) Ŭ������ �̸��� ���� 2) ��ȯ���� ���� 3) �ν��Ͻ� ������ �� �ѹ��� �ڵ� ����ȴ�
	
	// �����ڸ� �������� ������ void �����ڰ� �⺻���� ����
	// �����ڸ� �����ϸ� �ڹٰ� ������ �Ǵ� void �����ڰ� �����
	// void �����ڸ� ����Ϸ��� ���� ���Ǹ� ������� ��
	
	Cellphone(String color, int capacity) {// �Ű������� �ִ� ������
		this.color = color; // this�� ���� �̸��� ������ �����ϱ� ���ؼ� ���
		this.capacity = capacity;
		
	}
}
public class class10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Cellphone myphone1 = new Cellphone(); // ���� �߻�
		Cellphone myphone = new Cellphone("Silver", 64);
		
		System.out.println(myphone.model);
		System.out.println(myphone.color);
		System.out.println(myphone.capacity);
		}
	
}
