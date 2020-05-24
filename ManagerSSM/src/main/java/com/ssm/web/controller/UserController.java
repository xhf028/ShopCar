package com.ssm.web.controller;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssm.bean.User;
import com.ssm.dao.mapperInterface.ListMapper;
import com.ssm.service.serviceImpl.ListServiceImpl;

/**
 * @author 向鸿飞
 * @version 创建时间：2020年5月17日 下午8:52:29 类说明
 */
@Controller
public class UserController {

	@Autowired
	private ListServiceImpl listService;
	@Autowired
	private HttpSession session;
	@Autowired
	private HttpServletRequest request;
	@RequestMapping("list")
	public String queryUser() {

		List<User> list = listService.queryAllUser();
		session.setAttribute("userList", list);
		System.out.println("************************************"+list);
		return "list";
		
	}
	
	@RequestMapping("queryList")
	public String likeQueryUserByName(@RequestParam String content) {
		List<User> list = listService.queryUserByName(content);
		request.setAttribute("likeList", list);
		System.out.println("************************************"+list);
		return "queryList";
	}
	
	@RequestMapping("userInfo")
	public String  userInfo() {
		return "userInfo";
		
	}
	@RequestMapping("changeUserInfo")
	public String changeUserInfo(@RequestParam int id) {
		User user = listService.queryUserById(id);
		request.setAttribute("user2", user);
		return "changeUserInfo";
	}
	
	@RequestMapping("updateUser")
	public String updateUser(@RequestParam int id,@RequestParam String username, @RequestParam String name, @RequestParam String password,
			@RequestParam String email, @RequestParam String phone, @RequestParam String state,@RequestParam int status) {
/*		Timestamp birthday2 = Timestamp.valueOf(birthday);
		Timestamp intoDate2 = Timestamp.valueOf(intoDate);*/
		User user = new User(id, username, password, name, phone, email, null, null, state, status);
		System.out.println(user);
		listService.updateUser(user);
		return "addSucess";
	}
	
	@RequestMapping("selectActionUser")
	public String deleteUser() {
		List<User> list = listService.queryActionUser();
		session.setAttribute("actionUserList", list);
		return "actionUser";
	}
	
	@RequestMapping("querySameDept")
	public String querySameDept() {
		User user = (User)session.getAttribute("user");
		List<User> list = listService.queryUserByDeptId(user.getDeptId());
		request.setAttribute("sameList", list);
		return "sameDept";
	}
	
	@RequestMapping("outLogin")
	public String outLogin() {
		session.invalidate();
		return "login";
	}
	

}
