package com.ssm.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssm.common.bean.Customer;
import com.ssm.service.serviceImpl.OrderServiceImpl;
import com.ssm.service.serviceImpl.ShopCarServiceImpl;

/**
* @author 向鸿飞 
* @version 创建时间：2020年4月14日 下午3:27:03
* 类说明
*/
@Controller
public class ShopCarController {

	@Autowired
	private HttpSession session;
	@Autowired
	private OrderServiceImpl orderService;
	@Autowired
	private ShopCarServiceImpl shopCarService;
	
	@RequestMapping("shopCar")
	public String getShopCar() {
		orderService.addOrder();
		return "shopCar";
	}
	
	@RequestMapping("toShopCar")
	public String toShopCar(@RequestParam int bookId) {
		Customer customer = (Customer) session.getAttribute("customer");
		shopCarService.addShopCar(customer, bookId);
		return "shopCar";
	}
}
