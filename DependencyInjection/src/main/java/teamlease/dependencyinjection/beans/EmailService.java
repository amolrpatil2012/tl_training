package teamlease.dependencyinjection.beans;

public class EmailService implements MessageService {

	@Override
	public void sendMsg(String msg) {
		
		System.out.println(" Sending Msg Through Email :" + msg);
		
	}

}
