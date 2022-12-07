package javaPractice.ch_10;

import java.util.TreeSet;

public class TreeSet02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> score = new TreeSet<Integer>();
		
		score.add(90);
		score.add(100);
		score.add(85);
		score.add(65);
		score.add(50);
		score.add(75);
		score.add(90);
		
		System.out.println(score); // [50, 65, 75, 85, 90, 100]
		
		Integer value = null;
		value =score.first(); // first() : 가장 작은 값 반환
		print("가장 낮은 점수", value);
		value = score.last(); // last() : 가장 큰 값
		print("가장 높은 점수", value);
		value = score.lower(85); // lower() : 제공된 값보다 작은 값 중 가장 큰 값(인자값 미포함)
		print("85 바로 이전 점수", value);
		value = score.higher(85); // higher() : 제공된 값보다 큰 값중 가장 작은 값(인자값 미포함)
		print("85 바로 다음 점수", value);
		value = score.floor(85); // floor() : 제공된 값과 같거나 작은 값 중 가장 큰 값(인자값 미포함)
		print("85 또는 바로 이전 점수", value);
		value = score.ceiling(85); // ceiling() : 제공된 값보다 크거나 같은 값 중 가장 작은 값(인자값 미포함)
		print("85 또는 바로 다음 점수", value);
		
		while (!score.isEmpty()) {
			value = score.pollLast(); // pollLast() : 가장 큰 값을 반환 후 삭제
			print("현재 가장 높은 점수", value);
		}
	}

	private static void print(String string, Integer value) {
		// TODO Auto-generated method stub
		System.out.println(string + " : " + value);
	}


}
