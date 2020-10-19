<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%
    pageContext.setAttribute("path", request.getContextPath());
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>图书管理系统</title>
    <script src="https://cdn.staticfile.org/jquery/3.1.1/jquery.min.js"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css" href="css/main.css" />
    <style type="text/css">
        body{
            background-color: rgb(255, 239, 212);
        }
    </style>
</head>
<body>
<div class="title">
    <a href="#" id="jumpingto" class="back btn btn-default" style="color: #000000;">进入图书馆</a>
    <div class="icon">
				<span class="dec">
					<h2 style="color: white;"> 天 府 图 书 </h2>
					<h5 style="color: white;font-size: 15px;text:justify;text-justify:distribute-all-lines;text-align-last:justify;">
					 欢 迎 借 阅	</h5>
				</span>

    </div>
</div>
<div class="container">
    <div class="center-block">
        <div class="jumbotron" style="border: 1px solid #1ABC9C;">
            <div class="row">
                <div class="col-md-8 col-md-offset-2 text-success">
                    <h1>天 府 图 书 馆 欢 迎 您</h1>
                </div>
            </div>
            <br/><br />
            <div class="row">
                <span class="col-md-3 "><img src="img/show/1_1.jpg" alt="..." class="img-rounded" id="img1"></span>
                <span class="col-md-3 col-md-offset-1" ><img src="img/show/1_2.jpg" alt="..." class="img-rounded" id="img2"></span>
                <span class="col-md-3 col-md-offset-1" ><img src="img/show/1_3.jpg" alt="..." class="img-rounded" id="img3"></span>
            </div>
            <br/><br />
            <div class="row">
                <div class="col-md-1 col-md-offset-1" >
                    <p ><a class="btn btn-success btn-lg" id="mala" href="#" role="button">历史文献</a></p>
                </div>
                <div class="col-md-1 col-md-offset-1" >
                    <p><a class="btn btn-success btn-lg" id="ganban" href="#" role="button">健康医学</a></p>
                </div>
                <div class="col-md-1 col-md-offset-1" >
                    <p><a class="btn btn-success btn-lg" id="suantang" href="#" role="button">经济管理</a></p>
                </div>
                <div class="col-md-1 col-md-offset-1" >
                    <p><a class="btn btn-success btn-lg" id="qingtang" href="#" role="button">工业科技</a></p>
                </div>
                <div class="col-md-1 col-md-offset-1" >
                    <p><a class="btn btn-success btn-lg" id="fanqie" href="#" role="button">政治法律</a></p>
                </div>
            </div>

        </div>
    </div>

</div>
<script>
    $("#jumpingto").click(function (){
        const Url="http://localhost:8080/shijia/index.action"
        window.location.href = Url;
    });

    function initbtn(){
        $("#mala").attr("class","btn btn-success btn-lg")
        $("#ganban").attr("class","btn btn-success btn-lg");
        $("#suantang").attr("class","btn btn-success btn-lg");
        $("#fanqie").attr("class","btn btn-success btn-lg");
        $("#qingtang").attr("class","btn btn-success btn-lg");
    }

    $("#mala").hover(function(){
        initbtn();
        $("#img1").attr("src","img/show/1_1.jpg");
        $("#img2").attr("src","img/show/1_2.jpg");
        $("#img3").attr("src","img/show/1_3.jpg");
        $("#mala").attr("class","btn btn-warning btn-lg");
    });
    $("#ganban").hover(function(){
        initbtn();
        $("#img1").attr("src","img/show/2_1.jpg");
        $("#img2").attr("src","img/show/2_2.jpg");
        $("#img3").attr("src","img/show/2_3.jpg");
        $("#ganban").attr("class","btn btn-warning btn-lg");
    });
    $("#suantang").hover(function(){
        initbtn();
        $("#img1").attr("src","img/show/3_1.jpg");
        $("#img2").attr("src","img/show/3_2.jpg");
        $("#img3").attr("src","img/show/3_3.jpg");
        $("#suantang").attr("class","btn btn-warning btn-lg");
    });
    $("#qingtang").hover(function(){
        initbtn();
        $("#img1").attr("src","img/show/4_1.jpg");
        $("#img2").attr("src","img/show/4_2.jpg");
        $("#img3").attr("src","img/show/4_3.jpg");
        $("#qingtang").attr("class","btn btn-warning btn-lg");
    });
    $("#fanqie").hover(function(){
        initbtn();
        $("#img1").attr("src","img/show/5_1.jpg");
        $("#img2").attr("src","img/show/5_2.jpg");
        $("#img3").attr("src","img/show/5_3.jpg");
        $("#fanqie").attr("class","btn btn-warning btn-lg");
    });
</script>
</body>
</html>
