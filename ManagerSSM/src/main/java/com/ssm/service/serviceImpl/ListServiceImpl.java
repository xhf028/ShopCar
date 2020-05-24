package com.ssm.service.serviceImpl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.bean.User;
import com.ssm.dao.mapperInterface.ListMapper;

/**
* @author 向鸿飞 
* @version 创建时间：2020年4月19日 下午2:07:43
* 类说明
*/
@Service
public class ListServiceImpl {

	@Autowired
	private ListMapper listMapper;

	
	public List<User> queryAllUser(){
		List<User> list = listMapper.queryAllUser();
		
		return list;
		

	}

	public List<User> queryUserByName(String name){
		List<User> list =listMapper.queryAllUserByName(name);
		return list;
	}
	
	public User queryUserById(int id){
		User user = listMapper.queryUserById(id);
		return user;
	}
	
	public void updateUser(User user){
		listMapper.updateUser(user);
	}
	
	public List<User> queryActionUser(){
		List<User> list = listMapper.queryActionUser();
		return list;
	}
	
	public List<User> queryUserByDeptId(int deptId){
		List<User> list = listMapper.queryUserByDeptId(deptId);
		return list;
	}
	
	
}
