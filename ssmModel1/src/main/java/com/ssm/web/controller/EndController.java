package com.ssm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author 向鸿飞 
* @version 创建时间：2020年4月16日 下午2:30:10
* 类说明
*/
@Controller
public class EndController {

	@RequestMapping("end")
	public String allEnd() {
		
		return "json";
	}
}
