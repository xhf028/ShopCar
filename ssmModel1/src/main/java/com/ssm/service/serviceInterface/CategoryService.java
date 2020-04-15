package com.ssm.service.serviceInterface;

import java.util.List;

import com.ssm.common.bean.Category;

/**
* @author 向鸿飞 
* @version 创建时间：2020年4月13日 下午11:35:17
* 类说明
*/
public interface CategoryService {

	public List<Category> findAllCategory();
}
