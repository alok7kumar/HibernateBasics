package caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//						Sample code showing PROBLEM before applying CACHING
public class Admin {

	public static void main(String[] args) {
		
		System.out.println("Project begins.........................");
		// this code will hit database query two times, which is a drawback. This is PROBLEM, since two sessions are doing two query
	
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student1.class);
		
		SessionFactory sff = con.buildSessionFactory();
		Session s1 = sff.openSession();
			Student1 std = s1.get(Student1.class, 102);     //get() will fetch data from db
			System.out.println(std);
			System.out.println(s1.contains(std));
		
		s1.close();
		
		Configuration con1 = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student1.class);
		
		SessionFactory sff1 = con1.buildSessionFactory();
		Session s2 = sff1.openSession();
			Student1 std1 = s2.get(Student1.class, 102);
			System.out.println(std1);
			System.out.println(s2.contains(std1));
		
		s2.close();
	}

}
