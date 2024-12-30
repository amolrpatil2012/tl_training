package teamlease.dependencyinjection.beans;

public class MessageProcessor {

	// Loose Coupling
	
	MessageService service;			// interface reference

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
	
	public MessageProcessor()
	{
		
	}

	public void processMessage ( String msg )
	{
		service.sendMsg(msg);
	}
	
	
}
