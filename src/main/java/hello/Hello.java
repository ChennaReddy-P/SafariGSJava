package hello;

//import java.lang.*;
//import java.lang.System;
import static java.lang.System.out;

public class Hello {
  public static void main(String[] args) {
//    java.lang.System.out.println("Hello great big World!");
//    System.out.println("Hello great big World!");
    out.println("Hello great big World!");

    int x = 99;
    double y = 10;
//    x = y; // NOT allowed :)
    var z = x + y;
    var a = 10;

    a = (int)3.14;
    out.println(a);
    /*
    add +, subtract -, multiply *,
    divide / (integer or float??? based on args)
    % remainder

    > >= == !=
    & | ^ (bitwise)
    && || (logical shortcircuiting)
     */

    int one = 1;
    int unk = 1;
    out.println(one == unk); // == best for primitives :)

//    String s1 = new String("Hello");
//    String s2 = new String("Hello");
    String s1 = "Hello";
    String s2 = "Hello";
    out.println("s1 == s2? " + (s1 == s2));

    out.println("s1.equals(s2)? " + s1.equals(s2));

    StringBuilder sb1 = new StringBuilder("Hello");
    StringBuilder sb2 = new StringBuilder("Hello");
    out.println("sb1 == sb2? " + (sb1 == sb2));

    out.println("sb1.equals(sb2)? " + sb1.equals(sb2));

  }
}
