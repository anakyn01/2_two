<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<table class="table">
    <thead>
        <tr>
            <th>out내장객체메소드</th><th>반환유형</th><th>설명</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>print(String str)</td>
            <td>void</td>
            <td>inline</td>
        </tr>
        <tr>
            <td>println(String str)</td>
            <td>void</td>
            <td>block</td>
        </tr>
        <tr>
            <td>newLine()</td>
            <td>void</td>
            <td>줄바꿈을 출력</td>
        </tr>
        <tr>
            <td>getBufferSize()</td>
            <td>int</td>
            <td>현재 출력버퍼의 크기를 가져온다</td>
        </tr>
        <tr>
            <td>getRemaining</td>
            <td>int</td>
            <td>현재 남아있는 출력버퍼의 크기를 가져온다</td>
        </tr>
        <tr>
            <td>clear()</td>
            <td>void</td>
            <td>출력버퍼를 비움</td>
        </tr>
        <tr>
            <td>clearBuffer()</td>
            <td>void</td>
            <td>현제 출력버퍼에 저장되어 있는 내용을 전송하지 않고 비운다</td>
        </tr>
        <tr>
            <td>flush()</td>
            <td>void</td>
            <td>웹브라우저에 전송하고 비운다</td>
        </tr>
        <tr>
            <td>isAutoFlush</td>
            <td>boolean</td>
            <td>출력버퍼가 채워졋을때의 처리를 결정한다 자동 true, 그렇지 않은 경우 false</td>
        </tr>
    </tbody>
</table>