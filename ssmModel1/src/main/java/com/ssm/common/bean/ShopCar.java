package com.ssm.common.bean;
/**
* @author 向鸿飞 
* @version 创建时间：2020年4月14日 下午4:00:57
* 类说明
*/
public class ShopCar {
private int id;				//购物车订单id
private int customerId;		//顾客id
private int bookId;			//书籍id
private int num;			//书籍数量
public ShopCar(int id, int customerId, int bookId, int num) {
	super();
	this.id = id;
	this.customerId = customerId;
	this.bookId = bookId;
	this.num = num;
}
public ShopCar() {
	super();
}

public ShopCar(int customerId, int bookId, int num) {
	super();
	this.customerId = customerId;
	this.bookId = bookId;
	this.num = num;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
@Override
public String toString() {
	return "ShopCar [id=" + id + ", customerId=" + customerId + ", bookId=" + bookId + ", num=" + num + "]";
}


}
