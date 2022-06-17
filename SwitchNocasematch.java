//The default keyword specifies some code to run if there is no case match:
public class Main {
  public static void main(String[] args) {
    int month = 4;
    switch (month) {
      case 6:
        System.out.println("Its June");
        break;
      case 7:
        System.out.println("Its the month of September");
        break;
      default:
        System.out.println("Looking forward to Christmas");
    }    
  }
}
