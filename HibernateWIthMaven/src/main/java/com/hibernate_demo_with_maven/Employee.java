package com.hibernate_demo_with_maven;

/**
 * POJO class = having only fields and getter setter methods... 
 */
public class Employee {

	private int empId;
	private String empName;
	private String address;

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getAddress() {
		return address;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}

	public int addition(int i, int j) {
		return i+j;
	}
	  

}
