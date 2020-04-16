package com.ssm.dao.mapperInterface;

import com.ssm.common.bean.Order;

/**
* @author 向鸿飞 
* @version 创建时间：2020年4月15日 下午11:54:18
* 类说明
*/
public interface OrderMapper {

	//插入订单
	void insertOrder(Order order);
	//根据顾客ID查询订单
	Order selectOrderByCustomerId(int customerId);
	
	void updateOrderByCustomerId(Order order);
}
