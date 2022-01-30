package com.hibernate.programs;

public class EmpMapping {
	private int employeeId;  
	private String name,email;  
	private AddressMapping address;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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
	public AddressMapping getAddress() {
		return address;
	}
	public void setAddress(AddressMapping address) {
		this.address = address;
	} 
	
	
}
