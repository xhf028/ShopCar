package com.ssm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author 向鸿飞 
* @version 创建时间：2020年5月17日 下午8:56:25
* 类说明
*/
@Controller
public class IndexController {

	@RequestMapping("index")
	public String getIndex() {
		
		return "index";
	}
}
