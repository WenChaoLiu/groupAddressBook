<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="<%=basePath%>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="icon" href="<%=basePath%>resources/img/favicon.ico" mce_href="<%=basePath%>resources/img/favicon.ico" type="image/x-icon" />
<link rel="shortcut icon" href="<%=basePath%>resources/img/favicon.ico" mce_href="<%=basePath%>resources/img/favicon.ico" type="image/x-icon" />
<title>访问权限不足</title>
<style>
* {
	margin: 0;
	padding: 0
}

body {
	font-family: "微软雅黑";
	background: #DAD9D7
}

img {
	border: none
}

a * {
	cursor: pointer
}

ul,li {
	list-style: none
}

table {
	table-layout: fixed;
}

table tr td {
	word-break: break-all;
	word-wrap: break-word;
}

a {
	text-decoration: none;
	outline: none
}

a:hover {
	text-decoration: underline
}

.cf:after {
	content: ".";
	display: block;
	height: 0;
	font-size: 0;
	clear: both;
	visibility: hidden;
}

.cf {
	zoom: 1;
	clear: both
}

.bg {
	width: 100%;
	background: url("/resources/img/404/01.jpg") no-repeat center top
		#DAD9D7;
	position: absolute;
	top: 0;
	left: 0;
	height: 600px;
	overflow: hidden
}

.cont {
	margin: 0 auto;
	width: 500px;
	line-height: 20px;
}

.c1 {
	height: 360px;
	text-align: center
}

.c1 .img1 {
	margin-top: 180px
}

.c1 .img2 {
	margin-top: 165px
}

.cont h2 {
	text-align: center;
	color: #555;
	font-size: 18px;
	font-weight: normal;
	height: 35px
}

.c2 {
	height: 35px;
	text-align: center
}

.c2 a {
	display: inline-block;
	margin: 0 4px;
	font-size: 14px;
	height: 23px;
	color: #626262;
	padding-top: 1px;
	text-decoration: none;
	text-align: left
}

.c2 a:hover {
	color: #626262;
	text-decoration: none;
}

.c2 a.home {
	width: 66px;
	background: url("/resources/img/404/02.png");
	padding-left: 30px
}

.c2 a.home:hover {
	background: url("/resources/img/404/02.png") 0 -24px
}

.c2 a.home:active {
	background: url("/resources/img/404/02.png") 0 -48px
}

.c2 a.re {
	width: 66px;
	background: url("/resources/img/404/03.png");
	padding-left: 30px
}

.c2 a.re:hover {
	background: url("/resources/img/404/03.png") 0 -24px
}

.c2 a.re:active {
	background: url("/resources/img/404/03.png") 0 -48px
}

.c2 a.sr {
	width: 153px;
	background: url("/resources/img/404/04.png");
	padding-left: 28px
}

.c2 a.sr:hover {
	background: url("/resources/img/404/04.png") 0 -24px
}

.c2 a.sr:active {
	background: url("/resources/img/404/04.png") 0 -48px
}

.c3 {
	height: 180px;
	text-align: center;
	color: #999;
	font-size: 12px
}

#bf {
	position: absolute;
	top: 269px;
	left: 0;
	width: 100%
}

.bf1 {
	margin: 0 auto;
	width: 99px;
	padding-left: 32px
}

.bd {
	height: 600px;
	overflow: hidden
}

#box {
	position: absolute;
	top: 165px;
	left: 0;
	width: 100%;
	text-align: center
}

.bf1 {
	margin: 0 auto;
	width: 99px;
	padding-left: 32px
}
</style>
<script>
	function jump(url){
		document.location.href=url;
	}
</script>
</head>
<body>
	<div class="bg">
		<div class="cont">
			<div class="c1">
				<img src="/resources/img/404/01.png" class="img1" />
			</div>
			<h2 style="color: red;">哎呀…您好像没有权限访问该资源哦^_^</h2>
			<div class="c2" id="topdiv">
				<a href="javascript:jump(document.location.href)" class="re">重试一次</a> 
				<a href="javascript:jump('http://www.baidu.com/s?wd='+document.location.href)" class="sr">搜索一下页面相关信息</a>
			</div>
			<div class="c2" id="subdiv" style="display: none;">
				<a href="javascript:jump(document.location.href)" class="re">重试一次</a>
			</div>
			<div class="c3">温馨提示 - 您可能没有权限对该资源进行访问，或者您可能输入了错误的网址</div>
		</div>
	</div>
	<script>
//如果是顶层窗口
/*if (window.top !== window.self) {
	document.getElementById("topdiv").style.display = 'none';
	document.getElementById("subdiv").style.display = '';
} else {
	document.getElementById("subdiv").style.display = 'none';
	document.getElementById("topdiv").style.display='';
}*/
</script>
</body>
</html>