package demo.annotaiontconfiguration.beans;

import org.springframework.stereotype.Component;


public class EmailService implements MessageService{

	@Override
	public void sendMsg(String msg) {
		
		System.out.println(" Message sent using Email : " + msg);
	}

}
