//Using the Scanner class to get user input:

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter userName: ");
    String userName = myObj.nextLine();
    System.out.println("User name is: " + userName);
}
}

