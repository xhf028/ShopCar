package com.ssm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
