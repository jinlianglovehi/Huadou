<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
    <%--<jsp:include page="../WEB-INF/head.jsp"/>--%>
    <jsp:include page="../../../head.jsp"/>
    <style>

        body , .container.body {
            background: #f7f7f7 none repeat scroll 0 0;
        }
        body {
            margin: 0;
            padding:0;
            overflow-y: scroll;

        }

        .tile_stats_count .right {
            height:auto;
            max-height: 85px;
        }
    </style>
</head>


<body class="nav-md"  style="min-height: 960px;">
        <!-- top tiles -->
        <div class="container-fluid body">
            <div class="row tile_count">
                <%--flipInY--%>
                <div class="animated huhu col-md-2 col-sm-4 col-xs-4 tile_stats_count">
                    <div class="left"></div>
                    <div class="right">
                        <span class="count_top"><i class="fa fa-user"></i> Total Users</span>
                        <div class="count">2500</div>
                        <span class="count_bottom"><i class="green">4% </i> From last Week</span>
                    </div>
                </div>
            </div>
        </div>
<script>
    NProgress.done();
</script>
</body>
</html>
