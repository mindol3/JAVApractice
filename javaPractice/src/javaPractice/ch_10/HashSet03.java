package javaPractice.ch_10;

import java.util.HashSet;
import java.util.Set;

public class HashSet03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<MemberShip> set = new HashSet<MemberShip>();
		
		// �ν��Ͻ��� �ٸ����� ���� �����Ͱ� �����ϹǷ� ��ü 1���� ����
		set.add(new MemberShip("ȫ�浿", 30));
		set.add(new MemberShip("ȫ�浿", 30));
		
		System.out.println("�� ��ü��: " + set.size()); // 1
	}

}
