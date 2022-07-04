//A method can be called more than once

public class Main {
  static void myMethod() {
    System.out.println("I am being executed");
  }
    public static void main(String[] args) {
      myMethod();
      myMethod();
      myMethod();
    }
}
