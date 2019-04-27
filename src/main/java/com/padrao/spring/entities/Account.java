package com.padrao.spring.entities;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Account {
	
	private String username;
	private String fullname;
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date birthday;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
}
