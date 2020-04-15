package com.ssm.common.bean;

import java.util.List;

/**
* @author 向鸿飞 
* @version 创建时间：2020年4月13日 下午11:27:56
* 类说明
*/
public class Category {
private int id ;		//种类id
private String name;	//类名
private int fatherId;	//父类id
private List<Category> categoryList;

public List<Category> getCategoryList() {
	return categoryList;
}
public void setCategoryList(List<Category> categoryList) {
	this.categoryList = categoryList;
}
public Category(int id, String name, int fatherId) {
	super();
	this.id = id;
	this.name = name;
	this.fatherId = fatherId;
}
public Category() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getFatherId() {
	return fatherId;
}
public void setFatherId(int fatherId) {
	this.fatherId = fatherId;
}
@Override
public String toString() {
	return "Category [id=" + id + ", name=" + name + ", fatherId=" + fatherId + "]";
}



}
