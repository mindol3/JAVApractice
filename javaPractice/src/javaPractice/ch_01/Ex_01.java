package javaPractice.ch_01;

public class Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* int result = �� 1) ���� 4���� ��� ����ϰ� 2) ��Ģ������ + ���길 ����ؼ�
		 * 9�� �������� �ڵ带 �ϼ�*/
		
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		
		//int result = (int)var1 + (int)var2 + (int)var3 + (int)Double.parseDouble(var4) + (int)var2; // �̺κи� ����. 0��� �ڵ� �Է�.
		int result = (int)var1 + (int)(var2 + var3) + (int)Double.parseDouble(var4);
		System.out.println(result); // 9
	}

}
