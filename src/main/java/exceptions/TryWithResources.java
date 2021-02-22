package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
  public static void main(String[] args) {
    try (
        FileReader fr = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(fr);
    ) {
      // body...
    } catch(IOException ioe) {

    }
  }
}
