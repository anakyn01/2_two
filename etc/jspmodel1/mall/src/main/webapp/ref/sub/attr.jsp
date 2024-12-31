<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<table class="table">
    <colgroup>
    <col style="width:35%"/>
    <col style="width:15%"/>
    <col style="width:50%"/>
    </colgroup>
    <thead>
        <tr>
            <th>메소드</th><th>반환유형</th><th>설명</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>setAttribute(String name, Object value)</td>
            <td>void</td>
            <td>해당 내장객체의 속성 이름이 name인 속성값을 value로 저장한다</td>
        </tr>
        <tr>
            <td>getAttribute(String name)</td>
            <td>Object</td>
            <td>해당 내장객체의 속성 이름이 name인 속성 값을 가져온다</td>
        </tr>
        <tr>
            <td>removeAttribute(String name)</td>
            <td>void</td>
            <td>해당 내장객체의 속성 이름이 name인 속성을 삭제한다</td>
        </tr>
        <tr>
            <td>getAttributeNames()</td>
            <td>java.util.Enumaeration</td>
            <td>해당 내장객체의 속성 이름을 가져온다 단 (pageContext 내장객체는 이메소드를 제공하지 않는다)</td>
        </tr>
    </tbody>
</table>