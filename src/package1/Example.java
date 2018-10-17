package package1;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class Example {
	
	public static final String ACCOUNT_SID = "AC9d5ff4d7ae601b8ba10cfc424d916948";
	  public static final String AUTH_TOKEN = "dcbe1200d3b4bebae38c918299a0e3ca";

	public static void main(String[] args) {
		 Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

		    Message message = Message.creator(new PhoneNumber("+19733938201"),
		        new PhoneNumber("+19083565767"), 
		        "This is the ship that made the Kessel Run in fourteen parsecs?").create();

		    System.out.println(message.getSid());

	}

}
