//Use recursion to add all of the numbers up to 10.public class Main {
  public class Main {
  public static void main(String[] args) {
    int result = sum(100);
    System.out.println(result);
  }
  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }
}
