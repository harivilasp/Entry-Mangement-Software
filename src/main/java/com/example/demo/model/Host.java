package com.example.demo.model;

import org.springframework.stereotype.Component;

public class Host {
	String email;
	String mobno;
	
	public Host(String email, String mobno) {
		super();
		this.email = email;
		this.mobno = mobno;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getmobno() {
		return mobno;
	}
	
	public void setmobno(String mobno) {
		this.mobno = mobno;
	}
}
