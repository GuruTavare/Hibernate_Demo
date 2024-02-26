package com.prowings.entity_Annotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student_Using_Annotation")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rn;
	@Column
	private String name;
	@Column
	private String address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student( String name, String address) {
		super();
//		this.rn = rn;
		this.name = name;
		this.address = address;

	}

	public int getRn() {
		return rn;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setRn(int rn) {
		this.rn = rn;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rn=" + rn + ", name=" + name + ", address=" + address + "]";
	}

}
