package network.ref;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Tcp {
	private static ServerSocket serverSocket = null;

	public static void main(String[] args) {
		System.out.println("-----------------------------");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter키를 입력하세요");
		System.out.println("-----------------------------");
		
		//TCP 서버시작
		startServer();
		
		
		//키보드 입력
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String key = scanner.nextLine();
			if(key.toLowerCase().equals("q")) {
				break;
			}
		}
		scanner.close();
		
		//TCP 서버 종료
		stopServer();

	}//main end
	
	public static void startServer() {
		//작업 스레드 정의
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					//ServerSocket 생성 및 Port 바인딩
					serverSocket = new ServerSocket(50001);			
					System.out.println("[서버] 시작됨");
					
					while(true) {
						System.out.println("\n[서버] 연결 요청을 기다림\n");
						//연결수락 
						Socket socket = serverSocket.accept();
						
						//연결된 사람 정보얻기
						InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress();
						System.out.println(" [서버] " + isa.getHostString() + "의 연결 요청을 수락함");
						//연결 끊기
						socket.close();
						System.out.println(" [서버] " + isa.getHostString() + "의 연결을 끊음");
					}
						
						
				}catch(IOException e) {
					System.out.println("[서버] " + e.getMessage());
				}
			}	
		};
		//스레드 시작
		thread.start();
 	}
	public static void stopServer() {
try {
	//서버 소켓을 닫고 Port 언바인딩
	serverSocket.close();
	System.out.println("[서버] 종료됨");
}catch(IOException e1) {}
	}	

}//class end


/**
TCP 네트워킹
프로그램들이 통신할때는 약속된 데이터 전송규약이 있다
이것을 전송용 프로토콜이라고 한다
Transmission Control Protocol & User Datagram Protocol 
 */
