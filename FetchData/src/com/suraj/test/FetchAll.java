package com.suraj.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.suraj.bean.Employee;

public class FetchAll {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();

		session.beginTransaction();
		
		@SuppressWarnings("unchecked")
//		Query<Employee> query = session.createQuery("from Employee where first_name='suraj'");
		Query<Employee> query = session.createQuery("from Employee");
		
		List<Employee> list = query.getResultList();

		System.out.println(list);

		session.getTransaction().commit();

		session.close();

	}

}
