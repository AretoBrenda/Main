import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Input a number: ");
    int num1 = in.nextInt(); 
    if(num1 % 2 ==0) {
    System.out.println(1);
    }else {
      System.out.println(0);
    }
    
    
  }
}
