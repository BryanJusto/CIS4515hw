import java.lang.*;
import java.io.*;

public final class Main implements Runnable {
  private static volatile int counter;
  // ...
  private final Object lock = new Object();
 
  @Override public void run() {
    synchronized (lock) {
      counter++;
      // ...
    }
  }
 
  public static void main(String[] args) {
    for (int i = 0; i < 2; i++) {
    new Thread(new Main()).start();
    }
  }
}