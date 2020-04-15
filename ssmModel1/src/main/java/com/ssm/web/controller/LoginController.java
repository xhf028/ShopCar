package com.ssm.web.controller;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssm.common.bean.Book;
import com.ssm.common.bean.Category;
import com.ssm.common.bean.Customer;
import com.ssm.common.util.LogImpl;
import com.ssm.common.util.PasswordUtilMD5;
import com.ssm.common.util.interfaces.Log;

import com.ssm.service.serviceImpl.BookServiceImpl;
import com.ssm.service.serviceImpl.CategoryServiceImpl;
import com.ssm.service.serviceImpl.LoginServiceImpl;
import com.ssm.service.serviceInterface.BookService;





/*
 * 用户登录界面
 */
@Controller
public class LoginController {
	@Autowired
	private LoginServiceImpl loginServiceImpl;
	@Autowired
	private ServletContext application;
	@Autowired
	private BookServiceImpl bookServiceImpl;
	@Autowired
	private CategoryServiceImpl categoryServiceImpl;
	@Autowired
	private HttpServletRequest request;
	
	private Log log = new LogImpl();
	
	/*
	 * 登录界面，初始化页面信息
	 */
	@RequestMapping("login")
	public String getLogin() {
	//	List<Book> list = bookServiceImpl.findAllBooks();
	//	System.out.println(list);
		List<Category> list2 = categoryServiceImpl.findAllCategory();

		//System.out.println(list2);
	//	application.setAttribute("books", list);
		application.setAttribute("categorys", list2);
		log.info("初始化界面成功");
		String str = PasswordUtilMD5.addLockForPassword("ajkdbakwbdkb");
		log.info("加密过后的密码："+str);
		return "login";
	}

	
	
	
	@RequestMapping("index")
	//验证登录
	public String	verifyLogin(@RequestParam String username,@RequestParam String password,HttpSession session) {
		if(username.equals("") || password.equals("")) {
			request.setAttribute("error", "用户或密码不能为空");
			return "login";
		}
		Customer customer = new Customer();
		System.out.println(customer);
		//获取输入的用户名
		customer.setUsername(username);
		//获取输入的密码并对密码加密
		String passwordMD5 = PasswordUtilMD5.addLockForPassword(password);
		customer.setPassword(passwordMD5);
		//进行验证
		//验证正确返回customer2否则返回空
		Customer customer2 = loginServiceImpl.selectCustomerOne(customer);
		
		if(customer2!=null) {	//
			//登录成功
			session.setAttribute("customer", customer2);
			return "index";
			
		}
		//登录失败
		request.setAttribute("error", "用户或密码错误");
		return "login";
	}
	
	@RequestMapping("index1")
	public String getIndex() {
		return "index";
	}

	
}
