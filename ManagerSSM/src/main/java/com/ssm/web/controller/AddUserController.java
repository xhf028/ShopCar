package com.ssm.web.controller;

import java.sql.Date;
import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssm.bean.User;
import com.ssm.service.serviceImpl.AddUserServiceImpl;

/**
 * @author 向鸿飞
 * @version 创建时间：2020年5月22日 下午5:21:56 类说明
 */
@Controller
public class AddUserController {

	@Autowired
	private AddUserServiceImpl addUserService;

	@RequestMapping("add")
	public String addUser() {
		return "add";
	}

	@RequestMapping("insertUser")
	public String insertUser(@RequestParam String username, @RequestParam String name, @RequestParam String password,
			@RequestParam String email, @RequestParam String phone, @RequestParam Date birthday) {
		System.out.println(
				"************************************" + username + name + password + email + phone + birthday);
		User user = new User(username, password, name, phone, email, new Timestamp(birthday.getTime()));
		String url = addUserService.insertUser(user);

		return url;
	}

}
