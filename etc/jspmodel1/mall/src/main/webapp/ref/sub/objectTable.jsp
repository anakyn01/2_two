<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<table class="table table-hover">
    <thead>
<tr>
    <th>내장객체</th><th>반환유형</th><th>설명</th>
</tr>
    </thead>
    <tbody>
<tr>
    <td>request</td>
    <td>javax.servlet.http.HttpServletRequest</td>
    <td>http요청 정보를 저장한다</td>
</tr>
<tr>
    <td>response</td>
    <td>javax.servlet.http.HttpServletResponse</td>
    <td>http요청에 대한 응답 정보를 저장한다</td>
</tr>
<tr>
    <td>out</td>
    <td>javax.servlet.jsp.jsp.jspWriter</td>
    <td>jsp페이지의 출력할 내용을 담고 있는 출력스트림</td>
</tr>
<tr>
    <td>session</td>
    <td>javax.servlet.http.HttpSession</td>
    <td>세션정보를 저장한다</td>
</tr>
<tr>
    <td>application</td>
    <td>javax.servlet.ServletContext</td>
    <td>콘텍스트 정보를 저장한다</td>
</tr>
<tr>
    <td>pageContext</td>
    <td>javax.servlet.jsp.PageContext</td>
    <td>jsp페이지의 정보를 저장한다</td>
</tr>
<tr>
    <td>page</td>
    <td>java.lang.Object</td>
    <td>페이지를 구현한 자바 클래스로 JSP페이지 자체를 나타낸다</td>
</tr>
<tr>
    <td>config</td>
    <td>javax.servlet.ServletConfig</td>
    <td>페이지의 설정 정보를 저장한다</td>
</tr>
<tr>
    <td>exception</td>
    <td>java.lang.Throwable</td>
    <td>예외 발생을 처리한다</td>
</tr>
    </tbody>
</table>