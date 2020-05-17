package com.ssm.bean;

import java.sql.Timestamp;

/**
* @author 向鸿飞 
* @version 创建时间：2020年4月18日 下午7:41:52
* 类说明	 用户类
*/
public class User {

	private int id;				//员工ID
	private	String username;	//员工用户名
	private String password;	//员工密码
	private String name;		//员工姓名
	private String phone;		//员工电话
	private String email;		//邮箱
	private Timestamp birthday;	//生日
	private Timestamp intoDate; //入职时间
	private String state;		//员工状态(是否在职)
	private int status;			//身份(是否为管理员)
	public User(int id, String username, String password, String name, String phone, String email, Timestamp birthday,
			Timestamp intoDate, String state, int status) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.birthday = birthday;
		this.intoDate = intoDate;
		this.state = state;
		this.status = status;
	}
	public User() {
		super();
	}
	public User(String username, String password, String name, String phone, String email, Timestamp birthday,
			Timestamp intoDate, String state, int status) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.birthday = birthday;
		this.intoDate = intoDate;
		this.state = state;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Timestamp getBirthday() {
		return birthday;
	}
	public void setBirthday(Timestamp birthday) {
		this.birthday = birthday;
	}
	public Timestamp getIntoDate() {
		return intoDate;
	}
	public void setIntoDate(Timestamp intoDate) {
		this.intoDate = intoDate;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", name=" + name + ", phone="
				+ phone + ", email=" + email + ", birthday=" + birthday + ", intoDate=" + intoDate + ", state=" + state
				+ ", status=" + status + "]";
	}
	
	
	
}
