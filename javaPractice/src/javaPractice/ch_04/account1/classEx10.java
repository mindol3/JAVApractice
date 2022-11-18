package javaPractice.ch_04.account1;

import java.util.Scanner;

public class classEx10 {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			}
			else if(selectNo == 2) {
				accountList();
			}
			else if(selectNo == 3) {
				deposit();
			}
			else if(selectNo == 4) {
				withdraw();
			}
			else if(selectNo == 5) {
				run = false;
			}
		}
	}
		// 계좌생성하기
		private static void createAccount() {
			System.out.println("--------------");
			System.out.println("계좌생성");
			System.out.println("--------------");
			
			System.out.print("계좌번호: ");
			String ano = scanner.next();
			
			System.out.print("계좌주: ");
			String owner = scanner.next();
			
			System.out.print("초기입금액: ");
			int balance = scanner.nextInt();
			
			Account newAccount = new Account(ano, owner, balance);
			for(int i=0; i<accountArray.length; i++) {
				if(accountArray[i] == null) {
					accountArray[i] = newAccount;
					System.out.println("결과: 계좌가 생성되었습니다.");
					break;
				}
			}
		}
		private static void accountList() {
			for(int i = 0; i < accountArray.length; i++) {
				Account account = accountArray[i];
				if(account != null) {
					System.out.println(account.getAno());
					System.out.println("     ");
					System.out.println(account.getOwner());
					System.out.println("     ");
					System.out.println(account.getBalance());
				}
//				if(accountArray[i] != null) {
//					System.out.println(accountArray[i].getAno() + 
//							"  " +accountArray[i].getOwner() + "  "
//							+ accountArray[i].getBalance());
//				}
			}
		}
					
			
		
		private static void deposit() {
			System.out.println("--------------");
			System.out.println("예금");
			System.out.println("--------------");
			
			System.out.print("계좌번호: ");
			String ano = scanner.next();
			System.out.println("예금액: ");
			int money = scanner.nextInt();
			Account account = findAccount(ano);
			if(account == null) {
				System.out.println("계좌가 없습니다.");
				return;
			}
			account.setBalance(account.getBalance() + money);
			System.out.println("예금이 성공하였습니다.");
			System.out.println("현재 계좌 잔고 : " + account.getBalance());
//			else {
//				account.addBalance(money);
//				System.out.println("예금이 성공하였습니다.");
//				System.out.println("현재 계좌 잔고 : " + account.getBalance());
//			}
				
			
		}
		
		private static void withdraw() {
			System.out.println("--------------");
			System.out.println("출금");
			System.out.println("--------------");
			
			System.out.print("계좌번호: ");
			String ano = scanner.next();
			System.out.println("출금액: ");
			int money = scanner.nextInt();
			Account account = findAccount(ano);
			if(account == null) {
				System.out.println("계좌가 없습니다.");
				return;
			}
			if (account.getBalance() < money) {
				System.out.println("잔액보다 출금액이 커서 출금에 실패했습니다.");
				return;
			}
			account.setBalance(account.getBalance() - money);
			System.out.println("출금이 성공하였습니다.");
			System.out.println("현재 계좌 잔고 : " + account.getBalance());
			
//			else if (account.getBalance() < money) {
//				System.out.println("잔액보다 출금액이 커서 출금에 실패했습니다.");
//			}
//			else {
//				account.subBalance(money);
//				System.out.println("출금이 성공하였습니다.");
//				System.out.println("현재 계좌 잔고 : " + account.getBalance());
//			}
		}
		
		// Account 배열에서 ano와 동일한 Account 객체 찾기
		private static Account findAccount(String ano) {
			Account account = null;
			for(int i=0; i<accountArray.length; i++) {
				if(accountArray[i] != null) {
					String dbAno = accountArray[i].getAno();
					if(dbAno.equals(ano)) {
						account = accountArray[i];
						break;
					}
				}
			}
			return account;
		}

}
