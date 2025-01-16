package com.example.emq.requests;

import lombok.Data;

@Data
public class EmployeeRequest {
	
	private long id;
	private String name;
	private String email;
	private int age;
	private String phoneNumber;
	private String department;
	private double salary;
	
	
	private String paramOne;
	private String paramTwo;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getParamOne() {
		return paramOne;
	}
	public void setParamOne(String paramOne) {
		this.paramOne = paramOne;
	}
	public String getParamTwo() {
		return paramTwo;
	}
	public void setParamTwo(String paramTwo) {
		this.paramTwo = paramTwo;
	}
	
}
