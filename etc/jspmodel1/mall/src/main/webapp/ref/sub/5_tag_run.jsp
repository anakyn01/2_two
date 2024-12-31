<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<h2>디렉티브 태그에 Date클래스를 이용하여 현재날짜 출력하기</h2>
<%@ page import="java.util.*" %>
오늘은 <%=new Date()%> <!-- 익스프레션 표현식 el -->
<%
Map<String, String> map = new HashMap<>();
map.put("1", "a");
map.put("2", "b");
map.put("3", "c");
pageContext.setAttribute("map", map);
%>
<h1>${map["1"]}</h1>
<h2>buffer 속성 : 현재jsp페이지의 출력버퍼크기</h2>
<pre>
- none[출력버퍼를 채우지 않고 웹브라우저에 직접 보냅니다]과 
- 8kb[출력버퍼에 기록한후에 웹브라우저에 보냅니다] 
- 32kb[출력버퍼 내용이 32kb누적 될때까지 웹브라우저로 전송되지 않습니다]
</pre>
<%@ page buffer="32kb" %>
<h1>autoFlush: 자동으로 출력버퍼를 비우는 것</h1>
<%@ page autoFlush="true" %>
<h1>isThreadSafe : 여러 요청이 동시에 수신 false:순차적</h1>
<%@ page isThreadSafe="true" %>
<h1>page info : 설명 인포를 검색하여 메소드를 생성</h1>
<pre>
- jsp컨테이너는 info속성에 대응하여 서블릿 인터페이스
getServletInfo()메소드를 사용합니다
- 즉 info 속성 값인 설명메세지를 검색하여 getServletInfo()메소드 
</pre>
<%@ page info="home" %>
<%--
public String getServletInfo(){
	return "home";
}
--%>
<h1>el 사용못함</h1>
<%@ page isELIgnored="true" %>
<%
request.setAttribute("RequestAttribute", "request 내장 객체");
%>
${requestScope.RequestAttribute}
<h1>isScriptingEnalbed : 스크립트태그(선언문, 스크립틀릿, 표현문)을 사용하지 못하게 합니다</h1>
<%--   <%@ page isScriptingEnabled="true" %>   --%>





