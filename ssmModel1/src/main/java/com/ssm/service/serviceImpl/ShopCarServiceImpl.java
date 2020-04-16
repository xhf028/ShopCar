package com.ssm.service.serviceImpl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.common.bean.Book;
import com.ssm.common.bean.Customer;
import com.ssm.common.bean.Order;
import com.ssm.common.bean.ShopCar;
import com.ssm.common.util.LogImpl;
import com.ssm.common.util.interfaces.Log;
import com.ssm.dao.mapperInterface.BookMapper;
import com.ssm.dao.mapperInterface.OrderMapper;
import com.ssm.dao.mapperInterface.ShopCarMapper;
import com.ssm.service.serviceInterface.ShopCarService;

/**
 * @author 向鸿飞
 * @version 创建时间：2020年4月14日 下午4:07:22 类说明
 */
@Service
public class ShopCarServiceImpl implements ShopCarService {

	@Autowired
	private ShopCarMapper shopCarMapper;

	@Autowired
	private OrderMapper orderMapper;

	@Autowired
	private HttpSession session;
	@Autowired
	private HttpServletRequest request;
	
	private Log log =new LogImpl();

	@Override
	public void addShopCar(Customer customer, int bookId) {
		// TODO Auto-generated method stub
		ShopCar shopCar = shopCarMapper.verifyExsitInfo(customer.getId(), bookId);
		if (shopCar == null) {
			ShopCar shopCar1 = new ShopCar(customer.getId(), bookId, 1);
			shopCarMapper.insertShopCar(shopCar1);
		} else {
			shopCarMapper.addNumShopCar(shopCar.getId());

		}

	}

/*	@Override
	public void addOrder() {
		// TODO Auto-generated method stub
		Customer customer = (Customer) session.getAttribute("customer");
		//ShopCar shopCar = new ShopCar();
		

		double total = 0;
		
		List<ShopCar> shopCarList = shopCarMapper.getShopCarByCustomerId(customer.getId());

		//List<Book> bookList = new ArrayList<Book>();
		for (ShopCar sc:shopCarList) {
			Book book = sc.getBook();

			total += book.getPrice() * sc.getNum();
			
			
		}
	log.info("***************************"+total);
		request.setAttribute("shopCarList", shopCarList);

		Order order = new Order(total, new Timestamp(System.currentTimeMillis()), customer.getId());
		orderMapper.insertOrder(order);

	}*/

}
