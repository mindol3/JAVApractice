package javaPractice.ch_08;

public class tryEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30};
		
		try {
			System.out.println("arr[2]=" +arr[2]);
			System.out.println("arr[3]=" +arr[3]);
			System.out.println("arr ��� �Ϸ�");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("���� �߻� : catch�� ����");
		}
			System.out.println("try/catch ���� �� ���� ����");
				
	}
}
