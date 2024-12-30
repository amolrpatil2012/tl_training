package demo.annotaiontconfiguration.beans;

import org.springframework.stereotype.Component;

@Component("sms")
public class SMSService implements MessageService{

	@Override
	public void sendMsg(String msg) {
		
		System.out.println(" Sent message using sms : " + msg);
		
	}

}
