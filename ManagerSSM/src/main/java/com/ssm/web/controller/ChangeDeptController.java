package com.ssm.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssm.bean.Dept;
import com.ssm.service.serviceImpl.DeptServiceImpl;

/**
* @author 向鸿飞 
* @version 创建时间：2020年5月23日 上午12:46:45
* 类说明
*/
@Controller
public class ChangeDeptController {
	
	@Autowired
	private DeptServiceImpl deptService;
	@Autowired
	private HttpServletRequest request;
	
	
	@RequestMapping("changeDept")
	public String changeDept(@RequestParam int id) {
		Dept dept = deptService.queryDeptById(id);
		request.setAttribute("dept", dept);
		return "changeDept";
	}
}
