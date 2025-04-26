package TPC;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

								//Hibernate Inheritance Mapping : 2. TABLE PER CONCRETE (TPC)
public class AdminKingdom {
	public static void main(String[] args) {
	
		Fish f1 = new Fish();
		f1.setName("Nemo");
		f1.setSwim("20");
		
		Sparrow sp1 = new Sparrow();
		sp1.setName("Chidiyaa");
		sp1.setFly("high");

		System.out.println("Project Starts..................");
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Ani.class).addAnnotatedClass(Fish.class).addAnnotatedClass(Sparrow.class);
		SessionFactory sff = con.buildSessionFactory();
		Session s1 = sff.openSession();
		s1.save(f1);
		s1.save(sp1);

		Transaction tx = s1.beginTransaction();
		tx.commit();
		s1.close();
	}

}
