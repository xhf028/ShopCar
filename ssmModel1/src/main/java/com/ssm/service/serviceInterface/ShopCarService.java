package com.ssm.service.serviceInterface;

import com.ssm.common.bean.Customer;

/**
* @author 向鸿飞 
* @version 创建时间：2020年4月14日 下午4:05:37
* 类说明
*/
public interface ShopCarService {

	public void addShopCar(Customer customer,int bookId);
	
	public void addOrder();
}
