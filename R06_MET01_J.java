import java.lang.*;
import java.io.*;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) throws IOException{
        int a = 17;
        int b = 40;
        int c = getAbsAdd(a,b);
    }
    
    public static int getAbsAdd(int x, int y){
    	assert x != Integer.MIN_VALUE;
    	assert y != Integer.MIN_VALUE;
    	int absX = Math.abs(x);
    	int absY = Math.abs(y);
    	assert ( absX <= Integer.MAX_VALUE - absY);
    	return absX + absY;
    } 

}