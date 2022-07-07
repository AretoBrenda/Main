//You can have as many parameters as you want:

public class Main {
  int modelYear;
  String modelName;
  
  public Main(int year, String name) {
    modelYear = year;
    modelName = name;
  }
    
     public static void main(String[] args) {
       Main myCar = new Main(1969, "Ford");
      System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
  }
