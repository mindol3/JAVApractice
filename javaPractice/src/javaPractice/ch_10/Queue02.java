package javaPractice.ch_10;

import java.util.LinkedList;
import java.util.Queue;

class Message { // Queue를 이용한 메세지 큐
	public String command;
	public String to;
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}

public class Queue02 {
	// Queue를 이용한 메세지 큐
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Stack은 class 이지만 Queue은 interface
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		// 메시지 저장
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "박성훈"));
		messageQueue.offer(new Message("sendKakaotalk", "홍두깨"));
		
		while (!messageQueue.isEmpty()) { // 메시지 큐가 비었는지 확인
			Message message = messageQueue.poll(); // 메시지 큐에서 1개의 메시지 꺼냄
			switch (message.command) {
			case "sendMail" :
				System.out.println(message.to + "님에게 메일을 보냈습니다.");
				break;
			case "sendSMS" :
				System.out.println(message.to + "님에게 SMS을 보냈습니다.");
				break;
			case "sendKakaotalk" :
				System.out.println(message.to + "님에게 카카오톡을 보냈습니다.");
				break;
			}
		}
//		홍길동님에게 메일을 보냈습니다.
//		박성훈님에게 SMS을 보냈습니다.
//		홍두깨님에게 카카오톡을 보냈습니다.
	}
	

}
