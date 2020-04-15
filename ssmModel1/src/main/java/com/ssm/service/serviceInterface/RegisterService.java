package com.ssm.service.serviceInterface;

import com.ssm.common.bean.Customer;

/**
* @author 向鸿飞 
* @version 创建时间：2020年4月13日 下午8:19:32
* 类说明
*/
public interface RegisterService {
	//通过用户名查找对象
	public Customer selectCustomerByUserName(String username);
	
	public void  registerCustomer(Customer customer);
}
