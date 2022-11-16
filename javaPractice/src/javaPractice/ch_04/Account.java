package javaPractice.ch_04;

public class Account {
	String name;
	String no;
	long balance;
	
	public void printAccount() {
		System.out.println(name + "ÀÇ °èÁÂ");
		System.out.println("  °èÁÂ¸íÀÇ : " + name);
		System.out.println("  °èÁÂ¹øÈ£ : " + no); 
		System.out.println("  ¿¹±ÝÀÜ°í : " + balance); 
		
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
//		account1.name="Ã¶¼ö";
//		account1.no="123456";
//		account1.balance=1000;
//		
//		
//		System.out.println("Ã¶¼öÀÇ °èÁÂ");
//		System.out.println("  °èÁÂ¸íÀÇ : " + account1.name); 
//		System.out.println("  °èÁÂ¹øÈ£ : " + account1.no); 
//		System.out.println("  ¿¹±ÝÀÜ°í : " + account1.balance); 
		
		Account chulsoo;
		chulsoo = new Account();
		
		Account younghee = new Account(); 
		
		chulsoo.name = "Ã¶¼ö";
		chulsoo.no = "123456";
		chulsoo.balance = 1000;
		
		younghee.name = "¿µÈñ";
		younghee.no = "654321";
		younghee.balance = 200;
		
		chulsoo.balance -= 200;
		younghee.balance += 100;
		
		chulsoo.printAccount();
		younghee.printAccount();
	}

}
