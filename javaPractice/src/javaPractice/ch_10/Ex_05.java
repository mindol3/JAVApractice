package javaPractice.ch_10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex_05 {
	/* ���̵�� ��й�ȣ �˻��ϱ�
	 ���̵� ����� �Է��� �޾Ƽ� map�� ����� ���� �񱳸� �ؼ�
	 1) ������ ���̵� ����� �ִ� ��쿡�� "�α��εǾ����ϴ�."
	 2) ������ ���̵�� �ִµ� ����� Ʋ�� ��� "��й�ȣ�� ��ġ���� �ʽ��ϴ�."
	 3) ������ ���̵� ������ "�Է��Ͻ� ���̵� �������� �ʽ��ϴ�." �� ��µǵ��� �϶�.
	 */
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>(); // Ű�� ������ String ���
		
		// ���̵�� ��й�ȣ�� �̸� ����
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է��� �ּ���.");
			System.out.print("���̵� : ");
			String id = scanner.nextLine();
			System.out.print("��й�ȣ : ");
			String password = scanner.nextLine();
			System.out.println();
			
			// �ۼ���ġ
//			if(map.containsKey(id) && map.containsKey(password)) {
//				System.out.println("�α��εǾ����ϴ�.");
//			}
//			else {
//				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
//			}
			if(map.containsKey(id)) { // ���̵��� Ű�� �����ϴ��� Ȯ��.
				if(map.get(id).equals(password)) {// Ű�� id�� value�� �Է��� ��й�ȣ ���ڿ��� ��
					System.out.println("�α��εǾ����ϴ�.");
					break;
				}
				else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			}
				else {
					System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
			}
		}
	}
}
