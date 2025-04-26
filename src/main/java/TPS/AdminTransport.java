package TPS;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

						//Hibernate Inheritance Mapping : 3. TABLE PER SUBCLASS (TPS)
public class AdminTransport {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.setName("Range Rover");
		c1.setMode("Road");
		
		Helicopter h1 = new Helicopter();
		h1.setName("Tejas");
		h1.setSpeed("200 km/h");
		
		System.out.println("Project Starts..................");
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Car.class).addAnnotatedClass(Helicopter.class).addAnnotatedClass(Vehicle.class);
		SessionFactory sff = con.buildSessionFactory();
		Session s1 = sff.openSession();
		s1.save(c1);
		s1.save(h1);

		Transaction tx = s1.beginTransaction();
		tx.commit();
		s1.close();

	}

}
