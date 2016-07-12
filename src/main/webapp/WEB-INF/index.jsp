<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <!-- Meta, title, CSS, favicons, etc. -->
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>小豆科技</title>
  <jsp:include page="head.jsp"/>


    <script>
        function navigate(url)
        {
            window.frames['mainFrame'].location = url;
        }
    </script>


</head>
<body class="nav-md"  style="overflow-y: hidden;overflow-x: hidden">

<div class="container body">
  <div class="main_container" >
    <div class="col-md-3 left_col">
      <div class="left_col scroll-view">

        <!--左侧的的菜单的信息 -->
        <div class="navbar nav_title" style="border: 0;">
          <a href="#" class="site_title"><i class="fa fa-paw"></i> <span>小豆科技</span></a>
        </div>
        <div class="clearfix"></div>

        <!-- menu prile quick info -->
        <div class="profile">
          <div class="profile_pic">
            <img src="${pageContext.request.contextPath}/assets/bootstrap/images/img.jpg" alt="..." class="img-circle profile_img">
          </div>
          <div class="profile_info">
            <span>Welcome</span>
            <h2>${huhu.huhuName}</h2>
          </div>
        </div>
        <!-- /menu prile quick info -->

        <br />

        <!-- sidebar menu -->
        <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">

          <div class="menu_section">
            <h3>General</h3>
            <ul class="nav side-menu">

              <!-- 左侧的一级菜单和二级菜单 -->
              <c:forEach var="menu" items="${menuitems}">
                <%--用EL表达式直接调用属性循环输出对象的各个属性值--%>
                <li><a><i class="${menu.imageclass}"></i> ${menu.menuName} <span class="fa fa-chevron-down"></span></a>
                  <ul class="nav child_menu" style="display: none">
                    <c:forEach var="submenu" items="${menu.childMenus}">
                      <li><a  onclick="navigate('${submenu.url}')"   >
                          <%--<i class="${submenu.imageclass}"></i>--%>
                          ${submenu.menuName}</a>
                      </li>
                    </c:forEach>
                  </ul>
                </li>
              </c:forEach>



            </ul>
          </div>

        </div>
        <!-- /sidebar menu -->

        <!-- /menu footer buttons -->
        <div class="sidebar-footer hidden-small">
          <a data-toggle="tooltip" data-placement="top" title="Settings">
            <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
          </a>
          <a data-toggle="tooltip" data-placement="top" title="FullScreen">
            <span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
          </a>
          <a data-toggle="tooltip" data-placement="top" title="Lock">
            <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
          </a>
          <a data-toggle="tooltip" data-placement="top" title="Logout">
            <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
          </a>
        </div>
        <!-- /menu footer buttons -->
      </div>
    </div>

    <!-- top navigation -->
    <div class="top_nav">

      <div class="nav_menu">
        <nav class="" role="navigation">
          <div class="nav toggle">
            <a id="menu_toggle"><i class="fa fa-bars"></i></a>
          </div>

          <ul class="nav navbar-nav navbar-right">
            <li class="">
              <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                <img src="${pageContext.request.contextPath}/assets/bootstrap/images/img.jpg" alt="">金亮
                <span class=" fa fa-angle-down"></span>
              </a>
              <ul class="dropdown-menu dropdown-usermenu animated fadeInDown pull-right">
                <li><a href="javascript:;">  Profile</a>
                </li>
                <li>
                  <a href="javascript:;">
                    <span class="badge bg-red pull-right">50%</span>
                    <span>Settings</span>
                  </a>
                </li>
                <li>
                  <a href="javascript:;">Help</a>
                </li>
                <li><a href="login.html"><i class="fa fa-sign-out pull-right"></i> Log Out</a>
                </li>
              </ul>
            </li>

            <li role="presentation" class="dropdown">
              <a href="javascript:;" class="dropdown-toggle info-number" data-toggle="dropdown" aria-expanded="false">
                <i class="fa fa-envelope-o"></i>
                <span class="badge bg-green">6</span>
              </a>
              <ul id="menu1" class="dropdown-menu list-unstyled msg_list animated fadeInDown" role="menu">
                <li>
                  <a>
                      <span class="image">
                                        <img src="images/img.jpg" alt="Profile Image" />
                                    </span>
                      <span>
                                        <span>John Smith</span>
                      <span class="time">3 mins ago</span>
                      </span>
                      <span class="message">
                                        Film festivals used to be do-or-die moments for movie makers. They were where...
                                    </span>
                  </a>
                </li>
                <li>
                  <a>
                      <span class="image">
                                        <img src="images/img.jpg" alt="Profile Image" />
                                    </span>
                      <span>
                                        <span>John Smith</span>
                      <span class="time">3 mins ago</span>
                      </span>
                      <span class="message">
                                        Film festivals used to be do-or-die moments for movie makers. They were where...
                                    </span>
                  </a>
                </li>
                <li>
                  <a>
                      <span class="image">
                                        <img src="images/img.jpg" alt="Profile Image" />
                                    </span>
                      <span>
                                        <span>John Smith</span>
                      <span class="time">3 mins ago</span>
                      </span>
                      <span class="message">
                                        Film festivals used to be do-or-die moments for movie makers. They were where...
                                    </span>
                  </a>
                </li>
                <li>
                  <a>
                      <span class="image">
                                        <img src="images/img.jpg" alt="Profile Image" />
                      </span>
                      <span>
                        <span>John Smith</span>
                      <span class="time">3 mins ago</span>
                      </span>
                      <span class="message">
                                        Film festivals used to be do-or-die moments for movie makers. They were where...
                      </span>
                  </a>
                </li>
                <li>
                  <div class="text-center">
                    <a href="inbox.html">
                      <strong>See All Alerts</strong>
                      <i class="fa fa-angle-right"></i>
                    </a>
                  </div>
                </li>
              </ul>
            </li>

          </ul>
        </nav>
      </div>

    </div>
    <!-- /top navigation -->
    <div class="right_col" role="main">

    <iframe src="/menu/frame/pager_home"  id="mainFrame_id"
            name="mainFrame"
            marginheight="0" marginwidth="0"
            <%--height="600px" --%>

            scrolling="yes"
            width="100%"
            framespacing="0" frameborder="0"  onLoad="iFrameHeightEnd()"
    ></iframe>

      <script type="text/javascript" language="javascript">
          function iFrameHeight() {
              var ifm= document.getElementById("mainFrame_id");
              var subWeb = document.frames ? document.frames["mainFrame_id"].document : ifm.contentDocument;
              //获取窗口高度
              var  winHeight = 0 ;
              if (window.innerHeight){
                  winHeight = window.innerHeight;
              }else if ((document.body) && (document.body.clientHeight)){
                  winHeight = document.body.clientHeight;
              }

              if(ifm != null && subWeb != null) {
                  //scrollHeight
                  if(subWeb.body.clientHeight< winHeight ){
                      ifm.height = winHeight;
                  }else{
                      ifm.height = subWeb.body.clientHeight;
                  }

              }

              // 设置样式

              var x=document.getElementById("mainFrame_id");
              var y=(x.contentWindow || x.contentDocument);
              if (y.document)y=y.document;
              if ($('body').hasClass('nav-md')) {
                  y.body.className='nav-md' ;
              }else{
                  y.body.className='nav-sm' ;
              }

          }

          var timer1 = window.setInterval("iFrameHeight()", 500); //定时开始
          function iFrameHeightEnd(){
                iFrameHeight();
               window.clearInterval(timer1);

          }
      </script>

    </div>

  </div>

</div>

<div id="custom_notifications" class="custom-notifications dsp_none">
  <ul class="list-unstyled notifications clearfix" data-tabbed_notifications="notif-group">
  </ul>
  <div class="clearfix"></div>
  <div id="notif-group" class="tabbed_notifications"></div>
</div>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/common_js.jsp"/>

</body>

</html>
