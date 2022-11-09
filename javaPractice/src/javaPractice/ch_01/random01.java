package javaPractice.ch_01;

import java.util.Random;
import java.util.Scanner;

public class random01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int nextInt(int n) // int 타입의 0 ~ 매개값까지의 난수를 리턴합니다.
		/*프로그램이 가지고 있는 정수를 사용자가 알아맞히는 게임.
		 * 1) 1부터 1000 사이의 정수 하나를 생성한다.
		 * 2) 사용자가 답을 추측하여 입력한다.
		 * 3) 정답이 아닐 경우 정답이 입력한 값보다 큰지 혹은 작은지 알려준다.
		 * 4) 정답일 경우, 성공 메시지 및 시도 횟수 출력할 것*/
		Random random = new Random();
		int answer = random.nextInt(999) + 1;
		Scanner scanner = new Scanner(System.in);
		int count =0;
		System.out.println(answer);
		while(true) {
			int num = scanner.nextInt();
			System.out.println("정답을 추측하여 보시오:");
			count ++;
			if(answer < num) {
				System.out.println("제시한 정수가 높습니다.");
			}
			else if(answer > num) {
				System.out.println("제시한 정수가 낮습니다.");
			}
			else{
				break;
			}
		}
		System.out.println("정답입니다. 시도회수는" + count + "입니다.");
	}

}
