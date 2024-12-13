package network.ref;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UDPClient {

   public static void main(String[] args) {
      
      try {
      //datagramsocket생성
      DatagramSocket datagramSocket = new DatagramSocket();
      
      //구독하고 싶은 뉴스 주제 보내기
      String data ="정치";
      byte[] bytes = data.getBytes("UTF-8");
      DatagramPacket sendPacket = new DatagramPacket(
      bytes, bytes.length, new InetSocketAddress("localhost", 50005));
      datagramSocket.send(sendPacket);
      
      while(true) {
         //뉴스 받기
         DatagramPacket receivePacket = new DatagramPacket(new byte[1024], 1024);
         //[ 수신된 데이터를 저장할 배열], 수신할수 있는 최대 바이트수
         datagramSocket.receive(receivePacket);
         //문자열로 변환
         String news = new String(receivePacket.getData(),0,receivePacket.getLength(),"UTF-8");
         System.out.println(news);
         
         if(news.contains("뉴스10")) {
            break;
         }
      }
      //Datagramsocket 닫기
      datagramSocket.close();
      
      }catch(Exception e) {
         
      }

   }

}
/*
UDP클라이언트 : 서버에 요청내용을 보내고 그 결과를 받는 역활을 한다
DatagramSocket객체는 기본 생성자로 생성한다
Port번호는 자동으로 부여되기 때문에 따로 지정할 필요가 없다
위에 예제에서는 newsserver로 구독하고 싶은 주제를 보내고 관련 뉴스 10개를 받는 
UDP클라이언트이다
*/
