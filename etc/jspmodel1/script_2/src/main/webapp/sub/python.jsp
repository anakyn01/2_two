<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp" %>
<div class="container">
<div class="row">
<div class="col-md-12">
<py-script>
print('hello, world!')
a = 200
b = 33
if b > a:
 print("b is greater than a")
elif a == b:
 print("a and b are equal")
else:
 print("a is greater than b")
</py-script>
</div>
</div>
</div>
<%@ include file="../include/footer.jsp" %>