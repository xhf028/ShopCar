package com.ssm.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssm.bean.User;
import com.ssm.service.serviceImpl.LoginServiceImpl;


/**
* @author 向鸿飞 
* @version 创建时间：2020年4月18日 下午7:49:13
* 类说明
*/
@Controller
public class LoginController {

	@Autowired
	private LoginServiceImpl loginService;
	@Autowired
	private HttpServletRequest request;
	
	@RequestMapping("login")
	public String getLogin() {
		
		return "login";
	}
	
	/*
	 * 验证登录verifyLogin
	 */
	@RequestMapping("veriyLogin")
	public String veriyLogin(@RequestParam String username,@RequestParam String password) {
		//首先判断用户输入用户名密码不能为空，为空重新登录
		if("".equals(username) || "".equals(password)) {
			request.setAttribute("error", "用户名或密码不能为空！");
			return "login";
		}
		//设置一个临时用户存储用户输入的密码
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		//将用户传入loginservice进行验证
		String url = loginService.verifyLogin(user);
		return url;
	}
}
