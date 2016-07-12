<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<!-- saved from url=(0055)https://pandao.github.io/editor.md/examples/simple.html -->
<html lang="zh" class=""><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>Simple example - Editor.md examples</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/markmd/css/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/markmd/css/editormd.css">
    <link rel="shortcut icon" href="https://pandao.github.io/editor.md/favicon.ico" type="image/x-icon">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/assets/markmd/css/codemirror.min.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/assets/markmd/css/dialog.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/assets/markmd/css/matchesonscrollbar.css">
    <script id="-lib-codemirror-codemirror-min" type="text/javascript" src="${pageContext.request.contextPath}/assets/markmd/js/codemirror.min.js"></script>
    <script id="-lib-codemirror-modes-min" type="text/javascript" src="${pageContext.request.contextPath}/assets/markmd/js/modes.min.js"></script>
    <script id="-lib-codemirror-addons-min" type="text/javascript" src="${pageContext.request.contextPath}/assets/markmd/js/addons.min.js"></script>
    <script id="-lib-marked-min" type="text/javascript" src="${pageContext.request.contextPath}/assets/markmd/js/marked.min.js"></script>
    <script id="-lib-prettify-min" type="text/javascript" src="${pageContext.request.contextPath}/assets/markmd/js/prettify.min.js"></script>
    <style type="text/css">.fancybox-margin{margin-right:15px;}</style>
</head>
<body>
<div id="layout">

    <div id="test-editormd" class="editormd editormd-vertical" style="width: 90%; height: 640px;">

    </div>
</div>
<script src="${pageContext.request.contextPath}/assets/markmd/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/markmd/js/editormd.min.js"></script>
<script type="text/javascript">
    var testEditor;

    $(function() {
        testEditor = editormd("test-editormd", {
            width   : "90%",
            height  : 640,
            syncScrolling : "single",
            path    : "${pageContext.request.contextPath}/assets/markmd/lib/"
        });

    });
</script>

</body>
</html>