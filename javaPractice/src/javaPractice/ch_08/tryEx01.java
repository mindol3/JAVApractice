package javaPractice.ch_08;

public class tryEx01 {
	// 비정상 종료를 하는데, try ~ catch 을 이용해서
	// 예외를 안전하게 처리하도록 코드를 수정할 것
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			arr[i] = i;
		}
		try {
			for(int i = 0; i < 11; i++) {
				System.out.println(arr[i]);			
			}			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
			System.out.println("배열길이 오류");
		}
	}

}
