package collection.map;

import java.util.LinkedList;
import java.util.Queue;

public class Sns {

	public static void main(String[] args) {
		//Queue offer poll
		Queue<Message> messageQueue = new LinkedList<>();
		//
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "황"));
		messageQueue.offer(new Message("sendKakao", "감"));
		
		while (!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch (message.command) {
			case "sendMail" :
				System.out.println(message.to + "님에게 메일을 보냅니다");
				break;
			case "sendSMS" :
				System.out.println(message.to + "님에게 메일을 보냅니다");
				break;
			case "sendKakao" :
				System.out.println(message.to + "님에게 메일을 보냅니다");
				break;
			}
		}
		
	}

}
