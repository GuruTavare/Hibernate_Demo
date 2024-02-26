package com.prowings.entity_Annotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * POJO class = having only fields and getter setter methods...
 */

@Entity
@Table(name = "Employee1_Annotation")
public class Employee1 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int emp1Id;
	@Column
	private String emp1Name;
	@Column
	private String address;

	public int getEmp1Id() {
		return emp1Id;
	}

	public String getEmp1Name() {
		return emp1Name;
	}

	public String getAddress() {
		return address;
	}

	public void setEmp1Id(int emp1Id) {
		this.emp1Id = emp1Id;
	}

	public void setEmp1Name(String emp1Name) {
		this.emp1Name = emp1Name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	

	public int addition(int i, int j) {
		return i + j;
	}

}
