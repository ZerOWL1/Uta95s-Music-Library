package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(9);
    _jspx_dependants.add("/sourcesHome/homeHeader.jsp");
    _jspx_dependants.add("/sourcesHome/homeAdmin.jsp");
    _jspx_dependants.add("/sourcesHome/../sourcesManager/favoriteM.jsp");
    _jspx_dependants.add("/sourcesHome/../sourcesManager/userM.jsp");
    _jspx_dependants.add("/sourcesHome/../sourcesManager/songM.jsp");
    _jspx_dependants.add("/sourcesHome/../sourcesManager/genreM.jsp");
    _jspx_dependants.add("/sourcesHome/../sourcesManager/artistM.jsp");
    _jspx_dependants.add("/sourcesHome/../sourcesManager/albumM.jsp");
    _jspx_dependants.add("/sourcesHome/homeFooter.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <!-- require meta tag -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!-- title -->\n");
      out.write("        <title>UTA95S</title>\n");
      out.write("        <!-- bootstrap css -->\n");
      out.write("\n");
      out.write("        <!-- css -->\n");
      out.write("        <link href=\"css/cssUser/cssUser.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel = \"icon\" type = \"image/png\" href = \"images/logo/logo_home2.png\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <!-- require meta tag -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!-- title -->\n");
      out.write("        <title></title>\n");
      out.write("        <!-- bootstrap css -->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css\" \n");
      out.write("              rel=\"stylesheet\" integrity=\"sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl\"\n");
      out.write("              crossorigin=\"anonymous\">\n");
      out.write("        <!-- css -->\n");
      out.write("        <link href=\"css/cssHome/homeHeader.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-dark fixed-top\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"home\">\n");
      out.write("                        <img class=\"logo\" src=\"images/logo/logo_home.png\" alt=\"logo\"/>\n");
      out.write("                        <h4 class=\"title-logo\">Uta95s</h4>\n");
      out.write("                    </a>\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                        <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link active\" aria-current=\"page\" href=\"home\" >\n");
      out.write("                                    <i class=\"fas fa-home\"></i>Home\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"#\" id=\"categOptions\" \n");
      out.write("                                   role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                                    <i class=\"fas fa-list\"></i>\n");
      out.write("                                    Categories</a>\n");
      out.write("                                <ul class=\"dropdown-menu\" aria-labelledby=\"categOptions\">\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"#\">\n");
      out.write("                                    <i class=\"fas fa-headphones-alt\"></i>\n");
      out.write("                                    Album</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"#\" id=\"accountOptions\" \n");
      out.write("                                   role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                                    <i class=\"fas fa-user-circle\"></i>\n");
      out.write("                                    Account</a>\n");
      out.write("                                <ul class=\"dropdown-menu\" aria-labelledby=\"accountOptions\">\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    <li><hr class=\"dropdown-divider\"></li>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    <li><a class=\"dropdown-item\">Welcome ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item dropdown\">\n");
      out.write("                                <a class=\"nav-link \" href=\"#\" id=\"navbarDropdown\" \n");
      out.write("                                   role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                                    <i class=\"fas fa-chevron-circle-down\"></i>\n");
      out.write("                                    More\n");
      out.write("                                </a>\n");
      out.write("                                <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                                    <li><a class=\"dropdown-item\" href=\"#aboutU\">About</a></li>\n");
      out.write("                                    <li><a class=\"dropdown-item\" href=\"contact\">Contact Us</a></li>\n");
      out.write("                                    <li><hr class=\"dropdown-divider\"></li>\n");
      out.write("                                    <li><a class=\"dropdown-item\" href=\"#\">Forums</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <form action=\"search\" class=\"d-flex\" method=\"post\">\n");
      out.write("                            <input class=\"form-control me-1\" \n");
      out.write("                                   value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${searchNa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("                                   type=\"search\" \n");
      out.write("                                   placeholder=\"Search\" \n");
      out.write("                                   aria-label=\"Search\"\n");
      out.write("                                   name=\"txt\">\n");
      out.write("                            <button class=\"btn btn btn-outline-info\" type=\"submit\">\n");
      out.write("                                <i class=\"fas fa-search\"></i>\n");
      out.write("                            </button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            window.addEventListener(\"scroll\", function () {\n");
      out.write("                var header = document.querySelector(\"header\");\n");
      out.write("                header.classList.toggle(\"sticky\", window.scrollY > 0);\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!--bootstrap js-->\n");
      out.write("        <script src=\"https://kit.fontawesome.com/c41956cca0.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js\" \n");
      out.write("        integrity=\"sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("        <div class=\"all-container\">\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <!-- require meta tag -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!-- title -->\n");
      out.write("        <title></title>\n");
      out.write("        <!-- bootstrap css -->\n");
      out.write("        <!--        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css\" \n");
      out.write("                      rel=\"stylesheet\" integrity=\"sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl\"\n");
      out.write("                      crossorigin=\"anonymous\">-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto|Varela+Round\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- css -->\n");
      out.write("        <link href=\"css/cssHome/homeAdmin.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/cssUser/allManager.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"left\">\n");
      out.write("            <div class=\"lateCD\">\n");
      out.write("                <div class=\"lateCD-title\">\n");
      out.write("                    <div class=\"cd-container\">\n");
      out.write("                        <p class=\"altitle\">ALL&nbsp;OPTIONS</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!--single details-->\n");
      out.write("                <div class=\"album-container py-3\">\n");
      out.write("                    <div class=\"card-container row \">\n");
      out.write("                        <div class=\"d-flex align-items-start navtab\">\n");
      out.write("                            <div class=\"nav flex-column nav-pills me-3\" id=\"v-pills-tab\" role=\"tablist\" aria-orientation=\"vertical\">\n");
      out.write("                                ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_c_if_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_c_if_6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"tab-content\" id=\"v-pills-tabContent\">\n");
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_c_if_7(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_c_if_8(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_c_if_9(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>       \n");
      out.write("        </div>\n");
      out.write("        <!--        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js\" \n");
      out.write("                integrity=\"sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0\" \n");
      out.write("                crossorigin=\"anonymous\"></script>-->\n");
      out.write("    </body>\n");
      out.write("    <script>\n");
      out.write("        var checkPass = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${warningPass}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("';\n");
      out.write("        if (checkPass === '1') {\n");
      out.write("            alert(\"Repass does not similar to passwords!!\");\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</html>");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <!-- require meta tag -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!-- title -->\n");
      out.write("        <title></title>\n");
      out.write("        <!-- bootstrap css -->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- css -->\n");
      out.write("        <link href=\"css/cssHome/homeFooter.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <footer class=\"site-footer\" id=\"aboutU\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-12 col-md-6\" id=\"pterms\">\n");
      out.write("                        <h6>Policy Terms of Service</h6>\n");
      out.write("                        <p class=\"text-justify\">\n");
      out.write("                            All site material is the property of their respective copyright owners. \n");
      out.write("                            All material provided for educational purposes and personal use only.<br/>\n");
      out.write("                            In case of copyright infringement or any other issue, please directly contact the responsible parties. \n");
      out.write("                            We are merely functioning as an index of content found publicly on the Internet and does not accept responsibility for content hosted on third-party websites. \n");
      out.write("                            All trademarks, logos, and images are the property of their respective and rightful owners.\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"footer-all-link col-xs-6 col-md-6\">\n");
      out.write("                        <div class=\"col-xs-6 mx-auto\">\n");
      out.write("                            <h6>Categories</h6>\n");
      out.write("                            <ul class=\"footer-links\">\n");
      out.write("                                <li><a href=\"http://localhost:8080/MusicIndex/category?cid=1\">J-Pop</a></li>\n");
      out.write("                                <li><a href=\"http://localhost:8080/MusicIndex/category?cid=2\">J-Rock</a></li>\n");
      out.write("                                <li><a href=\"http://localhost:8080/MusicIndex/category?cid=5\">J-Music</a></li>\n");
      out.write("                                <li><a href=\"http://localhost:8080/MusicIndex/category?cid=3\">Anime</a></li>\n");
      out.write("                                <li><a href=\"http://localhost:8080/MusicIndex/category?cid=11\">Game</a></li>\n");
      out.write("                                <li><a href=\"http://localhost:8080/MusicIndex/category?cid=9\">Indie</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-xs-6 mx-auto\">\n");
      out.write("                            <h6>Quick Links</h6>\n");
      out.write("                            <ul class=\"footer-links\">\n");
      out.write("                                <li><a href=\"#aboutU\">About Us</a></li>\n");
      out.write("                                <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("                                <li><a href=\"#\">Contribute</a></li>\n");
      out.write("                                <li><a href=\"#pterms\">Privacy Policy</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <hr>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-8 col-sm-6 col-xs-12\">\n");
      out.write("                        <p class=\"copyright-text\">Copyright &copy; 2020 All Rights Reserved by \n");
      out.write("                            <a href=\"#adminU\">Uta95s</a>.\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-4 col-sm-6 col-xs-12\">\n");
      out.write("                        <ul class=\"social-icons\">\n");
      out.write("                            <li><a class=\"facebook\" href=\"https://www.facebook.com/groups/uta95s\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                            <li><a class=\"twitter\" href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                            <li><a class=\"discord\" href=\"https://discord.gg/vbtRkSn\"><i class=\"fab fa-discord\"></i></a></li>\n");
      out.write("                            <li><a class=\"mail\" href=\"contact\"><i class=\"fas fa-mail-bulk\"></i></a></li>   \n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"https://kit.fontawesome.com/c41956cca0.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            var checkUser = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${warningPass}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\";\n");
      out.write("            if (checkUser === 1) {\n");
      out.write("                alert(\"Repass does not similar!! or Mail enter already exist!!\");\n");
      out.write("            } \n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listGenre}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("listG");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <li><a class=\"dropdown-item\" href=\"category?cid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listG.idGenre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listG.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isUser == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <li><a class=\"dropdown-item\" href=\"manage\">Profile</a></li>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isAdmin == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <li><a class=\"dropdown-item\" href=\"manage\">Manager Albums</a></li>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <li><a class=\"dropdown-item btn\" href=\"logout\">Logout</a></li>\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <li><a class=\"dropdown-item btn\" href=\"logout\">Login</a></li>\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isUser == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <button class=\"nav-link active\" id=\"v-pills-profile-tab\" data-bs-toggle=\"tab\" data-bs-target=\"#v-pills-profile\" type=\"button\" role=\"tab\"  aria-selected=\"true\"><i class=\"fas fa-id-card\"></i>Profile</button>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_if_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent(null);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isUser == 1 or sessionScope.acc.isAdmin == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <button class=\"nav-link\" id=\"v-pills-badge-tab\" data-bs-toggle=\"tab\" data-bs-target=\"#v-pills-badge\" type=\"button\" role=\"tab\"  aria-selected=\"false\"><i class=\"fas fa-id-badge\"></i>Badges</button>\n");
        out.write("                                    <button class=\"nav-link\" id=\"v-pills-favorite-tab\" data-bs-toggle=\"tab\" data-bs-target=\"#v-pills-favorite\" type=\"button\" role=\"tab\"  aria-selected=\"false\"><i class=\"fas fa-star\"></i>Favorites</button>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_c_if_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent(null);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isAdmin == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <button class=\"nav-link\" id=\"v-pills-userM-tab\" data-bs-toggle=\"tab\" data-bs-target=\"#v-pills-userM\" type=\"button\" role=\"tab\"  aria-selected=\"false\"><i class=\"fas fa-users-cog\"></i>User Manager</button>\n");
        out.write("                                    <button class=\"nav-link\" id=\"v-pills-songM-tab\" data-bs-toggle=\"tab\" data-bs-target=\"#v-pills-songM\" type=\"button\" role=\"tab\"  aria-selected=\"false\"><i class=\"fas fa-music\"></i>Song Manager</button>\n");
        out.write("                                    <button class=\"nav-link\" id=\"v-pills-genreM-tab\" data-bs-toggle=\"tab\" data-bs-target=\"#v-pills-genreM\" type=\"button\" role=\"tab\"  aria-selected=\"false\"><i class=\"fas fa-list-ul\"></i>Genre Manager</button>\n");
        out.write("                                    <button class=\"nav-link\" id=\"v-pills-artistM-tab\" data-bs-toggle=\"tab\" data-bs-target=\"#v-pills-artistM\" type=\"button\" role=\"tab\"  aria-selected=\"false\"><i class=\"fas fa-guitar\"></i>Artist Manager</button>\n");
        out.write("                                    <button class=\"nav-link\" id=\"v-pills-albumM-tab\" data-bs-toggle=\"tab\" data-bs-target=\"#v-pills-albumM\" type=\"button\" role=\"tab\"  aria-selected=\"false\"><i class=\"fas fa-compact-disc\"></i>Album Manager</button>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }

  private boolean _jspx_meth_c_if_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent(null);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isUser == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <!--tab profile-->\n");
        out.write("                                    <div class=\"tab-pane fade show active tab-panel\" id=\"v-pills-profile\" role=\"tabpanel\" >\n");
        out.write("                                        <div class=\"tab-page\">\n");
        out.write("                                            <div class=\"block-space\"></div>\n");
        out.write("                                            <div class=\"img\">\n");
        out.write("                                                <img src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${uimg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" alt=\"\"/>\n");
        out.write("                                            </div>\n");
        out.write("                                            <div class=\"block-space\"></div>\n");
        out.write("                                        </div>\n");
        out.write("                                        <form action=\"verification\" method=\"post\" class=\"tab-form profile-form\">\n");
        out.write("                                            <div class=\"profileName tab-container\">\n");
        out.write("                                                <h5>UPDATE YOUR PROFILE</h5><hr/>\n");
        out.write("                                                <div class=\"tab-input-content\">\n");
        out.write("                                                    <h6>PROFILE IMAGE</h6>\n");
        out.write("                                                    <!--<input class=\"tab-img\" type=\"file\" name=\"img\" accept=\"image/x-png,image/gif,image/jpeg\" />-->\n");
        out.write("                                                    <input name=\"proImg\" class=\"tab-input\" type=\"text\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.UImg_path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" placeholder=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.UImg_path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\n");
        out.write("                                                </div>\n");
        out.write("                                                <div class=\"tab-input-content\">\n");
        out.write("                                                    <h6>PROFILE NAME</h6>\n");
        out.write("                                                    <input name=\"proName\" class=\"tab-input\" type=\"text\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" placeholder=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" />\n");
        out.write("                                                </div>\n");
        out.write("                                                <div class=\"tab-input-content\">\n");
        out.write("                                                    <h6>PROFILE Mail</h6>\n");
        out.write("                                                    <input name=\"proMail\" class=\"tab-input\" type=\"email\" placeholder=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"  />\n");
        out.write("                                                </div>\n");
        out.write("                                                <div class=\"tab-input-content\">\n");
        out.write("                                                    <h6>PROFILE Passwords</h6>\n");
        out.write("                                                    <input name=\"proPass\" class=\"tab-input\" type=\"password\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.pass}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" placeholder=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.pass}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" required />\n");
        out.write("                                                </div>\n");
        out.write("                                                <div class=\"tab-input-content\">\n");
        out.write("                                                    <h6>RE-Passwords</h6>\n");
        out.write("                                                    <input name=\"rePass\" class=\"tab-input\" type=\"password\" required />\n");
        out.write("                                                </div>\n");
        out.write("                                            </div>\n");
        out.write("                                            <center><input class=\"tab-submit\" type=\"submit\" value=\"Change Profile\"></center>\n");
        out.write("                                        </form>\n");
        out.write("                                    </div>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
    return false;
  }

  private boolean _jspx_meth_c_if_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent(null);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isUser == 1 or sessionScope.acc.isAdmin == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <div class=\"tab-pane fade tab-panel\" id=\"v-pills-badge\" role=\"tabpanel\" >Hello Badge</div>\n");
        out.write("                                    <div class=\"tab-pane fade tab-panel\" id=\"v-pills-favorite\" role=\"tabpanel\" >\n");
        out.write("                                        <div class=\"tab-Manager\">\n");
        out.write("                                            ");
        out.write("\n");
        out.write("\n");
        out.write("<!DOCTYPE html>\n");
        out.write("<html lang=\"en\">\n");
        out.write("    <head>\n");
        out.write("        <meta charset=\"utf-8\">\n");
        out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
        out.write("        <title></title>\n");
        out.write("        <!--bootstrap css-->\n");
        out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/aplayer/1.10.1/APlayer.min.css\" integrity=\"sha512-CIYsJUa3pr1eoXlZFroEI0mq0UIMUqNouNinjpCkSWo3Bx5NRlQ0OuC6DtEB/bDqUWnzXc1gs2X/g52l36N5iw==\" crossorigin=\"anonymous\" />\n");
        out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/aplayer/1.10.1/APlayer.min.js\" integrity=\"sha512-RWosNnDNw8FxHibJqdFRySIswOUgYhFxnmYO3fp+BgCU7gfo4z0oS7mYFBvaa8qu+axY39BmQOrhW3Tp70XbaQ==\" crossorigin=\"anonymous\"></script>\n");
        out.write("    </head>\n");
        out.write("    <body>\n");
        out.write("        <div class=\"table-container\">\n");
        out.write("            <div id=\"aplayer\"></div>\n");
        out.write("            <div class=\"table-responsive\">\n");
        out.write("                <div class=\"table-wrapper\">\n");
        out.write("                    <div class=\"table-title\">\n");
        out.write("                        <div class=\"row\">\n");
        out.write("                            <div class=\"col-sm-6\">\n");
        out.write("                                <h2>Favorite Manager</h2>\n");
        out.write("                            </div>\n");
        out.write("                        </div>\n");
        out.write("                    </div>\n");
        out.write("                    <table class=\"table table-striped table-hover\">\n");
        out.write("                        <thead>\n");
        out.write("                            <tr>\n");
        out.write("                                <th>\n");
        out.write("                                    <span class=\"custom-checkbox\">\n");
        out.write("                                        <input class=\"checkFavorite\" type=\"checkbox\" id=\"selectAllFavorite\">\n");
        out.write("                                        <label for=\"selectAllFavorite\"></label>\n");
        out.write("                                    </span>\n");
        out.write("                                </th>\n");
        out.write("                                <th>Name</th>\n");
        out.write("                                <th>Release</th>\n");
        out.write("                                <th>Actions</th>\n");
        out.write("                            </tr>\n");
        out.write("                        </thead>\n");
        out.write("                        <tbody>\n");
        out.write("                            ");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_8, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        </tbody>\n");
        out.write("                    </table>\n");
        out.write("                    <div class=\"clearfix\">\n");
        out.write("                        <div class=\"hint-text\">Showing <b>5</b> out of <b>25</b> entries</div>\n");
        out.write("                        <ul class=\"pagination\">\n");
        out.write("                            <li class=\"page-item disabled\"><a href=\"#\">Previous</a></li>\n");
        out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">1</a></li>\n");
        out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">2</a></li>\n");
        out.write("                            <li class=\"page-item active\"><a href=\"#\" class=\"page-link\">3</a></li>\n");
        out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">4</a></li>\n");
        out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">5</a></li>\n");
        out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">Next</a></li>\n");
        out.write("                        </ul>\n");
        out.write("                    </div>\n");
        out.write("                </div>\n");
        out.write("            </div>        \n");
        out.write("        </div>\n");
        out.write("\n");
        out.write("        <!-- Delete Modal HTML -->\n");
        out.write("        <div id=\"deleteFavorite\" class=\"modal fade\">\n");
        out.write("            <div class=\"modal-dialog\">\n");
        out.write("                <div class=\"modal-content\">\n");
        out.write("                    <form>\n");
        out.write("                        <div class=\"modal-header\">\t\t\t\t\t\t\n");
        out.write("                            <h4 class=\"modal-title\">Delete Favorite</h4>\n");
        out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
        out.write("                        </div>\n");
        out.write("                        <div class=\"text-warning modal-body\">\t\t\t\t\t\n");
        out.write("                            <p>Are you sure you want to delete this Song?</p>\n");
        out.write("                            <p class=\"text-warning\"><small>This action cannot be undone.</small></p>\n");
        out.write("                        </div>\n");
        out.write("                        <div class=\"modal-footer\">\n");
        out.write("                            <input type=\"button\" class=\"btn btn-default bg-info\" data-dismiss=\"modal\" value=\"Cancel\">\n");
        out.write("                            <input type=\"submit\" class=\"btn btn-danger\" value=\"Delete\">\n");
        out.write("                        </div>\n");
        out.write("                    </form>\n");
        out.write("                </div>\n");
        out.write("            </div>\n");
        out.write("        </div>\n");
        out.write("\n");
        out.write("        <script>\n");
        out.write("            $(document).ready(function () {\n");
        out.write("                // Activate tooltip\n");
        out.write("                $('[data-toggle=\"tooltip\"]').tooltip();\n");
        out.write("                // Select/Deselect checkboxes\n");
        out.write("                var checkbox = $('table tbody .checkFavorite[type=\"checkbox\"]');\n");
        out.write("                $(\"#selectAllFavorite\").click(function () {\n");
        out.write("                    if (this.checked) {\n");
        out.write("                        checkbox.each(function () {\n");
        out.write("                            this.checked = true;\n");
        out.write("                        });\n");
        out.write("                    } else {\n");
        out.write("                        checkbox.each(function () {\n");
        out.write("                            this.checked = false;\n");
        out.write("                        });\n");
        out.write("                    }\n");
        out.write("                });\n");
        out.write("                checkbox.click(function () {\n");
        out.write("                    if (!this.checked) {\n");
        out.write("                        $(\"#selectAllFavorite\").prop(\"checked\", false);\n");
        out.write("                    }\n");
        out.write("                });\n");
        out.write("            });\n");
        out.write("            const ap = new APlayer({\n");
        out.write("                container: document.getElementById('aplayer'),\n");
        out.write("                audio: [\n");
        out.write("            ");
        if (_jspx_meth_c_forEach_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_8, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                ]\n");
        out.write("            });\n");
        out.write("            \n");
        out.write("            function ConfirmDelete() {\n");
        out.write("            var x = confirm(\"Are you sure you want to delete?\");\n");
        out.write("            if (x)\n");
        out.write("                    window.alert(\"Delete Success!!\");\n");
        out.write("            else\n");
        out.write("                    return false;\n");
        out.write("            }\n");
        out.write("        </script>\n");
        out.write("        <script src=\"https://kit.fontawesome.com/c41956cca0.js\" crossorigin=\"anonymous\"></script>\n");
        out.write("    </body>\n");
        out.write("</html>");
        out.write("\n");
        out.write("                                        </div>\n");
        out.write("                                    </div>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_8);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sFavo}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("sFavo");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <tr>\n");
          out.write("                                    <td>\n");
          out.write("                                        <span class=\"custom-checkbox\">\n");
          out.write("                                            <input class=\"checkFavorite\" type=\"checkbox\" id=\"checkboxFavorite\" name=\"options[]\" value=\"1\">\n");
          out.write("                                            <label for=\"checkboxFavorite\"></label>\n");
          out.write("                                        </span>\n");
          out.write("                                    </td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sFavo.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sFavo.release}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td class=\"favoIcon\">\n");
          out.write("                                        <a onclick=\"return ConfirmDelete()\"href=\"delete?sFavor=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sFavo.sid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"delete\"><i class=\"material-icons\" data-toggle=\"tooltip\">&#xE872;</i></a>\n");
          out.write("                                    </td>\n");
          out.write("                                </tr>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_8);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sFavo}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("sFar");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    {\n");
          out.write("                        name: '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sFar.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("',\n");
          out.write("                        artist: '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sFar.idArtist}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("',\n");
          out.write("                        url: '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sFar.song_path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("',\n");
          out.write("                        cover: '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sFar.img_path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'\n");
          out.write("                    },\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_9.setPageContext(_jspx_page_context);
    _jspx_th_c_if_9.setParent(null);
    _jspx_th_c_if_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isAdmin == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
    if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\n");
        out.write("                                    <div class=\"tab-pane fade tab-panel\" id=\"v-pills-userM\" role=\"tabpanel\" >\n");
        out.write("                                        <div class=\"tab-Manager\">\n");
        out.write("                                            ");
        out.write("\n");
        out.write("<!DOCTYPE html>\n");
        out.write("<html lang=\"en\">\n");
        out.write("    <head>\n");
        out.write("        <meta charset=\"utf-8\">\n");
        out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
        out.write("        <title></title>\n");
        out.write("    </head>\n");
        out.write("    <body>\n");
        out.write("        <div class=\"table-container\">\n");
        out.write("            <div class=\"table-responsive\">\n");
        out.write("                <div class=\"table-wrapper\">\n");
        out.write("                    <div class=\"table-title\">\n");
        out.write("                        <div class=\"row\">\n");
        out.write("                            <div class=\"col-sm-6\">\n");
        out.write("                                <h2>User Manager</h2>\n");
        out.write("                            </div>\n");
        out.write("                            <div class=\"col-sm-6\">\n");
        out.write("                            </div>\n");
        out.write("                        </div>\n");
        out.write("                    </div>\n");
        out.write("                    <table class=\"table table-striped table-hover\">\n");
        out.write("                        <thead>\n");
        out.write("                            <tr>\n");
        out.write("                                <th>\n");
        out.write("                                    <span class=\"custom-checkbox\">\n");
        out.write("                                        <input class=\"checkUser\" type=\"checkbox\" id=\"selectAllUser\">\n");
        out.write("                                        <label for=\"selectAllUser\"></label>\n");
        out.write("                                    </span>\n");
        out.write("                                </th>\n");
        out.write("                                <th>UID</th>\n");
        out.write("                                <th>Name</th>\n");
        out.write("                                <th>Password</th>\n");
        out.write("                                <th>Mail</th>\n");
        out.write("                                <th>Actions</th>\n");
        out.write("                            </tr>\n");
        out.write("                        </thead>\n");
        out.write("                        <!--value-->\n");
        out.write("                        <tbody>\n");
        out.write("                            ");
        if (_jspx_meth_c_forEach_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_9, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        </tbody>\n");
        out.write("                    </table>\n");
        out.write("                    <div class=\"clearfix\">\n");
        out.write("                        <div class=\"hint-text\">Showing <b>5</b> out of <b>25</b> entries</div>\n");
        out.write("                        <ul class=\"pagination\">\n");
        out.write("                            <li class=\"page-item disabled\"><a href=\"#\">Previous</a></li>\n");
        out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">1</a></li>\n");
        out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">2</a></li>\n");
        out.write("                            <li class=\"page-item active\"><a href=\"#\" class=\"page-link\">3</a></li>\n");
        out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">4</a></li>\n");
        out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">5</a></li>\n");
        out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">Next</a></li>\n");
        out.write("                        </ul>\n");
        out.write("                    </div>\n");
        out.write("                </div>\n");
        out.write("            </div>        \n");
        out.write("        </div>\n");
        out.write("\n");
        out.write("        <script>\n");
        out.write("            $(document).ready(function () {\n");
        out.write("            // Activate tooltip\n");
        out.write("            $('[data-toggle=\"tooltip\"]').tooltip();\n");
        out.write("            // Select/Deselect checkboxes\n");
        out.write("            var checkbox = $('table tbody .checkUser[type=\"checkbox\"]');\n");
        out.write("            $(\"#selectAllUser\").click(function () {\n");
        out.write("            if (this.checked) {\n");
        out.write("            checkbox.each(function () {\n");
        out.write("            this.checked = true;\n");
        out.write("            });\n");
        out.write("            } else {\n");
        out.write("            checkbox.each(function () {\n");
        out.write("            this.checked = false;\n");
        out.write("            });\n");
        out.write("            }\n");
        out.write("            });\n");
        out.write("            checkbox.click(function () {\n");
        out.write("            if (!this.checked) {\n");
        out.write("            $(\"#selectAllUser\").prop(\"checked\", false);\n");
        out.write("            }\n");
        out.write("            });\n");
        out.write("            }\n");
        out.write("\n");
        out.write("            //confirm delete\n");
        out.write("            function ConfirmDelete() {\n");
        out.write("            var x = confirm(\"Are you sure you want to delete?\");\n");
        out.write("            if (x)\n");
        out.write("                    window.alert(\"Delete Success!!\");\n");
        out.write("            else\n");
        out.write("                    return false;\n");
        out.write("            }\n");
        out.write("            \n");
        out.write("\n");
        out.write("            );\n");
        out.write("        </script>\n");
        out.write("    </body>\n");
        out.write("</html>");
        out.write("\n");
        out.write("                                        </div>\n");
        out.write("                                    </div>\n");
        out.write("                                    <div class=\"tab-pane fade tab-panel\" id=\"v-pills-songM\" role=\"tabpanel\" >\n");
        out.write("                                        <div class=\"tab-Manager\">\n");
        out.write("                                            ");
        out.write("\r\n");
        out.write("<!DOCTYPE html>\r\n");
        out.write("<html lang=\"en\">\r\n");
        out.write("    <head>\r\n");
        out.write("        <meta charset=\"utf-8\">\r\n");
        out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
        out.write("        <title></title>\r\n");
        out.write("    </head>\r\n");
        out.write("    <body>\r\n");
        out.write("        <div class=\"table-container\">\r\n");
        out.write("            <div class=\"table-responsive\">\r\n");
        out.write("                <div class=\"table-wrapper song-wrapper\">\r\n");
        out.write("                    <div class=\"table-title\">\r\n");
        out.write("                        <div class=\"row\">\r\n");
        out.write("                            <div class=\"col-sm-6\">\r\n");
        out.write("                                <h2>Song Management</h2>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"col-sm-6\">\r\n");
        out.write("                                <a href=\"#addSong\" class=\"btn btn-success\" data-toggle=\"modal\"><i class=\"material-icons\">&#xE147;</i> <span>Add New Song</span></a>\r\n");
        out.write("                                <a href=\"#deleteSong\" class=\"btn btn-danger\" data-toggle=\"modal\"><i class=\"material-icons\">&#xE15C;</i> <span>Delete</span></a>\t\t\t\t\t\t\r\n");
        out.write("                            </div>\r\n");
        out.write("                        </div>\r\n");
        out.write("                    </div>\r\n");
        out.write("                    <table class=\"table table-striped table-hover\">\r\n");
        out.write("                        <thead>\r\n");
        out.write("                            <tr>\r\n");
        out.write("                                <th>\r\n");
        out.write("                                    <span class=\"custom-checkbox\">\r\n");
        out.write("                                        <input class=\"checkSong\" type=\"checkbox\" id=\"selectAllSong\">\r\n");
        out.write("                                        <label for=\"selectAllSong\"></label>\r\n");
        out.write("                                    </span>\r\n");
        out.write("                                </th>\r\n");
        out.write("                                <th>SongID</th>\r\n");
        out.write("                                <th>Name</th>\r\n");
        out.write("                                <th>Release</th>\r\n");
        out.write("                                <th>idAlbum</th>\r\n");
        out.write("                                <th>idArtist</th>\r\n");
        out.write("                                <th>idGenre</th>\r\n");
        out.write("                                <th>mv_path</th>\r\n");
        out.write("                                <th>song_path</th>\r\n");
        out.write("                                <th>img_path</th>\r\n");
        out.write("                                <th>Actions</th>\r\n");
        out.write("                            </tr>\r\n");
        out.write("                        </thead>\r\n");
        out.write("                        <!--value-->\r\n");
        out.write("                        <tbody>\r\n");
        out.write("                            ");
        if (_jspx_meth_c_forEach_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                        </tbody>\r\n");
        out.write("                    </table>\r\n");
        out.write("                    <div class=\"clearfix\">\r\n");
        out.write("                        <div class=\"hint-text\">Showing <b>5</b> out of <b>25</b> entries</div>\r\n");
        out.write("                        <ul class=\"pagination\">\r\n");
        out.write("                            <li class=\"page-item disabled\"><a href=\"#\">Previous</a></li>\r\n");
        out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">1</a></li>\r\n");
        out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">2</a></li>\r\n");
        out.write("                            <li class=\"page-item active\"><a href=\"#\" class=\"page-link\">3</a></li>\r\n");
        out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">4</a></li>\r\n");
        out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">5</a></li>\r\n");
        out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">Next</a></li>\r\n");
        out.write("                        </ul>\r\n");
        out.write("                    </div>\r\n");
        out.write("                </div>\r\n");
        out.write("            </div>        \r\n");
        out.write("        </div>\r\n");
        out.write("        <!-- add Modal HTML -->\r\n");
        out.write("        <div id=\"addSong\" class=\"modal fade\">\r\n");
        out.write("            <div class=\"modal-dialog\">\r\n");
        out.write("                <div class=\"modal-content\">\r\n");
        out.write("                    <form action=\"addS\" method=\"post\">\r\n");
        out.write("                        <div class=\"modal-header\">\t\t\t\t\t\t\r\n");
        out.write("                            <h4 class=\"modal-title\">Add New Song</h4>\r\n");
        out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
        out.write("                        </div>\r\n");
        out.write("                        <div class=\"modal-body\">\r\n");
        out.write("                            <div class=\"wrong-form-group\">\r\n");
        out.write("                                <p class=\"wrong\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${checkS}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</p>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"form-group\">\r\n");
        out.write("                                <label>SongID</label>\r\n");
        out.write("                                <input name=\"idS\" type=\"number\" class=\"form-control\">\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"form-group\">\r\n");
        out.write("                                <label>Name</label>\r\n");
        out.write("                                <input name=\"nameS\" type=\"text\" class=\"form-control\" required>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"form-group\">\r\n");
        out.write("                                <label>Release</label>\r\n");
        out.write("                                <input name=\"releaseS\" type=\"text\" class=\"form-control\" >\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"form-group\">\r\n");
        out.write("                                <label>Album</label>\r\n");
        out.write("                                <select name=\"idAlbumS\"  class=\"form-select\" required=\"\">\r\n");
        out.write("                                    ");
        if (_jspx_meth_c_forEach_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                </select>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"form-group\">\r\n");
        out.write("                                <label>Artist</label>\r\n");
        out.write("                                <select name=\"idArtistS\"  class=\"form-select\" required=\"\">\r\n");
        out.write("                                    ");
        if (_jspx_meth_c_forEach_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                </select>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"form-group\">\r\n");
        out.write("                                <label>Genre</label>\r\n");
        out.write("                                <select name=\"genreS\"  class=\"form-select\" required=\"\">\r\n");
        out.write("                                     ");
        if (_jspx_meth_c_forEach_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_9, _jspx_page_context))
          return true;
        out.write("   \r\n");
        out.write("                                </select>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"form-group\">\r\n");
        out.write("                                <label>MV_path</label>\r\n");
        out.write("                                <input name=\"mv_path\" type=\"text\" class=\"form-control\" >\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"form-group\">\r\n");
        out.write("                                <label>Song_path</label>\r\n");
        out.write("                                <input name=\"song_path\" type=\"text\" class=\"form-control\" required>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"form-group\">\r\n");
        out.write("                                <label>Img_path</label>\r\n");
        out.write("                                <input name=\"img_path\" type=\"text\" class=\"form-control\" required>\r\n");
        out.write("                            </div>\r\n");
        out.write("                        </div>\r\n");
        out.write("                        <div class=\"modal-footer\">\r\n");
        out.write("                            <input type=\"button\" class=\"btn btn-default bg-info\" data-dismiss=\"modal\" value=\"Cancel\">\r\n");
        out.write("                            <input onclick=\"ConfirmAdd()\" type=\"submit\" class=\"btn btn-success\" value=\"Add\">\r\n");
        out.write("                        </div>\r\n");
        out.write("                    </form>\r\n");
        out.write("                </div>\r\n");
        out.write("            </div>\r\n");
        out.write("        </div>\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("        <script>\r\n");
        out.write("            $(document).ready(function () {\r\n");
        out.write("                // Activate tooltip\r\n");
        out.write("                $('[data-toggle=\"tooltip\"]').tooltip();\r\n");
        out.write("\r\n");
        out.write("                // Select/Deselect checkboxes\r\n");
        out.write("                var checkbox = $('table tbody .checkSong[type=\"checkbox\"]');\r\n");
        out.write("                $(\"#selectAllSong\").click(function () {\r\n");
        out.write("                    if (this.checked) {\r\n");
        out.write("                        checkbox.each(function () {\r\n");
        out.write("                            this.checked = true;\r\n");
        out.write("                        });\r\n");
        out.write("                    } else {\r\n");
        out.write("                        checkbox.each(function () {\r\n");
        out.write("                            this.checked = false;\r\n");
        out.write("                        });\r\n");
        out.write("                    }\r\n");
        out.write("                });\r\n");
        out.write("                checkbox.click(function () {\r\n");
        out.write("                    if (!this.checked) {\r\n");
        out.write("                        $(\"#selectAllSong\").prop(\"checked\", false);\r\n");
        out.write("                    }\r\n");
        out.write("                });\r\n");
        out.write("            });\r\n");
        out.write("            \r\n");
        out.write("            \r\n");
        out.write("            function ConfirmDelete() {\r\n");
        out.write("            var x = confirm(\"Are you sure you want to delete?\");\r\n");
        out.write("            if (x)\r\n");
        out.write("                    window.alert(\"Delete Success!!\");\r\n");
        out.write("            else\r\n");
        out.write("                    return false;\r\n");
        out.write("            }\r\n");
        out.write("            \r\n");
        out.write("             //confirm add\r\n");
        out.write("            function ConfirmAdd() {\r\n");
        out.write("                return window.alert(\"Please check again data!!\");\r\n");
        out.write("            }\r\n");
        out.write("            \r\n");
        out.write("        </script>\r\n");
        out.write("    </body>\r\n");
        out.write("</html>");
        out.write("\n");
        out.write("                                        </div>\n");
        out.write("                                    </div>\n");
        out.write("                                    <div class=\"tab-pane fade tab-panel\" id=\"v-pills-genreM\" role=\"tabpanel\" >\n");
        out.write("                                        <div class=\"tab-Manager\">\n");
        out.write("                                            ");
        out.write("\r\n");
        out.write("<!DOCTYPE html>\r\n");
        out.write("<html lang=\"en\">\r\n");
        out.write("    <head>\r\n");
        out.write("        ");
        DAO.LoadDAO genre = null;
        synchronized (request) {
          genre = (DAO.LoadDAO) _jspx_page_context.getAttribute("genre", PageContext.REQUEST_SCOPE);
          if (genre == null){
            genre = new DAO.LoadDAO();
            _jspx_page_context.setAttribute("genre", genre, PageContext.REQUEST_SCOPE);
          }
        }
        out.write("\r\n");
        out.write("            <meta charset=\"utf-8\">\r\n");
        out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
        out.write("            <title></title>\r\n");
        out.write("        </head>\r\n");
        out.write("        <body>\r\n");
        out.write("            <div class=\"table-container\">\r\n");
        out.write("                <div class=\"table-responsive\">\r\n");
        out.write("                    <div class=\"table-wrapper\">\r\n");
        out.write("                        <div class=\"table-title\">\r\n");
        out.write("                            <div class=\"row\">\r\n");
        out.write("                                <div class=\"col-sm-6\">\r\n");
        out.write("                                    <h2>Genre Manager</h2>\r\n");
        out.write("                                </div>\r\n");
        out.write("                                <div class=\"col-sm-6\">\r\n");
        out.write("                                    <a href=\"#addGenre\" class=\"btn btn-success\" data-toggle=\"modal\"><i class=\"material-icons\">&#xE147;</i> <span>Add New Genre</span></a>\r\n");
        out.write("                                    <a href=\"#deleteGenre\" class=\"btn btn-danger\" data-toggle=\"modal\"><i class=\"material-icons\">&#xE15C;</i> <span>Delete</span></a>\t\t\t\t\t\t\r\n");
        out.write("                                </div>\r\n");
        out.write("                            </div>\r\n");
        out.write("                        </div>\r\n");
        out.write("                        <table class=\"table table-striped table-hover\">\r\n");
        out.write("                            <thead>\r\n");
        out.write("                                <tr>\r\n");
        out.write("                                    <th>\r\n");
        out.write("                                        <span class=\"custom-checkbox\">\r\n");
        out.write("                                            <input class=\"checkGenre\" type=\"checkbox\" id=\"selectAllGenre\">\r\n");
        out.write("                                            <label for=\"selectAllGenre\"></label>\r\n");
        out.write("                                        </span>\r\n");
        out.write("                                    </th>\r\n");
        out.write("                                    <th>GenreID</th>\r\n");
        out.write("                                    <th>Name</th>\r\n");
        out.write("                                    <th>Actions</th>\r\n");
        out.write("                                </tr>\r\n");
        out.write("                            </thead>\r\n");
        out.write("                            <!--value-->\r\n");
        out.write("                            <tbody>\r\n");
        out.write("                            ");
        if (_jspx_meth_c_forEach_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                        </tbody>\r\n");
        out.write("                    </table>\r\n");
        out.write("                    <div class=\"clearfix\">\r\n");
        out.write("                        <div class=\"hint-text\">Showing <b>5</b> out of <b>25</b> entries</div>\r\n");
        out.write("                        <ul class=\"pagination\">\r\n");
        out.write("                            <li class=\"page-item disabled\"><a href=\"#\">Previous</a></li>\r\n");
        out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">1</a></li>\r\n");
        out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">2</a></li>\r\n");
        out.write("                            <li class=\"page-item active\"><a href=\"#\" class=\"page-link\">3</a></li>\r\n");
        out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">4</a></li>\r\n");
        out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">5</a></li>\r\n");
        out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">Next</a></li>\r\n");
        out.write("                        </ul>\r\n");
        out.write("                    </div>\r\n");
        out.write("                </div>\r\n");
        out.write("            </div>        \r\n");
        out.write("        </div>\r\n");
        out.write("        <!-- add Modal HTML -->\r\n");
        out.write("        <div id=\"addGenre\" class=\"modal fade\">\r\n");
        out.write("            <div class=\"modal-dialog\">\r\n");
        out.write("                <div class=\"modal-content\">\r\n");
        out.write("                    <form action=\"addG\" method=\"post\">\r\n");
        out.write("                        <div class=\"modal-header\">\t\t\t\t\t\t\r\n");
        out.write("                            <h4 class=\"modal-title\">Add New Genre</h4>\r\n");
        out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
        out.write("                        </div>\r\n");
        out.write("                        <div class=\"modal-body\">\t\t\t\t\t\r\n");
        out.write("                            <div class=\"wrong-form-group\">\r\n");
        out.write("                                <p class=\"wrong\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${checkG}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</p>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"form-group\">\r\n");
        out.write("                                <label>ID Genre</label>\r\n");
        out.write("                                <input name=\"idG\" type=\"tel\" class=\"form-control\" required>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"form-group\">\r\n");
        out.write("                                <label>Name</label>\r\n");
        out.write("                                <input name=\"nameG\" type=\"text\" class=\"form-control\" required>\r\n");
        out.write("                            </div>\r\n");
        out.write("                        </div>\r\n");
        out.write("                        <div class=\"modal-footer\">\r\n");
        out.write("                            <input type=\"button\" class=\"btn btn-default bg-info\" data-dismiss=\"modal\" value=\"Cancel\">\r\n");
        out.write("                            <input onclick=\"ConfirmAdd()\" type=\"submit\" class=\"btn btn-success\" value=\"Add\">\r\n");
        out.write("                        </div>\r\n");
        out.write("                    </form>\r\n");
        out.write("                </div>\r\n");
        out.write("            </div>\r\n");
        out.write("        </div>\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("        <script>\r\n");
        out.write("            $(document).ready(function () {\r\n");
        out.write("                // Activate tooltip\r\n");
        out.write("                $('[data-toggle=\"tooltip\"]').tooltip();\r\n");
        out.write("\r\n");
        out.write("                // Select/Deselect checkboxes\r\n");
        out.write("                var checkbox = $('table tbody .checkGenre[type=\"checkbox\"]');\r\n");
        out.write("                $(\"#selectAllGenre\").click(function () {\r\n");
        out.write("                    if (this.checked) {\r\n");
        out.write("                        checkbox.each(function () {\r\n");
        out.write("                            this.checked = true;\r\n");
        out.write("                        });\r\n");
        out.write("                    } else {\r\n");
        out.write("                        checkbox.each(function () {\r\n");
        out.write("                            this.checked = false;\r\n");
        out.write("                        });\r\n");
        out.write("                    }\r\n");
        out.write("                });\r\n");
        out.write("                checkbox.click(function () {\r\n");
        out.write("                    if (!this.checked) {\r\n");
        out.write("                        $(\"#selectAllGenre\").prop(\"checked\", false);\r\n");
        out.write("                    }\r\n");
        out.write("                });\r\n");
        out.write("            });\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("            //confirm delete\r\n");
        out.write("            function ConfirmDelete() {\r\n");
        out.write("                var x = confirm(\"Are you sure you want to delete?\");\r\n");
        out.write("                if (x)\r\n");
        out.write("                    window.alert(\"Delete Success!!\");\r\n");
        out.write("                else\r\n");
        out.write("                    return false;\r\n");
        out.write("            }\r\n");
        out.write("            //confirm add\r\n");
        out.write("            function ConfirmAdd() {\r\n");
        out.write("                return window.alert(\"Please check again data!!\");\r\n");
        out.write("            }\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("        </script>\r\n");
        out.write("    </body>\r\n");
        out.write("</html>");
        out.write("\n");
        out.write("                                        </div>\n");
        out.write("                                    </div>\n");
        out.write("                                    <div class=\"tab-pane fade tab-panel\" id=\"v-pills-artistM\" role=\"tabpanel\" >\n");
        out.write("                                        <div class=\"tab-Manager\">\n");
        out.write("                                            ");
        out.write("\r\n");
        out.write("<!DOCTYPE html>\r\n");
        out.write("<html lang=\"en\">\r\n");
        out.write("    <head>\r\n");
        out.write("        <meta charset=\"utf-8\">\r\n");
        out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
        out.write("        <title></title>\r\n");
        out.write("    </head>\r\n");
        out.write("    <body>\r\n");
        out.write("        <div class=\"table-container\">\r\n");
        out.write("            <div class=\"table-responsive\">\r\n");
        out.write("                <div class=\"table-wrapper\">\r\n");
        out.write("                    <div class=\"table-title\">\r\n");
        out.write("                        <div class=\"row\">\r\n");
        out.write("                            <div class=\"col-sm-6\">\r\n");
        out.write("                                <h2>Artist Manager</h2>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"col-sm-6\">\r\n");
        out.write("                                <a href=\"#addArtist\" class=\"btn btn-success\" data-toggle=\"modal\"><i class=\"material-icons\">&#xE147;</i> <span>Add New Artist</span></a>\r\n");
        out.write("                                <a href=\"#deleteArtist\" class=\"btn btn-danger\" data-toggle=\"modal\"><i class=\"material-icons\">&#xE15C;</i> <span>Delete</span></a>\t\t\t\t\t\t\r\n");
        out.write("                            </div>\r\n");
        out.write("                        </div>\r\n");
        out.write("                    </div>\r\n");
        out.write("                    <table class=\"table table-striped table-hover\">\r\n");
        out.write("                        <thead>\r\n");
        out.write("                            <tr>\r\n");
        out.write("                                <th>\r\n");
        out.write("                                    <span class=\"custom-checkbox\">\r\n");
        out.write("                                        <input class=\"checkArtist\" type=\"checkbox\" id=\"selectAllArtist\">\r\n");
        out.write("                                        <label for=\"selectAllArtist\"></label>\r\n");
        out.write("                                    </span>\r\n");
        out.write("                                </th>\r\n");
        out.write("                                <th>ArtistID</th>\r\n");
        out.write("                                <th>Name</th>\r\n");
        out.write("                                <th>Band</th>\r\n");
        out.write("                                <th>SpellName</th>\r\n");
        out.write("                                <th>Actions</th>\r\n");
        out.write("                            </tr>\r\n");
        out.write("                        </thead>\r\n");
        out.write("                        <!--value-->\r\n");
        out.write("                        <tbody>\r\n");
        out.write("                            ");
        if (_jspx_meth_c_forEach_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                        </tbody>\r\n");
        out.write("                    </table>\r\n");
        out.write("                    <div class=\"clearfix\">\r\n");
        out.write("                        <div class=\"hint-text\">Showing <b>5</b> out of <b>25</b> entries</div>\r\n");
        out.write("                        <ul class=\"pagination\">\r\n");
        out.write("                            <li class=\"page-item disabled\"><a href=\"#\">Previous</a></li>\r\n");
        out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">1</a></li>\r\n");
        out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">2</a></li>\r\n");
        out.write("                            <li class=\"page-item active\"><a href=\"#\" class=\"page-link\">3</a></li>\r\n");
        out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">4</a></li>\r\n");
        out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">5</a></li>\r\n");
        out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">Next</a></li>\r\n");
        out.write("                        </ul>\r\n");
        out.write("                    </div>\r\n");
        out.write("                </div>\r\n");
        out.write("            </div>        \r\n");
        out.write("        </div>\r\n");
        out.write("        <!-- add Modal HTML -->\r\n");
        out.write("        <div id=\"addArtist\" class=\"modal fade\">\r\n");
        out.write("            <div class=\"modal-dialog\">\r\n");
        out.write("                <div class=\"modal-content\">\r\n");
        out.write("                    <form action=\"addArt\" method=\"post\">\r\n");
        out.write("                        <div class=\"modal-header\">\t\t\t\t\t\t\r\n");
        out.write("                            <h4 class=\"modal-title\">Add New Artist</h4>\r\n");
        out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
        out.write("                        </div>\r\n");
        out.write("                        <div class=\"modal-body\">\t\r\n");
        out.write("                            <div class=\"wrong-form-group\">\r\n");
        out.write("                                <p class=\"wrong\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${checkArt}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</p>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"form-group\">\r\n");
        out.write("                                <label>ArtistID</label>\r\n");
        out.write("                                <input name=\"artID\" type=\"text\" class=\"form-control\" required>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"form-group\">\r\n");
        out.write("                                <label>Name</label>\r\n");
        out.write("                                <input name=\"artName\" type=\"text\" class=\"form-control\" required>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"form-group\">\r\n");
        out.write("                                <label>Band</label>\r\n");
        out.write("                                <input name=\"artBand\" type=\"text\" class=\"form-control\" >\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"form-group\">\r\n");
        out.write("                                <label>Spell Name</label>\r\n");
        out.write("                                <input name=\"artSName\" type=\"text\" class=\"form-control\" >\r\n");
        out.write("                            </div>\r\n");
        out.write("                        </div>\r\n");
        out.write("                        <div class=\"modal-footer\">\r\n");
        out.write("                            <input type=\"button\" class=\"btn btn-default bg-info\" data-dismiss=\"modal\" value=\"Cancel\">\r\n");
        out.write("                            <input onclick=\"ConfirmAdd()\"  type=\"submit\" class=\"btn btn-success\" value=\"Add\">\r\n");
        out.write("                        </div>\r\n");
        out.write("                    </form>\r\n");
        out.write("                </div>\r\n");
        out.write("            </div>\r\n");
        out.write("        </div>\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("        <script>\r\n");
        out.write("            $(document).ready(function () {\r\n");
        out.write("                // Activate tooltip\r\n");
        out.write("                $('[data-toggle=\"tooltip\"]').tooltip();\r\n");
        out.write("\r\n");
        out.write("                // Select/Deselect checkboxes\r\n");
        out.write("                var checkbox = $('table tbody .checkArtist[type=\"checkbox\"]');\r\n");
        out.write("                $(\"#selectAllArtist\").click(function () {\r\n");
        out.write("                    if (this.checked) {\r\n");
        out.write("                        checkbox.each(function () {\r\n");
        out.write("                            this.checked = true;\r\n");
        out.write("                        });\r\n");
        out.write("                    } else {\r\n");
        out.write("                        checkbox.each(function () {\r\n");
        out.write("                            this.checked = false;\r\n");
        out.write("                        });\r\n");
        out.write("                    }\r\n");
        out.write("                });\r\n");
        out.write("                checkbox.click(function () {\r\n");
        out.write("                    if (!this.checked) {\r\n");
        out.write("                        $(\"#selectAllArtist\").prop(\"checked\", false);\r\n");
        out.write("                    }\r\n");
        out.write("                });\r\n");
        out.write("            });\r\n");
        out.write("            \r\n");
        out.write("            \r\n");
        out.write("            function ConfirmDelete() {\r\n");
        out.write("            var x = confirm(\"Are you sure you want to delete?\");\r\n");
        out.write("            if (x)\r\n");
        out.write("                    window.alert(\"Delete Success!!\");\r\n");
        out.write("            else\r\n");
        out.write("                    return false;\r\n");
        out.write("            }\r\n");
        out.write("            \r\n");
        out.write("              //confirm add\r\n");
        out.write("            function ConfirmAdd() {\r\n");
        out.write("                return window.alert(\"Please check again data!!\");\r\n");
        out.write("            }\r\n");
        out.write("        </script>\r\n");
        out.write("    </body>\r\n");
        out.write("</html>");
        out.write("\n");
        out.write("                                        </div>\n");
        out.write("                                    </div>\n");
        out.write("                                    <div class=\"tab-pane fade tab-panel\" id=\"v-pills-albumM\" role=\"tabpanel\" >\n");
        out.write("                                        <div class=\"tab-Manager\">\n");
        out.write("                                            ");
        out.write("\r\n");
        out.write("<!DOCTYPE html>\r\n");
        out.write("<html lang=\"en\">\r\n");
        out.write("    <head>\r\n");
        out.write("        <meta charset=\"utf-8\">\r\n");
        out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
        out.write("        <title></title>\r\n");
        out.write("    </head>\r\n");
        out.write("    <body>\r\n");
        out.write("        <div class=\"table-container\">\r\n");
        out.write("            <div class=\"table-responsive\">\r\n");
        out.write("                <div class=\"table-wrapper album-wrapper\">\r\n");
        out.write("                    <div class=\"table-title\">\r\n");
        out.write("                        <div class=\"row\">\r\n");
        out.write("                            <div class=\"col-sm-6\">\r\n");
        out.write("                                <h2>Album Manager</h2>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"col-sm-6\">\r\n");
        out.write("                                <a href=\"#addAlbum\" class=\"btn btn-success\" data-toggle=\"modal\"><i class=\"material-icons\">&#xE147;</i> <span>Add New Album</span></a>\r\n");
        out.write("                                <a href=\"#deleteAlbum\" class=\"btn btn-danger\" data-toggle=\"modal\"><i class=\"material-icons\">&#xE15C;</i> <span>Delete</span></a>\t\t\t\t\t\t\r\n");
        out.write("                            </div>\r\n");
        out.write("                        </div>\r\n");
        out.write("                    </div>\r\n");
        out.write("                    <table class=\"table table-striped table-hover\">\r\n");
        out.write("                        <thead>\r\n");
        out.write("                            <tr>\r\n");
        out.write("                                <th>\r\n");
        out.write("                                    <span class=\"custom-checkbox\">\r\n");
        out.write("                                        <input class=\"checkArtist\" type=\"checkbox\" id=\"selectAllAlbum\">\r\n");
        out.write("                                        <label for=\"selectAllAlbum\"></label>\r\n");
        out.write("                                    </span>\r\n");
        out.write("                                </th>\r\n");
        out.write("                                <th>AlbumID</th>\r\n");
        out.write("                                <th>ArtistID</th>\r\n");
        out.write("                                <th>Name</th>\r\n");
        out.write("                                <th>Year</th>\r\n");
        out.write("                                <th>AImg_path</th>\r\n");
        out.write("                                <th>Date Update</th>\r\n");
        out.write("                                <th>Genre</th>\r\n");
        out.write("                                <th>Actions</th>\r\n");
        out.write("                            </tr>\r\n");
        out.write("                        </thead>\r\n");
        out.write("                        <!--value-->\r\n");
        out.write("                        <tbody>\r\n");
        out.write("                            ");
        if (_jspx_meth_c_forEach_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                        </tbody>\r\n");
        out.write("                    </table>\r\n");
        out.write("                    <div class=\"clearfix\">\r\n");
        out.write("                        <div class=\"hint-text\">Showing <b>5</b> out of <b>25</b> entries</div>\r\n");
        out.write("                        <ul class=\"pagination\">\r\n");
        out.write("                            <li class=\"page-item disabled\"><a href=\"#\">Previous</a></li>\r\n");
        out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">1</a></li>\r\n");
        out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">2</a></li>\r\n");
        out.write("                            <li class=\"page-item active\"><a href=\"#\" class=\"page-link\">3</a></li>\r\n");
        out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">4</a></li>\r\n");
        out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">5</a></li>\r\n");
        out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">Next</a></li>\r\n");
        out.write("                        </ul>\r\n");
        out.write("                    </div>\r\n");
        out.write("                </div>\r\n");
        out.write("            </div>        \r\n");
        out.write("        </div>\r\n");
        out.write("        <!-- add Modal HTML -->\r\n");
        out.write("        <div id=\"addAlbum\" class=\"modal fade\">\r\n");
        out.write("            <div class=\"modal-dialog\">\r\n");
        out.write("                <div class=\"modal-content\">\r\n");
        out.write("                    <form action=\"addAlb\" method=\"post\">\r\n");
        out.write("                        <div class=\"modal-header\">\t\t\t\t\t\t\r\n");
        out.write("                            <h4 class=\"modal-title\">Add New Album</h4>\r\n");
        out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
        out.write("                        </div>\r\n");
        out.write("                        <div class=\"modal-body\">\r\n");
        out.write("                             <div class=\"wrong-form-group\">\r\n");
        out.write("                                <p class=\"wrong\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${checkAlb}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</p>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"form-group\">\r\n");
        out.write("                                <label>AlbumID</label>\r\n");
        out.write("                                <input name=\"albID\" type=\"text\" class=\"form-control\" required>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"form-group\">\r\n");
        out.write("                                <label>Artist</label>\r\n");
        out.write("                                <select name=\"albArtist\"  class=\"form-select\" required=\"\">\r\n");
        out.write("                                    ");
        if (_jspx_meth_c_forEach_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                </select>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"form-group\">\r\n");
        out.write("                                <label>Name</label>\r\n");
        out.write("                                <input name=\"albName\" type=\"text\" class=\"form-control\" required>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"form-group\">\r\n");
        out.write("                                <label>Year</label>\r\n");
        out.write("                                <input name=\"albYear\" type=\"text\" class=\"form-control\" >\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"form-group\">\r\n");
        out.write("                                <label>AImg_path</label>\r\n");
        out.write("                                <input name=\"albPath\" type=\"text\" class=\"form-control\" >\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"form-group\">\r\n");
        out.write("                                <label>Genre</label>\r\n");
        out.write("                                <select name=\"albGenre\"  class=\"form-select\" required=\"\">\r\n");
        out.write("                                     ");
        if (_jspx_meth_c_forEach_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_9, _jspx_page_context))
          return true;
        out.write("   \r\n");
        out.write("                                </select>\r\n");
        out.write("                            </div>\r\n");
        out.write("                        </div>\r\n");
        out.write("                        <div class=\"modal-footer\">\r\n");
        out.write("                            <input type=\"button\" class=\"btn btn-default bg-info\" data-dismiss=\"modal\" value=\"Cancel\">\r\n");
        out.write("                            <input onclick=\"ConfirmAdd()\" type=\"submit\" class=\"btn btn-success\" value=\"Add\">\r\n");
        out.write("                        </div>\r\n");
        out.write("                    </form>\r\n");
        out.write("                </div>\r\n");
        out.write("            </div>\r\n");
        out.write("        </div>\r\n");
        out.write("\r\n");
        out.write("        <script>\r\n");
        out.write("            $(document).ready(function () {\r\n");
        out.write("                // Activate tooltip\r\n");
        out.write("                $('[data-toggle=\"tooltip\"]').tooltip();\r\n");
        out.write("\r\n");
        out.write("                // Select/Deselect checkboxes\r\n");
        out.write("                var checkbox = $('table tbody .checkAlbum[type=\"checkbox\"]');\r\n");
        out.write("                $(\"#selectAllAlbum\").click(function () {\r\n");
        out.write("                    if (this.checked) {\r\n");
        out.write("                        checkbox.each(function () {\r\n");
        out.write("                            this.checked = true;\r\n");
        out.write("                        });\r\n");
        out.write("                    } else {\r\n");
        out.write("                        checkbox.each(function () {\r\n");
        out.write("                            this.checked = false;\r\n");
        out.write("                        });\r\n");
        out.write("                    }\r\n");
        out.write("                });\r\n");
        out.write("                checkbox.click(function () {\r\n");
        out.write("                    if (!this.checked) {\r\n");
        out.write("                        $(\"#selectAllAlbum\").prop(\"checked\", false);\r\n");
        out.write("                    }\r\n");
        out.write("                });\r\n");
        out.write("            });\r\n");
        out.write("            \r\n");
        out.write("            \r\n");
        out.write("            function ConfirmDelete() {\r\n");
        out.write("            var x = confirm(\"Are you sure you want to delete?\");\r\n");
        out.write("            if (x)\r\n");
        out.write("                    window.alert(\"Delete Success!!\");\r\n");
        out.write("            else\r\n");
        out.write("                    return false;\r\n");
        out.write("            }\r\n");
        out.write("            \r\n");
        out.write("             //confirm add\r\n");
        out.write("            function ConfirmAdd() {\r\n");
        out.write("                return window.alert(\"Please check again data!!\");\r\n");
        out.write("            }\r\n");
        out.write("        </script>\r\n");
        out.write("    </body>\r\n");
        out.write("</html>");
        out.write("\n");
        out.write("                                        </div>\n");
        out.write("                                    </div>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_9);
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${accM}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVar("a");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <tr>\n");
          out.write("                                    <td>\n");
          out.write("                                        <span class=\"custom-checkbox\">\n");
          out.write("                                            <input class=\"checkUser\" type=\"checkbox\" id=\"checkboxUser\" name=\"options[]\" value=\"1\">\n");
          out.write("                                            <label for=\"checkboxUser\"></label>\n");
          out.write("                                        </span>\n");
          out.write("                                    </td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.uid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.pass}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>\n");
          out.write("                                        <a href=\"editU?uID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.uid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"edit\" ><i class=\"material-icons\" data-toggle=\"tooltip\">&#xE254;</i></a>\n");
          out.write("                                        <a onclick=\"return ConfirmDelete()\" href=\"delete?uID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.uid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"delete\" ><i class=\"material-icons\" data-toggle=\"tooltip\">&#xE872;</i></a>\n");
          out.write("                                    </td>\n");
          out.write("                                </tr>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_9);
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${allSM}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_4.setVar("alS");
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <tr>\r\n");
          out.write("                                    <td>\r\n");
          out.write("                                        <span class=\"custom-checkbox\">\r\n");
          out.write("                                            <input class=\"checkSong\" type=\"checkbox\" id=\"checkboxSong\" name=\"options[]\" value=\"1\">\r\n");
          out.write("                                            <label for=\"checkboxSong\"></label>\r\n");
          out.write("                                        </span>\r\n");
          out.write("                                    </td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alS.songID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alS.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alS.release}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alS.idAlbum}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alS.idArtist}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alS.idGenre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alS.mv_path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alS.song_path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alS.img_path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td>\r\n");
          out.write("                                        <a href=\"editS?sid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alS.songID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"edit\" ><i class=\"material-icons\" data-toggle=\"tooltip\">&#xE254;</i></a>\r\n");
          out.write("                                        <a onclick=\"return ConfirmDelete()\"href=\"delete?sid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alS.songID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"delete\" ><i class=\"material-icons\" data-toggle=\"tooltip\">&#xE872;</i></a>\r\n");
          out.write("                                    </td>\r\n");
          out.write("                                </tr>\r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_4.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_4);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_5.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_9);
    _jspx_th_c_forEach_5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${albM}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_5.setVar("alb");
    int[] _jspx_push_body_count_c_forEach_5 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_5 = _jspx_th_c_forEach_5.doStartTag();
      if (_jspx_eval_c_forEach_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alb.idAlbum}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alb.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_5.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_5);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_6 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_6.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_9);
    _jspx_th_c_forEach_6.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${artM}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_6.setVar("art");
    int[] _jspx_push_body_count_c_forEach_6 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_6 = _jspx_th_c_forEach_6.doStartTag();
      if (_jspx_eval_c_forEach_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${art.idArtist}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${art.nameArtist}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_6.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_6);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_7 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_7.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_9);
    _jspx_th_c_forEach_7.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${genreM}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_7.setVar("gen");
    int[] _jspx_push_body_count_c_forEach_7 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_7 = _jspx_th_c_forEach_7.doStartTag();
      if (_jspx_eval_c_forEach_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${gen.idGenre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${gen.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_7.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_7.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_7);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_8 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_8.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_9);
    _jspx_th_c_forEach_8.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${genreM}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_8.setVar("genM");
    int[] _jspx_push_body_count_c_forEach_8 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_8 = _jspx_th_c_forEach_8.doStartTag();
      if (_jspx_eval_c_forEach_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <tr>\r\n");
          out.write("                                    <td>\r\n");
          out.write("                                        <span class=\"custom-checkbox\">\r\n");
          out.write("                                            <input class=\"checkGenre\" type=\"checkbox\" id=\"checkboxGenre\" name=\"options[]\" value=\"1\">\r\n");
          out.write("                                            <label for=\"checkboxGenre\"></label>\r\n");
          out.write("                                        </span>\r\n");
          out.write("                                    </td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${genM.idGenre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${genM.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td>\r\n");
          out.write("                                        <a href=\"editG?gid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${genM.idGenre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"edit\" ><i class=\"material-icons\" data-toggle=\"tooltip\">&#xE254;</i></a>\r\n");
          out.write("                                        <a onclick=\"return ConfirmDelete()\" href=\"delete?gid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${genM.idGenre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"delete\"><i class=\"material-icons\" data-toggle=\"tooltip\">&#xE872;</i></a>\r\n");
          out.write("                                    </td>\r\n");
          out.write("                                </tr>\r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_8.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_8[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_8.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_8.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_8);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_9 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_9.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_9);
    _jspx_th_c_forEach_9.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${artM}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_9.setVar("art");
    int[] _jspx_push_body_count_c_forEach_9 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_9 = _jspx_th_c_forEach_9.doStartTag();
      if (_jspx_eval_c_forEach_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <tr>\r\n");
          out.write("                                    <td>\r\n");
          out.write("                                        <span class=\"custom-checkbox\">\r\n");
          out.write("                                            <input class=\"checkArtist\" type=\"checkbox\" id=\"checkboxArtist\" name=\"options[]\" value=\"1\">\r\n");
          out.write("                                            <label for=\"checkboxArtist\"></label>\r\n");
          out.write("                                        </span>\r\n");
          out.write("                                    </td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${art.idArtist}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${art.nameArtist}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${art.band}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${art.spellName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td>\r\n");
          out.write("                                        <a href=\"editArt?art=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${art.idArtist}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"edit\" ><i class=\"material-icons\" data-toggle=\"tooltip\">&#xE254;</i></a>\r\n");
          out.write("                                        <a onclick=\"return ConfirmDelete()\" href=\"delete?art=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${art.idArtist}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"delete\" ><i class=\"material-icons\" data-toggle=\"tooltip\">&#xE872;</i></a>\r\n");
          out.write("                                    </td>\r\n");
          out.write("                                </tr>\r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_9.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_9[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_9.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_9.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_9);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_10 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_10.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_9);
    _jspx_th_c_forEach_10.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${albM}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_10.setVar("alb");
    int[] _jspx_push_body_count_c_forEach_10 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_10 = _jspx_th_c_forEach_10.doStartTag();
      if (_jspx_eval_c_forEach_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <tr>\r\n");
          out.write("                                <td>\r\n");
          out.write("                                    <span class=\"custom-checkbox\">\r\n");
          out.write("                                        <input class=\"checkAlbum\" type=\"checkbox\" id=\"checkboxArtist\" name=\"options[]\" value=\"1\">\r\n");
          out.write("                                        <label for=\"checkboxAlbum\"></label>\r\n");
          out.write("                                    </span>\r\n");
          out.write("                                </td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alb.idAlbum}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alb.idArtist}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alb.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alb.year}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alb.AImg_path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alb.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alb.idGenre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td>\r\n");
          out.write("                                    <a href=\"editAlb?alb=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alb.idAlbum}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"edit\" ><i class=\"material-icons\" data-toggle=\"tooltip\">&#xE254;</i></a>\r\n");
          out.write("                                    <a onclick=\"return ConfirmDelete()\" href=\"delete?alb=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alb.idAlbum}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"delete\" ><i class=\"material-icons\" data-toggle=\"tooltip\">&#xE872;</i></a>\r\n");
          out.write("                                </td>\r\n");
          out.write("                            </tr>\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_10.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_10[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_10.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_10.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_10);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_11 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_11.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_9);
    _jspx_th_c_forEach_11.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${artM}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_11.setVar("art");
    int[] _jspx_push_body_count_c_forEach_11 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_11 = _jspx_th_c_forEach_11.doStartTag();
      if (_jspx_eval_c_forEach_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${art.idArtist}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${art.nameArtist}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_11.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_11[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_11.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_11.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_11);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_12 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_12.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_9);
    _jspx_th_c_forEach_12.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${genreM}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_12.setVar("gen");
    int[] _jspx_push_body_count_c_forEach_12 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_12 = _jspx_th_c_forEach_12.doStartTag();
      if (_jspx_eval_c_forEach_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${gen.idGenre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${gen.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_12.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_12[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_12.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_12.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_12);
    }
    return false;
  }
}
