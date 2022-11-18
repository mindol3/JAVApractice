package javaPractice.ch_04.account;

class Account{
	private int balance = 0;
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(balance > MIN_BALANCE && balance < MAX_BALANCE) {
			this.balance = balance;
		}
//		this.balance = (balance < MIN_BALANCE || balance > MAX_BALANCE) ? this.balance : balance;
	}
}

public class classEx09 {
	/*
	 ���� ���� ��ü�� Account ��ü�� �ܰ� balance �ʵ带 ������ �ִ�.
	 balance �ʵ�� �������� �� �� ����, �ִ� �鸸������ ������ �� �ִ�.
	 �ܺο��� balance �ʵ带 ������� �������� ���ϵ��� �ϰ�,
	 0 ~ 1,000,000 ������ ���� ���� �� �ֵ��� Account Ŭ������ �ۼ��϶�.
	 
	 1) Setter�� Getter�� �̿��Ѵ�.
	 2) 0�� 1,000,000�� MIN_BALANCE �� MAX_BALANCE ����� �����ؼ� �̿��Ѵ�.
	 3) Setter�� �Ű����� �����̰ų� �鸸���� �ʰ��ϸ� ���� balance ���� �����Ѵ�.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("���� �ܰ�: " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("���� �ܰ�: " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("���� �ܰ�: " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("���� �ܰ�: " + account.getBalance());
	}

}
