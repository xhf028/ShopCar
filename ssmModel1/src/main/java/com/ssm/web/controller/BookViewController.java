package com.ssm.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssm.common.bean.Book;
import com.ssm.service.serviceImpl.BookServiceImpl;

/**
* @author 向鸿飞 
* @version 创建时间：2020年4月14日 上午10:53:08
* 类说明
*/
/*
 * 书籍信息
 */
@Controller
public class BookViewController {
	@Autowired
	private BookServiceImpl bookService;
	@Autowired
	private HttpServletRequest request;
	
	/*
	 *	根据类别ID获取书籍，存入request返回到list.jsp界面
	 */
	@RequestMapping("toList")
	public String getListPage(@RequestParam int cateid) {
		List<Book> list = bookService.findBooksById(cateid);
		request.setAttribute("bookList", list);
		return "list";
	}
	
	@RequestMapping("viewBook")
	public String bookDetails(@RequestParam int bookId) {
		Book book = bookService.findBookById(bookId);
		request.setAttribute("viewBook", book);
		return "viewBook";
	}
}
