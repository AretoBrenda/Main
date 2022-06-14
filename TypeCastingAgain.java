//ype casting is when you assign a value of one primitive data type to another type.

//Narrowing Casting
public class Main {
  public static void main(String[] args) {
    double myDouble = 8.78d;
    int myInt = (int) myDouble; // Manual casting: double to int

    System.out.println(myDouble);   // Outputs 8.78
    System.out.println(myInt);      // Outputs 8
  }
}
