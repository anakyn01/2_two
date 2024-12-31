package network.ref;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;//병렬작업시 여러개의 작업을 효율적으로 처리하기 위헤 제공 
import java.util.concurrent.Executors;

public class Request {
   
   private static ServerSocket serverSocket = null;
   //10개의 스레드로 요청을 처리하는 스레드풀을 생성
   private static ExecutorService executorService = Executors.newFixedThreadPool(10);
   //작업(Runnable, Callable)등록을 위한 인터페이스 

   public static void main(String[] args) {
   System.out.println("-------------------------------------");
   System.out.println("서버를 종료하려면 q를 입력하고 Enter키를 입력하세요");
   System.out.println("-------------------------------------");
   
   //TCP서버 시작
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
   //TCP서버 종료
   stopServer();

   }
   public static void startServer() {
      //작업스레드 정의
      Thread thread = new Thread() {
         @Override
         public void run() {
            try {
            //ServerSocket생성 및 port바인딩
            serverSocket = new ServerSocket(50007);
            System.out.println("[서버] 시작됨\n");
            
            //연결 수락 및 데이터 통신
            while(true) {
               //연결 수락
               Socket socket = serverSocket.accept();
               
               //작업큐에 처리작업 넣기,Runnable은 함수형 인터페이스로 람다식으로 표현가능
               executorService.execute(() -> {
                  try {
//연결된 클라이언트 정보얻기
InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress();
System.out.println("[서버] " + isa.getHostName() + " 의 연결요청을 수락함");

//데이터받기
DataInputStream dis = new DataInputStream(socket.getInputStream());
String message = dis.readUTF();

//데이터보내기
DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
dos.writeUTF(message);
dos.flush();
System.out.println("[서버] 받은 데이터를 다시보냄: " + message);

//연결끊기
socket.close();
System.out.println("[서버] " + isa.getHostName() + "의 연결을 끊음\n");
                  } catch(IOException e) {                     
                  }
               });
            }
            
            } catch(IOException e) {
               System.out.println("[서버]" + e.getMessage());
            }
         }
      };
      thread.start();
   }
   public static void stopServer() {
      try {
         //serversocket을 닫고 port 언바인딩
         serverSocket.close();
         executorService.shutdownNow();
         System.out.println("[서버] 종료됨");
      } catch (IOException e1) {}
   }
}
/*
서버의 동시 요청처리[다수의 클라이언트와 통신을 한다]
서버는 클라이언트들로 동시에 요청을 받아서 처리하고
처리 결과를 개별 클라이언트로 보내 줘야 합니다

앞전에 수행과제 먼저 연결한 클라이언트 요청을 처리한후에 다음클라이언트의 요청을 처리한다
순차적으로 해서 좋지만
먼저 연결한 클라이언트의 요청 처리시간이 길어질수록 
다음 클라이언트의 요청이 처리가 지연되며
따라서 accept()와 receive() 를 제외한 요청처리 코드를 별도의 스레드 작업하는 것이 좋다
스레드를 처리할때 주의점은 클라이언트의 폭증으로 인한 서버의 과도한 스레드 생성을 방지해야 한다
그래서 스레드풀을 사용하는것이 바람직하다
스레드풀을 작업 처리스레드 수를 제한해서 사용하기 때문에 갑작스런 클라이언트 폭증이 발생해도 
크게 문제가 되지 않는다
다만 작업큐의 대기 작업이 증가되어 클라이언트에서 응답을 늦게 받을수 있습니다
*/
