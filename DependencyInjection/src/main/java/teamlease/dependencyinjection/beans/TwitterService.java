package teamlease.dependencyinjection.beans;

public class TwitterService implements MessageService{

	@Override
	public void sendMsg(String msg) {
		System.out.println(" Sending Message using Twitter : " + msg);
		
	}

}
