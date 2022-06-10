import java.util.Scanner;  
  

  
  public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Input first number: " );
    int num1 = in.nextInt();
    System.out.print("Input second number: ");
    int num2 = in.nextInt();
    System.out.print(num1 + " + " + num2 + " = " +(num1 + num2));
    
        System.out.print("\n");
   
    System.out.print( num1 + " - " + num2 + " = " + (num1 - num2));
    
        System.out.print("\n");
    
     System.out.print( num1 + " / " + num2 + " = " + (num1 / num2));
    
        System.out.print("\n");
    
   System.out.print( num1 + " * " + num2 + " = " + (num1 * num2));
    
        System.out.print("\n");
 
    
  System.out.println( num1 + " % " + num2 + " = " + (num1 % num2));
}
}
