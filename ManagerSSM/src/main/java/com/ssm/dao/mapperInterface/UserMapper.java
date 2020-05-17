package com.ssm.dao.mapperInterface;

import com.ssm.bean.User;

/**
* @author 向鸿飞 
* @version 创建时间：2020年4月19日 下午1:50:18
* 类说明		user映射接口
*/
public interface UserMapper {

	//通过用户名查询用户
	public User selectUserByUserName(String username);
}
