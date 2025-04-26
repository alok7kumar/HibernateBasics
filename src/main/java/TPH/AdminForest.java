package TPH;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

										// Hibernate Inheritance Mapping : 1. TABLE PER HIERARCHY (TPH)
public class AdminForest {

	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		d1.setName("Tommy");  //from Animal sub class
		d1.setBreed("german Shephard");
		
		Cat c1 = new Cat();
		c1.setName("Kitty");		 //from Animal sub class
		c1.setColor("white");
		
		System.out.println("Project Starts..................");
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Animal.class).addAnnotatedClass(Cat.class).addAnnotatedClass(Dog.class);
		SessionFactory sff = con.buildSessionFactory();
		Session s1 = sff.openSession();
		s1.save(c1);
		s1.save(d1);

		Transaction tx = s1.beginTransaction();
		tx.commit();
		s1.close();

	}

}
