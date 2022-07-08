//Now we can create Pig and Dog objects and call the animalSound() method on both of them:

 class Animal {
  public void animalSound() {
    System.out.println("Animal makes a sound");
  }
 }
  class Pig extends Animal {
    public void animalSound() {
      System.out.println("The pig says: wee, wee");
    }
  }
  class Dog extends Animal {
    public void animalSound() {
      System.out.println("Tdog says: Bow, wow");
    }
  }
  class Main {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();
    Animal myPig = new Pig();
    Animal myDog = new Dog();
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}
  

      
  
