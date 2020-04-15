$(function(){
	$('.carousel').carousel({

		interval: 3000

	})
	$('.collapse').first().removeClass('on');
	$('.collapse').first().addClass('in');
	
	$('.body .menu ul li').click(function(){
		$('.collapse').removeClass('in');
		var text=$(this).attr('herf');
		$(text).addClass('in');
	});
	$('.booknum').on('click',function(event){
		console.log('start');
		if($(event.target).is($('.add'))) {
			var value=$(this).find('.value');
			var num=parseInt(value.text());
			value.text(num+1);
			
		}else if($(event.target).is($('.sub'))) {
			var value=$(this).find('.value');
			var num=parseInt(value.text());
			value.text(num-1);
			
		}
	});
	$('.viewbook .book-message #box dd').click(function(){
		$('.viewbook .book-message #box dd').removeClass('active');
		$(this).addClass('active');
	});
	$('#typeMenu').collapse('hide')
	
})
/*function searchbook(){
	var name = $("#bookName").val();
	
	console.log(name);
	window.location.href="search?bookName="+name;
	$.ajax({
		type:"post",
		url:"search",
		data:{'bookName' : $("#bookName").val() },
		sucess:function(data){
			alter('sucess')
			$.html(data);
		},
		error:function(){
			alter('error')
		}
	
	})
}*/
function addShopCar(customer,bookId){
	console.log(customer)
	console.log(bookId)
	if(customer==""){
		alert("请先登录！")
	}else{
		$.ajax({
			type:"get",
			url:"toShopCar?bookId="+bookId,
			success:function(){
				alert("添加购物车成功！")
			},error:function(){
				alert("添加购物车失败！")
			}
		})
	}
	
}
