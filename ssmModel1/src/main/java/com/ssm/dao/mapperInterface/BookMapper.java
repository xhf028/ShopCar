package com.ssm.dao.mapperInterface;

import java.util.List;

import com.ssm.common.bean.Book;

/**
* @author 向鸿飞 
* @version 创建时间：2020年4月13日 下午10:42:01
* 类说明
*/
public interface BookMapper {
	//查询全部书籍信息
	List<Book> selectAllBook();
	
	//通过书籍分类ID查询书籍
	List<Book> selectBookById(int id);

	//通过书籍id查询书籍
	Book selectBookByBookId(int id);
	
	//根据书籍部分名称查询书籍（模糊查询）
	List<Book> selectBookLikeName(String name);
}


