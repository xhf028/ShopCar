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
* @version 创建时间：2020年4月14日 下午12:39:19
* 类说明
*/
@Controller
public class SearchBookController {
	@Autowired
	private HttpServletRequest request;
	@Autowired
	public BookServiceImpl bookService;
	/*
	 * 通过模糊查询跳转list界面
	 */
@RequestMapping("search")
public String likeSearch(@RequestParam String bookName) {
	List<Book> list = bookService.findBookLikeName(bookName);
	request.setAttribute("bookList", list);
	return "list";
}
}
