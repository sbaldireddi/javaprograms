package com.nit.Inheritance;

public class Employee {
	String name;
	Address address;
	public Employee(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	public void display() {
		System.out.println(name);  
		System.out.println(address.city+" "+address.pincode);  
	}
	public static void main(String[] args) {
		Address address=new Address("hyd", 5000089);
		Address address1=new Address("hyd", 5000080);
		Employee employee=new Employee("satish", address1);
		employee.display();
	}
}
class Address{
	String city;
	int pincode;
	public Address(String city,int pincode) {
		this.city=city;
		this.pincode=pincode;
	}
}
