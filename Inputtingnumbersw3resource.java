import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Input first number: ");
    int num1 = in.nextInt();
    System.out.print("Input second number: ");
    int num2 = in.nextInt();
    System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
  }
}
/* expected out put
Input first number:  25
Input second number:  5
25 x 5 = 125*/
