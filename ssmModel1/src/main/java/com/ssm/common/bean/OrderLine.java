package com.ssm.common.bean;
/**
* @author 向鸿飞 
* @version 创建时间：2020年4月15日 下午1:28:50
* 类说明
*/
public class OrderLine {

	private int id;
	private int num;
	private int bookId;
	private int orderId;
	public OrderLine(int id, int num, int bookId, int orderId) {
		super();
		this.id = id;
		this.num = num;
		this.bookId = bookId;
		this.orderId = orderId;
	}
	public OrderLine() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	@Override
	public String toString() {
		return "OrderLine [id=" + id + ", num=" + num + ", bookId=" + bookId + ", orderId=" + orderId + "]";
	}
	
	
}
