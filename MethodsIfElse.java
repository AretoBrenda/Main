//It is common to use if...else statements inside methods:

public class Main {
  static void CheckAge(int age) {
    if(age < 18) {
      System.out.println("Access denied");
    } else {
      System.out.println("Access granted - You are old enough");
    }
  }
  public static void main(String[] args) {
    CheckAge(20);
  }
}
