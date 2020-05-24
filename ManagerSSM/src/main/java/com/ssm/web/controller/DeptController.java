package com.ssm.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssm.bean.Dept;
import com.ssm.service.serviceImpl.DeptServiceImpl;

/**
* @author 向鸿飞 
* @version 创建时间：2020年5月22日 下午11:57:59
* 类说明
*/
@Controller
public class DeptController {

	@Autowired
	private DeptServiceImpl deptService;
	@Autowired
	private HttpSession session;
	@Autowired
	private HttpServletRequest request;
	
	@RequestMapping("deptList")
	public String deptList() {
		List<Dept> list = deptService.queryAllDept();
		session.setAttribute("deptList", list);
		return "deptList";
	}
	
	@RequestMapping("queryLikeDept")
	public String queryLikeDept(@RequestParam String name) {
		List<Dept> list = deptService.queryLikeDept(name);
		request.setAttribute("deptLikeList", list);
		return "deptLikeList";
	}
}
