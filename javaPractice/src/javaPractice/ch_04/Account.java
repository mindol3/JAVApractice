package javaPractice.ch_04;

public class Account {
	String name;
	String no;
	long balance;
	
	public void printAccount() {
		System.out.println(name + "�� ����");
		System.out.println("  ���¸��� : " + name);
		System.out.println("  ���¹�ȣ : " + no); 
		System.out.println("  �����ܰ� : " + balance); 
		
	}
//	int money;
//	void withdrawal() {
//		Balance += money;
//	}
//	
//	void Deposit() {
//		Balance -= money;
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Account account1 = new Account();
//		Account account2 = new Account();
//		
//		account1.name="ö��";
//		account1.no="123456";
//		account1.balance=1000;
//		
//		
//		System.out.println("ö���� ����");
//		System.out.println("  ���¸��� : " + account1.name); 
//		System.out.println("  ���¹�ȣ : " + account1.no); 
//		System.out.println("  �����ܰ� : " + account1.balance); 
		
		Account chulsoo;
		chulsoo = new Account();
		
		Account younghee = new Account(); 
		
		chulsoo.name = "ö��";
		chulsoo.no = "123456";
		chulsoo.balance = 1000;
		
		younghee.name = "����";
		younghee.no = "654321";
		younghee.balance = 200;
		
		chulsoo.balance -= 200;
		younghee.balance += 100;
		
		chulsoo.printAccount();
		younghee.printAccount();
	}

}
