package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

					// Hibernate Collection Mapping : 		1. List,		2. Set,		3. Map,		4. Bag

public class Call {

	public static void main(String[] args) {
		
		Candidate c1 = new Candidate();
		c1.setId(103);
		c1.setName("Vikash");
		
//		List<String> l1 = new ArrayList<String>();
//		l1.add("Akshay");
//		l1.add("Vijay");
//		l1.add("Ramesh");
//		
//		c1.setFriends(l1);
		
//		Set<String> s2 = new HashSet<String>();
//		s2.add("bank");
//		s2.add("food");
//		s2.add("e-commerce");
//		
//		c1.setProject(s2);
		
		Map<String, String> m1 = new HashMap<String, String>();
		m1.put("Aadhar", "123");
		m1.put("PAN", "457");
		
		c1.setCards(m1);
		
		System.out.println("Project Starts..................");
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Candidate.class)
				.addAnnotatedClass(Call.class);
		SessionFactory sff = con.buildSessionFactory();
		Session s1 = sff.openSession();
		s1.save(c1);

		Transaction tx = s1.beginTransaction();
		tx.commit();
		s1.close();

	}
}
