package javaPractice.ch_09;

/*
 void exit(int status)
 ���� ���μ����� ���� ����.
 �μ��� ���� Ÿ���� ���� �ڵ带 ����.
 �������� ����� 0�� �����ϰ� �����߻��ÿ� -1�� �����ϴ� ���� ����.
 �Ǵ� ȣ����� ����Ͽ� �ǹ� �ִ� ���� ������ ���� ����.
 ���� Ư������ �����ϴ� ���μ������ �ᱣ���� ���� �ڵ�� �����ϴ� ��
 * */

public class exit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 ���α׷� ���� exit()
		 exit() �޼���� ���� ����ǰ� �ִ� ���μ����� ���� ���� ��Ű�� ����.
		 int �Ű� ���� �����ϵ��� �Ǿ��մµ�, �� ���� ���� ���� �� �̶�� �ϰ�, �Ϲ������� ���� ������ ��� 0 ���� ��.
		 * */
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			if(i == 5) {
				System.exit(0);
			}
		}
		System.out.println("������ �ڵ�");
	}

}
