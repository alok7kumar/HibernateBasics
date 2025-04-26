package many.to.many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Customer {
	
	@Id
	private int cid;
	private String name;
	
	@ManyToMany
	@JoinTable(
			name = "Customer_Product",
			joinColumns = @JoinColumn(name = "cid"),
			inverseJoinColumns = @JoinColumn(name = "pid")
			)
	private List<Product> products;
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	

}
