package com.ssm.dao.mapperInterface;

import java.util.List;

import com.ssm.common.bean.Category;

/**
* @author 向鸿飞 
* @version 创建时间：2020年4月13日 下午11:31:00
* 类说明
*/
public interface CategoryMapper {
	//查询全部类别信息
	List<Category> selectAllCategory();
	
	//
	List<Category> selectAllCatesCategory();
}
