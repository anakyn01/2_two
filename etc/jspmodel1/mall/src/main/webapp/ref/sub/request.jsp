<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<table class="table">
    <thead>
        <tr>
            <th>요청파라미터관련 메소드</th><th>반환유형</th><th>설명</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>getParameter(String name)</td>
            <td>String</td>
            <td>요청 파라미어 이름이 name인 값을 전달받는다.요청 파라미터 값이 없으면 null을 리턴</td>
        </tr>
        <tr>
            <td>getParameterValues(String name)</td>
            <td>String[]</td>
            <td>요청 파라미어 이름이 name인 값을 배열형태로 전달받는다..요청 파라미터 값이 없으면 null을 리턴</td>
        </tr>
        <tr>
            <td>getParameterNames()</td>
            <td>java.util.Enumeration</td>
            <td>모든 요청 파라미터의 이름과 값을 Enumeration 객체 타입으로 전달받는다</td>
        </tr>
        <tr>
            <td>getParameterMap()</td>
            <td>java.util.Map</td>
            <td>모든 요청 파라미터의 이름과 값을 Map객체 타입으로 전달받는다
                [map객체 타입은 (요청파라미터 이름, 값 형식으로 구성된다)]
            </td>
        </tr>
    </tbody>
</table>
