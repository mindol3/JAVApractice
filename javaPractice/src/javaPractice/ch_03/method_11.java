package javaPractice.ch_03;

public class method_11 {
	/*문자열에 의한 호출방식
	 * 예외적으로 문자열을 전달하려면 참조형 데이타로 값에 의한 호출을 함.*/
	
	public void setAddress(String addr) {
		addr = "경기도 수원시 장안구";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address = "서울시 강남구 논현동";
		
		method_11 st = new method_11();
		System.out.println("메서드 호출 전");
		System.out.println("adress: " + address); // adress: 서울시 강남구 논현동
		
		st.setAddress(address);
		System.out.println("메서드 호출 전");
		System.out.println("adress: " + address); // adress: 서울시 강남구 논현동
	}

}
