package com.ssm.dao.mapperInterface;

import java.util.List;

import com.ssm.bean.User;

/**
 * @author 向鸿飞
 * @version 创建时间：2020年5月22日 下午1:03:15 类说明
 */
public interface ListMapper {

	// 查询所有用户
	public List<User> queryAllUser();

	// 根据姓名模糊查询部分用户
	public List<User> queryAllUserByName(String name);

	// 根据ID查询用户
	public User queryUserById(int id);
	
	//更改用户信息
	public void updateUser(User user);
	//查询所有活动用户
	public List<User> queryActionUser();
	
	//根据部门ID查询员工
	public List<User> queryUserByDeptId(int deptId);
}
