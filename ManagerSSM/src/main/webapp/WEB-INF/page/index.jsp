<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getLocalPort()
			+ request.getContextPath() + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<!DOCTYPE HTML>
<html>

<head>

<title>后台登录</title>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="后台管理" 	/>

    <link rel="shortcut icon" href="./static/logo.ico" type="image/x-icon" />
	<link rel="stylesheet" href="./static/css/font.css">
	<link rel="stylesheet" href="./static/css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="./static/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="./static/js/xadmin.js"></script>

</head>
<body>
    <!-- 顶部开始 -->
    <div class="container">
        <div class="logo"><a href="javascript:;">人事管理系统</a></div>
        <div class="left_open">
            <i title="展开左侧栏" class="iconfont">&#xe699;</i>
        </div>
        
        <ul class="layui-nav right" lay-filter="">
          <li class="layui-nav-item">
            <a href="javascript:;">admin</a>
          </li>
          <li class="layui-nav-item to-index"><a>欢迎登录</a></li>
        </ul>
    </div>
    <!-- 顶部结束 -->
    <!-- 中部开始 -->
     <!-- 左侧菜单开始 -->
    <div class="left-nav">
      <div id="side-nav">
        <ul id="nav">
            <li>
                <a href="list">
                    <i class="iconfont">&#xe6b8;</i>
                    <cite>用户列表</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                  <a href="javascript:;">
                    <i class="iconfont">&#xe6b8;</i>
                    <cite>添加用户</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${ctx }/user/list">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>用户列表</cite>
                            
                        </a>
                    </li >
                    <li>
                        <a _href="${ctx }/user/add">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>添加用户</cite>
                            
                        </a>
                    </li>
                   
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe723;</i>
                    <cite>部门管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${ctx }/dept/list">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>部门列表</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="${ctx }/dept/add">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>添加部门</cite>
                        </a>
                    </li >
                </ul>
            </li>     
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe726;</i>
                    <cite>员工管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${ctx }/employee/list">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>员工列表</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="${ctx }/employee/add">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>添加员工</cite>
                        </a>
                    </li >
                </ul>
            </li>
        </ul>
      </div>
    </div>
    <!-- <div class="x-slide_left"></div> -->
    <!-- 左侧菜单结束 -->
    <!-- 右侧主体开始 -->
    <div class="page-content">
        <div class="layui-tab tab" lay-filter="xbs_tab" lay-allowclose="false">
          <ul class="layui-tab-title">
            <li class="home"><i class="layui-icon">&#xe68e;</i>我的桌面</li>
          </ul>
          <div class="layui-tab-content">
            <div class="layui-tab-item layui-show">
                <div class="x-body layui-anim layui-anim-up">
        <blockquote class="layui-elem-quote">欢迎职工：
            <span class="x-red">${user.name} </span>！当前时间:<%=new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss").format(new Date()) %></blockquote>
            </div>
            </div>
          </div>
        </div>
    </div>
    <div class="page-content-bg"></div>
    <!-- 右侧主体结束 -->
    <!-- 中部结束 -->
    <!-- 底部开始 -->
    <div class="footer">
        <div class="copyright">信科162向鸿飞</div>  
    </div>
    <!-- 底部结束 -->
 
</body>
</html>