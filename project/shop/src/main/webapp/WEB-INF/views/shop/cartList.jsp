<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../include/myNav.jsp"/>

<section id="content">
 <ul>
  <c:forEach items="${cartList}" var="cartList">
  <li>
   <div class="thumb">
    <img src="${cartList.gdsThumbImg}" />
   </div>
   <div class="gdsInfo">
    <p>
     <span>상품명</span>${cartList.gdsName}<br />
     <span>개당 가격</span><fmt:formatNumber pattern="###,###,###" value="${cartList.gdsPrice}" /> 원<br />
     <span>구입 수량</span>${cartList.cartStock} 개<br />
     <span>최종 가격</span><fmt:formatNumber pattern="###,###,###" value="${cartList.gdsPrice * cartList.cartStock}" /> 원
    </p>
    
    <div class="delete">
     <button type="button" class="delete_btn">삭제</button>
    </div>
   </div>   
  </li>
  </c:forEach>
 </ul>
</section>