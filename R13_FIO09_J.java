import java.util.*;

class R13_FIO09_J {
  public static void main(String[] args)
                          throws NumberFormatException, IOException {
    // Perform range checking
    int value = Integer.valueOf(args[0]);
    if (value < 0 || value > 255) {
      throw new ArithmeticException("Value is out of range");
    }

    System.out.write(value);
    System.out.flush();
  }
}
