package javaPractice.ch_04;
class Area{
	static void manual() {// static�� �����Ƿ� Ŭ���� �޼���
		System.out.println("���� ��� ������ �Լ� ���");
		System.out.println("triangle : �ﰢ�� ����");
		System.out.println("rectangle : �簢�� ����");
		System.out.println("�Դϴ�.");
	}
	
	static double triangle(int a, int b) {//�ﰢ�� ���̸� ��ȯ�ϴ� �޼���
		return (double) a * b / 2;
	}
	
	int rectangle(int a, int b) { // �簢�� ���̸� ��ȯ�ϴ� �޼���
		return a * b; 
	}
}
public class class06 {
	/* Ŭ���� �޼���� ��ü�� �������� �ʾƵ� ȣ���� ����.
	 * �ν��Ͻ� �޼���� ��ü�� �����ؾ߸� ȣ���� ����
	 * �ֳ��ϸ� �ν��Ͻ� �޼���� ��ü�� �����Ǿ�� �޸𸮻� ������ �����ϰ�
	 * Ŭ���� �޼���� Ŭ������ �޸𸮿� �ö� �� �����Ǳ� ����*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area.manual();//Ŭ���� �޼��� ���� ����
		Area.triangle(3, 5);
		System.out.println();
		//Area.rectangle(3, 5); �����߻� static�� ���
		
		Area cal = new Area();
		cal.manual();
		System.out.println(cal.triangle(3, 5));
		System.out.println(cal.rectangle(3, 4));
	}

}
