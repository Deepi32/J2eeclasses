package AutoWiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Traveller {
	Vehicle vehicle;

	public Vehicle getVehicle() {
		return vehicle;
	}

	@Autowired
	@Qualifier("ship") //if we have multiple setter methods
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public void travel()
	{
		vehicle.move();
	}

}
