package org.apache.jsp.WEB_002dINF.jsp.user.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstruts_005fform_0026_005fnamespace_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstruts_005ftextfield_0026_005fname_005flabel_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstruts_005fsubmit_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fstruts_005fform_0026_005fnamespace_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstruts_005ftextfield_0026_005fname_005flabel_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstruts_005fsubmit_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fstruts_005fform_0026_005fnamespace_005faction.release();
    _005fjspx_005ftagPool_005fstruts_005ftextfield_0026_005fname_005flabel_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fstruts_005fsubmit_005fnobody.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      if (_jspx_meth_struts_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_struts_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  struts:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_struts_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fstruts_005fform_0026_005fnamespace_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_struts_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_struts_005fform_005f0.setParent(null);
    // /WEB-INF/jsp/user/login/login.jsp(11,1) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_struts_005fform_005f0.setAction("loginpage");
    // /WEB-INF/jsp/user/login/login.jsp(11,1) name = namespace type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_struts_005fform_005f0.setNamespace("/login");
    int _jspx_eval_struts_005fform_005f0 = _jspx_th_struts_005fform_005f0.doStartTag();
    if (_jspx_eval_struts_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_struts_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_struts_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_struts_005fform_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t");
        if (_jspx_meth_struts_005ftextfield_005f0(_jspx_th_struts_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        if (_jspx_meth_struts_005ftextfield_005f1(_jspx_th_struts_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        if (_jspx_meth_struts_005fsubmit_005f0(_jspx_th_struts_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        out.write('	');
        int evalDoAfterBody = _jspx_th_struts_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_struts_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_struts_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstruts_005fform_0026_005fnamespace_005faction.reuse(_jspx_th_struts_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fstruts_005fform_0026_005fnamespace_005faction.reuse(_jspx_th_struts_005fform_005f0);
    return false;
  }

  private boolean _jspx_meth_struts_005ftextfield_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_struts_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  struts:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_struts_005ftextfield_005f0 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fstruts_005ftextfield_0026_005fname_005flabel_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_struts_005ftextfield_005f0.setPageContext(_jspx_page_context);
    _jspx_th_struts_005ftextfield_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_struts_005fform_005f0);
    // /WEB-INF/jsp/user/login/login.jsp(12,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_struts_005ftextfield_005f0.setName("userName");
    // /WEB-INF/jsp/user/login/login.jsp(12,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_struts_005ftextfield_005f0.setId("userName");
    // /WEB-INF/jsp/user/login/login.jsp(12,2) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_struts_005ftextfield_005f0.setLabel("User Name");
    int _jspx_eval_struts_005ftextfield_005f0 = _jspx_th_struts_005ftextfield_005f0.doStartTag();
    if (_jspx_th_struts_005ftextfield_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstruts_005ftextfield_0026_005fname_005flabel_005fid_005fnobody.reuse(_jspx_th_struts_005ftextfield_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fstruts_005ftextfield_0026_005fname_005flabel_005fid_005fnobody.reuse(_jspx_th_struts_005ftextfield_005f0);
    return false;
  }

  private boolean _jspx_meth_struts_005ftextfield_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_struts_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  struts:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_struts_005ftextfield_005f1 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fstruts_005ftextfield_0026_005fname_005flabel_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_struts_005ftextfield_005f1.setPageContext(_jspx_page_context);
    _jspx_th_struts_005ftextfield_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_struts_005fform_005f0);
    // /WEB-INF/jsp/user/login/login.jsp(13,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_struts_005ftextfield_005f1.setName("password");
    // /WEB-INF/jsp/user/login/login.jsp(13,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_struts_005ftextfield_005f1.setId("password");
    // /WEB-INF/jsp/user/login/login.jsp(13,2) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_struts_005ftextfield_005f1.setLabel("Password");
    int _jspx_eval_struts_005ftextfield_005f1 = _jspx_th_struts_005ftextfield_005f1.doStartTag();
    if (_jspx_th_struts_005ftextfield_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstruts_005ftextfield_0026_005fname_005flabel_005fid_005fnobody.reuse(_jspx_th_struts_005ftextfield_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fstruts_005ftextfield_0026_005fname_005flabel_005fid_005fnobody.reuse(_jspx_th_struts_005ftextfield_005f1);
    return false;
  }

  private boolean _jspx_meth_struts_005fsubmit_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_struts_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  struts:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_struts_005fsubmit_005f0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _005fjspx_005ftagPool_005fstruts_005fsubmit_005fnobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_struts_005fsubmit_005f0.setPageContext(_jspx_page_context);
    _jspx_th_struts_005fsubmit_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_struts_005fform_005f0);
    int _jspx_eval_struts_005fsubmit_005f0 = _jspx_th_struts_005fsubmit_005f0.doStartTag();
    if (_jspx_th_struts_005fsubmit_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstruts_005fsubmit_005fnobody.reuse(_jspx_th_struts_005fsubmit_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fstruts_005fsubmit_005fnobody.reuse(_jspx_th_struts_005fsubmit_005f0);
    return false;
  }
}
