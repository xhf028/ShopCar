package com.ssm.service.serviceImpl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.bean.User;
import com.ssm.dao.mapperInterface.AddUserMapper;

/**
* @author 向鸿飞 
* @version 创建时间：2020年5月22日 下午5:23:13
* 类说明
*/
@Service
public class AddUserServiceImpl {

	@Autowired
	private AddUserMapper addUserMapper;
	@Autowired
	private HttpServletRequest request;
	
	public String insertUser(User user) {
		User user2 = addUserMapper.queryUserByUserName(user.getUsername());
		if(user2!=null) {
			request.setAttribute("error", "用户名已经存在");
			return "add";
		}else {
			addUserMapper.insertUser(user);
			return "addSucess";
		}
	}
}
