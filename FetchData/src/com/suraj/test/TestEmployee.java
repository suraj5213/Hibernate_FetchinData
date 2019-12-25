package com.suraj.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.suraj.bean.Employee;

public class TestEmployee {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();

		session.beginTransaction();

		Employee employee = new Employee(103, "suraj", "Sirsat", 25000);

		session.save(employee);

		session.getTransaction().commit();

		session.close();

	}

}
