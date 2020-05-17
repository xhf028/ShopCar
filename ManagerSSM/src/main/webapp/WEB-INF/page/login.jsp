<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
            <%	
    	String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getLocalPort()+request.getContextPath()+"/";
		
	%>
<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>"/>
<title>后台登录</title>
<!-- Custom Theme files -->
<link href="./static/css/style.css" rel="stylesheet" type="text/css" media="all"/>
<!-- Custom Theme files -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
<meta name="keywords" content="后台登录" />
<!--Google Fonts-->
<!--<link href='//fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
--><!--Google Fonts-->
</head>
<body>
<!--header start here-->
<div class="login-form">
			<div class="top-login">
				<span><img src="./static/images/group.png" alt=""/></span>
			</div>
			<h1>登录</h1>
			<div class="login-top">
			<form action="veriyLogin" method="post">
				<div class="login-ic">
					<i ></i>
					<input type="text"  value="用户名" name="username" />
					<div class="clear"><span style="color: red">${error}</span> </div>
				</div>
				<div class="login-ic">
					<i class="icon"></i>
					<input type="password"  value="密码" name= "password" />
					<div class="clear"> </div>
				</div>
			
				<div class="log-bwn">
					<input type="submit"  value="Login" >
				</div>
				</form>
			</div>
			<p class="copy">信科162 040716216  向鸿飞</p>
</div>		
<!--header start here-->
</body>
</html>