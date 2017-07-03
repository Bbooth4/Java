class Car {
  private String name;
  private int cylinders;
  private boolean engine;
  private int wheels;

  public Car(String name, int cylinders) {
    this.name = name;
    this.cylinders = cylinders;
    this.engine = true;
    this.wheels = 4;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isEngine() {
    return engine;
  }

  public void setEngine(boolean engine) {
    this.engine = engine;
  }

  public int getCylinders() {
    return cylinders;
  }

  public void setCylinders(int cylinders) {
    this.cylinders = cylinders;
  }

  public int getWheels() {
    return wheels;
  }

  public void setWheels(int wheels) {
    this.wheels = wheels;
  }

  public boolean startEngine(boolean status) {
    return status;
  }

  public int accelerate(int speed) {
    if (startEngine(false)) {
      System.out.println("The car is not on.");
      return -1;
    }
     return speed;
  }

  public int brake() {
    if (startEngine(false)) {
      System.out.println("The car is not on."); 
      return -1;
    }
    return accelerate(0);
  }
}

class Car1 extends Car {
  public Car1(String name, int cylinders) {
    super(name, cylinders);
  }
  
  @Override
  public boolean startEngine(boolean status) {
    return status; 
  }
}

class Car3 extends Car {
  public Car3(String name, int cylinders) {
    super(name, cylinders);
  }
}

public class Main {
  public static void main(String[] args) {
    Car car = new Car("Car1", 2);

    System.out.println(car.startEngine(true));
    System.out.println(car.accelerate(10));
    System.out.println(car.accelerate(5));
    System.out.println(car.brake());

  }
}