package objects;

public class UseDate {
  public static void main(String[] args) {
    int myBirthDay = 12;
    int myBirthMonth = 7;
    int myBirthYear = 1993;

    System.out.println(Date.asText(myBirthDay, myBirthMonth, myBirthYear));

    Date myBirth = new Date(12, 7, 1993);
//    Date myBirth = new Date();  // new does two things:
    // FIRST Allocate and zero the memory (new's primary job)
    // SECOND delegate to a matching (argument list) "constructor"--actually "initializer"
//    Date.initalize(myBirth, 12, 7, 1993);

//    myBirth.day = 12;
//    myBirth.month = 7;
//    myBirth.year = 1993;

//    System.out.println(Date.asText(myBirth));

    System.out.println(myBirth.toString());

//    myBirth.day = -37; // impossible because of "private"
    System.out.println(myBirth.toString());
    myBirth.setDay(31);
    // Better would be a utility such as "setLastOfMonth()"
    System.out.println(myBirth.toString());

//    myBirth.setDay(-2);

    Holiday h = new Holiday("New Year's Day", 1, 1, 2022);
    System.out.println(h.toString());
    System.out.println(h);
  }

}
