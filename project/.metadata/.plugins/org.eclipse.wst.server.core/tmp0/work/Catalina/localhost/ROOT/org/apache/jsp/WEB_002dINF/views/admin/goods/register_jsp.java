/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.69
 * Generated at: 2024-12-13 07:14:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.admin.goods;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../include/header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid bg-gradient-primary\">\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("<div class=\"col-md-2\">\r\n");
      out.write("<div class=\"mt-1\"></div>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../include/lnb.jsp", out, false);
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"col-md-10\">\r\n");
      out.write("<h2 class=\"my-3 text-white\">상품 등록</h2>\r\n");
      out.write("<form method=\"post\" autocomplete=\"off\" class=\"my-5\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"input-group\">\r\n");
      out.write("	<label class=\"form-label text-white\">1차분류</label>\r\n");
      out.write("	<div class=\"w-5\"></div>\r\n");
      out.write("	<select class=\"form-select category1\">\r\n");
      out.write("		<option value=\"\">전체</option>\r\n");
      out.write("	</select>\r\n");
      out.write("	<div class=\"w-5\"></div>\r\n");
      out.write("	<label class=\"form-label text-white\">2차분류</label>\r\n");
      out.write("	<div class=\"w-5\"></div>\r\n");
      out.write("	<select class=\"form-select category2\" name=\"cateCode\">\r\n");
      out.write("		<option value=\"\">전체</option>\r\n");
      out.write("	</select>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"input-group mt-5\">\r\n");
      out.write("	<label class=\"form-label text-white w-10\">상품명</label>\r\n");
      out.write("	<input type=\"text\" id=\"gdsName\" name=\"gdsName\" class=\"form-control w-90\" required/>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"input-group mt-5\">\r\n");
      out.write("	<label class=\"form-label text-white w-10\">상품가격</label>\r\n");
      out.write("	<input type=\"text\" id=\"gdsPrice\" name=\"gdsPrice\" class=\"form-control w-90\" required/>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"input-group mt-5\">\r\n");
      out.write("	<label class=\"form-label text-white w-10\">상품수량</label>\r\n");
      out.write("	<input type=\"text\" id=\"gdsStock\" name=\"gdsStock\" class=\"form-control w-90\" required/>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"input-group mt-5\">\r\n");
      out.write("	<label class=\"form-label text-white w-10\">상품소개</label>\r\n");
      out.write("	<textarea cols=\"50\" id=\"gdsDes\" name=\"gdsDes\" class=\"form-control w-90\" required></textarea>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("<label class=\"form-label\" for=\"gdsImg\">이미지</label>\r\n");
      out.write("<input type=\"file\" id=\"gdsImg\" name=\"file\" />\r\n");
      out.write("<div class=\"select_img\"><img src=\"\"/></div>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("$(\"#gdsImg\").change(function(){\r\n");
      out.write("if(this.files && this.files[0]){\r\n");
      out.write("	var reader = new FileReader;\r\n");
      out.write("	reader.onload = function(data){\r\n");
      out.write("		$(\".select_img img\").attr(\"src\", data.target.result).width(500);\r\n");
      out.write("	}\r\n");
      out.write("	reader.readAsDataURL(this.files[0]);\r\n");
      out.write("}	\r\n");
      out.write("})\r\n");
      out.write("</script>\r\n");
      out.write("<div class=\"text-white\">");
      out.print(request.getRealPath("/") );
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"d-flex justify-content-end my-5\">\r\n");
      out.write("<button type=\"submit\" id=\"register_Btn\" class=\"btn btn-outline-warning btn-block py-3\">\r\n");
      out.write("등록\r\n");
      out.write("</button>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("//컨트롤러에서 데이터 받기\r\n");
      out.write("var jsonData = JSON.parse('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${category}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("');\r\n");
      out.write("console.log(jsonData);\r\n");
      out.write("\r\n");
      out.write("var cate1Arr = new Array();\r\n");
      out.write("var cate1Obj = new Object();\r\n");
      out.write("\r\n");
      out.write("// 1차 분류 셀렉트 박스에 삽입할 데이터 준비\r\n");
      out.write("for(var i = 0; i < jsonData.length; i++) {\r\n");
      out.write(" \r\n");
      out.write(" if(jsonData[i].level == \"1\") {\r\n");
      out.write("  cate1Obj = new Object();  //초기화\r\n");
      out.write("  cate1Obj.cateCode = jsonData[i].cateCode;\r\n");
      out.write("  cate1Obj.cateName = jsonData[i].cateName;\r\n");
      out.write("  cate1Arr.push(cate1Obj);\r\n");
      out.write(" }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// 1차 분류 셀렉트 박스에 데이터 삽입\r\n");
      out.write("var cate1Select = $(\"select.category1\")\r\n");
      out.write("\r\n");
      out.write("for(var i = 0; i < cate1Arr.length; i++) {\r\n");
      out.write(" cate1Select.append(\"<option value='\" + cate1Arr[i].cateCode + \"'>\"\r\n");
      out.write("      + cate1Arr[i].cateName + \"</option>\"); \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("$(document).on(\"change\", \"select.category1\", function(){\r\n");
      out.write("	//select.category1이 변경되었다면 실행되는 함수\r\n");
      out.write("\r\n");
      out.write("	 var cate2Arr = new Array();\r\n");
      out.write("	 var cate2Obj = new Object();\r\n");
      out.write("	 \r\n");
      out.write("	 // 2차 분류 셀렉트 박스에 삽입할 데이터 준비\r\n");
      out.write("	 for(var i = 0; i < jsonData.length; i++) {\r\n");
      out.write("	  \r\n");
      out.write("	  if(jsonData[i].level == \"2\") {\r\n");
      out.write("	   cate2Obj = new Object();  //초기화\r\n");
      out.write("	   cate2Obj.cateCode = jsonData[i].cateCode;\r\n");
      out.write("	   cate2Obj.cateName = jsonData[i].cateName;\r\n");
      out.write("	   cate2Obj.cateCodeRef = jsonData[i].cateCodeRef;\r\n");
      out.write("	   \r\n");
      out.write("	   cate2Arr.push(cate2Obj);\r\n");
      out.write("	  }\r\n");
      out.write("	 }\r\n");
      out.write("	 \r\n");
      out.write("	 var cate2Select = $(\"select.category2\");\r\n");
      out.write("	 \r\n");
      out.write("	 cate2Select.children().remove();\r\n");
      out.write("\r\n");
      out.write("	 /*for(var i = 0; i < cate2Arr.length; i++) {\r\n");
      out.write("	   cate2Select.append(\"<option value='\" + cate2Arr[i].cateCode + \"'>\"\r\n");
      out.write("	        + cate2Arr[i].cateName + \"</option>\");\r\n");
      out.write("	 }*/\r\n");
      out.write("	$(\"option:selected\", this).each(function(){\r\n");
      out.write("		var selectVal = $(this).val();\r\n");
      out.write("		cate2Select.append(\"<option value='\" + selectVal + \"'>전체</option>\");\r\n");
      out.write("		\r\n");
      out.write("		for(var i =0; i < cate2Arr.length; i++){\r\n");
      out.write("			if(selectVal == cate2Arr[i].cateCodeRef){\r\n");
      out.write("				   cate2Select.append(\"<option value='\" + cate2Arr[i].cateCode + \"'>\"\r\n");
      out.write("					        + cate2Arr[i].cateName + \"</option>\");\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("	}); \r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../include/footer.jsp", out, false);
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
