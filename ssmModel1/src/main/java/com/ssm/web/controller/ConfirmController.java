package com.ssm.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
* @author 向鸿飞 
* @version 创建时间：2020年4月14日 下午7:08:52
* 类说明
*/
@Controller
public class ConfirmController {
	@RequestMapping("toConfirm")
	public String toConfirm() {
		
		return "confirm";
	}
}
