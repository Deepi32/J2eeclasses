package AutoWiring;

import org.springframework.stereotype.Component;

@Component
public class Ship implements Vehicle {

	@Override
	public void move() {
		System.out.println("Ship is moving");

	}

}
