package javaPractice.ch_03;

import java.util.Scanner;

public class methodEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* login() �޼���� logout() �޼��带 �����Ϸ��� �մϴ�.
		 * login() �޼��带 ȣ���� ���� �Ű������� id�� passwd�� �����ϰ�,
		 * logout() �޼���� id�� �Ű������� �����մϴ�.
		 * 
		 * 1) login() �޼���� �Ű��� id�� "admin", �Ű��� password�� "1234"�� ��쿡�� true�� �����ϰ�
		 * �׿��� ���� ��쿡�� false�� �����ϵ��� �ϼ���.
		 * 2) logout() �޼���� "�α׾ƿ� �Ǿ����ϴ�."�� ��µǵ��� �ϼ���.*/
		Scanner scanner = new Scanner(System.in);
		String id, password;
		System.out.println("���̵� �Է��� �ּ���. >>");
		id = scanner.nextLine();
		System.out.println("��й�ȣ�� �Է��� �ּ���. >>");
		password = scanner.nextLine();
		
		boolean result = login(id, password);
		if (result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			logout(id);
		}
		else {
			System.out.println("id �Ǵ� paswwword�� �ùٸ��� �ʽ��ϴ�.");
		}
			
		}
		static boolean login(String id, String password) {
				return(id.equals("admin") && password.equals("1234"));
	}
		static void logout(String id) {
			System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
		}

}
