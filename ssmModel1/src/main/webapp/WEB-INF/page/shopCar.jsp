<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getLocalPort()
			+ request.getContextPath() + "/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>" />
<title>briup-电子商务-购物车</title>
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
			<span><a href="index1">首页</a></span> <span><a href="shopCar">我的订单</a></span>
			<span><a href="outLogin">退出</a></span>
		</div>
	</div>

	<div class="head">
		<div class="row clearfix">
			<div class="col-md-6 column">
				<img src="./static/images/logo.png" class="logo">
			</div>
			<div class="col-md-6 column">
				<img src="./static/images/play_01.png" alt="">
			</div>
		</div>
	</div>
	<div class="nav">
		<div class="col-md-2 column  type">
			<span class="glyphicon glyphicon-briefcase"></span>&nbsp;&nbsp;&nbsp;我的书包
		</div>

		<div class="col-md-10 column marquee">
			<marquee scrollamount="3">
				<span class="glyphicon glyphicon-bullhorn">
					系统公告：本系统今晚十点进行系统升级，带来不便敬请谅解！</span>
			</marquee>
		</div>
	</div>
	<div class="body">
		<div class="table-shopCar">
			<div class="table_head row ">
				<span class="col-md-4 column">商品</span> <span
					class="col-md-2 column">单价(元)</span> <span class="col-md-3 column">数量</span>
				<span class="col-md-2 column">小计(元)</span> <span
					class="col-md-1 column">操作</span>
			</div>
			<div class="table_body ">
				
					<c:forEach items="${shopCarList}" var="shopCar">
					<div class="row">
						<div class="col-md-4 column">
							<img class="col-md-4 img-thumbnail"
								src="./static/images/book_shopCart/book1.jpg">
							<p class="col-md-8 bookname">${shopCar.book.getName() }</p>
						</div>
						<div class="col-md-2 column">${shopCar.book.getPrice()}</div>
						<div class="col-md-3 column booknum">
							<button class="btn btn-primary btn-sm add">
								<span class="glyphicon glyphicon-plus"></span>
							</button>
							<span class="btn value">${shopCar.num }</span>
							<button class="btn btn-primary btn-sm sub">
								<span class="glyphicon glyphicon-minus"></span>
							</button>
						</div>
						<div class="col-md-2 column">${shopCar.num*shopCar.book.getPrice()}</div>
						<div class="col-md-1 column">
							<button class="btn btn-danger" >
								<span class=" 	glyphicon glyphicon-trash"></span>
							</button>
						</div>
				</div>
				</c:forEach>
				<!-- <div class="row">
				 <div class="col-md-4 column">
					<img class="col-md-4 img-thumbnail"
						src="./static/images/book_shopCart/book1.jpg">
					<p class="col-md-8 bookname">javascript技术</p>
				</div>
				<div class="col-md-2 column">46</div>
				<div class="col-md-3 column booknum">
					<button class="btn btn-primary btn-sm add">
						<span class="glyphicon glyphicon-plus"></span>
					</button>
					<span class="btn value">1</span>
					<button class="btn btn-primary btn-sm sub">
						<span class="glyphicon glyphicon-minus"></span>
					</button>
				</div>
				<div class="col-md-2 column">46</div>
				<div class="col-md-1 column">
					<button class="btn btn-danger">
						<span class=" 	glyphicon glyphicon-trash"></span>
					</button>
				</div>
			</div>  -->
			<!-- <div class="row">
				<div class="col-md-4 column">
					<img class="col-md-4 img-thumbnail"
						src="./static/images/book_shopCart/book1.jpg">
					<p class="col-md-8 bookname">javascript技术</p>
				</div>
				<div class="col-md-2 column">46</div>
				<div class="col-md-3 column booknum">
					<button class="btn btn-primary btn-sm add">
						<span class="glyphicon glyphicon-plus"></span>
					</button>
					<span class="btn value">1</span>
					<button class="btn btn-primary btn-sm sub">
						<span class="glyphicon glyphicon-minus"></span>
					</button>
				</div>
				<div class="col-md-2 column">46</div>
				<div class="col-md-1 column">
					<button class="btn btn-danger">
						<span class=" 	glyphicon glyphicon-trash"></span>
					</button>
				</div> -->
			</div>
		</div>
	</div>
	<div class="allButtom">
		<p class="caozuo">
			<a href="toConfirm">去结算</a>
		</p>
		<span>已选择<font id="book-num" style="color: #b11e22;">2</font>件商品&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;总价(不含运费)：¥<font
			id="price-num" style="color: #b11e22;"> 199.0</font>元
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