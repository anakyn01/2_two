package network.chat;
/*
chatServer => server
- 채팅서버 실행클래스
- serverSocket을 생성하고 50009에 바인딩  
- Chatclient 연결 수락후 SocketClient생성

SocketClient => ChatClient와 1:1로 통신

chatClient 
- 채팅 클라이언트 실행클래스
- ChatServer에 연결 요청
- SocketClient와 1:1 통신
*/



import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.json.JSONObject;

public class ChatServer {
		ServerSocket serverSocket;//클라이언트의 연결 요청을 수락
		ExecutorService threadPool = Executors.newFixedThreadPool(100);
		//threadPool은 100개의 클라이언트가 동시에 채팅할수 있도록 합니다
		Map<String, SocketClient> chatRoom = Collections.synchronizedMap(new HashMap<>());
		//chatRoom은 통신용 SocketClient를 관리하는 동기화된 Map컬렉션
		
		
		
	//메소드 : 서버시작
		public void start() throws IOException{
			serverSocket = new ServerSocket(50009);
			//2) 50009번 port에 바인딩하는 ServerSocket을 생성하고
			System.out.println("[서버] 시작됨");
			
			Thread thread = new Thread(()->{//3)lambda 작업 스레드가 처리할 Runnable 람다식 ()->{...}제공
				try {
					while(true) {
						Socket socket = serverSocket.accept();
						SocketClient sc= new SocketClient(this, socket);
					}
				} catch (Exception e) {
					
				}
			});
			thread.start();/*1) 채팅서버가 시작할때 제일 먼저 호출되는 것으로*/
			
		}
   	//메소드 : 클라이언트 연결시 SocketClient 생성 및 추가
	public void addSocketClient(SocketClient socketClient) {//4) 채팅방에 추가
		String key = socketClient.chatName + "@" + socketClient.clientIp;
		//채팅명과 @ ip로 하고 SocketClient값으로 해서 지정한다
		chatRoom.put(key, socketClient);
		System.out.println("입장 : " + key);
		System.out.println("현재 채팅자 수 : " + chatRoom.size()+"\n");
	}
	//메소드 : 클라이언트 연결 종료시 SocketClient 제거[연결이 끊긴 클라이언트(SocketClient)를 채팅방에서 제거
	public void removeSocketClient(SocketClient socketClient) {
		String key = socketClient.chatName + "@" + socketClient.clientIp;
		chatRoom.remove(key);
		System.out.println("나감 : " + key);
		System.out.println("현재 채팅자 수 : " + chatRoom.size()+"\n");
	}
	//메소드 : 모든 클라이언트에게 메세지 보냄
	public void sendToAll(SocketClient sender, String message) {
		//json메세지를 생성해서 채팅방에 있는 모든 클라이언트에게 보내는 역할을 한다
		JSONObject root = new JSONObject();
		root.put("clientIp", sender.clientIp);
		root.put("chatName", sender.chatName);
		root.put("message", message);
		String json = root.toString();
		
		//전송되기 위한 조건을 ..
		Collection<SocketClient> socketClients = chatRoom.values();
		for(SocketClient sc : socketClients) {
			if(sc == sender)continue;
			sc.send(json);
		}
		
		
}	
	//메소드 : 서버종료 채팅서버를 종료시키는 역할을 한다
			public void stop() {
				try {
					serverSocket.close();
					threadPool.shutdownNow();//스레드풀로 담고
					chatRoom.values().stream().forEach(sc -> sc.close());
					//Collector로 <SocketClient>를 얻고 요소 스트림을 이용해서 전체 SocketClient close()메소드를 호출한다 
					System.out.println("[서버] 종료됨");
				} catch (IOException e1) {
					
				}
			}

//메소드 : 메인
public static void main(String[] args) {
	try {
		ChatServer chatServer = new ChatServer();
		chatServer.start();
		System.out.println("-------------------------------");
		System.out.println("서버를 종료하려면 q를 입력하고 Enter");
		System.out.println("-------------------------------");
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String key = scanner.nextLine();
			if(key.equals("q")) break;
		}
		scanner.close();
		chatServer.stop();
		
	} catch (IOException e) {
		System.out.println("[서버] " + e.getMessage());
	}
}

}
