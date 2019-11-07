import java.util.logging.*;
import java.io.IOException;
import java.util.regex.Pattern;

public class R00_IDS03_J
{
	public static void main(String[] args) throws SecurityException, IOException {
    	Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    	String username = "Test";
    	boolean loginSuccessful = true;

    	if(loginSuccessful) {
    		logger.severe("User login succeeded for : " + sanitizeUser(username));
    	} else {
    		logger.severe("User login failed for: " +sanitizeUser(username));
    	}
    }
		public static String sanitizeUser(String username){
			return Pattern.matches("[A-Za-z0-9_]+", username)
			? username: "unauthorized user";
		}
}
