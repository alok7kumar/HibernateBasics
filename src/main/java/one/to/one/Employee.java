package one.to.one;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Emp_13")
public class Employee {

	@Id
	private int id;
	@OneToOne
	private Full_Name Name; //Creating separate table(class) as FullName for name
	private String Course;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Full_Name getName() {
		return Name;
	}
	public void setName(Full_Name name) {
		Name = name;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	
	
}
