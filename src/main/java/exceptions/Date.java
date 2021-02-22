package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Date {
  public static String readOneLine(String filename) throws IOException {
    // "Checked" exception
    // EITHER handle it ourselves
    // OR admit we're passing it up...
    BufferedReader input = new BufferedReader(new FileReader(filename));
    return input.readLine();
  }
  public static String dayName(int d) {
    // "unchecked" exception; compiler doesn't care...
    if (d < 0 || d > 6) throw new IllegalArgumentException("Bad day");
    switch (d) {
      case 0:
        return "Saturday";
      case 1:
        return "Sunday";
      case 2:
        return "Monday";
      default:
        return "Not yet implemented";
    }
  }

  public static void main(String[] args) {
    System.out.println("Day number 2 is " + Date.dayName(2));
//    System.out.println("Day number 128 is " + Date.dayName(128));

    try {
      System.out.println("One line from file data.txt is " + readOneLine("datax.txt"));
    } catch (FileNotFoundException ioe) { // catch "more specialized" (i.e. subclasses) first
      System.out.println("File Not found!!!");
    } catch (IOException ioe) {
      System.out.println("That broke");
    } finally {
      System.out.println("This always happens");
    }
  }
}
