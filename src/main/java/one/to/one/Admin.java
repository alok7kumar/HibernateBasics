package one.to.one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


				// ONE-TO-ONE MAPPING
public class Admin {

	public static void main(String[] args) {
		
		Full_Name f1 = new Full_Name();
		f1.setId(101);
		f1.setF_name("Alok");
		f1.setM_name("Kumar");
		f1.setL_name("Lal");
		
		Employee emp = new Employee();
		emp.setId(501);
		emp.setName(f1);
		emp.setCourse("Java");
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).addAnnotatedClass(Full_Name.class);
		SessionFactory sff = con.buildSessionFactory();
		Session s1 = sff.openSession();
		s1.save(f1);
		s1.save(emp);
		Transaction tx = s1.beginTransaction();
		tx.commit();
		s1.close();

	}

}
