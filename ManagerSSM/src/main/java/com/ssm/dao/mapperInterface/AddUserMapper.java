package com.ssm.dao.mapperInterface;

import com.ssm.bean.User;

/**
* @author 向鸿飞 
* @version 创建时间：2020年5月22日 下午5:23:47
* 类说明
*/
public interface AddUserMapper {

	//根据用户名查询用户
	public 	User queryUserByUserName(String username);
	  
	//插入用户
	public void  insertUser(User user) ;
}
