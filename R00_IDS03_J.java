import java.util.logging.*;
import java.io.IOException;
public class Main
{
	public static void main(String[] args) throws SecurityException, IOException {
    	Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    	String username = "Test";
    	boolean loginSuccessful = true;
    	
    	if(loginSuccessful) {
    		logger.severe("User login succeeded for : " + username);
    	} else {
    		logger.severe("User login failed for: " +username);	
    	} 
    }
}