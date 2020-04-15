package com.ssm.service.serviceInterface;

import java.util.List;

import com.ssm.common.bean.Book;

/**
* @author 向鸿飞 
* @version 创建时间：2020年4月13日 下午10:53:52
* 类说明
*/
/*
 * 书籍信息处理
 */
public interface BookService {
	//查询全部书籍
	public List<Book> findAllBooks();
	
	//根据类别id查询书籍
	public List<Book> findBooksById(int categoryId);
	
	//根据书籍id查询书籍
	public Book findBookById(int bookId);
	
	//模糊查询根据书籍部分名称查询
	public List<Book> findBookLikeName(String name);
}
