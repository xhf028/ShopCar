package com.ssm.common.bean;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
/**
* @author 向鸿飞 
* @version 创建时间：2020年4月15日 下午1:28:39
* 类说明
*/
public class Order {

	private int id;												//订单号
	private double total;										//订单总价
	private Timestamp orderDate;								//订单创建时间
	private int customerId;										//订单顾客id
	private List<OrderLine> list = new ArrayList<OrderLine>();	//
	
	
	
	
	public Order(double total, int customerId) {
		super();
		this.total = total;
		this.customerId = customerId;
	}
	public List<OrderLine> getList() {
		return list;
	}
	public void setList(List<OrderLine> list) {
		this.list = list;
	}
	public Order(int id, double total, Timestamp orderDate, int customerId) {
		super();
		this.id = id;
		this.total = total;
		this.orderDate = orderDate;
		this.customerId = customerId;
	}
	public Order() {
		super();
	}
	
	

	
	
	public Order(double total, Timestamp orderDate, int customerId) {
		super();
		this.total = total;
		this.orderDate = orderDate;
		this.customerId = customerId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Timestamp getorderDate() {
		return orderDate;
	}
	public void setorderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", total=" + total + ", orderDate=" + orderDate + ", customerId=" + customerId
				+ "]";
	}
	
	
}
