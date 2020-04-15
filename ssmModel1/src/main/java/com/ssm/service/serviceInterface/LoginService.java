package com.ssm.service.serviceInterface;

import org.springframework.stereotype.Service;

import com.ssm.common.bean.Customer;

/**
* @author 向鸿飞 
* @version 创建时间：2020年4月13日 下午6:29:20
* 类说明
*/

public interface LoginService {

	Customer selectCustomerOne(Customer customer);
}
