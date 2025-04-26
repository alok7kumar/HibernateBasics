package com.firstHB;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

							// basic HIBERNATE project
public class Admin {

	public static void main(String[] args) {

		Student std = new Student();
		std.setId(106);
		std.setName("Zainab");
		std.setCourse("React.js");

		System.out.println("Project begins.........................");
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
		SessionFactory sff = con.buildSessionFactory();
		Session s1 = sff.openSession();
		s1.save(std);
		Transaction tx = s1.beginTransaction();
		tx.commit();
		s1.close();

	}

}
