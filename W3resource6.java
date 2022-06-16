import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input first number: ");
    int num1 = scanner.nextInt();
     System.out.print("Input second number: ");
    int num2 = scanner.nextInt();
     System.out.print("Input third number: ");
    int num3 = scanner.nextInt();
    
    System.out.println("Average of five numbers is: " +(num1 + num2 + num3) / 3);
  }
}
