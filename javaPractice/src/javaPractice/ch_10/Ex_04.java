package javaPractice.ch_10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//HashMap에 아이디(String)와 점수(Integer)가 저장되어 있슴
// 실행 결과와 같이 평균 점수를 출력하고, 최고점수와 최고점수를 받은 아이디를 출력할 것

public class Ex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null; // 최고 점수를 받은 아이디 저장
		int maxScore = 0; // 최고 점수 저장
		int totalScore = 0; // 점수 합계 저장
		
		
		// 작성위치
//		Set<String> keySet = map.keySet(); // keySet() : 모든 키를 Set 객체에 담아서 리턴. key Set 얻기
//		Iterator<String> keyIterator = keySet.iterator();
//		while (keyIterator.hasNext()) {// 반복해서 키를 얻고 값을 Map에서 얻어냄
//			String key = keyIterator.next();
//			Integer value = map.get(key);
//			if(value>maxScore) {
//				maxScore=value;
//				name = key;
//			}
//			totalScore += value;
//		}
		Iterator<String> entrySet = map.keySet().iterator();
		while(entrySet.hasNext()) {// 반복해서 키를 얻고 값을 Map에서 얻어냄
			String key =entrySet.next();
			int thisScore = map.get(key);
			totalScore += thisScore;
			if (maxScore < thisScore) {
				maxScore = thisScore;
				name = key;
			}
		}
		
		System.out.println("총 점수 값 : " + totalScore);
		System.out.println("평균 점수 : " + totalScore/map.size());
		System.out.println("최고 점수 : " + maxScore);
		System.out.println("최고 점수를 받은 아이디 : " + name);
		/*
		 평균 점수 : 91
		 최고 점수 : 96
		 최고 점수를 받은 아이디 : blue
		 */
	}
}
