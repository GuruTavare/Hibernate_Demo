package com.hibernate_demo_with_maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.prowings.entity_Annotation.Employee1;

public class TestEmployeeHibernateDemo {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();

		SessionFactory sf = cfg.configure().buildSessionFactory();

		Session s = sf.openSession();

		Employee1 emp1 = new Employee1();

		emp1.setEmp1Id(1);
		emp1.setEmp1Name("Ram");
		emp1.setAddress("pune");

//			System.out.println(emp);

//			Student s1= new Student( "Ram", "pune");
//			s.save(s1);
		s.save(emp1);
		Transaction t = s.beginTransaction();
		t.commit();
		s.close();
	}

}
