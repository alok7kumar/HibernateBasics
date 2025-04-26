package many.to.one;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

							//		MANY-TO-ONE MAPPING

public class AdminCompany {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setId(101);
		p1.setName("Alok");
		
		Person p2 = new Person();
		p2.setId(102);
		p2.setName("Binay");
		
		List<Person> per = new ArrayList<Person>();
		per.add(p1);
		per.add(p2);
		
		Department d1 = new Department();
		d1.setId(201);
		d1.setDep_name("IT");
		d1.setEmp(per);
		
		p1.setDep(d1);
		p2.setDep(d1);
		
		System.out.println("Project Starts..................");
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Department.class).addAnnotatedClass(Person.class);
		SessionFactory sff = con.buildSessionFactory();
		Session s1 = sff.openSession();
		s1.save(p1);
		s1.save(p2);
		s1.save(d1);
		Transaction tx = s1.beginTransaction();
		tx.commit();
		s1.close();

	}

}
