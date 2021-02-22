package methods;

public class Methods {

  // NO default argument value
  // NO named parameter passing
  public static int add(int a, int b) { // name is methods.Methods.add_int_int
    System.out.println("adding " + a + " and " + b);
    return a + b;
  }

  // YES "overloading"
  public static int add(int a) {
    return add(a, 10);
  }

  // varargs
  // passed as arrays...
  public static void showAll(String ... strings) { // vararg param must be last
    for(String s : strings) {
      System.out.println(">> " + s);
    }
  }

  public static void main(String[] args) {
    int sum = add(1, 2);
    System.out.println(sum);

    System.out.println(add(4));

    String [] names = {"Fred", "Jim", "Sheila"};
    showAll(names);
    System.out.println("--------------");
    showAll(new String[]{"Fred", "Jim", "Sheila"});
    System.out.println("--------------");
    showAll("Fred", "Jim", "Sheila");
  }
}
