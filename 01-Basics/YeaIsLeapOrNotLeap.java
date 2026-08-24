public class YeaIsLeapOrNotLeap {
    // Write a program that checks whether a year is a leap year.
  public static void main(String[] args) {
    int year=2024;

    System.out.println("Year is "+year);
    if(year%4==0)
        System.out.println("Year is Leap");
    else
        System.out.println("Year is Not Leap");
  }

}
