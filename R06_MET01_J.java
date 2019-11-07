import java.lang.*;
import java.io.*;
import java.lang.Math;

public class R06_MET01_J
{
	public static void main(String[] args) throws IOException{
        int a = 17;
        int b = 40;
        int c = getAbsAdd(a,b);
    }

    public static int getAbsAdd(int x, int y){
			if(x== Integer.MIN_VALUE || y == Integer.MIN_VALUE){
				throw new IllegalArgumentException();
			}
    	int absX = Math.abs(x);
    	int absY = Math.abs(y);
			if(absX > Integer.MAX_VALUE - absY){
				throw new IllegalArgumentException();
			}
			return absX + absY;
		}
}
