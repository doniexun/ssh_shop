package org.apache.jsp.admin.category;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("\t<HEAD>\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Language\" content=\"zh-cn\">\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t\t<LINK href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/Style1.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("\t</HEAD>\r\n");
      out.write("\t\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<form id=\"userAction_save_do\" name=\"Form1\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/adminCategory_save.action\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t\t&nbsp;\r\n");
      out.write("\t\t\t<table cellSpacing=\"1\" cellPadding=\"5\" width=\"100%\" align=\"center\" bgColor=\"#eeeeee\" style=\"border: 1px solid #8ba7e3\" border=\"0\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"ta_01\" align=\"center\" bgColor=\"#afd1f3\" colSpan=\"4\"\r\n");
      out.write("\t\t\t\t\t\theight=\"26\">\r\n");
      out.write("\t\t\t\t\t\t<strong><STRONG>Add First Category</STRONG>\r\n");
      out.write("\t\t\t\t\t\t</strong>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"18%\" align=\"center\" bgColor=\"#f5fafe\" class=\"ta_01\">\r\n");
      out.write("\t\t\t\t\t\tCategory：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"ta_01\" bgColor=\"#ffffff\" colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"cname\" value=\"\" id=\"userAction_save_do_logonName\" class=\"bg\"/>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"ta_01\" style=\"WIDTH: 100%\" align=\"center\"\r\n");
      out.write("\t\t\t\t\t\tbgColor=\"#f5fafe\" colSpan=\"4\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" id=\"userAction_save_do_submit\" value=\"Confirm\" class=\"button_ok\">\r\n");
      out.write("\t\t\t\t\t\t\t&#30830;&#23450;\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<FONT face=\"宋体\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</FONT>\r\n");
      out.write("\t\t\t\t\t\t<button type=\"reset\" value=\"Reset\" class=\"button_cancel\">&#37325;&#32622;</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<FONT face=\"宋体\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</FONT>\r\n");
      out.write("\t\t\t\t\t\t<INPUT class=\"button_ok\" type=\"button\" onclick=\"history.go(-1)\" value=\"Return\"/>\r\n");
      out.write("\t\t\t\t\t\t<span id=\"Label1\"></span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</body>\r\n");
      out.write("</HTML>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}