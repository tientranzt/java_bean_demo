package com.tientranzt.entity;

public class Employee {

	private String name;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public void onInit() {
		System.out.println("on init");
	}
	
	public void onDestroy() {
		System.out.println("on destroy");
	}
	
	
	
	public void getMessage() {
		
		System.out.println("message from employee class " + this.name);
	}
}
