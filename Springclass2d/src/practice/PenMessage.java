package practice;

import org.springframework.stereotype.Component;

@Component
public class PenMessage implements MessageType {

	@Override
	public void write() {
		System.out.println("Writing with pencil ");
		
	}

}
