package caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//										FIRST LEVEL CACHING in HIBERNATE
//								SOLUTION (Admin class PROBLEM): this code will hit database query only ONCE. Since, One session is doing two query.
//										by default enabled and associated with Session
public class Admin2 {

	public static void main(String[] args) {
		
		System.out.println("Project begins.........................");
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student1.class);
		SessionFactory sff = con.buildSessionFactory();
		
		Session s1 = sff.openSession();
			Student1 std = s1.get(Student1.class, 102);     //get() will fetch data from db
			System.out.println(std);
			System.out.println("Working something................");
			
			Student1 std1 = s1.get(Student1.class, 102);     //get() will fetch data from db
			System.out.println(std1);
			System.out.println(s1.contains(std1));
		
		s1.close();

	}

}
