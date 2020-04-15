package com.ssm.dao.mapperInterface;

import com.ssm.common.bean.ShopCar;

/**
* @author 向鸿飞 
* @version 创建时间：2020年4月14日 下午4:02:50
* 类说明
*/
public interface ShopCarMapper {

	//查询是否存在订单
	public ShopCar verifyExsitInfo(int customerId,int bookId);
	
	//将购物车信息插入数据库
	public void insertShopCar(ShopCar shopCar);
	
	//购物信息已存在则添加num
	public void addNumShopCar(int id);
}
