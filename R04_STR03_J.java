import java.lang.*;
import java.io.*;
import java.math.BigInteger;

public class R04_STR03_J
{
	public static void main(String[] args) throws IOException{
			BigInteger x = new BigInteger("530500452766");
			String s = x.toString();  // Valid character data
			byte[] byteArray = s.getBytes();
			String ns = new String(byteArray);
			x = new BigInteger(ns);
    }

}
