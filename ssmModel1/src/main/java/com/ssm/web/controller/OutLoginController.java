package com.ssm.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author 向鸿飞 
* @version 创建时间：2020年4月14日 上午10:48:33
* 类说明
*/
/*
 * 退出登录，清空session
 */
@Controller
public class OutLoginController {

	@RequestMapping("outLogin")
	public String outLogin(HttpSession session) {
		session.invalidate();
		return "login";
	}
}
