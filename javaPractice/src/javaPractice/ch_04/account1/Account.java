package javaPractice.ch_04.account1;

public class Account {
	// ���� ������ �����ϱ� ���� Ŭ����.
	// �ʵ�, ������, getter / setter �θ� ����.
	private String ano; // ���¹�ȣ
	private String owner; // ������
	private int balance; // �ܾ�
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
//	public void addBalance(int money) {
//		balance += money;
//	}
//	
//	public void subBalance(int money) {
//		balance -= money;
//	}
	

}
