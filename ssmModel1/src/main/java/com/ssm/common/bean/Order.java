package com.ssm.common.bean;

import java.sql.Timestamp;
/**
* @author 向鸿飞 
* @version 创建时间：2020年4月15日 下午1:28:39
* 类说明
*/
public class Order {

	private int id;						//订单号
	private double total;				//订单总价
	private Timestamp oraderDate;		//订单创建时间
	private int customerId;				//订单顾客id
	public Order(int id, double total, Timestamp oraderDate, int customerId) {
		super();
		this.id = id;
		this.total = total;
		this.oraderDate = oraderDate;
		this.customerId = customerId;
	}
	public Order() {
		super();
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
	public Timestamp getOraderDate() {
		return oraderDate;
	}
	public void setOraderDate(Timestamp oraderDate) {
		this.oraderDate = oraderDate;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", total=" + total + ", oraderDate=" + oraderDate + ", customerId=" + customerId
				+ "]";
	}
	
	
}
