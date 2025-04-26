package HQL;

import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.firstHB.Student;

//			HQL : HIBERNATE QUERY LANGUAGE     : using LIKE for pattern matching

public class Admin5 {

	public static void main(String[] args) {
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sff = con.buildSessionFactory();
		Session s1 = sff.openSession();
		//s1.save(std);
		
		Query q1 =s1.createQuery("from Student where name like : nameP");  // nameP is a temporary reference variable(placeholder) that will be used in setParameter.
		q1.setParameter("nameP", "V%");
		
		List<Student> list	=	q1.list();
		
		for (Student student : list) {
			System.out.println("ID : " + student.getId() + ", Name : " + student.getName() + ", Course : " + student.getCourse());
		}
		
		Transaction tx = s1.beginTransaction();
		tx.commit();
		s1.close();

	}

}
