package demo.annotaiontconfiguration.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/*
 * 
 * 	@Autowired  --> used to inject dependency automatically 
 * 
 * 1. Property Injection
 * 2. Setter Injection
 * 3. Constructor Injection
 * 
 * 
 */

@Component
public class MessageProcessor {

	@Autowired
	private MessageService service;		// Need to Autowire this dependency 
	

	public MessageService getService() {
		return service;
	}

	
	public void setService(MessageService service) {
		this.service = service;
	}
	
	public MessageProcessor(MessageService service) {
		super();
		this.service = service;
	}
	
	public void processMsg ( String msg)
	{
		service.sendMsg(msg);
	}
}
