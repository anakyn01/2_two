<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="date" class="java.util.Date"/>
<p>
<%
out.print("오늘의 날짜 및 시각");
%>
<%=date %>
</p>
<hr/>
<jsp:useBean id="bean" class="mall.dao.Calculator"/>
<%
int m = bean.process(5);
out.print("5의 3제곱: " + m);
%>
<hr/>
<h1>page=request</h1>
<jsp:useBean id="person" class="mall.dao.Person" scope="request"/>
<mark>아이디 : <%=person.getId() %></mark><br>
<mark>이 름 : <%=person.getName() %></mark><br>
<hr/>
<h1>setProperty액션태그</h1>
<pre>
- setter메소드에 접근
- 폼페이지로부터 전달되는 요청파라미터의 값을 직접 저장하거나 
- 자바빈즈의 프로퍼티로 변경하여 값을 저장 할수 있다
name = id속성 값으로 설정된 자바빈즈를 식별하기 위한 이름이다
property = 자바빈즈프로퍼티의 이름이다
value = 변경할 자바빈즈의 프로퍼티 값이다
param = 자바빈즈 프로퍼티값을 전달하는 요청파라미터의 이름이다

jsp:setProperty name="자바빈즈 식별이름" property="프로파티이름" value="값"
</pre>
<jsp:useBean id="person_update" class="mall.dao.Person" scope="request"/>
<jsp:setProperty name="person_update" property="id" value="20240813"/>
<jsp:setProperty name="person_update" property="name" value="홍길동"/>
<mark>아이디 : <%=person_update.getId() %></mark><br>
<mark>이 름 : <%=person_update.getName() %></mark><br>















