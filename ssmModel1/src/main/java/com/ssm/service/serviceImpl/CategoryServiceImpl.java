package com.ssm.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.common.bean.Category;
import com.ssm.dao.mapperInterface.CategoryMapper;
import com.ssm.service.serviceInterface.CategoryService;

/**
* @author 向鸿飞 
* @version 创建时间：2020年4月13日 下午11:36:29
* 类说明
*/
@Service
public class CategoryServiceImpl implements CategoryService {
@Autowired
private CategoryMapper categoryMapper;

@Override
public List<Category> findAllCategory() {
	// TODO Auto-generated method stub
	List<Category> list = categoryMapper.selectAllCatesCategory();
	
	return list;
}


	
}
