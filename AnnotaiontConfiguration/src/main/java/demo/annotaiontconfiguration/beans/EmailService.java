package demo.annotaiontconfiguration.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary			// this will be default bean - primary bean in ambiguity
@Component("email")
public class EmailService implements MessageService{

	@Override
	public void sendMsg(String msg) {
		
		System.out.println(" Message sent using Email : " + msg);
	}

}
