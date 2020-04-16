<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getLocalPort()
			+ request.getContextPath() + "/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>" />
<title>briup-电子商务-订单确认</title>
<link rel="stylesheet" type="text/css"
	href="./static/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="./static/css/style.css">

<script type="text/javascript" src="./static/js/jquery.min.js"></script>
<script type="text/javascript" src="./static/js/bootstrap.min.js"></script>
<script type="text/javascript" src="./static/js/estore.js"></script>
</head>
<body>
	<a href="#top" alt="回到顶部" class="toTop">
		<button class="btn btn-top">
			<span class="glyphicon glyphicon-chevron-up"></span>
		</button>
	</a>
	<div class="top" id="top">
		<div class="herf">
			<span><a href="index">首页</a></span> <span><a>我的订单</a></span> <span><a
				href="outLogin">退出</a></span>
		</div>
	</div>

	<div class="head">
		<div class="row clearfix">
			<div class="col-md-6 column">
				<img src="./static/images/logo.png" class="logo">
			</div>
			<div class="col-md-6 column">
				<img src="./static/images/play_02.png" alt="">
			</div>
		</div>
	</div>
	<div class="nav">
		<div class="col-md-2 column  type">
			<span class="glyphicon glyphicon-shopping-cart"></span>&nbsp;&nbsp;&nbsp;订单确认
		</div>

		<div class="col-md-10 column marquee">
			<marquee scrollamount="3">
				<span class="glyphicon glyphicon-bullhorn">
					系统公告：本系统今晚十点进行系统升级，带来不便敬请谅解！</span>
			</marquee>
		</div>
	</div>
	<div class="body">
		<div class=" receiver">
			<div class=" receiver-header">填写并核对您的订单信息</div>
			<div class="row">
				<form class="form-horizontal col-md-7 column" role="form">
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-4 control-label">收货人姓名：</label>
						<div class="col-sm-8">
							<input type="text" class="form-control" disabled="disabled"
								value="张三" />
						</div>
					</div>
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-4 control-label">收货地址：</label>
						<div class="col-sm-8">
							<input type="text" class="form-control" disabled="disabled"
								value="江苏省苏州市常熟市常熟理工学院" />
						</div>
					</div>
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-4 control-label">收货人电话：</label>
						<div class="col-sm-8">
							<input type="text" class="form-control" disabled="disabled"
								value="1888888888" />
						</div>
					</div>
				</form>
			</div>
			<div class="row sendlist">
				送货清单 <a href="shopCar"
					style="display: inline-block; float: right; margin-right: 50px; font-size: 14px; color: blue !important;">返回修改购物车</a>
			</div>
			<div class="bigDiv">

				<!--遍历显示book  -->
				<c:forEach items="${shopCarList }" var="shopCar">
					<div class="twoDiv row">
						<p style="padding: 10px 20px">商家：向鸿飞自营</p>
						<div class="col-md-3 column pic">
							<img
								src="./static/images/book_shopCart/${shopCar.book.getimage()}">
						</div>
						<div class="col-md-9  column order-message">

							<div class="row">
								<font class="col-md-3  column" color="red" size="3">${shopCar.book.getName() }</font>
								<font class="col-md-3  column">¥
									${shopCar.num*shopCar.book.getPrice()}</font> <font
									class="col-md-3  column">×${shopCar.num }</font> <font
									class="col-md-3  column" color="red">有货</font>
							</div>
							<div class="row">
								<img src="./static/images/sureLogo_14.png" alt=""><span>七天无理由退换货</span>
							</div>
							<div class="row">【赠品】 高级定制干花书签 随机 ×1</div>
						</div>
					</div>
				</c:forEach>
				<!-- <div class="col-md-3 column pic">
						<img src="./static/images/book_shopCart/book1.jpg">
					</div>
					<div class="col-md-9  column order-message">
						
						<div class="row">
							<font class="col-md-3  column" color="red" size="3">JAVA核心技术</font>
							<font class="col-md-3  column">¥ 81.00</font> <font
								class="col-md-3  column">×1</font> <font
								class="col-md-3  column" color="red">有货</font>
						</div>
						<div class="row">
							<img src="./static/images/sureLogo_14.png" alt=""><span>七天无理由退换货</span>
						</div>
						<div class="row">【赠品】 高级定制干花书签 随机 ×1</div>
					</div> -->

			</div>
		</div>
		<div class="allButtom">
			<p class="caozuo">
				<a href="end">订单确认</a>
			</p>
			<span>共<font id="book-num" style="color: #b11e22;">${bookNum}</font>件商品&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;应付：¥<font
				id="price-num" style="color: #b11e22;">${order.total }</font>元
			</span>
		</div>
	</div>

	<div class="footer">
		<div class="row clearfix icons">
			<div class="col-md-3 column">
				<img src="./static/images/icons/icon_1_17.png"> 品目繁多 愉悦购物
			</div>
			<div class="col-md-3 column">
				<img src="./static/images/icons/icon_1_20.png"> 正品保障 天天低价
			</div>
			<div class="col-md-3 column">
				<img src="./static/images/icons/icon_1_23.png"> 极速物流 特色定制
			</div>
			<div class="col-md-3 column">
				<img src="./static/images/icons/icon_1_25.png"> 优质服务 以客为尊
			</div>
		</div>
		<div class="links">
			<p>
				<span>关于我们</span>| <span>联系我们</span>| <span>加我我们</span>| <span>友情链接</span>
			</p>

			<img src="./static/images/police.png">
		</div>
	</div>
	</div>
</body>
</html>