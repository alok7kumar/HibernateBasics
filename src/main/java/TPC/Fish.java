package TPC;

import javax.persistence.Entity;

@Entity
public class Fish extends Ani{
	
	private String Swim;

	public String getSwim() {
		return Swim;
	}

	public void setSwim(String swim) {
		Swim = swim;
	}
	
	

}
