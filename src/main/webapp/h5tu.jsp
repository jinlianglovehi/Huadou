
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html  style="height:100%;">
<meta charset="utf-8"/>
<meta name="viewport" content="width=device-width, user-scalable=no">
<META NAME ="keywords" CONTENT="H5,HTML5,3D,WEBGL,AR,VR,ANDROID,iOS">
<META NAME="description" CONTENT="H5TU.com 技术与艺术的完美结合 商务合作 微信:le3d618 QQ:371691096">
<meta name = "format-detection" content="telephone = no" />
<link rel="stylesheet" href="http://h5tu.com/case/css/index.css">
<head>
    <title></title>
</head>
<body>
<img src="" id="wxshare" style="display:none;" />
<div id="canvas-area">
    <canvas id="canvas" width="720" height="1280">
    </canvas>
</div>
<div id="loading" class="loading">
    <div class="spinner">
        <div class="clock">
            <div class="scanner">
                <div class="trail"></div>
                <img src="http://h5tu.com/case/image/pointer.png" class="pointer">
            </div>
            <img src="http://h5tu.com/case/image/quater.png" class="quarter1">
            <img src="http://h5tu.com/case/image/quater.png" class="quarter2">
            <img src="http://h5tu.com/case/image/quater.png" class="quarter3">
            <img src="http://h5tu.com/case/image/quater.png" class="quarter4">
        </div>
    </div>
    <div class="banner">
        <a href="http://www.h5tu.com">
            <img src="http://h5tu.com/case/image/go.png" class="pic">
        </a>
        <div class="text">技术与艺术的完美结合</div>
    </div>
</div>
<div class="prevent-crash">.</div>
<script src="e3dx.min.js"></script>
<script src="http://h5tu.com/js/debug.js"></script>
<script src="http://h5tu.com/js/jquery-2.1.3.min.js?v=2015723"></script>
<script src="http://h5tu.com/js/jweixin-1.0.0.js?v=2015723"></script>
<script src="http://h5tu.com/js/wx.js?v=2015723"></script>
<script src="http://h5tu.com/js/wxManage.js"></script>
<script src="http://h5tu.com/js/base/util.js"></script>
<script type="text/javascript">

    $(function(){
        var canvasArea=document.getElementById('canvas-area');
        canvasArea.style.display='none';
        var mCanvas = document.getElementById("canvas");
        var startLoadingTime = new Date().getTime();
        $.getJSON(window.location.href.split('?')[0].split('#')[0].replace('index.html','')+'assets.json',function(result){
            switch(result.mode){
                case '0':mCanvas.style.height='100%';break;//高撑�?
                case '1':mCanvas.style.width='100%';break;//宽撑�?
                case '2':mCanvas.style.width='100%';mCanvas.style.height='100%';break;//宽撑满，高撑�?
                default:mCanvas.style.height='100%';break;
            }
            $('title').html(result.title);
            var imgUrl=window.location.href.split('?')[0].split('#')[0].replace('index.html','')+result.share;
            wxManage.init({
                title: result.title,
                desc: result.desc,
                imgUrl: imgUrl,
                link: window.location.href
            });
            $('#wxshare').attr('src',imgUrl);
            //var height=window.innerHeight;
            //mCanvas.width =height*9/16;
            //mCanvas.height=height;
            var mLoading = document.getElementById("loading");
            canvasArea.style.display = 'block';
            var tmp = mCanvas.getContext("experimental-webgl", {antialias:true,alpha:false});
            var me3d = new E3dWallpaperBase( mCanvas,false);
            me3d.start();
            canvasArea.style.display = 'none';
            me3d.loadAsset('../szg3d', null, function() {
                var leftTime=2000 - (new Date().getTime() - startLoadingTime);
                setTimeout(function(){
//              document.body.style.backgroundColor="#000000";
                    canvasArea.style.display = 'block';
                    mLoading.style.display = 'none';
                },leftTime<0?0:leftTime );
            });

        });

    });


</script>
<script src="http://h5tu.com/js/bdStatistics.js?v=20150714"></script>
<!--<script src="http://h5tu.com/js/share.js"></script>-->
</body>
</html>