package HQL;

import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.firstHB.Student;

//									All data used here is code in Student.java of com.firstHB
//				HQL : HIBERNATE QUERY LANGUAGE     : where clause (to select specific record)

public class Admin {

	public static void main(String[] args) {

		Configuration con = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sff = con.buildSessionFactory();
		Session s1 = sff.openSession();
		
		Query q1 =s1.createQuery("from Student where course = 'Java'");    //Provide POJO classname
		List<Student> list	=	q1.list();
		
		for (Student student : list) {
			System.out.println("ID : " + student.getId() + ", Name : " + student.getName() + ", Course : " + student.getCourse());
		}
		
		Transaction tx = s1.beginTransaction();
		tx.commit();
		s1.close();

	}

}
