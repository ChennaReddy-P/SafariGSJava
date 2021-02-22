package objects;

import java.util.List;

public class Date {
  private int day;
  private int month;
  private int year;

  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    if (day < 1 || day > 31) { // Not good enough!!!
      throw new IllegalArgumentException("Bad day");
    }
    this.day = day;
  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

//  class A{}

  // "Constructor" taking zero arguments.
  // ALSO has hidden Date this as "first arg"
  // CANNOT be explict about Date this in a constructor
  public Date() {
    System.out.println("Building a date with zero arguments");
  }

  public Date(/*@NotNull Date this, */int day, int month, int year) {
    System.out.println("Building a date with d/m/y");
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public void intialize(/*@NotNull Date this, */int day, int month, int year) {
    initalize(this, day, month, year);
  }

  public static void initalize(Date d, int day, int month, int year) {
    d.day = day;
    d.month = month;
    d.year = year;
  }

  public static String dayName(int d) {
    switch (d) {
      case 0:
        return "Saturday";
      case 1:
        return "Sunday";
      case 2:
        return "Monday";
      case 3:
        return "Tuesday";
      case 4:
        return "Wednesday";
      case 5:
        return "Thursday";
      case 6:
        return "Friday";
      default:
        throw new IllegalArgumentException("Bad day");
    }
  }

  private static List<String> monthNames = List.of(
      "January", "February", "March", "April", "May", "June",
      "July", "August", "September", "October", "November", "December");

  public static String monthName(int month) {
    if (month < 1 || month > 12) throw new IllegalArgumentException("Bad month");
    return monthNames.get(month - 1);
  }

  public static int dayOfWeek(int day, int month, int year) {
    // Zeller's congruence
    if (month < 3) {
      month += 12;
      year -= 1;
    }
    return (day + (13 * (month + 1) / 5) + year + year / 4 - year / 100 + year / 400) % 7;
  }

  public static int dayOfWeek(Date d) {
    return dayOfWeek(d.day, d.month, d.year);
  }

  //  public int dayOfWeek(Date this) {
  public int dayOfWeek() {
    return dayOfWeek(this.day, this.month, this.year);
  }

  public static String asText(int day, int month, int year) {
    return "Date: " + dayName(dayOfWeek(day, month, year))
        + ", " + day + " of " + monthName(month) + ", " + year;
  }

  //  public /*static*/ String asText(Date this) { // "instance" method
  public String toString() { // "instance" method
    return "Date: " + dayName(dayOfWeek(this))
        + ", " + this.day + " of " + monthName(this.month) + ", " + this.year;
  }
}
