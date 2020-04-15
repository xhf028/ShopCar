package com.ssm.common.bean;
/**
* @author 向鸿飞 
* @version 创建时间：2020年4月13日 下午10:39:48
* 类说明
*/
public class Book {
private int id;			//书籍id
private String name;	//书籍名称
private double price;	//书籍价格
private int categoryId;	//书籍类型
private String image;	//书籍图片路径
public Book(int id, String name, double price, int catgoryId, String image) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.categoryId = catgoryId;
	this.image = image;
}
public Book(String name, double price, int categoryId, String image) {
	super();
	this.name = name;
	this.price = price;
	this.categoryId = categoryId;
	this.image = image;
}
public Book() {
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
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getCategoryId() {
	return categoryId;
}
public void setCatgoryId(int categoryId) {
	this.categoryId = categoryId;
}
public String getimage() {
	return image;
}
public void setimage(String image) {
	this.image = image;
}
@Override
public String toString() {
	return "Book [id=" + id + ", name=" + name + ", price=" + price + ", catgoryId=" + categoryId + ", images=" + image
			+ "]";
}


}
