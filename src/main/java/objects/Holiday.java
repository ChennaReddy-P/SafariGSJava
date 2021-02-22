package objects;

public class Holiday extends Date {
  private String name;

  // if ZERO constructors defined, Java compiler creates "default"
  // zero arguments, does "nothing"
  // accessibility is same as the enclosing class (except for enums)
//  public Holiday() {
//    super(); // call to Date()
//  }

  public Holiday(String name, int day, int month, int year) {
    super(day, month, year);
    this.name = name;
  }

  @Override
  public String toString(Holiday this) {
    return "Holiday: " + super.toString() + " which is a holday called " + this.name;
  }

}
