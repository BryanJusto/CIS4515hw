//VNA02-J
import java.lang.*;
import java.io.*;

public class R08_VNA02_J
{
    public static void main(String[] args) {
    }
}

final class Flag {
  private boolean flag = true;

  public synchronized void toggle() {  // Unsafe
    flag ^= true;
  }

  public synchronized boolean getFlag() { // Safe
    return flag;
  }
}
