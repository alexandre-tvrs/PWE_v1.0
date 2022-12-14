/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.37
 * Generated at: 2022-09-21 22:55:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastrar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>Cadastro</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("  \n");
      out.write("  \t$(document).ready(function() {\n");
      out.write("\t\t$(\"#btnEnviar\").click(function() {\n");
      out.write("\t\t\tvar frmData = $(\"#frmCadastro\").serialize();\n");
      out.write("\t\t\t$(\"#msg\").html(\"Enviou:\" + frmData);\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl: \"respondedorCadastro.jsp\",\n");
      out.write("\t\t\t\tdata: frmData,\n");
      out.write("\t\t\t\ttype: \"POST\",\n");
      out.write("\t\t\t\tsuccess: function( data ) {\n");
      out.write("\t\t\t\t\t$(\"#msg\").html( $(\"#msg\").html()+\"<br>Retornou:\" + data);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("  \n");
      out.write("  </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("  <h2>Cadastrar novo usu??rio</h2>\n");
      out.write("  <form  id=\"frmCadastro\">\n");
      out.write("  \t<div class=\"form-group\">\n");
      out.write("      <label for=\"nome\">Nome:</label>\n");
      out.write("      <input type=\"nome\" class=\"form-control\" id=\"nome\" placeholder=\"Digite seu  Nome\" name=\"nome\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("    <label class=\"visually-hidden\" for=\"inlineFormSelectPref\">N??vel</label>\n");
      out.write("    <select class=\"select\" id=\"nivel\" name=\"nivel\">\n");
      out.write("      <option value=\"1\" default>Um</option>\n");
      out.write("      <option value=\"2\">Dois</option>\n");
      out.write("      <option value=\"3\">Tr??s</option>\n");
      out.write("    </select>\n");
      out.write("  </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"email\">Email:</label>\n");
      out.write("      <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Digite seu  email\" name=\"email\" required>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"cpf\">CPF:</label>\n");
      out.write("      <input type=\"cpf\" class=\"form-control\" id=\"senha\" placeholder=\"Digite seu CPF:\" name=\"cpf\" required>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"end\">Endere??o:</label>\n");
      out.write("      <input type=\"end\" class=\"form-control\" id=\"end\" placeholder=\"Digite seu Endere??o:\" name=\"end\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"bairro\">Bairro:</label>\n");
      out.write("      <input type=\"bairro\" class=\"form-control\" id=\"bairro\" placeholder=\"Digite seu Bairro:\" name=\"bairro\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"cidade\">Cidade:</label>\n");
      out.write("      <input type=\"cidade\" class=\"form-control\" id=\"cidade\" placeholder=\"Digite sua Cidade:\" name=\"cidade\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("    <label class=\"visually-hidden\" for=\"inlineFormSelectPref\">UF:</label>\n");
      out.write("    <select class=\"select\" id=\"uf\" name=\"uf\">\n");
      out.write("      <option value=\"RO\" default>RO</option>\n");
      out.write("      <option value=\"AC\">AC</option>\n");
      out.write("      <option value=\"AM\">AM</option>\n");
      out.write("      <option value=\"RR\">RR</option>\n");
      out.write("      <option value=\"PA\">PA</option>\n");
      out.write("      <option value=\"AP\">AP</option>\n");
      out.write("      <option value=\"TO\">TO</option>\n");
      out.write("      <option value=\"MA\">MA</option>\n");
      out.write("      <option value=\"PI\">PI</option>\n");
      out.write("      <option value=\"CE\">CE</option>\n");
      out.write("      <option value=\"RN\">RN</option>\n");
      out.write("      <option value=\"PB\">PB</option>\n");
      out.write("      <option value=\"PE\">PE</option>\n");
      out.write("      <option value=\"AL\">AL</option>\n");
      out.write("      <option value=\"SE\">SE</option>\n");
      out.write("      <option value=\"BA\">BA</option>\n");
      out.write("      <option value=\"MG\">MG</option>\n");
      out.write("      <option value=\"ES\">ES</option>\n");
      out.write("      <option value=\"RJ\">RJ</option>\n");
      out.write("      <option value=\"SP\">SP</option>\n");
      out.write("      <option value=\"PR\">PR</option>\n");
      out.write("      <option value=\"SC\">SC</option>\n");
      out.write("      <option value=\"RS\">RS</option>\n");
      out.write("      <option value=\"MS\">MS</option>\n");
      out.write("      <option value=\"MT\">MT</option>\n");
      out.write("      <option value=\"GO\">GO</option>\n");
      out.write("      <option value=\"DF\">DF</option>\n");
      out.write("    </select>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("      <label for=\"CEP\">CEP:</label>\n");
      out.write("      <input type=\"cidade\" class=\"form-control\" id=\"cidade\" placeholder=\"Digite seu CEP:\" name=\"CEP\">\n");
      out.write("    </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("      <label for=\"telefone\">Telefone:</label>\n");
      out.write("      <input type=\"telefone\" class=\"form-control\" id=\"telefone\" placeholder=\"Digite seu telefone\" name=\"telefone\">\n");
      out.write("    </div>\n");
      out.write("    <button type=\"button\"  id=\"btnEnviar\"class=\"btn btn-primary\">Enviar</button>\n");
      out.write("    \n");
      out.write("  </form>\n");
      out.write("  <div id=\"msg\"></div>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
