package caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//      SECOND LEVEL CACHING
//2nd level cache is associated with SessionFactory, enabled by user
//2 dependency is added in pom.xml   and      configuration is updated in hibernate.cfg.xml
public class Admin3 {

	public static void main(String[] args) {
		
		System.out.println("Project begins.........................");
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student1.class);
		SessionFactory sff = con.buildSessionFactory();
		
		Session s1 = sff.openSession();
			Student1 std 		= 		s1.get(Student1.class, 102);
			System.out.println(std);
		
		Session s2 = sff.openSession();
			Student1 std1 = s2.get(Student1.class, 102);
			System.out.println(std1);
			
		Transaction tx = s1.beginTransaction();
		tx.commit();
		s1.close();
		s2.close();
	}

}
