package com.prowings;

import org.junit.Test;

import com.hibernate_demo_with_maven.Employee;

import junit.framework.Assert;

public class TestEmployee {
	@Test
	public void testEmployeeAddition() {

		Employee e = new Employee();

		int res = e.addition(10, 20);

		assert (res == 30) : "The answer should be 30";

//		Assert.assertEquals(30, res);

	}

}
