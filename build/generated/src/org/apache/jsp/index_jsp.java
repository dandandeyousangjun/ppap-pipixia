package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zh-cn\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <title>PPAP</title>\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"http://labfile.oss.aliyuncs.com/libs/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"http://labfile.oss.aliyuncs.com/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("  </head>\r\n");
      out.write("    <style>\r\n");
      out.write("        .fill:hover,\r\n");
      out.write("        .fill:focus {\r\n");
      out.write("          box-shadow: inset 0 0 0 2em var(--hover);\r\n");
      out.write("         }\r\n");
      out.write("        .fill {\r\n");
      out.write("           --color: #a972cb;\r\n");
      out.write("           --hover: #cb72aa;\r\n");
      out.write("          }\r\n");
      out.write("\r\n");
      out.write("        button {\r\n");
      out.write("         color:var(--color);\r\n");
      out.write("         -webkit-transition: 0.25s;\r\n");
      out.write("         transition: 0.25s;\r\n");
      out.write("         }\r\n");
      out.write("         \r\n");
      out.write("        button:hover, button:focus {\r\n");
      out.write("       border-color: var(--hover);\r\n");
      out.write("       color: #fff;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("       button {\r\n");
      out.write("         background: none;\r\n");
      out.write("          border: 2px solid;\r\n");
      out.write("          font: inherit;\r\n");
      out.write("          line-height: 1;\r\n");
      out.write("           margin: 0.5em;\r\n");
      out.write("         padding: 1em 2em;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\tbody{\r\n");
      out.write("\t\tbackground-image: url('pic/img001.jpg');\r\n");
      out.write("\t\tbackground-repeat: repeat-x;\r\n");
      out.write("\t}\r\n");
      out.write("        \r\n");
      out.write("    </style>\r\n");
      out.write("    \r\n");
      out.write("  <body>\r\n");
      out.write("\t<div style=\"margin:0 auto;width:20%;font-size:10;color:white\"  >\r\n");
      out.write("            <h2> PPAP 音乐网站</h2>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div  style=\"margin:0 auto;width:10%;\" >\r\n");
      out.write("              <button type=\"button\" class=\"fill\" id=\"login\" onclick=\"window.location='login.jsp'\" >登录</button>\r\n");
      out.write("              <h2>  </h2>\r\n");
      out.write("            </div>\r\n");
      out.write("      <div style=\"margin:0 auto;width:80%;\" >\r\n");
      out.write("      <img src=\"pic/1.jpg\" />\r\n");
      out.write("    </div>\r\n");
      out.write(" <p></p>\r\n");
      out.write("<br />\r\n");
      out.write("<br />\r\n");
      out.write("<p></p>\r\n");
      out.write("    <footer class=\"main-footer\">\r\n");
      out.write("\t<div style=\"width:40%;margin:5px auto;\">\r\n");
      out.write("\t\t<strong>Copyright &copy; 2001-2017 <a href=\"#\">PPAP北京有限公司</a>.</strong> All rights \r\n");
      out.write("\t</div>\r\n");
      out.write("</footer>  \r\n");
      out.write("     <p></p>\r\n");
      out.write("<br />\r\n");
      out.write("<br />\r\n");
      out.write("<p></p>    \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("<script src=\"http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js\" ></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\tvar i = 1;\r\n");
      out.write("\t\tsetInterval(function(){\r\n");
      out.write("\t\t\t$('img').attr('src','pic/'+i+'.jpg');\r\n");
      out.write("\t\t\t++i;\r\n");
      out.write("\t\t\tif(i>5){\r\n");
      out.write("\t\t\t\ti=1;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t},1500)\r\n");
      out.write("\t})\r\n");
      out.write("</script>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
