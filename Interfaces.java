//An interface is a completely "abstract class" that is used to group related methods with empty bodies:

interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}

class Pig implements Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
  public void sleep() {
    System.out.println("Zzz");
  }
}
class Cow implements Animal {
  public void animalSound() {
    System.out.println("Cow say: Moooow");
  }
  public void sleep() {
    System.out.println("ZZzzzzzz");
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig();
    myPig.animalSound();
    myPig.sleep();
    Cow myCow = new Cow();
    myCow.animalSound();
    myCow.sleep();
    
  }
}
