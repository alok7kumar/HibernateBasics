package TPS;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Car")
public class Car extends Vehicle{

	private String mode;

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
	
	
}
