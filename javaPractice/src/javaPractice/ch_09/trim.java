package javaPractice.ch_09;

public class trim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 ���ڿ� �յ� ���� �߶󳻱�
		 trim() �޼���� ���ڿ� �յ� ������ ������ ���ο� ���ڿ��� �����ϰ� ����.
		 * */
		String tel1 = "	    02"; 
		String tel2 = "123	"; 
		String tel3 = "	    1234      ";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);
	}

}
