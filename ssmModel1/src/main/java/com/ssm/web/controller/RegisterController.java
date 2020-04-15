package com.ssm.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssm.common.bean.Customer;
import com.ssm.common.util.PasswordUtilMD5;
import com.ssm.service.serviceImpl.LoginServiceImpl;
import com.ssm.service.serviceImpl.RegisterServiceImpl;
import com.ssm.service.serviceInterface.RegisterService;

/**
* @author 向鸿飞 
* @version 创建时间：2020年4月13日 下午8:04:25
* 类说明
*/
@Controller
public class RegisterController {
	@Autowired
	private HttpSession session;
	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	 private RegisterServiceImpl registerServiceImpl;
	
	//注册界面
	@RequestMapping("register")
	public String getRegister() {
		return "register";
	}
	//验证注册信息
		@RequestMapping("registerLogin")
		public String verifyRegister(@RequestParam String username,@RequestParam String password,@RequestParam String zip,@RequestParam String address,@RequestParam String phone,@RequestParam String email) {
			//注册用户判断是否输入用户密码
			if(username.equals("") || password.equals("")) {
				request.setAttribute("error1","用户名密码不能为空");
				return "register";
			}
			//获取输入用户
			Customer customer = registerServiceImpl.selectCustomerByUserName(username);
			//判断数据库中是否存在
			if(customer!=null) {
				request.setAttribute("error1","用户名已存在");
				return "register";
			}
		/*
		 * 注册用户并插入数据库
		 * 先对密码进行加密
		 */
			String passwordMD5 = PasswordUtilMD5.addLockForPassword(password);
			
			registerServiceImpl.registerCustomer(new Customer(username, passwordMD5, zip, address, phone, email));
			
			return "login";
		}
}
