//VNA02-J
import java.lang.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) {
    }
}

final class Flag {
  private volatile boolean flag = true;

  public void toggle() {  // Unsafe
    flag ^= true;
  }

  public boolean getFlag() { // Safe
    return flag;
  }
} 