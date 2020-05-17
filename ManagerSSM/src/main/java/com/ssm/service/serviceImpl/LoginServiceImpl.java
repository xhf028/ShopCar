package com.ssm.service.serviceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.bean.User;
import com.ssm.dao.mapperInterface.UserMapper;

/**
* @author 向鸿飞 
* @version 创建时间：2020年4月19日 下午2:08:38
* 类说明
*/
@Service
public class LoginServiceImpl {

	@Autowired
	private  UserMapper userMapper;

	
	@Autowired
	private HttpSession session;
	@Autowired
	private HttpServletRequest request;
	
	//验证登录
	public String verifyLogin(User user) {
		User user2 = userMapper.selectUserByUserName(user.getUsername());
		if(user2!=null) {
			if(user.getPassword().equals(user2.getPassword())) {
				session.setAttribute("user", user2);
				return "index";
			}
		}
		request.setAttribute("error", "用户名密码错误！");
		return "login";
	}
}
