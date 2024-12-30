package demo.annotaiontconfiguration.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/*
 * 
 * 	@Autowired  --> used to inject dependency automatically 
 * 
 * 1. Property Injection
 * 
 * 		@Autowired
 * 		MessageService service;
 * 
 * 2. Setter Injection
 * 
 * 		@Autowired
 * 		public void setService(MessageService service)
 * 		{
 * 				this.service = service;
 * 		}
 * 3. Constructor Injection ---> default
 * 
 * 		@Autowired [ not necessary ]
 * 		public MessageProcessor ( MessageService service)
 * 		{
 * 				this.service = service;
 * 		}
 * 
 * 
 * 	If more than one beans are eligible to Autowire
 * 
 * 	1. @Primary 	--> Make one of bean as primary bean [ default ]
 *  2. @Qualifier	--> Mention name of bean which you want to inject [ autowire ]
 *  
 *  if both annotations are available then container will go with @Qualifier
 * 
 */

@Component
public class MessageProcessor {

	//@Autowired						// property
	private MessageService service;		// Need to Autowire this dependency 
	

	public MessageService getService() {
		return service;
	}


	// @Autowired	-- setter
	public void setService(MessageService service) {
		this.service = service;
	}

	// @Autowired -- constructor -- default
	public MessageProcessor( @Qualifier("twitter")	MessageService service) {
		super();
		this.service = service;
	}
	
	public void processMsg ( String msg)
	{
		service.sendMsg(msg);
	}
}
