package javaPractice.ch_10;

import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("ȫ�浿");
		treeSet.add("������");
		treeSet.add("�̼���");
		treeSet.add("������");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
		/*������������ ������ �Ǿ� ���
		 ������
		 �̼���
		 ȫ�浿

		 */
	}

}
