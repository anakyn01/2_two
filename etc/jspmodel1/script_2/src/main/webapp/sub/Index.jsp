<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp" %>
<div class="container">
<div class="row">
<div class="col-md-12">
<h1>React</h1>
<div id="mydiv"></div>
<script type="text/babel">
function This(){
return <h2>난 리액트다</h2>
}
function Hello(){
return <h1>또 헬로 월드</h1>
}
const container = document.getElementById('mydiv');
const root = ReactDOM.createRoot(container);
root.render(<This/>)
</script>
</div>
</div>
</div>

<%@ include file="../include/footer.jsp" %>