package AutoScanning;

import org.springframework.stereotype.Component;

@Component
public class MessageBean {
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
