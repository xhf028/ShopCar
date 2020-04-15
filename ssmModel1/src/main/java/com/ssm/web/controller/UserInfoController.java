package com.ssm.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssm.common.bean.Customer;
import com.ssm.dao.mapperInterface.CustomerMapper;

/**
* @author 向鸿飞 
* @version 创建时间：2020年4月13日 下午9:28:02
* 类说明
*/
@Controller
public class UserInfoController {
	@Autowired
	private HttpSession session;
	@Autowired
	private CustomerMapper customerMapper;
	
	@RequestMapping("turnInfo")
	//修改用户个人信息
	public String turnInfo(@RequestParam String username,@RequestParam String password,
			@RequestParam String zip,@RequestParam String address,@RequestParam String phone,@RequestParam String email)
	{
		//获取用户输入的个人信息
		Customer customer = new Customer(username, password, zip, address, phone, email);
		//修改入库
		customerMapper.updateCustomer(customer);
		session.setAttribute("customer", customer);
		
		return "userinfo";
	}
	
	//展示个人信息
	@RequestMapping("userinfo")
	public String userInfo() {
		
		return "userinfo";
	}
	
}
