<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<h2>page디렉티브 태그의 속성</h2>
 <table class="table table-hover">
<thead>
    <tr>
        <th>속성</th><th>설명</th><th>기본값</th>
    </tr>
</thead>
<tbody>
<tr>
    <td>language</td>
    <td>사용할 프로그래밍 언어를 설정합니다</td>
    <td>java</td>
</tr>

<tr>
    <td>contentType</td>
    <td>생성할 문서의 콘텐츠 유형을 설정합니다</td>
    <td>text/html</td>
</tr>

<tr>
    <td>pageEncoding</td>
    <td> 문자인코딩 </td>
    <td>ISO-8859-1</td>
</tr>

<tr>
    <td>import</td>
    <td>불러올 자바클래스 사용할때</td>
    <td></td>
</tr>

<tr>
    <td>session</td>
    <td>현재 jsp페이지의 세션 사용여부를 결정한다 false</td>
    <td>true</td>
</tr>

<tr>
    <td>buffer</td>
    <td>현재jsp페이지의 출력 버퍼크기를 설정한다 (8kb)</td>
    <td></td>
</tr>

<tr>
    <td>autoFlush</td>
    <td>출력버퍼의 동작제어를 설정합니다</td>
    <td></td>
</tr>

<tr>
    <td>isThreadSafe</td>
    <td>현재페이지의 멀티스레드 어용 여부를 설정합니다</td>
    <td></td>
</tr>

<tr>
    <td>info</td>
    <td>현재jsp페이지의 대한 설명을 설정합니다</td>
    <td></td>
</tr>

<tr>
    <td>errorPage</td>
    <td>커스텀으로 jsp페이지에서 오류가 발생했을때 보여줄 오류 페이지를 설정합니다</td>
    <td></td>
</tr>

<tr>
    <td>isErrorPage</td>
    <td>현재 jsp페이지가 오류 페이지인지 여부를 설정합니다</td>
    <td>false</td>
</tr>

<tr>
    <td>isElIgnored</td>
    <td>jsp의 표현언어(EL)지원 여부를 설정합니다</td>
    <td>false</td>
</tr>

<tr>
    <td>isScriptingEnabled</td>
    <td>현재 페이지의 스크립트(선언문,스크립틀릿,익스프레션) 태그사용여부를 설정합니다</td>
    <td></td>
</tr>
</tbody>
 </table>