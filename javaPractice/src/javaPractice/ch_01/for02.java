package javaPractice.ch_01;

public class for02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for�� ���� �ð� ���ϱ�
		 * ���α׷��� ���� �ð��� ���ϴ� ���
		 * ���α׷� ���� ���� �κп��� ���۽ð��� ���ϰ�,
		 * ���α׷��� ������ �κп��� ����ð��� ������
		 * ����ð����� ���۽ð��� ���� ���α׷��� ������ �ð��� ���� �� �ֽ�.*/
		
		long startTime = System.currentTimeMillis(); // ���۽ð�
		for(int i = 0; i < 1000000000; i++) { // 10��� �ݺ�
			; // ���� ����
		}
		long endTime = System.currentTimeMillis(); // ����ð�
		
		System.out.println("���۽ð� : " + startTime);
		System.out.println("����ð� : " + endTime);
		System.out.println("�ҿ�ð� : " + (endTime - startTime));
	}

}
