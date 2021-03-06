package com.suraj.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.suraj.bean.Employee;

public class UpdateEmployee {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();

		session.beginTransaction();

		Employee employee = session.get(Employee.class,107);

		session.save(employee);
		
//		employee.setFirstName("suraj");
		employee.setLastName("bhosale");
		
		System.out.println(employee);

		session.getTransaction().commit();

		session.close();

	}

}
