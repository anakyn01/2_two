<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration" %>
<%
//폼에서 한글 입력을 정상적으로 하려면 필요함
request.setCharacterEncoding("utf-8");
String name = request.getParameter("name");
String tel = request.getParameter("tel");
String password = request.getParameter("pwd");

out.println("<hr>");
Enumeration en = request.getHeaderNames();
while (en.hasMoreElements()){
	String headerName = (String)en.nextElement();
	String headerValue = request.getHeader(headerName);
%>
<%=headerName %> : <%=headerValue %><br>
<%
} 
%>
<p>이름 : <%=name%>
<p>전화 : <%=tel%>
<p>패스워드 : <%=password%>
<hr>
<p>클라이언트 IP :<%=request.getRemoteAddr() %>
<p>요청정보 길이 :<%=request.getContentLength()%>
<p>요청정보 인코딩 :<%=request.getCharacterEncoding()%>
<p>요청정보 콘텐츠유형 :<%=request.getContentType()%>
<p>요청정보 프로토콜 : <%=request.getProtocol()%>
<p>요청정보 전송방식 : <%=request.getMethod()%>
<p>요청 URI : <%=request.getRequestURI()%>
<p>콘텍스트 경로 : <%=request.getContextPath()%>
<p>서버이름 : <%=request.getServerName()%>
<p>서버포트 : <%=request.getServerPort()%>
<p>쿼리문 : <%=request.getQueryString()%>

<pre>
속성을 공유할수 있는 유효범위
- page : [내장객체 : pageContext] 해당 페이지가 클라이언트에게 서비스를 제공하는 동안
- request :[내장객체 : request ] 클라이언트의 요청이 처리되는 동안 유효
- session :[내장객체 : session] 세션이 유지되는 동안 유효
- application :[내장객체 : application ] 어플리케이션이 실해되고 있는 동안 유효
</pre>
<p>이 페이지는 5초후에 폭파된다
<%
response.setIntHeader("Refresh", 5);//5초마다 페이지가 갱신되도록 
%>
<p><%=(new java.util.Date()) %>







