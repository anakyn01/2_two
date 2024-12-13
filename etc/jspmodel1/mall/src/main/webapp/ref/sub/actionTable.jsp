<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h1>자바빈즈<small>자바로 작성된 소프트웨어 컴포넌트
(가시적으로 조작이 가능하고 또한 재사용이 가능함)</small></h1>
<table class="table table-hover">
	<thead>
		<tr>
			<th>액션태그</th><th>형식</th><th>설명</th>
		</tr>
	</thead>
	<tbody>
<tr>
<td>forward</td>
<td>jsp:forward</td>
<td>다른 페이지로 이동과 같은 페이지의 흐름을 제어한다</td>
</tr>
<tr>
<td>include</td>
<td>jsp:include</td>
<td>외부 페이지에 내용을 포함하거나 페이지를 모듈화 한다</td>
</tr>
<tr>
<td>useBean</td>
<td>jsp:useBean</td>
<td>jsp페이지에 자바빈즈를 설정한다</td>
</tr>
<tr>
<td>setProperty</td>
<td>jsp:setProperty</td>
<td>자바빈즈의 프로퍼티 값을 설정한다</td>
</tr>
<tr>
<td>getProperty</td>
<td>jsp:getProperty</td>
<td>자바빈즈의 프로퍼티 값을 얻어온다</td>
</tr>
<tr>
<td>param</td>
<td>jsp:param</td>
<td>태그에 인자를 추가한다
(단독으로 사용되지 않으며 forward, include내부에 사용된다)</td>
</tr>
<tr>
<td>plugin</td>
<td>jsp:plugin</td>
<td>BOM : 웹브라우저에서 자바애플릿을 실행</td>
</tr>
<tr>
<td>element</td>
<td>jsp:element</td>
<td>동적 xml요소를 설정한다</td>
</tr>
<tr>
<td>attribute</td>
<td>jsp:attribute</td>
<td>동적으로 정의된 XML요소의 속성을 설정한다</td>
</tr>
<tr>
<td>body</td>
<td>jsp:body</td>
<td>동적으로 정의된 XML요소의 몸체를 설정한다</td>
</tr>
<tr>
<td>text</td>
<td>jsp:text</td>
<td>jsp페이지 및 문서에서 템플릿 텍스트 작성</td>
</tr>
	</tbody>
</table>