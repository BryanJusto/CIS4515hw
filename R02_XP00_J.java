
import java.io.File;

public class R02_XP00_J
{
	public static void main(String[] args){
			File someFile = new File("someFileName.txt");
			//do something
			if(!someFile.delete()){
				//do something with failure
			}
    }
}
