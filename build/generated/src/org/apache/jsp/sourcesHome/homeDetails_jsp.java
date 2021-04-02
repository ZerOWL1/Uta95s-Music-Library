package org.apache.jsp.sourcesHome;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homeDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
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
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sByAlID}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("sAlID");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <strong>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sAlID.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</strong>\n");
          out.write("                                            ");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                            <hr/>\n");
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

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isUser == 1 or sessionScope.acc.isAdmin == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <a onclick=\"addFavol()\" href=\"addFavol?idS=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sAlID.songID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" ><i class=\"fas fa-folder-plus text-dark h5\" ></i></a>\n");
        out.write("                                                ");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sByAlID}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("s");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
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
}
