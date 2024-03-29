import java.lang.*;
import java.io.*;
import java.net.*;


// Thread-safe class
public final class R10_THI04_J implements Runnable {
  private final Socket socket;
  private final BufferedReader in;
  private volatile boolean done = false;
  private final Object lock = new Object();

  public R10_THI04_J(String host, int port) throws IOException {
    this.socket = new Socket(host, port);
    this.in = new BufferedReader(
        new InputStreamReader(this.socket.getInputStream())
    );
  }

  // Only one thread can use the socket at a particular time
  @Override public void run() {
    try {
      synchronized (lock) {
        readData();
      }
    } catch (IOException ie) {
      // Forward to handler
    }
  }

  public void readData() throws IOException {
    String string;
    try {
      while ((string = in.readLine()) != null) {
        // Blocks until end of stream (null)
      }
    } finally {
      shutdown();
    }
  }

  public void shutdown() throws IOException {
    socket.close();
  }

  public static void main(String[] args)
                          throws IOException, InterruptedException {
    SocketReader reader = new SocketReader("somehost", 25);
    Thread thread = new Thread(reader);
    thread.start();
    Thread.sleep(1000);
    reader.shutdown();
  }
}
