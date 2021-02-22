package conditions;

public class Conditions {
  public static void main(String[] args) {
    int day = 6;
    switch (day) {
      case 0:
        System.out.println("Saturday");
        break;
      case 1:
        System.out.println("Sunday");
        break;
      case 2:
        System.out.println("Monday");
        break;
      default:
        System.out.println("Not yet implemented");
        break;
    }

  }
}
