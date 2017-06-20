public class Dog extends Animal {
  private int eyes;
  private int legs;
  private int tail;
  private int teeth;
  private String coat;
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
      super(name, 1, 1, size, weight);
      this.eyes = eyes;
      this.legs = legs; 
      this.tail = tail; 
      this.teeth = teeth;
      this.coat = coat; 

      // 1 represents that all dogs have 1 brain, so you don't need to manually define the brain paramter each time
  }

  public void chew() {
    System.out.println("Dog.chew() was called.");
  }

  @Override
  public void eat() {
    System.out.println("Dog.eat() was called.");
    chew();
    super.eat();
    // this calls the eat method from the super class (Animal)
  }

  public void walk() {
    System.out.println("Dog.walk() was called");
    super.move(5);
  }

  public void run() {
    System.out.println("Dog.run() was called");
    super.move(10);
    // if there is not super keyword, then it cannot be found and will run one in the super class instead 
  }

  private void moveLegs(int speed) {
    System.out.println("Dog.moveLegs() called.");
  }

  public void move(int speed) {
    System.out.println("Dog.move() called.");
    moveLegs(speed);
    super.move(speed);
  }
 
}