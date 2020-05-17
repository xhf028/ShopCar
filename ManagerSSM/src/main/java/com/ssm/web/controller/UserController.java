package com.ssm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author 向鸿飞 
* @version 创建时间：2020年5月17日 下午8:52:29
* 类说明
*/
@Controller
public class UserController {

	@RequestMapping("list")
	public String queryUser() {
		return "list";
		
	}
}
