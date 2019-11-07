import java.util.*;

class Main {
  public static void main(String[] args) {
    // Any input value > 255 will result in unexpected output
    System.out.write(Integer.valueOf(args[0]));
    System.out.flush();
  }
}