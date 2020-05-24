package com.ssm.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.bean.Dept;
import com.ssm.dao.mapperInterface.DeptMapper;

/**
* @author 向鸿飞 
* @version 创建时间：2020年5月23日 上午12:09:01
* 类说明
*/
@Service
public class DeptServiceImpl {

	@Autowired
	private DeptMapper deptMapper;
	
	public List<Dept> queryAllDept(){
		
		List<Dept> list = deptMapper.queryAllDept();
		return list;
	}
	
	public List<Dept> queryLikeDept(String name){
		List<Dept> list = deptMapper.queryDeptByName(name);
		return list;
	}
	
	public Dept queryDeptById(int id) {
		Dept dept = deptMapper.queryDeptById(id);
		return dept;
		
	}
}
