package HQL;

import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.firstHB.Student;

//HQL : HIBERNATE QUERY LANGUAGE  :		UPDATE a Record (Modifying data)
public class Admin8 {

	public static void main(String[] args) {
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sff = con.buildSessionFactory();
		Session s1 = sff.openSession();
		//s1.save(std);
		
		Transaction tx = s1.beginTransaction();
		
		Query q1 =s1.createQuery("update Student set course = :newCourse where id = :id");  //:id is used as a placeholder for setParameter()
		q1.setParameter("newCourse", "JavaScript");		//	updating from previous course to "Javascript"
		q1.setParameter("id", 102);				// where to be updated
		
		int result = q1.executeUpdate();
		
		if(result > 0) {
			System.out.println("Record with id 102 updated.");
			}
		
		tx.commit();
		s1.close();

	}

}
