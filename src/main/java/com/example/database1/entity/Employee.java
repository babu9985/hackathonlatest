package com.example.database1.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Employee {
	@Id
	private int empid;
	private String name;
	private float salary;
	private long mobileno;
	private String role;
	public int getEmpId() {
		return empid;
	}
	public void setEmpId(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public long getMobileNo() {
		return mobileno;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileno = mobileNo;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
