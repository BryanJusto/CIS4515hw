import java.lang.*;
import java.io.*;
public class R03_NUM03_J
{
	public static void main(String[] args) throws IOException{

        DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("file.txt"));
        dataOut.writeInt(10);
        DataInputStream in = new DataInputStream(new FileInputStream("file.txt"));
        System.out.println(getInteger(in));
    }

	public static long getInteger(DataInputStream is) throws IOException{
		return is.readInt() & 0xFFFFFFFFL;
	}
}
