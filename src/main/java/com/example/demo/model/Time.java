package com.example.demo.model;

import org.springframework.stereotype.Component;

public class Time {
	String inTime;
	String outTime;
	
	public Time(String inTime, String outTime) {
		super();
		this.inTime = inTime;
		this.outTime = outTime;
	}
	public String getinTime() {
		return inTime;
	}
	public void setinTime(String inTime) {
		this.inTime = inTime;
	}
	public String getoutTime() {
		return outTime;
	}
	
	public void setoutTime(String outTime) {
		this.outTime = outTime;
	}
}
