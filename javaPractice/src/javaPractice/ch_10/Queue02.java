package javaPractice.ch_10;

import java.util.LinkedList;
import java.util.Queue;

class Message { // Queue�� �̿��� �޼��� ť
	public String command;
	public String to;
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}

public class Queue02 {
	// Queue�� �̿��� �޼��� ť
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Stack�� class ������ Queue�� interface
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		// �޽��� ����
		messageQueue.offer(new Message("sendMail", "ȫ�浿"));
		messageQueue.offer(new Message("sendSMS", "�ڼ���"));
		messageQueue.offer(new Message("sendKakaotalk", "ȫ�α�"));
		
		while (!messageQueue.isEmpty()) { // �޽��� ť�� ������� Ȯ��
			Message message = messageQueue.poll(); // �޽��� ť���� 1���� �޽��� ����
			switch (message.command) {
			case "sendMail" :
				System.out.println(message.to + "�Կ��� ������ ���½��ϴ�.");
				break;
			case "sendSMS" :
				System.out.println(message.to + "�Կ��� SMS�� ���½��ϴ�.");
				break;
			case "sendKakaotalk" :
				System.out.println(message.to + "�Կ��� īī������ ���½��ϴ�.");
				break;
			}
		}
//		ȫ�浿�Կ��� ������ ���½��ϴ�.
//		�ڼ��ƴԿ��� SMS�� ���½��ϴ�.
//		ȫ�α��Կ��� īī������ ���½��ϴ�.
	}
	

}
