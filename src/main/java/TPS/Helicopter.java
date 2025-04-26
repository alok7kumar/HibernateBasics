package TPS;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Helicopter")
public class Helicopter extends Vehicle {

	private String speed;

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}
	
	
}
