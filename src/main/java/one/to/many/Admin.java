package one.to.many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

					// ONE-TO-MANY MAPPING

public class Admin {

	public static void main(String[] args) {
		
		// Setting 3 different answers as a list for one question
		Answer a1 = new Answer();
		a1.setId(1);
		a1.setAns("Plarform Independent");
		a1.setAuthor("Alok");
		
		Answer a2 = new Answer();
		a2.setId(2);
		a2.setAns("Architectural Neutral");
		a2.setAuthor("Akshay");
		
		Answer a3 = new Answer();
		a3.setId(3);
		a3.setAns("Robust");
		a3.setAuthor("Vijay");
		
		List<Answer> list = new ArrayList<Answer>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		Question q1 = new Question();
		q1.setId(11);
		q1.setQuestion("Features");
		q1.setAns(list);
		
		System.out.println("Project Starts..................");
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Question.class).addAnnotatedClass(Answer.class);
		SessionFactory sff = con.buildSessionFactory();
		Session s1 = sff.openSession();
		s1.save(a1);
		s1.save(a2);
		s1.save(a3);
		s1.save(q1);
		Transaction tx = s1.beginTransaction();
		tx.commit();
		s1.close();
	}

}
