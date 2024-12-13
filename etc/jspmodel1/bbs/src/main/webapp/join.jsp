<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp" %>

<div class="card o-hidden border-0 shadow-lg my-5">
<div class="card-body p-0">
<div class="row">

<div class="col-lg-5 d-none d-lg-block bg-register-image"><!-- 배경이미지가 들어가는 블록 -->
</div>

<div class="col-lg-7"><!-- 회원가입이 들어가는 블록 -->

   <div class="p-5">
      <div class="text-center">
      <h3 class="h4 text-grey-900 mb-4 text-white">Create an Account!</h3>
         <form method="post" action="joinAction.jsp" class="user">
         
            <div class="form-group row mb-3">
               <div class="col-sm-12 mb-3 mb-sm-0">
                  <input type="text"
                  class="form-control form-control-user"
                  placeholder="Enter Your Name"
                  name="userName"
                  required
                  />
               </div>
            </div>
            
            <div class="form-group mb-3">
               <input 
               type="text"
               class="form-control form-control-user"
               placeholder="Enter your userid"
               name="userID"
               required
               />
            </div>
            
            <div class="form-group mb-3">
               <input 
               type="password"
               class="form-control form-control-user"
               placeholder="Enter your password"
               name="userPassword"
               required
               />
            </div>
            
            <div class="form-group mb-3">
               <div class="btn-group">
                  <label class="btn btn-primary active">   
                     <input type="radio" name="userGender" value="남자" checked>남자
                  </label>
                  <label class="btn btn-primary">   
                     <input type="radio" name="userGender" value="여자">여자
                  </label>                           
               </div>            
            </div>
            
            <div class="form-group mb-3">
               <input 
               type="email"
               class="form-control form-control-user"
               placeholder="Email Address"
               name="userEmail"
               required
               />
            </div>
            <p class="mb-3">
               <input 
               type="submit"
               class="btn btn-primary btn-user btn-block"
               value="회원가입"
               />
            </p>
         
         </form>
         <hr>
         <div class="text-center mb-3">
            <a class="small" href="${contextPath}/forgot.jsp">
            Forgot Password?
            </a>         
         </div>
         <div class="text-center mb-3">
             <a class="small" href="${contextPath}/login.jsp">
            Create an Account!
            </a>
         </div>
      </div>
   </div>

</div>
</div>
</div>
</div>

<%@ include file="../include/footer.jsp" %>