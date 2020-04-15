package com.ssm.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.common.bean.Customer;
import com.ssm.common.bean.ShopCar;
import com.ssm.dao.mapperInterface.ShopCarMapper;
import com.ssm.service.serviceInterface.ShopCarService;

/**
* @author 向鸿飞 
* @version 创建时间：2020年4月14日 下午4:07:22
* 类说明
*/
@Service
public class ShopCarServiceImpl implements ShopCarService{

	@Autowired
	private ShopCarMapper shopCarMapper;
	@Override
	public void addShopCar(Customer customer, int bookId) {
		// TODO Auto-generated method stub
		ShopCar shopCar = shopCarMapper.verifyExsitInfo(customer.getId(), bookId);
		if(shopCar==null) {
			ShopCar shopCar1 = new ShopCar(customer.getId(), bookId, 1);
			shopCarMapper.insertShopCar(shopCar1);
		}else {
			shopCarMapper.addNumShopCar(shopCar.getId());
			
		}
		
	}

}
