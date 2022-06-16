//To get more control over the random number, e.g. you only want a random number between 0 and 100, you can use the following formula:

public class Main {
  public static void main(String[] args) {
    int randomNum = (int)(Math.random() * 101);  // 0 to 100
    System.out.println(randomNum);
  }
}
