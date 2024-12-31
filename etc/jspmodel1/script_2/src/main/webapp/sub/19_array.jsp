<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp" %>
<div class="container">
<div class="row">
<div class="col-md-12">
<h1>Arrays</h1>
<pre>
- 단일변수에 여러값을 저장하기 위해서
- python에서는 arrays가 없고 대용으로 list를 대용으로 
  사용합니다 외부모듈인 Numpy를 사용합니다
- 내장객체 arrays
- es6(2015년) 이후로 const 사용하여 만듭니다
</pre>
<p><mark id="array"></mark></p>
<h1>반복배열 for 루프를 사용</h1>
<p><mark id="loop"></mark></p>
<script src="../js/array.js"></script>
</div>
</div>
<div class="row">
<div class="col-md-6">
<h1>파이선</h1>
<pre>
- 파이선에는 array가 없다 다만 list를 사용할 뿐
- 순서가 지정되고 변경가능하며 중복값을 허용한다
- 목록이 정렬되어 있다는 것은 항목에 정의된 순서가 있고
해당순서가 변경되지 않는다는 의미입니다
- 새항목을 추가하면 append,lastchild 새항목이 
목록 끝에 배치됩니다
</pre>
<py-script>
pyt = '''
파이썬은 이것이 긴주석 
또 변수에 쓰면 여러줄이 사용 가능
true false ?
'''
print(pyt)

thislist = ["apple","banana","cherry","apple","cherry"]
print(thislist)

#목록의 길이를 표현할때는 len
print(len(thislist))
</py-script>
</div>
<div class="col-md-6">
<h1>파이선</h1>
</div>
</div>
</div>
<%@ include file="../include/footer.jsp" %>