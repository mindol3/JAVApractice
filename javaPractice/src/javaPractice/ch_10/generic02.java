package javaPractice.ch_10;

import java.util.ArrayList;

/*
 Ÿ�� ����ġ�� ���� ĳ������ ����� �߸��� ĳ�������� ���� ������ �����ϱ� ����
 �ڹ�5���� ������ ������ ���׸�.
 ���׸��� Ŭ������ �μ�ȭ�Ͽ� ������ Ÿ�Կ� ���� �����ϴ� �Ϲ����� �˰����� ����.
 
 �����Ϸ��� �ڷ����� ���׸����� ������ �ڷ����� �ƴϸ� ������ ������ ��.
 ������ �߿� �Ǽ��� �̸� �˼� �ִٴ� ���� �߿��� �����̸� �ڵ��� ������ �� ���꼺 ��� ū �⿩.
 
 * ���׸��� ����
  1) ������ �� Ÿ���� üũ�� �� �ִ�.
  2) ĳ������ �ʿ䰡 ���� ���Ǽ��� �������� ���ȴ�.
 * */

public class generic02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arNum = new ArrayList<Integer>();
		arNum.add(1);
		// ����Ʈ���� �������� ���� �����ϰ� �ٸ� �ڷ����� �����ϸ� �����Ͽ��� ���� ó��
//		 arNum.add("���ڿ�");
		int value = arNum.get(0);
		System.out.println(value);
	}

}
