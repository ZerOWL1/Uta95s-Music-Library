package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/sourcesHome/homeHeader.jsp");
    _jspx_dependants.add("/sourcesHome/homeLeft.jsp");
    _jspx_dependants.add("/sourcesHome/homeRight.jsp");
    _jspx_dependants.add("/sourcesHome/homeFooter.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_forEach_var_end_begin.release();
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
      out.write("        <link href=\"css/cssHome/cssHome.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
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
      out.write("\n");
      out.write("        <!-- css -->\n");
      out.write("        <link href=\"css/cssHome/homeLeft.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"left\">\n");
      out.write("            <div class=\"lateCD\">\n");
      out.write("                <div class=\"lateCD-title\">\n");
      out.write("                    <div class=\"cd-container\">\n");
      out.write("                        <p class=\"altitle\">Lastest&nbspCDs/Music</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"album-container py-3\">\n");
      out.write("                    <div class=\"card-container row \">\n");
      out.write("                        <!--card here-->\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!--off set-->\n");
      out.write("                <div class=\"clearfix\">\n");
      out.write("                    <ul class=\"pagination\">\n");
      out.write("                        <li class=\"page-item\">\n");
      out.write("                            <a href=\"\n");
      out.write("                               ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\" class=\"page-link prev\">< Prev\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                        <li class=\"page-item\">\n");
      out.write("                            <a href=\"\n");
      out.write("                               ");
      if (_jspx_meth_c_if_9(_jspx_page_context))
        return;
      out.write("\" class=\"page-link next\">Next >\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("            ");
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
      out.write("\n");
      out.write("\n");
      out.write("        <!-- css -->\n");
      out.write("        <link href=\"css/cssHome/homeRight.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"right\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!--categories-->\n");
      out.write("            <div class=\"categories\">\n");
      out.write("                <div class=\"cate-container\">\n");
      out.write("                    <div class=\"cate-title\">\n");
      out.write("                        <p class=\"title\">Categories</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <h5 class=\"card-header\">\n");
      out.write("                        <a href=\"home\" style=\"text-decoration: none; color: #fafafa;\">🔥 All categories here!! 🔥</a>\n");
      out.write("                    </h5>\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <div class=\"cate-box row\">\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                            <!--example-->\n");
      out.write("                            <!--                            <div class=\"cate-sm-box\">\n");
      out.write("                                                            <a href=\"#\">Cate 2</a>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"cate-sm-box\">\n");
      out.write("                                                            <a href=\"#\">Cate 3</a>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"cate-sm-box\">\n");
      out.write("                                                            <a href=\"#\">Cate 4</a>\n");
      out.write("                                                        </div>-->\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"img\">\n");
      out.write("                            <img src=\"images/rightbar_icon/gamezone.png\" alt=\"\"/>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!--Guide-->\n");
      out.write("            <div class=\"right-container\">\n");
      out.write("                <div class=\"guide\">\n");
      out.write("                    <div class=\"guide-container\">\n");
      out.write("                        <p class=\"guide-title\">Guide&nbspFor&nbspNew&nbspUsers</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <a href=\"#\" ><h5 class=\"card-header\">\n");
      out.write("                            find all guide here!\n");
      out.write("                        </h5></a>\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <div class=\"img\">\n");
      out.write("                            <img src=\"images/bg/4.jpg\" alt=\"\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-content\">\n");
      out.write("                            <h5 class=\"card-title\">Download Guide</h5>\n");
      out.write("                            <p class=\"card-text\">\n");
      out.write("                                Zippyshare 403 Forbidden Links, need a free vpn to download in some countries.\n");
      out.write("                            </p>\n");
      out.write("                            <p class=\"card-text\">\n");
      out.write("                                Be-Drive Server dont exits Anymore, feel free to report this links.\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!--top season-->\n");
      out.write("            <div class=\"top-ss-container\">\n");
      out.write("                <div class=\"top-ss\">\n");
      out.write("                    <div class=\"ss-container\">\n");
      out.write("                        <p class=\"ss-title\">Music&nbspWinter&nbsp2021</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <a href=\"#\" ><h5 class=\"card-header\">\n");
      out.write("                            all winter music here!\n");
      out.write("                        </h5></a>\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <div class=\"img\">\n");
      out.write("                            <img src=\"images/gif/winter_season.gif\" alt=\"\"/>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!--season music-->\n");
      out.write("            <div class=\"season-container\">\n");
      out.write("                <div class=\"top-ss\">\n");
      out.write("                    <div class=\"ss-container\">\n");
      out.write("                        <p class=\"ss-title\">Anime&nbspSeasonal&nbspMusic</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <h5 class=\"card-header\">\n");
      out.write("                        all season music here!\n");
      out.write("                    </h5>\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <!--autumn-->\n");
      out.write("                        <a href=\"#\" class=\"autumn\">\n");
      out.write("                            <div class=\"img-title\">\n");
      out.write("                                <h2 class=\"title\">Autumn</h2>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"img\">\n");
      out.write("                                <img src=\"images/season_list/autumn.png\" alt=\"\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                        <hr/>\n");
      out.write("                        <!--spring-->\n");
      out.write("                        <a href=\"#\" class=\"summer\">\n");
      out.write("                            <div class=\"img-title\">\n");
      out.write("                                <h2 class=\"title\">Summer</h2>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"img\">\n");
      out.write("                                <img src=\"images/season_list/summer.png\" alt=\"\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                        <hr/>\n");
      out.write("                        <!--summer-->\n");
      out.write("                        <a href=\"#\" class=\"spring\">\n");
      out.write("                            <div class=\"img-title\" >\n");
      out.write("                                <h2 class=\"title\">Spring</h2>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"img\">\n");
      out.write("                                <img src=\"images/season_list/spring.png\" alt=\"\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                        <hr/>\n");
      out.write("                        <!--winter-->\n");
      out.write("                        <a href=\"#\"  class=\"winter\">\n");
      out.write("                            <div class=\"img-title\">\n");
      out.write("                                <h2 class=\"title\">Winter</h2>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"img\">\n");
      out.write("                                <img src=\"images/season_list/winter.png\" alt=\"\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!--social list-->\n");
      out.write("            <div class=\"social-container\">\n");
      out.write("                <div class=\"social\">\n");
      out.write("                    <div class=\"social-title\">\n");
      out.write("                        <p class=\"title\">Updated&nbspSocial&nbspMedia</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <h5 class=\"card-header\">\n");
      out.write("                        Stay Updated with the Social Media\n");
      out.write("                    </h5>\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <div class=\"social-box fb-icon\">\n");
      out.write("                            <a href=\"https://www.facebook.com/groups/uta95s\">\n");
      out.write("                                <div class=\"box\"><i class=\"fab fa-facebook-f\"></i></div>\n");
      out.write("                            </a> \n");
      out.write("                            <div class=\"block-box\"></div>\n");
      out.write("                            <div class=\"box-after fb-after\">Like</div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"social-box tw-icon\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div class=\"box \"><i class=\"fab fa-twitter\"></i></div>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"block-box\"></div>\n");
      out.write("                            <div class=\"box-after tw-after\">Follow</div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"social-box dc-icon\">\n");
      out.write("                            <a href=\"https://discord.gg/vbtRkSn\">\n");
      out.write("                                <div class=\"box\"><i class=\"fab fa-discord\"></i></div>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"block-box\"></div>\n");
      out.write("                            <div class=\"box-after dc-after\">Join</div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!--view list-->\n");
      out.write("            <div class=\"view-container\">\n");
      out.write("                <div class=\"view\">\n");
      out.write("                    <div class=\"view-title\">\n");
      out.write("                        <p class=\"title\">Viewer&nbsp;Page</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <div class=\"card-images\">\n");
      out.write("                        <img src=\"images/rightbar_icon/polygon.png\" alt=\"\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <div class=\"card-page-counter\" style=\"display: block;\">\n");
      out.write("                            <span class=\"card-page-counter-item\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${view}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!--bootstrap-->\n");
      out.write("        <script src=\"https://kit.fontawesome.com/c41956cca0.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("            \n");
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
      out.write("        \n");
      out.write("        \n");
      out.write("        <script defer > window.onload = function(){ \n");
      out.write("            setTimeout(function(){var chatJsElement = document.createElement(\"script\"); \n");
      out.write("                chatJsElement.src = \"https://app.ohchat.net/clients/46427/code.php\"; \n");
      out.write("                chatJsElement.setAttribute(\"defer\", \"defer\"); \n");
      out.write("                document.getElementsByTagName(\"body\")[0].appendChild(chatJsElement);}, 300) }; \n");
      out.write("        \n");
      out.write("        \n");
      out.write("            var check = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${warning}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("';\n");
      out.write("            if (check === '1') {\n");
      out.write("                alert(\"Please Logout before Login new Account\");\n");
      out.write("            }    \n");
      out.write("            var checkGuest = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${warningGuest}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("';\n");
      out.write("            if (checkGuest === '1') {\n");
      out.write("                alert(\"You must login or signup account!!\");\n");
      out.write("            }    \n");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${allAl}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("al");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <div class=\"card-content ms-3 me-3 mb-3\" style=\"width: 20rem;\">\n");
          out.write("                                <a href=\"detail?aid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${al.idAlbum}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"card-img\">\n");
          out.write("                                    <div class=\"img\">\n");
          out.write("                                        <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${al.AImg_path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"\" alt=\"...\">\n");
          out.write("                                    </div>\n");
          out.write("                                    <div class=\"card-name\">\n");
          out.write("                                        <h3 class=\"\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${al.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h3>\n");
          out.write("                                    </div>\n");
          out.write("                                </a>\n");
          out.write("                                <div class=\"card-date\">\n");
          out.write("                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${al.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                </div>\n");
          out.write("                                <div class=\"card-excerpt\">\n");
          out.write("                                    Upcoming Music [Anime] Winter / Invierno 2021 Calendar | Release Dates\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                        ");
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

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${index>1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                   ");
        if (_jspx_meth_c_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                   ");
        if (_jspx_meth_c_if_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                               ");
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

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!isCategory}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                       home?index=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${index-1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("   \n");
        out.write("                                   ");
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

  private boolean _jspx_meth_c_if_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${isCategory}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                       home?index=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${index-1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&cid=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                   ");
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

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setBegin(1);
    _jspx_th_c_forEach_2.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${endP}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_2.setVar("i");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            ");
          if (_jspx_meth_c_if_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\n");
          out.write("                            ");
          if (_jspx_meth_c_if_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\n");
          out.write("                        ");
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
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!isCategory}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <li class=\"page-item\">                            \n");
        out.write("                                    <a class=\"pageNumber ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i == index?\"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" page-link\" href=\"home?index=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\n");
        out.write("                                </li>\n");
        out.write("                            ");
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

  private boolean _jspx_meth_c_if_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${isCategory}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <li class=\"page-item\">                            \n");
        out.write("                                    <a class=\"pageNumber ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i == index?\"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" page-link\" href=\"home?index=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&cid=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\n");
        out.write("                                </li>\n");
        out.write("                            ");
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

  private boolean _jspx_meth_c_if_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_9.setPageContext(_jspx_page_context);
    _jspx_th_c_if_9.setParent(null);
    _jspx_th_c_if_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${index<endP}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
    if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                   ");
        if (_jspx_meth_c_if_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_9, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                   ");
        if (_jspx_meth_c_if_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_9, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                               ");
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

  private boolean _jspx_meth_c_if_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_10.setPageContext(_jspx_page_context);
    _jspx_th_c_if_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_9);
    _jspx_th_c_if_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!isCategory}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
    if (_jspx_eval_c_if_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                       home?index=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${index+1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                   ");
        int evalDoAfterBody = _jspx_th_c_if_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
    return false;
  }

  private boolean _jspx_meth_c_if_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_11.setPageContext(_jspx_page_context);
    _jspx_th_c_if_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_9);
    _jspx_th_c_if_11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${isCategory}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_11 = _jspx_th_c_if_11.doStartTag();
    if (_jspx_eval_c_if_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                       home?index=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${index+1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&cid=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                   ");
        int evalDoAfterBody = _jspx_th_c_if_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listGenre}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVar("listG");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <div class=\"cate-sm-box btn ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tag == listG.idGenre ? \"bg-dark\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                    <a href=\"category?cid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listG.idGenre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listG.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                                </div>\n");
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
}
