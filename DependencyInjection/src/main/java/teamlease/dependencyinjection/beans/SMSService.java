package teamlease.dependencyinjection.beans;

public class SMSService implements MessageService{

	@Override
	public void sendMsg(String msg) {
		System.out.println(" Sending Message Using SMS : " + msg);
		
	}

}
