package network.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import org.json.JSONObject;

public class ChatClient {
//필드
	Socket socket; //연결 요청과 연결을 끊을때
	DataInputStream dis; //dis, dos는 문자열을 읽고 보내기 위한 보조스트림
	DataOutputStream dos;
	String chatName;//클라이언트의 대화명
	
	//메소드 서버연결
	public void connect() throws IOException{
		socket = new Socket("localhost", 50009);
		dis = new DataInputStream(socket.getInputStream());
		dos = new DataOutputStream(socket.getOutputStream());
		System.out.println("[클라이언트] 서버에 연결됨");
	}
	
	//메소드 : JSON받기
	public void receive() {
		Thread thread = new Thread(()->{
			try {
				while(true) {
					String json = dis.readUTF();
					JSONObject root = new JSONObject(json);
					String clientIp = root.getString("clientIp");
					String chatName = root.getString("chatName");
					String message = root.getString("message");
					System.out.println("<"+chatName+"@"+clientIp+">"+message);
				}
			} catch (Exception e) {
				System.out.println("[클라이언트] 서버 연결 끊김");
				System.exit(0);//서버와의 통신이 끊어지면 dis.readUTF에서 입출력예외가 발생하기 때문에 예외처리를 해서 클라이언트도 종료되도록 한다
			//0(정상적인종료) 1(강제종료) int status
			}
		});
		thread.start();
	}
	
	//메소드 json보내기
	public void send(String json) throws IOException{
		dos.writeUTF(json);
		dos.flush();
	}
	//메소드 서버연결 종료
	public void unconnect() throws IOException{
		socket.close();
		
	}
	public static void main(String[] againTTostring) {
		try {
		ChatClient chatClient = new ChatClient();
		chatClient.connect();
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("대화명 입력 : ");
		chatClient.chatName = scanner.nextLine();
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("command","incoming");
		jsonObject.put("data",chatClient.chatName);
		String json = jsonObject.toString();
		chatClient.send(json);
		
		chatClient.receive();
		
		System.out.println("-------------------------------");
		System.out.println("보낼 메세지를 입력하고 Enter");
		System.out.println("채팅을 종료하려면 q를 입력하고 Enter");
		System.out.println("-------------------------------");
		while(true) {
			String message = scanner.nextLine();
			if(message.toLowerCase().equals("q")) {
				break;
			}else {
				jsonObject = new JSONObject();
				jsonObject.put("command","message");
				jsonObject.put("data","message");
				json = jsonObject.toString();
				chatClient.send(json);
			}
		}
		scanner.close();
		chatClient.unconnect();
		}catch (IOException e) {
			System.out.println("[클라이언트] 서버 연결 안됨");
		}
	}
	
}
