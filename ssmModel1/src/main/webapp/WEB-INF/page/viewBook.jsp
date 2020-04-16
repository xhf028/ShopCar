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
<title>briup-电子商务-书籍详情</title>
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
			<span><a href="index">首页</a></span> <span><a href="userinfo">个人信息</a></span>
			<span><a href="shopCar">我的订单</a></span> <span><a
				href="outLogin">退出</a></span>
		</div>
	</div>

	<div class="head">
		<div class="row clearfix">
			<div class="col-md-3 column">
				<img src="./static/images/logo.png" class="logo">
			</div>
			<form action="search">
				<div class="col-md-6 column">
					<div class="input-group search">
						<input type="text" name="bookName" class="form-control"
							placeholder="请输入你要检索的书名" style="padding: 20px"> <span
							class="input-group-btn">
							<button class="btn btn-estore" type="submit">
								<span class="glyphicon glyphicon-search"></span>
							</button>
						</span>
					</div>
				</div>
			</form>
			<div class="col-md-3 column bag">
				<a href="shopCar">
					<button class="btn btn-estore">
						<span class="glyphicon glyphicon-briefcase"> </span>&nbsp;我的书包
					</button>
				</a>
			</div>
		</div>
	</div>
	<div class="nav">
		<div class="col-md-2 column  type" data-toggle="collapse"
			href="#typeMenu">
			<span class="glyphicon glyphicon-th"></span>&nbsp;&nbsp;&nbsp;全部图书分类
		</div>

		<div class="col-md-10 column marquee">
			<marquee scrollamount="3">
				<span class="glyphicon glyphicon-bullhorn">
					系统公告：本系统今晚十点进行系统升级，带来不便敬请谅解！</span>
			</marquee>
		</div>
	</div>
	<div class="body">
		<div class="type-box row clearfix collapse on " id="typeMenu">
			<c:forEach items="${categorys}" var="cate">
				<dl>
					<dt>${cate.name}:</dt>
					<c:forEach items="${cate.categoryList }" var="cate2">
						<dd>
							<a href="toList?cateid=${cate2.id }">${cate2.name }</a>
						</dd>
					</c:forEach>

				</dl>
			</c:forEach>

		</div>
		<div class="row clearfix">
			<ul class="breadcrumb">
				<li><a href="index1">首页</a></li>
				<li>书籍详情</li>
				<li class="active">${viewBook.name }</li>
			</ul>
		</div>
		<div class="viewbook row">

			<div class="col-md-5 column pic">
				<div class="big-image row">
					<img class="img-thumbnail"
						src="./static/images/book_view/${viewBook.image }">
				</div>
				<div class="row small-image">
					<div class="col-sm-6 col-md-3">
						<img class="img-thumbnail hover"
							src="./static/images/book_view/${viewBook.image }">

					</div>
					<div class="col-sm-6 col-md-3">
						<img class="img-thumbnail"
							src="./static/images/book_view/${viewBook.image }">

					</div>
					<div class="col-sm-6 col-md-3">
						<img class="img-thumbnail"
							src="./static/images/book_view/${viewBook.image }">

					</div>
					<div class="col-sm-6 col-md-3">
						<img class="img-thumbnail"
							src="./static/images/book_view/${viewBook.image }">

					</div>
				</div>

			</div>

			<div class="col-md-5 column book-message">
				<div class="row bookname">
					<label class="col-md-3 column">书名：</label> <span>${viewBook.name }</span>
				</div>
				<div class="row bg-warning book-price">
					<label class="col-md-3 column">书价：</label> <span>${viewBook.price }</span>
				</div>
				<div class="row">
					<label class="col-md-3 column">服务：</label> <img
						src="./static/images/icons/service_03.png"> <small>分期付款</small>
					<img src="./static/images/icons/service_05.png"> <small>免运费</small>
					<img src="./static/images/icons/service_07.png"> <small>送货上门</small>
					<img src="./static/images/icons/service_09.png"> <small>7天无理由退换</small>
				</div>
				<hr>
				<div class="row">
					<div id="box">
						<dl>
							<dt class="col-md-3 column">包装：</dt>
							<dd class="active">简单装</dd>
							<dd>升级装</dd>
							<dd>精品装</dd>
							<dd>至尊装</dd>
						</dl>
					</div>
				</div>
				<div class="row">

					<button class="col-md-5 column btn btn-estore"
						onclick="addShopCar('${customer}','${viewBook.id}')">加入书包</button>

					<p class="col-md-2 column"></p>
					<a href="shopCar">
						<button class="col-md-5 column btn btn-shopCar">立即购买</button>
					</a>
				</div>
			</div>

		</div>
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