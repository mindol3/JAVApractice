package javaPractice.ch_10;

import java.util.ArrayList;

class MyStack {
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) { // ������ �� �ڿ� ��Ҹ� �߰�
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size(); // ����� ����
		if (len == 0) {
			System.out.println("������ ������ϴ�.");
			return null;
		}
		return(arrayStack.remove(len - 1)); // �� �ڿ� �ִ� �ڷ� ��ȯ�ϰ� �迭���� ����
	}
	
	// push(E Item) : �־��� ��ü�� ���ÿ� ����.
	// peek() : ������ �� �� ��ü�� ������. ��ü�� ���ÿ��� �������� ����.
	// pop() : ������ �� �� ��ü�� ������. ��ü�� ���ÿ��� ����.
	// peek ����
	public String peek() {
		int len = arrayStack.size(); // ����� ����
		if (len == 0) {
			System.out.println("������ ������ϴ�.");
			return null;
		}
		return (arrayStack.get(len - 1)); // �� �ڿ� �ִ� �ڷ� ��ȯ
	}
}

public class stack01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.peek()); // C
		
		System.out.println(stack.pop()); // C
		System.out.println(stack.pop()); // B
		System.out.println(stack.pop()); // A
	}

}
