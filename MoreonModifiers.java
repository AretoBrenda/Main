//An example to demonstrate the differences between static and public methods:

  public class Main {
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }
  public static void main(String[] args) {
     myStaticMethod();// calls static nethod
     //myPublicMethod();// produces an error
       
    Main myObj = new Main();// creates an object of Main
    myObj.myPublicMethod();// calls the public method
  }
}
