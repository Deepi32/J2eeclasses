package practice;



import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Message {
	MessageType messageType;

	public MessageType getMessageType() {
		return messageType;
	}

	@Autowired
	@Qualifier("pencilMessage")
	public void setMessageType(MessageType messageType) {
		this.messageType = messageType;
		messageType.write();
	}
	@PostConstruct
	public void myinit()
	{
		System.out.println("init is called");
	}
	@PreDestroy
	public void myend()
	{
		System.out.println("end is called");
	}
	}
