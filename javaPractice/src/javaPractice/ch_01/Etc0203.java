package javaPractice.ch_01;

public class Etc0203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float f = 1.2345678901234567890f;
		float f3 = 1.2f; // ���̻� f �� ��� ����
		
		double d = 1.2345678901234567890;
		float f2 = 0.100000001f; // 0.1
		double d2 = 0.100000001; // double�� ���̻� ��������.
		double d3 = 0.1000000000000001;
		
		System.out.println(f); //1.2345679 -> �Ҽ��� 8�ڸ����� �ݿø�
		System.out.println(d); // 1.2345678901234567
		System.out.println(f2); // 0.1
		System.out.println(d2); // 0.100000001
		System.out.println(d3); // 0.1000000000000001
		
	}

}
