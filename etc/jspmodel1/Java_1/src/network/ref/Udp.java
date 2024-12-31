package network.ref;


import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.Scanner;

public class Udp {
   private static DatagramSocket datagramSocket = null;   
   
   public static void main(String[] args) throws Exception{
      
   //UDP클라이언트가 구독하고 싶은 뉴스 10개를 전송하는 UDP
   System.out.println("-------------------------------------");
   System.out.println("서버를 종료하려면 q를 입력하고 Enter키를 입력하세요");
   System.out.println("-------------------------------------");
   
   startServer();
   
   //키보드 입력
   Scanner scanner = new Scanner(System.in);
   while(true) {
      String key = scanner.nextLine();//next, nextline 차이점은 개행문자를 주냐 안주냐  문자열로 리턴
      if(key.toLowerCase().equals("q")) {
         break;
      }
   }
   scanner.close();
   
   //원하는걸 실행해서 프로세스 종료
   stopServer();

   }
   
   public static void startServer() {
      
      Thread thread = new Thread() {
         @Override
         public void run() {
            //데이타그램소켓 생성 및 port 바인딩
            try {
               datagramSocket = new DatagramSocket(50005);//port 바인딩
               System.out.println("[서버] 시작됨");
               
               while(true) {
                  //클라이언트가 구독하고 싶은 뉴스 주제 얻기
                  DatagramPacket receivePacket = new DatagramPacket(new byte[1024], 1024);
                  datagramSocket.receive(receivePacket);                  
                  String newskind = new String(receivePacket.getData(), 0, receivePacket.getLength(), "UTF-8");
                  
                  //클라이언트 IP와 port얻기
                  SocketAddress socketAddress = receivePacket.getSocketAddress();
                  
                  //10개의 뉴스를 클라이언트로 전송
                  for(int i=1; i<=10; i++) {
                     String data = newskind + ":뉴스" +i;
                     byte[] bytes = data.getBytes("UTF-8");
                     DatagramPacket sendPacket = 
                           new DatagramPacket(bytes, 0, bytes.length, socketAddress);
                     datagramSocket.send(sendPacket);
                  }
               }
               
               
            } catch (Exception e) {
                System.out.println("[서버] " + e.getMessage());
            }
         }
      };
      //스레드 시작
      thread.start();
      
   }
   
   public static void stopServer() {
      //DatagramSocket을 닫고 port언바인딩
      datagramSocket.close();
      System.out.println("[서버] 종료됨");
   }

}
/*
TCP처럼 고정회선이 아니라 여러회선을 통해 데이터가 전송되기 때문에
특정회선에 속도에 따라 데이터가 순서대로 전달되지 않거나 잘못된 회선으로 인해 데이터
손실이 발생할수 있다
그래서 신뢰성보다 속도가 중용하다면 UDP를 사용하고
데이터 전달의 신뢰성이 중요하다면 TCP를 사용합니다

자바는 UDP 네트워킹을 위해 java.net패키지에서
DatagramSocket[발신점과 수신점]과 DatagramPacket[주고 받는 데이터]클래스를 제공한다

DatagramSocket객체를 생성할때는
아래와 같이 바인딩할 Port생성자를 매개값으로 제공해야 한다

DatagramSocket datagramSocket = new DatagramSocket(50001)

DatagramPacket receivePacket = new DatagramPacket(new byte[1024], 1024);
datagramSocket.receive(receivePacket);

1바이트(Byte)=8비트(bit)
1키로바이트(KiloByte)= 1024바이트
1메가바이트(MegaByte)= 1024키로바이트
1기가바이트(GigaByte)= 1024메가바이트
1테라바이트(TeraByte)= 1024기가바이트
1페타바이트(PetaByte)=1024테라바이트
1엑사바이트(ExaByte)= 1024페타바이트

DatagramPacket생성자의 첫번째 매개값은 수신된 데이터를 저장할 배열이고 
두번째 매개값은 수신할수 있는 최대 바이트수이다
보통 첫번째 바이트 배열의 크기를 준다
두번째 개개값은 수신할수 있는 최대 바이트 수이다

byte[] bytes = receivePacket.getData();
int num = receivePacket.getLength();

읽는 데이터가 문자열이라고 하면 아래와 같이 String생성자를 이용하여 문자열을 얻을수 있다
String data = new String(bytes, 0, num, "UTF-8");
DatagramPacket sendPacket = new DatagramPacket(bytes, 0, bytes.length, socketAddress);

클라이언트로 보낼때는 send()메소드를 이용한다
datagramSocket.send(sendPacket);

더이상 원하지 않을경우는 
datagramSocket.close();

이제 반대로 UDP서버가 클라이언트에게 처리 내용을 보내려면 클라이언트 ip주소와
port번호가 필요한데
이것은 receive()로 받은 DatagramPacket에서 얻을수 있다

SocketAddress socketAddress = receivePacket.getSocketAddress();

이렇게 얻은 SocketAddress객체는 아래와 같이 클라이언트로 보낼 DatagramPacket을 생성할때
네번째 매개값으로 사용된다.DatagramPacket 생성자의 첫번째 매개값은 바이트배열이고
두번째는 시작 인덱스, 세번째는 보낼 바이트의 수이다







*/
