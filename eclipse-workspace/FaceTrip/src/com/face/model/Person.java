package com.face.model;

import java.time.LocalDate;


public class Person {
	private String firstname;
	private String lastname;
	private String username;
	private String password;
	private String email;
	private String mobile;
	private String empid;
	private String dob;
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void display()
	{
		System.out.println(this.getFirstname());
		System.out.println(this.getLastname());
		System.out.println(this.getUsername());
		System.out.println(this.getPassword());
		System.out.println(this.getEmail());
		System.out.println(this.getMobile());
		System.out.println(this.getEmpid());
		System.out.println(this.getDob());
	}
}
