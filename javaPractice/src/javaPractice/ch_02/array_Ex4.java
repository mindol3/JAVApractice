package javaPractice.ch_02;

public class array_Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 아래의 배열을 이용하여 랜덤으로 조편성을 하세요.
		 * 한 조의 인원은 3명입니다.
		 * 
		 * 1조 : 배규 김정원 오범수
		 * 2조 : 박정혜 최현지 황희윤
		 * 3조 : 유수현 김대환 이성호
		 * 4조 : 육승민 김준혁 박기훈
		 * 5조 : 박준휘 신용화 장윤영
		 * 6조 : 김지혜 이승재 오해준
		 * 7조 : 박성민 이기행 장명규
		 * 8조 : 주민석 손하늘 박소희
		 * 9조 : 이영주 김혜현 오원택
		 * */
		
		String[] student = {"김대환", "김정원", "김준혁", "김지혜", "김혜현",
				"박기훈", "박성민", "박소희", "박정혜", "박준휘",
				"배규", "손하늘", "신용화", "오범수", "오원택",
				"오해준", "유수현", "육승민", "이기행", "이성호",
				"이승재", "이영주", "장명규", "장윤영", "주민석",
				"최현지", "황희윤"};
		int numberPerTeam = 3;
		int count = 0;
		for(int i=0; i < 10000; i++) {
			int n =(int)(Math.random()* student.length); // 0 ~ student.length - 1중의 한 값을 임의로 얻는다
			String temp = student[0];
			student[0] = student[n];
			student[n] = temp;
		}
		for (int i = 0; i < student.length; i++) {
			if ((i + 1) % numberPerTeam == 1) {
				System.out.print( ++ count + "조 :");
			}
			System.out.print(student[i] + " ");
			if ((i + 1) % numberPerTeam == 0) {
				System.out.println();
			}
		}
		
	}

}
