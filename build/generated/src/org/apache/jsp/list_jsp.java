package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!doctype html>\n");
      out.write("  \n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no\">\n");
      out.write("<title></title>\n");
      out.write("<link href=\"css/jq22.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("</head>\n");
      out.write("    <style>\n");
      out.write("\tbody{\n");
      out.write("\t\tbackground-image: url('images/back.png');\n");
      out.write("                background-repeat: repeat-x;\n");
      out.write("\t}\n");
      out.write("        body{ \n");
      out.write("\tfont:20px/200% Arial, Helvetica, sans-serif, \"新宋体\";\n");
      out.write("\theight:90%;\n");
      out.write("     }\n");
      out.write("    </style>\n");
      out.write("<body>\n");
      out.write("\t<div style=\"float:right;width:100%;margin:20px;\">\n");
      out.write("\t\t<div style=\"float:right;margin-right:10px;\">\n");
      out.write("\t\t\t<b><span>\n");
      out.write("\t\t\t\t<a href=\"#\">用户名</a>\n");
      out.write("\t\t\t</span></b>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div style=\"margin:5px auto;width:4%;clear:both\">\n");
      out.write("\t\t<h2>歌单秀</h2>\n");
      out.write("\t</div>\n");
      out.write("    <div class=\"btnMode\" id=\"slider\">    \n");
      out.write("\t<a href=\"javascript:void(0);\" class=\"prev btn\"></a>\n");
      out.write("\t<div class=\"scroll\">\t\n");
      out.write("\t\t<ul class=\"scrollContainer\">\n");
      out.write("\t\t\t<li class=\"panel\" id=\"panel_1\">\n");
      out.write("\t\t\t\t<a href=\"http://localhost:8080/WEB-INF/song.jsp#\" class=\"inside\" >\n");
      out.write("\t\t\t\t\t<img width=\"500\" height=\"500\" alt=\"《追光者》岑宁儿\" src=\"LP/L1.png\" />\n");
      out.write("\t\t\t\t\t<span>《追光者》岑宁儿</span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"panel\" id=\"panel_2\">\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"inside\" >\n");
      out.write("                                    <img width=\"500\" height=\"500\" alt=\"《童话镇》陈一发儿\" src=\"LP/L2.png\" />\n");
      out.write("\t\t\t\t\t<span>《童话镇》陈一发儿</span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"panel\" id=\"panel_3\">\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"inside\" >\n");
      out.write("\t\t\t\t\t<img width=\"500\" height=\"500\" alt=\"《暧昧》薛之谦\" src=\"LP/L3.png\" />\n");
      out.write("\t\t\t\t\t<span>《暧昧》薛之谦</span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"panel\" id=\"panel_4\">\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"inside\" >\n");
      out.write("\t\t\t\t\t<img width=\"500\" height=\"500\" alt=\"《成都》赵雷\" src=\"LP/L4.png\" />\n");
      out.write("\t\t\t\t\t<span>《成都》赵雷</span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"panel\" id=\"panel_5\">\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"inside\" >\n");
      out.write("\t\t\t\t\t<img width=\"500\" height=\"500\" alt=\"《说散就散》 JC\" src=\"LP/L5.png\" />\n");
      out.write("\t\t\t\t\t<span>《说散就散》 JC</span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"panel\" id=\"panel_6\">\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"inside\" >\n");
      out.write("\t\t\t\t\t<img width=\"500\" height=\"500\" alt=\"《全部都是你》\" src=\"LP/L6.png\" />\n");
      out.write("\t\t\t\t\t<span>《全部都是你》 Dragon</span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"panel\" id=\"panel_7\">\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"inside\" >\n");
      out.write("\t\t\t\t\t<img width=\"500\" height=\"500\" alt=\"《安河桥》宋冬野\" src=\"LP/L7.png\" />\n");
      out.write("\t\t\t\t\t<span>《安河桥》宋冬野</span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("                        <li class=\"panel\" id=\"panel_8\">\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"inside\" >\n");
      out.write("\t\t\t\t\t<img width=\"500\" height=\"500\" alt=\"《刚好遇见你》李玉刚\" src=\"LP/L8.png\" />\n");
      out.write("\t\t\t\t\t<span>《刚好遇见你》李玉刚</span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("                        <li class=\"panel\" id=\"panel_9\">\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"inside\" >\n");
      out.write("\t\t\t\t\t<img width=\"500\" height=\"500\" alt=\"《Shape of You》Ed Sheeran\" src=\"LP/L9.png\" />\n");
      out.write("\t\t\t\t\t<span>《Shape of You》Ed Sheeran</span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("                        <li class=\"panel\" id=\"panel_10\">\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"inside\" >\n");
      out.write("\t\t\t\t\t<img width=\"500\" height=\"500\" alt=\"《再也没有》Ryan.B\" src=\"LP/L10.png\" />\n");
      out.write("\t\t\t\t\t<span>《再也没有》Ryan.B</span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
      out.write("\t<a href=\"javascript:void(0);\" class=\"next btn\"></a>     \n");
      out.write("</div>\n");
      out.write("<!--\n");
      out.write("<div style=\"width:100%;margin-bottom:20px;\">\n");
      out.write("\t<div style=\"width:20%;margin:5px auto;\">\n");
      out.write("\t\t<b><span>????</span></b>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("-->\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>jQuery带播放列表音乐播放器DEMO演示</title>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"css/mplayer.css\">\n");
      out.write("<style>\n");
      out.write("\t.info {\n");
      out.write("\t\tfont-family: \"Microsoft Yahei\";\n");
      out.write("\t\ttext-align: center;\n");
      out.write("\t}\n");
      out.write("\t.info h1 {\n");
      out.write("\t\tfont-weight: 400;\n");
      out.write("\t}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<div class=\"mp\">\n");
      out.write("\t<div class=\"mp-box\">\n");
      out.write("\t\t<img src=\"img/mplayer_error.png\" alt=\"music cover\" class=\"mp-cover\">\n");
      out.write("\t\t<div class=\"mp-info\">\n");
      out.write("\t\t\t<p class=\"mp-name\">燕归巢</p>\n");
      out.write("\t\t\t<p class=\"mp-singer\">许嵩</p>\n");
      out.write("\t\t\t<p><span class=\"mp-time-current\">00:00</span>/<span class=\"mp-time-all\">00:00</span></p>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"mp-btn\">\n");
      out.write("\t\t\t<button class=\"mp-prev\" title=\"上一首\"></button>\n");
      out.write("\t\t\t<button class=\"mp-pause\" title=\"播放\"></button>\n");
      out.write("\t\t\t<button class=\"mp-next\" title=\"下一首\"></button>\n");
      out.write("\t\t\t<button class=\"mp-mode\" title=\"播放模式\"></button>\n");
      out.write("\t\t\t<div class=\"mp-vol\">\n");
      out.write("\t\t\t\t<button class=\"mp-vol-img\" title=\"静音\"></button>\n");
      out.write("\t\t\t\t<div class=\"mp-vol-range\" data-range_min=\"0\" data-range_max=\"100\" data-cur_min=\"80\">\n");
      out.write("\t\t\t\t\t<div class=\"mp-vol-current\"></div>\n");
      out.write("\t\t\t\t\t<div class=\"mp-vol-circle\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"mp-pro\">\n");
      out.write("\t\t\t<div class=\"mp-pro-current\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"mp-menu\">\n");
      out.write("\t\t\t<button class=\"mp-list-toggle\"></button>\n");
      out.write("\t\t\t<button class=\"mp-lrc-toggle\"></button>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<button class=\"mp-toggle\">\n");
      out.write("\t\t<span class=\"mp-toggle-img\"></span>\n");
      out.write("\t</button>\n");
      out.write("\t<div class=\"mp-lrc-box\">\n");
      out.write("\t\t<ul class=\"mp-lrc\"></ul>\n");
      out.write("\t</div>\n");
      out.write("\t<button class=\"mp-lrc-close\"></button>\n");
      out.write("\t<div class=\"mp-list-box\">\n");
      out.write("\t\t<ul class=\"mp-list-title\"></ul>\n");
      out.write("\t\t<table class=\"mp-list-table\">\n");
      out.write("\t\t\t<thead>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th>歌名</th>\n");
      out.write("\t\t\t\t\t<th>歌手</th>\n");
      out.write("\t\t\t\t\t<th>时长</th>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</thead>\n");
      out.write("\t\t\t<tbody class=\"mp-list\"></tbody>\n");
      out.write("\t\t</table>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script src=\"js/jquery-2.1.1.js\"></script>\n");
      out.write("<script src=\"js/mplayer.js\"></script>\n");
      out.write("<script src=\"js/mplayer-list.js\"></script>\n");
      out.write("<script src=\"js/mplayer-functions.js\"></script>\n");
      out.write("<script src=\"js/jquery.nstSlider.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("var modeText = ['顺序播放','单曲循环','随机播放','列表循环'];\n");
      out.write("var player = new MPlayer({\n");
      out.write("\t// 容器选择器名称\n");
      out.write("\tcontainerSelector: '.mp',\n");
      out.write("\t// 播放列表\n");
      out.write("\tsongList: mplayer_song,\n");
      out.write("\t// 专辑图片错误时显示的图片\n");
      out.write("\tdefaultImg: 'img/mplayer_error.png',\n");
      out.write("\t// 自动播放\n");
      out.write("\tautoPlay: true,\n");
      out.write("\t// 播放模式(0->顺序播放,1->单曲循环,2->随机播放,3->列表循环(默认))\n");
      out.write("\tplayMode:0,\n");
      out.write("\tplayList:0,\n");
      out.write("\tplaySong:0,\n");
      out.write("\t// 当前歌词距离顶部的距离\n");
      out.write("\tlrcTopPos: 34,\n");
      out.write("\t// 列表模板，用");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${变量名}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("$插入模板变量\n");
      out.write("\tlistFormat: '<tr><td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("$</td><td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${singer}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("$</td><td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${time}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("$</td></tr>',\n");
      out.write("\t// 音量滑块改变事件名称\n");
      out.write("\tvolSlideEventName:'change',\n");
      out.write("\t// 初始音量\n");
      out.write("\tdefaultVolume:80\n");
      out.write("}, function () {\n");
      out.write("\t// 绑定事件\n");
      out.write("\tthis.on('afterInit', function () {\n");
      out.write("\t\tconsole.log('播放器初始化完成，正在准备播放');\n");
      out.write("\t}).on('beforePlay', function () {\n");
      out.write("\t\tvar $this = this;\n");
      out.write("\t\tvar song = $this.getCurrentSong(true);\n");
      out.write("\t\tvar songName = song.name + ' - ' + song.singer;\n");
      out.write("\t\tconsole.log('即将播放'+songName+'，return false;可以取消播放');\n");
      out.write("\t}).on('timeUpdate', function () {\n");
      out.write("\t\tvar $this = this;\n");
      out.write("\t\tconsole.log('当前歌词：' + $this.getLrc());\n");
      out.write("\t}).on('end', function () {\n");
      out.write("\t\tvar $this = this;\n");
      out.write("\t\tvar song = $this.getCurrentSong(true);\n");
      out.write("\t\tvar songName = song.name + ' - ' + song.singer;\n");
      out.write("\t\tconsole.log(songName+'播放完毕，return false;可以取消播放下一曲');\n");
      out.write("\t}).on('mute', function () {\n");
      out.write("\t\tvar status = this.getIsMuted() ? '已静音' : '未静音';\n");
      out.write("\t\tconsole.log('当前静音状态：' + status);\n");
      out.write("\t}).on('changeMode', function () {\n");
      out.write("\t\tvar $this = this;\n");
      out.write("\t\tvar mode = modeText[$this.getPlayMode()];\n");
      out.write("\t\t$this.dom.container.find('.mp-mode').attr('title',mode);\n");
      out.write("\t\tconsole.log('播放模式已切换为：' + mode);\n");
      out.write("\t});\n");
      out.write("});\n");
      out.write("\n");
      out.write("$(document.body).append(player.audio); // 测试用\n");
      out.write("\n");
      out.write("setEffects(player);\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jq22.js\"></script>\n");
      out.write("<script>\n");
      out.write("$(function(){\n");
      out.write("    \n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("<p></p>\n");
      out.write("<br />\n");
      out.write("<br />\n");
      out.write("<br />\n");
      out.write("<br />\n");
      out.write("<p></p>\n");
      out.write("<div style=\"width:40%;margin:20px auto;\">\n");
      out.write("\t\t<strong>Copyright &copy; 2001-2017 <a href=\"#\">PPAP北京有限公司</a>.</strong> All rights .\n");
      out.write("\t</div>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t");
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
