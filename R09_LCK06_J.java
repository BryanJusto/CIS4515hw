import java.lang.*;
import java.io.*;

public final class R09_LCK06_J implements Runnable {
  private static int counter;
  // ...
  private static final Object lock = new Object();

  public void run() {
    synchronized (lock) {
      counter++;
      // ...
    }
  }

  public static void main(String[] args) {
    for (int i = 0; i < 2; i++) {
    new Thread(new R09_LCK06_J()).start();
    }
  }
}
