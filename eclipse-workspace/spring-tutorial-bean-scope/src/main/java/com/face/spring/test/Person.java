package com.face.spring.test;

public class Person {
	private int id;
	private String name;
	private int taxId;
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getTaxId() {
		return taxId;
	}
	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}
	public Person() {
		
	}
public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}



@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", address=" + address + "]";
}
public void display() {
	System.out.println("Hi Springs! Let us learn spring");

}
}
