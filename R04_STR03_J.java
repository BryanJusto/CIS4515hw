import java.lang.*;
import java.io.*;
import java.math.BigInteger;

public class Main
{
	public static void main(String[] args) throws IOException{
        BigInteger x = new BigInteger("530500452766");
        byte[] byteArray = x.toByteArray();
        String s = new String(byteArray);
        byteArray = s.getBytes();
        x = new BigInteger(byteArray); 
    }

}