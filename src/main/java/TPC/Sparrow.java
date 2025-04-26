package TPC;

import javax.persistence.Entity;

@Entity
public class Sparrow extends Ani{

	private String fly;

	public String getFly() {
		return fly;
	}

	public void setFly(String fly) {
		this.fly = fly;
	}
	
	
}
