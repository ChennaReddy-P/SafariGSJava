package loops;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Loops {
  public static void main(String[] args) throws Throwable {
    int x = 0;
    while (x < 3) {
      System.out.println("x is " + x);
//      x = x + 1;
//      x += 1;
      x++;
    }

    for (int y = 0; y < 3; y++) {
      System.out.println("y is " + y);
    }

    String [] names = { "Fred", "Jim", "Sheila" };
    // array is fixed length!
    for (int idx = 0; idx < names.length; idx++) {
      System.out.println("Name " + idx + " is " + names[idx]);
    }

    for (String s : names) {
      System.out.println(">> " + s);
    }
    System.out.println("names is " + Arrays.toString(names));

//    ArrayList<String> al = new ArrayList<>();
    List<String> al = new LinkedList<>(List.of("Alice", "Bob"));
    al.add("Fred");
    System.out.println("item count is " + al.size());
    System.out.println("al is " + al);
//    al.add(LocalDate.now());
    al.add("Jim");
    System.out.println("item count is " + al.size());
    System.out.println("al is " + al);

//    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"));
    String line = bufferedReader.readLine();
    System.out.println("You typed " + line);

    String 你好 = "nihao";
  }
}
