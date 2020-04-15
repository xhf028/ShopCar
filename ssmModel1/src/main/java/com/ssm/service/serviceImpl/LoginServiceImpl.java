package com.ssm.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.common.bean.Customer;
import com.ssm.dao.mapperInterface.CustomerMapper;


/**
* @author 向鸿飞 
* @version 创建时间：2020年4月13日 下午6:28:56
* 类说明
*/
@Service
public class LoginServiceImpl{

	@Autowired
	private CustomerMapper customerMapper;

	public Customer selectCustomerOne(Customer customer) {
		// TODO Auto-generated method stub
		//通过用户名进行数据库查询用户
		Customer customer2 = customerMapper.selectCustomer(customer.getUsername());
		if(customer2!=null) {				//找到用户
			System.out.println(customer2);
			if(customer.getPassword().equals(customer2.getPassword())) {	//验证密码，密码正确返回用户customer2
				return customer2;
			}
		}
		//未匹配到用户名密码则返回null
		return null;
	}

}
