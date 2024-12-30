package demo.annotaiontconfiguration.beans;

import org.springframework.stereotype.Component;

@Component
public class TwitterService implements MessageService {

	@Override
	public void sendMsg(String msg) {
		
		System.out.println(" sent message using twitter : " + msg);
		
	}

}
