package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class details_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/sourcesHome/homeHeader.jsp");
    _jspx_dependants.add("/sourcesHome/homeDetails.jsp");
    _jspx_dependants.add("/sourcesHome/homeRight.jsp");
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
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/aplayer/1.10.1/APlayer.min.css\" \n");
      out.write("              integrity=\"sha512-CIYsJUa3pr1eoXlZFroEI0mq0UIMUqNouNinjpCkSWo3Bx5NRlQ0OuC6DtEB/bDqUWnzXc1gs2X/g52l36N5iw==\" \n");
      out.write("              crossorigin=\"anonymous\" />\n");
      out.write("        <!-- css -->\n");
      out.write("        <link href=\"css/cssHome/homeDetails.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"left\">\n");
      out.write("            <div class=\"lateCD\">\n");
      out.write("                <div class=\"lateCD-title\">\n");
      out.write("                    <div class=\"cd-container\">\n");
      out.write("                        <p class=\"altitle\">Details&nbspCDs/Music</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!--single details-->\n");
      out.write("                <div class=\"album-container py-3\">\n");
      out.write("                    <div class=\"card-container row \">\n");
      out.write("                        <div class=\"card-content ms-3 me-3\" style=\"width: 50rem;\">\n");
      out.write("                            <div href=\"\" class=\"card-img\">\n");
      out.write("                                <div class=\"img\">\n");
      out.write("                                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.AImg_path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"\" alt=\"...\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"song-title\">\n");
      out.write("                                <div class=\"song-content\">\n");
      out.write("                                    <p class=\"song-album\">\n");
      out.write("                                        <strong>Tracklist:</strong>\n");
      out.write("                                    </p>\n");
      out.write("\n");
      out.write("                                    <p class=\"song-name\">\n");
      out.write("                                    <form action=\"\" method=\"post\">\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--Music Player-->\n");
      out.write("                        <div class=\"a-player\">\n");
      out.write("                            <div id=\"aplayer\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"album-title\">\n");
      out.write("                            <h3>\n");
      out.write("                                <strong>\n");
      out.write("                                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" – ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${abc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                                    <br/>\n");
      out.write("                                </strong>\n");
      out.write("                            </h3>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!--youtube video player-->\n");
      out.write("                <div class=\"pin-note py-3\">\n");
      out.write("                    <div class=\"pin-container row \">\n");
      out.write("                        <p class=\"pin-text\">\n");
      out.write("                            <strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MVPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" - Buy the original support the artist - Copyright issues [<a href=\"contact\">Contact Us</a>]</strong>\n");
      out.write("                        </p>\n");
      out.write("                        <div class=\"pin-content ms-3 me-3 mb-3\" style=\"width: 50rem;\">\n");
      out.write("                            <div class=\"television\">\n");
      out.write("                                <div class=\"television__top\">\n");
      out.write("                                    <div class=\"television__antenna television__antenna--left\"></div>\n");
      out.write("                                    <div class=\"television__antenna television__antenna--right\"></div>\n");
      out.write("                                    <div class=\"television__antenna__base\"></div>\n");
      out.write("                                </div><!-- television__top -->\n");
      out.write("                                <div class=\"television__center\">\n");
      out.write("                                    <div class=\"television__screen\">\n");
      out.write("                                        <iframe src=\"https://www.youtube.com/embed/SRu6YRr1KtM\" frameborder=\"0\" allowfullscreen></iframe>\n");
      out.write("                                    </div><!-- television__screen -->\n");
      out.write("                                    <div class=\"television__channels-wrapper\">\n");
      out.write("                                        <ul class=\"television__channels\">\n");
      out.write("                                            <li class=\"television__channel\"><a href=\"https://www.youtube.com/embed/SRu6YRr1KtM\" title=\"Channel 1\"></a></li>\n");
      out.write("                                            <li class=\"television__channel\"><a href=\"https://www.youtube.com/embed/oRdxUFDoQe0\" title=\"Channel 2\"></a></li>\n");
      out.write("                                            <li class=\"television__channel\"><a href=\"https://www.youtube.com/embed/EGikhmjTSZI\" title=\"Channel 3\"></a></li>\n");
      out.write("                                            <li class=\"television__channel\"><a href=\"https://www.youtube.com/embed/06qJVpUSKZY\" title=\"Channel 4\"></a></li>\n");
      out.write("                                            <li class=\"television__channel\"><a href=\"https://www.youtube.com/embed/v_09wFxoaeQ\" title=\"Channel 5\"></a></li>\n");
      out.write("                                            <li class=\"television__channel\"><a href=\"https://www.youtube.com/embed/Tj75Arhq5ho\" title=\"Channel 6\"></a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div><!-- television__channels-wrapper -->\n");
      out.write("                                </div><!-- television__center -->\n");
      out.write("                                <div class=\"television__base\">\n");
      out.write("                                    <div class=\"television__foot television__foot--left\"></div>\n");
      out.write("                                    <div class=\"television__foot television__foot--right\"></div>\n");
      out.write("                                </div><!-- television__base -->\n");
      out.write("                            </div><!-- .television -->\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!--pin note-->\n");
      out.write("                <div class=\"pin-note py-3\">\n");
      out.write("                    <div class=\"pin-container row \">\n");
      out.write("                        <p class=\"pin-text\">\n");
      out.write("                            <strong>Uta95s - Buy the original support the artist - Copyright issues [<a href=\"#aboutU\">Contact Us</a>]</strong>\n");
      out.write("                        </p>\n");
      out.write("                        <div class=\"pin-content ms-3 me-3 mb-3\" style=\"width: 50rem;\">\n");
      out.write("                            <div href=\"#\" class=\"card-img\">\n");
      out.write("                                <div class=\"img\">\n");
      out.write("                                    <img src=\"images/rightbar_icon/cashino.png\" alt=\"\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"song-title\">\n");
      out.write("                                <div class=\"song-content py-3\">\n");
      out.write("                                    <div class=\"song-box\">\n");
      out.write("                                        <a href=\"https://www.amazon.com/music\" ><img src=\"images/logo music/amazon.png\" alt=\"amazon\"/></a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"song-box\">\n");
      out.write("                                        <a href= \"https://www.cdjapan.co.jp/\" ><img src=\"images/logo music/cdjp.png\" alt=\"cdjp\"/></a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"song-box\">\n");
      out.write("                                        <a href= \"https://www.apple.com/music/\" ><img src=\"images/logo music/itune.png\" alt=\"itune\"/></a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!--fb cmt-->\n");
      out.write("                <div class=\"fb-cmt py-3\">\n");
      out.write("                    <div class=\"pin-container row \">\n");
      out.write("                        <div class=\"pin-content ms-3 me-3 mb-3\" style=\"width: 50rem;\">\n");
      out.write("                            <p class=\"pin-text\">\n");
      out.write("                                <strong>Let's us know your opinions below. Even report music links.</strong>\n");
      out.write("                            </p>\n");
      out.write("                            <div href=\"#\" class=\"card-img\">\n");
      out.write("                                <div class=\"img\">\n");
      out.write("                                    ");
      out.write("\n");
      out.write("                                    <div class=\"facebook-comment mt20\" style=\"background-color: white;\">\n");
      out.write("                                        <div class=\"fb-comments\" \n");
      out.write("                                             data-href=\"https://www.facebook.com/ZerOwl1/posts/1987719038060728\" \n");
      out.write("                                             data-width=\"360\" data-numposts=\"100\"  data-height=\"100px\"\n");
      out.write("                                             data-mobile=\"true\"\n");
      out.write("                                             style=\"vertical-align: bottom; width: 100%; height: 100%;\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>       \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"fb-root\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script async defer src=\"https://connect.facebook.net/en_US/sdk.js#xfbml=1&version=v2.6\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/aplayer/1.10.1/APlayer.min.js\" \n");
      out.write("                integrity=\"sha512-RWosNnDNw8FxHibJqdFRySIswOUgYhFxnmYO3fp+BgCU7gfo4z0oS7mYFBvaa8qu+axY39BmQOrhW3Tp70XbaQ==\" \n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("                                                    const ap = new APlayer({\n");
      out.write("                                                        container: document.getElementById('aplayer'),\n");
      out.write("                                                        listFolded: true,\n");
      out.write("                                                        autoplay: false,\n");
      out.write("                                                        loop: 'all',\n");
      out.write("                                                        order: 'random',\n");
      out.write("                                                        theme: '#FADFA3',\n");
      out.write("                                                        audio: [\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                        ]\n");
      out.write("                                                    });\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                    function addFavol() {\n");
      out.write("                                                        alert(\"Please check again your Favorites\");\n");
      out.write("                                                    }\n");
      out.write("                                                    var buttons = document.querySelectorAll('.television__channel a');\n");
      out.write("\n");
      out.write("                                                    for (var i = 0; i < buttons.length; i++) {\n");
      out.write("                                                        buttons[i].addEventListener('click', function (e) {\n");
      out.write("                                                            document.querySelector('.television__screen iframe').src = this.href;\n");
      out.write("                                                            e.preventDefault();\n");
      out.write("                                                        });\n");
      out.write("                                                    }\n");
      out.write("        </script>\n");
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
      out.write("        </div>\n");
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
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sByAlID}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("sAlID");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <strong>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sAlID.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</strong>\n");
          out.write("                                            ");
          if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n");
          out.write("                                            <hr/>\n");
          out.write("                                        ");
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

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isUser == 1 or sessionScope.acc.isAdmin == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <a onclick=\"addFavol()\" href=\"addFavol?idS=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sAlID.songID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" ><i class=\"fas fa-folder-plus text-dark h5\" ></i></a>\n");
        out.write("                                                ");
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

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sByAlID}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("s");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                            {\n");
          out.write("                                                                name: '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("',\n");
          out.write("                                                                artist: '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.idArtist}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("',\n");
          out.write("                                                                url: '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.song_path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("',\n");
          out.write("                                                                cover: '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.img_path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'\n");
          out.write("                                                            },\n");
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
