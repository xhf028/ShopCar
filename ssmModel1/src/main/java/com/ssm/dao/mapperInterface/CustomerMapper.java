package com.ssm.dao.mapperInterface;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.ssm.common.bean.Customer;

/**
* @author 向鸿飞 
* @version 创建时间：2020年4月12日 下午10:10:40
* 类说明
*/


public interface CustomerMapper {
	//通过用户名查询用户
	Customer selectCustomer(String username);
	
	//注册用户入库
	void insertCustomer(Customer customer);
	
	//修改用户
	void updateCustomer(Customer customer);
}
