<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getLocalPort()
			+ request.getContextPath() + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE HTML>
<html>

<head>

<title>后台登录</title>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="后台管理" />

<link rel="shortcut icon" href="./static/logo.ico" type="image/x-icon" />
<link rel="stylesheet" href="./static/css/font.css">
<link rel="stylesheet" href="./static/css/xadmin.css">


</head>
<body>
	<!-- 顶部开始 -->
	<div class="container">
		<div class="logo">
			<a href="index">人事管理系统</a>
		</div>
		<div class="left_open">
			<i title="展开左侧栏" class="iconfont">&#xe699;</i>
		</div>
<ul class="layui-nav right" lay-filter="">
			<li class="layui-nav-item">${user.name}</li>
			<li class="layui-nav-item to-index"><a href="outLogin">登出</a></li>
		</ul>

	</div>
	<!-- 顶部结束 -->
	<!-- 中部开始 -->
	<!-- 左侧菜单开始 -->
	<div class="left-nav">
		<div id="side-nav">
			<ul id="nav">
				<li id ="aaa" ><a href="list"> <i class="iconfont">&#xe6b8;</i> <cite>员工管理</cite>
						<i class="iconfont nav_right">&#xe697;</i>
				</a> <a href="add"> <i class="iconfont">&#xe6b8;</i> <cite>添加用户</cite>
						<i class="iconfont nav_right">&#xe697;</i>
				</a><a href="deptList"> <i class="iconfont">&#xe723;</i>
						<cite>部门管理</cite> <i class="iconfont nav_right">&#xe697;</i>
				</a></li>
			
				<li><a href="querySameDept"> <i class="iconfont">&#xe726;</i>
						<cite>部门员工</cite> <i class="iconfont nav_right">&#xe697;</i>
				</a></li>
					<li><a href="userInfo"> <i class="iconfont">&#xe726;</i>
						<cite>个人信息</cite> <i class="iconfont nav_right">&#xe697;</i>
				</a></li>
			</ul>
		</div>
	</div>
	<!-- <div class="x-slide_left"></div> -->
	<!-- 左侧菜单结束 -->
	<!-- 右侧主体开始 -->
	<div class="page-content">
		<div class="layui-tab tab" lay-filter="xbs_tab" lay-allowclose="false">
			<ul class="layui-tab-title">
				<li class="home"><i class="layui-icon">&#xe68e;</i>部门列表</li>
			</ul>
			<div class="layui-tab-content">
				<div class="layui-tab-item layui-show">
 <div class="x-body">
      <div class="layui-row" style="" align="center">
        <form class="layui-form layui-col-md12 x-so" method="get" action="queryLikeDept">
          <!-- <input class="layui-input" placeholder="开始日" name="start" id="start">
          <input class="layui-input" placeholder="截止日" name="end" id="end"> -->
          <input type="text" name="name" style="width:50%;"  placeholder="请输入查找内容" autocomplete="off" class="layui-input">
          <input class="layui-btn"  type="submit"  value= "搜索">
        </form>
      </div>
      <%-- <xblock>
 <!--        <button class="layui-btn layui-btn-danger" onclick="delAll()"><i class="layui-icon"></i>批量删除</button> -->
        <button class="layui-btn" onclick="x_admin_show('添加用户','${ctx}/dept/add')"><i class="layui-icon"></i>添加</button>
        <span class="x-right" style="line-height:40px">共有数据：88 条</span>
      </xblock> --%>
     
      
      <table class="layui-table">
        <thead>
          <tr>
            <th>
              <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">&#xe605;</i></div>
            </th>
            <th>ID</th>
            <th>部门名称</th>
            <th>详细信息</th>
         <!-- <th>状态</th> -->
            <th>操作</th>
        </thead>
        <tbody>
        <c:forEach items="${deptList}" var="dept" varStatus="stat">
     <tr>
            <td>
              <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>
            </td>
            <td>${dept.id}</td>
            <td>${dept.name }</td>
            <td>${dept.remark }</td>
            
           <!--  <td class="td-status">
              <span class="layui-btn layui-btn-normal layui-btn-mini">已启用</span></td> -->
            <td class="td-manage">
             <!--  <a onclick="member_stop(this,'10001')" href="javascript:;"  title="启用">
                <i class="layui-icon">&#xe601;</i>
              </a> -->
              <a title="编辑"  href="changeDept?id=${dept.id }">
             
                <i class="layui-icon">&#xe642;</i>
              </a>
           
            </td>
          </tr>
				
			</c:forEach>
        
          
          
          
        </tbody>
      </table>
    </div>
  

					<%-- <div class="x-body layui-anim layui-anim-up">
						<blockquote class="layui-elem-quote">
							欢迎职工： <span class="x-red">${user.name} </span>！当前时间:<%=new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss").format(new Date())%></blockquote>
					</div> --%>
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
	
	<script type="text/javascript">
	var aaa = document.getElementById("aaa")
	aaa.onclick= function(){
		if(${user.status}==1){
			alert("暂无权限")
			return false
		}
	}
	</script>

</body>
</html>