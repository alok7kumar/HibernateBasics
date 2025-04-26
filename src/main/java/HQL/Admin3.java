package HQL;

import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.firstHB.Student;

//		HQL : HIBERNATE QUERY LANGUAGE     : Projection (select specific column)
public class Admin3 {

	public static void main(String[] args) {
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sff = con.buildSessionFactory();
		Session s1 = sff.openSession();
		//s1.save(std);
		
		Query q1 =s1.createQuery("select name, course from Student");      //to fetch only name and course
		List<Object[]> list	=	q1.list();     // Object[] is added because of selecting multiple column fields
		
		for (Object[] row : list) {
			System.out.println( "Name : " + row[0] + ", Course : " + row[1] );   //giving indexes of required column
		}
		
		Transaction tx = s1.beginTransaction();
		tx.commit();
		s1.close();

	}

}
