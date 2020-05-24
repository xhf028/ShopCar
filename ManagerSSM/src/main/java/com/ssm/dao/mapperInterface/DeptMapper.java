package com.ssm.dao.mapperInterface;

import java.util.List;

import com.ssm.bean.Dept;

/**
* @author 向鸿飞 
* @version 创建时间：2020年5月23日 上午12:04:45
* 类说明
*/
public interface DeptMapper {

	//查询所有部门
	public List<Dept> queryAllDept();
	
	//模糊查询部门根据部门名称
	public List<Dept> queryDeptByName(String name);
	
	//根据ID查询部门
	public Dept queryDeptById(int id);
}
