package many.to.one;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="dep_14")
public class Department {

	@Id
	private int id;
	private String dep_name;
	@OneToMany(mappedBy = "dep")
	private List<Person> Emp;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDep_name() {
		return dep_name;
	}
	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}
	public List<Person> getEmp() {
		return Emp;
	}
	public void setEmp(List<Person> emp) {
		Emp = emp;
	}
	
	
	
}
