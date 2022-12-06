package javaPractice.ch_10;

import java.util.LinkedList;

class MyQueue {
	private LinkedList<String> linkedList = new LinkedList<String>();
	
	public void enQueue(String data) {
		linkedList.add(data); // ť�� �� �ڿ� �߰�
	}
	
	public String deQueue() {
		//ť�� �� �տ��� ����.
		int len = linkedList.size();
		if (len == 0) {
			System.out.println("ť�� ������ϴ�.");
			return null;
		}
		return (linkedList.remove(0)); // �� ���� �ڷ� ��ȯ�ϰ� �迭���� ����.
	}
}

public class Queue01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue queue = new MyQueue();
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		System.out.println(queue.deQueue()); // A
		System.out.println(queue.deQueue()); // B
		System.out.println(queue.deQueue()); // C
	}

}
