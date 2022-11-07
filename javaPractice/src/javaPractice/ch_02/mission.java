package javaPractice.ch_02;

import java.util.Scanner;

public class mission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1. 프로그램 시작시 계좌의 잔액은 10000원입니다.

2. 프로그램 실행을 하면 제일 먼저 입금 금액을 한번만 입력 받습니다.
'입금 금액을 입력해주십시요' 라는 문장을 출력하고 입금 금액을 입력받습니다.

3. 입금 받은 후 1) 그 금액을 잔액과 더하고 2) 문장을 출력하여 입금 금액이 얼마인지 또 잔액이 얼마인지 알려줍니다.
 문장은 '입금하신 금액은 ****원이고 잔액은 ****원 입니다.'입니다.

4. 이후에는 잔액이 0원이 될 때 까지 계속 출금 금액을 입력 받습니다.
출금 금액 입력시에는 '출금금액을 입력해주십시요'라는 문장을 출력하고, 출금 금액을 입력받습니다.

5. 출금 금액을 입력 받으면 1) 잔액에서 차감처리는 하고 2) 출금 금액이 얼마이고 잔액이 얼마인지 출력을 합니다.
문장은 '****원을 출금처리했고 잔액은 ****원입니다.' 입니다.

6. 잔액보다 더 많은 금액을 출금하고자 하면 문장을 출력하고, 차감 처리를 하지 않습니다.
문장은 '잔액은 ****원인데 출금액 ****원이 더 커서 출금이 안됩니다.' 입니다.

7. 0원이 입력된 경우 문장을 출력하고, 차감 처리를 하지 않습니다.
문장은 '0원을 입력하셨습니다. 확인하시고 다시 입력해 주십시요.' 입니다.

8. 잔액이 모두 출금되어 0원이 되면 문장을 출력하고 프로그램을 종료합니다.
문장은 '잔액이 0원이어서 거래가 종료됩니다. 감사합니다.' 입니다.

9. 모든 입력은 0이상의 정수만 입력된다고 가정합니다.*/
		int balance = 10000; // 계좌 잔액
		Scanner scanner = new Scanner(System.in);
		System.out.println("입금 금액을 입력해주십시요");
		int deposit = scanner.nextInt();
		balance += deposit; // 계좌잔액 + 입금 금액
		System.out.println("입금하신 금액은" + deposit +"원이고 잔액은" + balance + "원 입니다.");
		//출금 과정
		
		while(true) {
			System.out.println("출금금액을 입력해주십시요");
			int withdraw = scanner.nextInt();
			if(balance < withdraw ) {// 더많은 금액 입력시 출금 불가
				System.out.println("잔액은"+ balance +"원인데 출금액" + withdraw + "원이 더 커서 출금이 안됩니다.");
			}
			else if (balance >= withdraw && withdraw != 0) { // 알맞은 금액입력시 출금가능과 0원입력시 재확인요청
				balance -= withdraw;
				System.out.println(withdraw+"원을 출금처리했고 잔액은" + balance + "원입니다.");
				
				if( balance == 0) {
					System.out.println("잔액이 0원이어서 거래가 종료됩니다. 감사합니다.");
					break;
				}
			}
			else if (withdraw == 0) { 
				System.out.println("0원을 입력하셨습니다. 확인하시고 다시 입력해 주십시요.");
			}
		
		}
	}

}
