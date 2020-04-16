package com.ssm.service.serviceInterface;

import com.ssm.common.bean.Order;

/**
* @author 向鸿飞 
* @version 创建时间：2020年4月16日 上午11:56:39
* 类说明
*/
public interface OrderService {

	public void addOrder();
	
	public Order getOrderByCustomerId(int customerId);
}
