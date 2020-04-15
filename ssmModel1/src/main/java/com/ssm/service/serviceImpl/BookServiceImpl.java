package com.ssm.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.common.bean.Book;
import com.ssm.dao.mapperInterface.BookMapper;
import com.ssm.service.serviceInterface.BookService;

/**
* @author 向鸿飞 
* @version 创建时间：2020年4月13日 下午10:48:41
* 类说明
*/
@Service
public class BookServiceImpl  implements BookService{
@Autowired
private BookMapper bookMapper;

@Override
public List<Book> findAllBooks(){
	List<Book> list = bookMapper.selectAllBook();
	return list;
}


@Override
public List<Book> findBooksById(int categoryId) {
	// TODO Auto-generated method stub
	List<Book> list = bookMapper.selectBookById(categoryId);
	return list;
}


@Override
public Book findBookById(int bookId) {
	// TODO Auto-generated method stub
		Book book = bookMapper.selectBookByBookId(bookId);
	return book;
}


@Override
public List<Book> findBookLikeName(String name) {
	// TODO Auto-generated method stub
	List<Book> list = bookMapper.selectBookLikeName(name);
	return list;
}


}
