package network.ref;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewsServer {
	private static DatagramSocket datagramSocket = null;
	private static ExecutorService executorService = Executors.newFixedThreadPool(10);
	//accept와 receive를 제외한 스레드풀 생성
	
	public static void main(String[] args)throws Exception {
		System.out.println("종료 하려면 q");
		//UDP서버시작 
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

	}// main 함수 end
	public static void startServer() {
		//작업 스레드 정의
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					//데이터그램소켓 생성및 바인딩
					datagramSocket = new DatagramSocket(50007);
					System.out.println("[서버] 시작됨");
																			//[] 배열  최대 수
					DatagramPacket receivePacket = new DatagramPacket(new byte[1024], 1024);
					datagramSocket.receive(receivePacket);
			
					executorService.execute(()->{
						try {
							String newsKind = new String(receivePacket.getData(), 0, receivePacket.getLength(), "UTF-8");
							//ip port
								SocketAddress socketAddress = receivePacket.getSocketAddress();
								//10개의 뉴스를 클라이언트로 전송
								for(int i=1; i<=10; i++) {
									String data = newsKind + ": 뉴스" + i;
									byte[] bytes = data.getBytes("UTF-8");
									DatagramPacket sendPacket = new DatagramPacket(bytes, 0, bytes.length, socketAddress);
									datagramSocket.send(sendPacket);
								}
						} catch (Exception e) {
							
						}
					});
					
				} catch (Exception e) {
					System.out.println("[서버] " + e.getMessage());
				}
			}
		};
		thread.start();
	}
	public static void stopServer() {
		datagramSocket.close();
		executorService.shutdownNow();
		System.out.println("[서버] 종료됨");
	}
}
