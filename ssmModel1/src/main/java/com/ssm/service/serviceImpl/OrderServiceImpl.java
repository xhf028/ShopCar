package com.ssm.service.serviceImpl;

import java.sql.Timestamp;
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
import com.ssm.dao.mapperInterface.OrderMapper;
import com.ssm.dao.mapperInterface.ShopCarMapper;
import com.ssm.service.serviceInterface.OrderService;

/**
 * @author 向鸿飞
 * @version 创建时间：2020年4月16日 上午11:57:38 类说明
 */
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private ShopCarMapper shopCarMapper;

	@Autowired
	private OrderMapper orderMapper;

	@Autowired
	private HttpSession session;
	@Autowired
	private HttpServletRequest request;

	private Log log = new LogImpl();

	@Override
	public void addOrder() {
		// TODO Auto-generated method stub
		Customer customer = (Customer) session.getAttribute("customer");
		// ShopCar shopCar = new ShopCar();
		Order order = orderMapper.selectOrderByCustomerId(customer.getId());
		int bookNum=0;
		if (order == null) {
			double total = 0;

			List<ShopCar> shopCarList = shopCarMapper.getShopCarByCustomerId(customer.getId());

			// List<Book> bookList = new ArrayList<Book>();
			for (ShopCar sc : shopCarList) {
				Book book = sc.getBook();

				total += book.getPrice() * sc.getNum();
				bookNum=bookNum+sc.getNum();

			}

			session.setAttribute("shopCarList", shopCarList);
			session.setAttribute("bookNum", bookNum);
			order =new Order(total, new Timestamp(System.currentTimeMillis()), customer.getId());
			session.setAttribute("order", order);
			orderMapper.insertOrder(order);
		}else {
			double total = 0;
			List<ShopCar> shopCarList = shopCarMapper.getShopCarByCustomerId(customer.getId());
			for (ShopCar sc : shopCarList) {
				Book book = sc.getBook();
				total += book.getPrice() * sc.getNum();
				bookNum=bookNum+sc.getNum();
			}
			session.setAttribute("shopCarList", shopCarList);
			session.setAttribute("bookNum", bookNum);
			order.setTotal(total);
			session.setAttribute("order", order);
			orderMapper.updateOrderByCustomerId(order);
		}

	}

	@Override
	public Order getOrderByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
