package HQL;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//		HQL : HIBERNATE QUERY LANGUAGE  :		DELETE a Record (Modifying record)
public class Admin7 {

	public static void main(String[] args) {
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sff = con.buildSessionFactory();
		Session s1 = sff.openSession();
		//s1.save(std);
		
		Transaction tx = s1.beginTransaction();  //It has to be placed here in update/delete
		
		Query q1 =s1.createQuery("delete from Student where id = :id");  
		q1.setParameter("id", 102);
		
		int result = q1.executeUpdate();
		
		if(result > 0) {
			System.out.println("Record with id 102 deleted.");
			}
		
		tx.commit();
		s1.close();

	}

}
