package com.jeyun.test.vo;

public class sample  {

	String test;
	String ID;
	String name;
	
	public sample(String test, String iD, String name) {
		this.test = test;
		this.ID = iD;
		this.name = name;
	}
	
	public sample() {

	}
	
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
