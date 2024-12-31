<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="include/header.jsp" %>
<div class="container">
   <div class="row justify-content-center"><!-- 로그인 창 프레임 -->
      <div class="card o-hidden border-0 shadow-lg my-5">
         <div class="card-body p-0">
         <div class="row">

            <!-- 배경 이미지가 들어가는 영역 -->
            <div class="col-lg-6 d-none d-lg-block bg-login-image"></div>

<!-- 인풋  -->         
            <div class="col-lg-6">
               <div class="p-5">
                     <div class="text-center">
                        <h1 class="h4 text-gray-900 mb-4">Welcome back!</h1>
                     </div>
<form class="user" method="post" action="loginAction.jsp">
                        <div class="form-group">
                           <input 
                           type="text" 
                           class="form-control form-control-user"
                           placeholder="아이디를 입력하세요"
                           name="userID"
                           />
                        </div>
                         <div class="form-group">
                           <input
                           type="password"
                           class="form-control form-control-user"
                           placeholder="패스워드를 입력하세요"
                           name="userPassword"
                           />
                        </div>
                        <div class="form-group">
                           <div class="my-3">
                              <input type="submit" class="btn btn-primary btn-user btn-block" value="login">
                           </div>
                        </div>
                        <hr>
                        <a href="#" class="btn btn-google btn-user btn-block">
                         <i class="fab fa-google fa-fw"></i>Login with Google
                        </a>
                        <hr>
                        <a href="#" class="btn btn-facebook btn-user btn-block">
                         <i class="fab fa-facebook-f fa-fw"></i>Login with FaceBook
                         </a>
                         <hr>
                     </div>
                  </form>
         <hr>
         <div class="text-center mb-3">
            <a class="small" href="${contextPath}/forgot.jsp">
            Forgot Password?
            </a>         
         </div>
         <div class="text-center mb-3">
             <a class="small" href="${contextPath}/join.jsp">
            Create an Account!
            </a>
         </div>
               </div>
            </div>         
   
         </div><!--  카드 바디  end -->
      </div><!-- 카드 end -->   
   </div><!-- 로그인 프레임 end -->
   </div><!-- row -->
</div><!--container end-->
</div>
<%@ include file="include/footer.jsp" %>