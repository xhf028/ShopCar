package com.ssm.service.serviceImpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.common.bean.Customer;
import com.ssm.dao.mapperInterface.CustomerMapper;
import com.ssm.service.serviceInterface.RegisterService;

/**
* @author 向鸿飞 
* @version 创建时间：2020年4月13日 下午8:17:06
* 类说明
*/
@Service
public class RegisterServiceImpl implements RegisterService{
	@Autowired
	private CustomerMapper customerMapper;
	
	@Override
	//根据用户名查询用户
	public Customer selectCustomerByUserName(String username) {
		Customer customer = customerMapper.selectCustomer(username);
		return customer;
	}

	@Override
	//注册插入数据库
	public void registerCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerMapper.insertCustomer(customer);
		
	}

	
}

