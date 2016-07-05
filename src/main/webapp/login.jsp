<%--
  Created by IntelliJ IDEA.
  User: jinliang
  Date: 16/7/5
  Time: 上午7:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆界面</title>
    <jsp:include page="WEB-INF/head_simple.jsp"/>
</head>
<body>

<div class="">
    <a class="hiddenanchor" id="toregister"></a>
    <a class="hiddenanchor" id="tologin"></a>

    <div id="wrapper">
        <div id="login" class="animate form " style="float: right">
            <section class="login_content">
                <form>
                    <h1> Login </h1>
                    <div>
                        <input type="text" class="form-control" placeholder="Username" required="" />
                    </div>
                    <div>
                        <input type="password" class="form-control" placeholder="Password" required="" />
                    </div>
                    <div class="row">
                        <%--<a class="reset_pass text-left" href="#">忘记密码?</a>--%>
                        <%--<a class="to_register" href="#">创建用户</a>--%>
                        <%--<a class="btn btn-default submit  text-right" href="index.html">登陆</a>--%>
                            <div class="col-sm-3  text-center"><a class="btn btn-sm" href="#">忘记密码?</a></div>
                            <div class="col-sm-3 text-center"><a  class="btn btn-sm" href="#">创建用户</a></div>
                            <div class="col-sm-offset-9"><a class=" btn btn-sm submit " href="index.html">登陆</a></div>
                    </div>
                    <div class="clearfix"></div>
                    <div class="separator">

                        <%--<p class="change_link">--%>
                            <%--<a href="#toregister" class="to_register"> 创建用户 </a>--%>
                        <%--</p>--%>
                        <%--<div class="clearfix"></div>--%>
                        <%--<br />--%>
                        <%--<div>--%>
                            <%--<h1><i class="fa fa-paw" style="font-size: 26px;"></i> 华豆科技</h1>--%>

                            <%--<p>©2015 www.huadou.com</p>--%>
                        <%--</div>--%>
                    </div>
                </form>
                <!-- form -->
            </section>
            <!-- content -->
        </div>
        <div id="register" class="animate form">
            <section class="login_content">
                <form>
                    <h1>Create Account</h1>
                    <div>
                        <input type="text" class="form-control" placeholder="Username" required="" />
                    </div>
                    <div>
                        <input type="email" class="form-control" placeholder="Email" required="" />
                    </div>
                    <div>
                        <input type="password" class="form-control" placeholder="Password" required="" />
                    </div>
                    <div>
                        <a class="btn btn-default submit" href="index.html">Submit</a>
                    </div>
                    <div class="clearfix"></div>
                    <div class="separator">

                        <p class="change_link">Already a member ?
                            <a href="#tologin" class="to_register"> Log in </a>
                        </p>
                        <div class="clearfix"></div>
                        <br />
                        <div>
                            <h1><i class="fa fa-paw" style="font-size: 26px;"></i> Gentelella Alela!</h1>

                            <p>©2015 All Rights Reserved. Gentelella Alela! is a Bootstrap 3 template. Privacy and Terms</p>
                        </div>
                    </div>
                </form>
                <!-- form -->
            </section>
            <!-- content -->
        </div>
    </div>
</div>


</body>
</html>
