package loops;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpression { // aka Function Literal
  public static void main(String[] args) {
    List.of("Fred", "Jim", "Sheila")
//        .forEach((String s) -> { System.out.println("String is " + s);});
//        .forEach((s) -> { System.out.println("String is " + s);});
        .forEach(s -> System.out.println("String is " + s));

    List<String> ls = new ArrayList<>(List.of("Fred", "Jim", "Sheila"));

    System.out.println(ls);
    ls.sort((s1, s2) -> Integer.compare(s2.length(), s1.length()));
    System.out.println(ls);

  }
}
