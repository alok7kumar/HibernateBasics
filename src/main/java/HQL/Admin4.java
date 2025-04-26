package HQL;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


//								HQL : HIBERNATE QUERY LANGUAGE     : 
//					Using Aggregate Functions		:		count, min, max, avg, etc

public class Admin4 {

	public static void main(String[] args) {
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sff = con.buildSessionFactory();
		Session s1 = sff.openSession();
		//s1.save(std);
		
		Query q1 =s1.createQuery("select count(id) from Student");
		Long count	=	(Long) q1.uniqueResult();     // uniqueResult(): since output is single value
		
		System.out.println("Total number of records: " + count);  //	it will give (+ve)integer value as output 
		
		Transaction tx = s1.beginTransaction();
		tx.commit();
		s1.close();

	}

}
