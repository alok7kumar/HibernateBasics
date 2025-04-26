package many.to.many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

								// MANY-TO-MANY MAPPING
public class Admin {

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		c1.setCid(3);
		c1.setName("Alok");
		
		Customer c2 = new Customer();
		c2.setCid(4);
		c2.setName("Ajay");
		
		Product p1 = new Product();
		p1.setPid(103);
		p1.setPname("Laptop");
		
		Product p2 = new Product();
		p2.setPid(104);
		p2.setPname("Mobile");
		
		List<Product> list1 = new ArrayList<Product>();
		List<Customer> list2 = new ArrayList<Customer>();
		
		list1.add(p1);
		list1.add(p2);
		
		list2.add(c1);
		list2.add(c2);
		
		c1.setProducts(list1);
		p2.setCustomers(list2);
		
		System.out.println("Project Starts..................");
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Customer.class).addAnnotatedClass(Product.class);
		SessionFactory sff = con.buildSessionFactory();
		Session s1 = sff.openSession();
		s1.save(c1);
		s1.save(c2);
		s1.save(p1);
		s1.save(p2);
		Transaction tx = s1.beginTransaction();
		tx.commit();
		s1.close();

	}

}
