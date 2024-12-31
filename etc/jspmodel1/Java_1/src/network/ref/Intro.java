/**
 네트워크
 : 여러 컴퓨터들을 통신 회선으로 연결한 것을 말한다
 LAN : Local Area Network : 가정,회사,건물, 특정영역에 존재하는 컴퓨터를 연결한 것이고
 WAN : Wide Area Network : LAN을 연결한 것을 말합니다
 => 우리가 말하는 인터넷이다
 
 서버와 클라이언트
 서버 : 서비스를 제공하는 일반적인 것을 서버
 클라이언트 : 서비스를 요청하는 프로그램
 인터넷에서 두 프로그램을 통신하기 위해서 먼저 클라이언트가 서비스를 request(요청) 하고
 서버는 처리 결과로 response(응답)을 제공해 준다
 
 Internet Protocol : 집과 같은 고유한 인터넷의 주소
 ip주소는 네트워크 어댑터(Lan 카드) 마다 할당된다
 if 컴퓨터가 2대 : ip주소는 두개
 
 네트워크에서 어떤 ip주소가 부여되어 있는지 확인하려면 
 창문 + r  => cmd => user => ipconfig
 면 실행된다
 여기서 xxx는 부호가 없는 0~255 사이의 정수이다
 
 연결할 상대방 컴퓨터의 ip주소를 모르면 프로그램들은 서로 통신할수 없다
 
 전화번호를 모르면 02-114에 전화해서 물어보듯
 프로그램은 뭘로 물어보냐면 ip를 물어봅니다
 Domain Name System dns로 물어 봅니다
 여기서 dns는 도메인 이름으로 ip를 등록하는 저장소이다
 주소를 검색해 찾은 다음 웹서버와 연결해서 웹 페이지를 받는다
 
 한대의 컴퓨터에는 다양한 서버 프로그램이 실행된다
 웹서버, 데이터베이스, 관리시스템(DBMS), FTP서버
 이경우 클라이언트는 어떤 서버와 통신을 해야 할지 결정한다
 컴퓨터 내부에서 실행하는 서버를 선택하기 위해서 추가적인 port 번호가 필요하다
 Port는 운영체제가 관리하는 서버프로그램의 연결번호 이다
 
 프로그램에서 사용할수 있는 전체 port번호의 범위는 0 ~ 65535로
 Well know Port Numbers : 0 ~1023 국제인터넷주소관리기구에서 애플리케이션으로 미리 예약한 port
 Registered Port Numbers : 1024 ~ 49151 -> 회사에서 등록해서 사용할수 있는 port
 Dynamic Or private Port Numbers : 49152 ~ 65535 -> 운영체제가 부여하는 동적 port
 개인목적으로 사용할수 있는 port
 
 TCP는 연결형 프로토콜 상대방이 연결된 상태에서 데이터를 주고 받는다
 클라이언트가 연결요청을 하고 서버가 연결을 수락하면 통신회선이 고정되고
 데이터는 고정 회선을 통해 전달된다
 
 TCP는 웹브라우저가 웹서버에 연결할때 사용되며
 이메일 전송, 파일전송, DB연동에도 사용된다
 
 자바는 TCP네트워킹을 위해 java.net
 ServerSocket과 Socket클래스를 제공한다
 ServerSocket은 클라이언트의 연결을 수락하는 서버쪽 클래스
 Socket은 클라이언트와 서버 양쪽에서 데이터를 주고 받을때 사용되는 클래스이다
 
 TCP서버 프로그램을 개발하려면 우선 SeverSoket객체를 생성해야 한다
 다음은 50001번 port에 바인딩하는 SeverSocket을 생성하는 코드이다
 
 SeverSocket severSocket = new SeverSocket(50001);
 
 any 개발이든 binding(구성요소의 구체적인 값 성격을 확정하는것)
 SeverSocket을 생성하는 또다른 방법은 기본 생성자로 객체를 생성하고 
 port바인딩을 위해 bind()메소드를 호출하는 것이다 
 
 SeverSocket severSocket = new SeverSocket();
 SeverSocket.bind(new InetSocketAddress(50001));
 
 여러개의 ip가 할당되어 있을경우 특정 ip에서만 서비스 하고싶으면
 InetSocketAddress의 첫번째 매개값으로 해당 ip를 준다
 
 SeverSocket severSocket = new SeverSocket();
 SeverSocket.bind("xxx.xxx.xxx.xxx"new InetSocketAddress(50001));
 
 if (access){
 다른 port로 바인딩 하거나
 }else if{
 사용중인 프로그램을 종료하고 다시 실행한다
 }else {
 안해
 }
 
 severSocket 생성되었다면 
 연결 요청수락을 위해 accept() 메소드를 실행해야 한다
 
 accept()는 클라이언트가 연결 요청을 하기전까지 블로킹된다
 
 getRemoteSocketAddress() : 연결된 클라이언트의 ip주소와 port번호를 얻고자 할때
 getHostToString()과 getPort() 메소드를 호출한다
 
 서버를 종료하려면 port번호를 unbinding시켜야
 그래야 다른 프로그램에서 해당 port번호를 재사용한다
 
 serverSocket.close();
 
 */

package network.ref;

import java.net.InetAddress;
import java.net.UnknownHostException;


public class Intro {

	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 IP주소 : " + local.getHostAddress());
			
			InetAddress[] isYou = InetAddress.getAllByName("www.youtube.com");
			for(InetAddress remote : isYou) {
				System.out.println("유튜브 IP 주소 : " + remote.getHostAddress());
			}
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
