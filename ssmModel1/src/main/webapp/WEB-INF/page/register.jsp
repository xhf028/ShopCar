<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
                   <%	
    	String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getLocalPort()+request.getContextPath()+"/";
		
	%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>"/>
	<title>briup-电子商务-注册</title>
	<link rel="stylesheet" type="text/css" href="./static/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="./static/css/style.css">

	<script type="text/javascript" src="./static/js/jquery.min.js"></script>
	<script type="text/javascript" src="./static/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="./static/js/estore.js"></script>
</head>
<body>
	<div class="login_top">
		<img src="./static/images/logo.png">
		<h2 class="title">欢迎注册</h2>
	</div>
	<div class="login_tip"><span class=" glyphicon glyphicon-info-sign">&nbsp;</span>依据《网络安全法》，为保障您的账户安全和正常使用，请尽快完成手机号验证！ 新版《杰普隐私政策》已上线，将更有利于保护您的个人隐私。</div>
	<div class="reg_bg row">
		
		<div class="reg_box col-md-7 column">
			<h1>用户注册<span class="glyphicon glyphicon-hand-right">&nbsp;已经有账号<a href="login">去登录</a></span></h1>
			<form action="registerLogin" class="form-horizontal" role="from" method="post">
				
				<div class="form-group">
					<label class="col-sm-3 control-label">用户名：</label>
					<div class="col-sm-9">
						<input class="form-control" id="focusedInput" type="text" name="username" placeholder="请输入您的用户名">
						<div  style="color: red">${error1}</div>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-sm-3 control-label">密码：</label>
					<div class="col-sm-9">
						<input class="form-control" id="focusedInput" type="password" name="password"  placeholder="请设置您的密码">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-3 control-label">邮编：</label>
					<div class="col-sm-9">
						<input class="form-control" id="focusedInput" type="text" name="zip"  placeholder="请输入您的邮编 ">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-3 control-label">地址：</label>
					<div class="col-sm-9">
						<input class="form-control" id="focusedInput" type="text" name="address"  placeholder="请填写您的地址">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-3 control-label">电话：</label>
					<div class="col-sm-9">
						<input class="form-control" id="focusedInput" type="text" name="phone" placeholder="请填写您的联系方式">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-3 control-label">电子邮箱：</label>
					<div class="col-sm-9">
						<input class="form-control" id="focusedInput" type="email" name="email" placeholder="请输入您的电子邮箱">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-1">
					</div>
					<div class="col-sm-1">
						<input  type="checkbox">
					</div>
					我已阅读并同意《杰普隐私协议》
				</div>
				<div class="form-group">
					<div class="col-sm-12">
						<input class="form-control btn btn-danger" id="focusedInput" type="submit" value="立即注册">
					</div>
				</div>
			</form>

		</div>
		<div class="reg_body col-md-5 column">
			<img src="./static/images/bg-reg.jpg">
		</div>

	</div>
	<div class="footer"> 
		<div class="row clearfix icons">
			<div class="col-md-3 column">
				<img src="./static/images/icons/icon_1_17.png">
				品目繁多 愉悦购物
			</div>
			<div class="col-md-3 column">
				<img src="./static/images/icons/icon_1_20.png">
				正品保障 天天低价
			</div>
			<div class="col-md-3 column">
				<img src="./static/images/icons/icon_1_23.png">
				极速物流 特色定制
			</div>
			<div class="col-md-3 column">
				<img src="./static/images/icons/icon_1_25.png">
				优质服务 以客为尊
			</div>
		</div>
		<div class="links">
			<p>
				<span>关于我们</span>|
				<span>联系我们</span>|
				<span>加我我们</span>|
				<span>友情链接</span>
			</p>
			<p>沪ICP备14033591号-8 杰普briup.com版权所有 杰普软件科技有限公司</p>
			<img src="./static/images/police.png">
		</div>
	</div>
</div>
</body>
</html>