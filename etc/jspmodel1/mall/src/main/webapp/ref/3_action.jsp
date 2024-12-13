<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="include/header.jsp" %>
<div class="container">
<div class="row">
<div class="col-md-12">
<h1>액션태그</h1>
<pre>
- 서버나 클라이언트에게 어떤 행동을 하도록 명령하는 태그
- 주석, 디렉티브 태그와 함께 jsp페이지를 구성하는 태그
- 페이지와 패이지 사이를 제어 하거나 
- 다른 페이지의 실행결과 내용을 현재 페이지에 포함하거나
- 자바빈즈(javaBeans)등의 다양한 기능을 제공합니다
</pre>
<jsp:include page="sub/actionTable.jsp" flush="false"/>
<h1>forward 액션태그</h1>
<%-- <jsp:forward page="3_action.jsp"/>--%>
<h1>jsp 인클루드</h1>
<pre>
- 속성에 flush 설정 => 설정한 외부 파일로 제어가 이동할때 기본값은 false이고 
- true로 설정하면 지금까지 출력버퍼에 저장된 내용을 웹브라우저에서 출력하고 출력버퍼를 지운다
</pre>
<h1>param 액션태그</h1>
<pre>
- 단독으로 사용하지 못하며 forward나 include 태그의 내부에 사용됩니다
</pre>
<jsp:include page="sub/forward_date.jsp">
	<jsp:param name="date" value="<%=new java.util.Date() %>"/>
</jsp:include>

<h1>자바빈즈 액션태그</h1>
<pre>
- jsp페이지의 주요기능중 하나는 데이터를 보여주는것 입니다
- 다같이 작성을 하면 => 기능을 확장하거나 코드를 재 사용하는데 어려움이 있습니다
- 프로그램의 효율을 높이기 위해 화면을 출력하는 부분과 데이터를 처리하는 로직부분을
구분하여 작성한다
- 로직부분 코드에는 자바빈즈라는 클래스를 사용합니다
- 자바빈즈는 데이터를 담는 맴버변수인 프로퍼티(property)와
데이터를 가져오거나 저장하는 메소드로 구성됩니다
- 아래에 규칙을 따라야 합니다
- java.io.Serializable 인터페이스를 구현한다
- 인수가 없는 기본 생성자가 있어야 한다
- 모든 맴버변수인 프로퍼티는 private접근 지정자로 설정해야 합니다
- 모든 맴버변수인 프로퍼티는 Getter/setter()메소드가 존재해야 합니다
id="자바빈스 식별이름" class="자바빈즈 이름" scope="범위"
- 범위는 page(기본),request,session,application
</pre>
<jsp:include page="sub/8_bean.jsp"/>






</div>
</div>
</div>
<%@ include file="include/footer.jsp" %>