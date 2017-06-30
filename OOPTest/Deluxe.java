public class Deluxe extends Burgers {
  public Deluxe() {
    super("Deluxe Burger", "white", "angus beef", 15.45);
    super.addition1("chips", 1.2);
    super.addition2("drink", 1.11);
  }
  // addition1/2 can be called in the constructors because it is using the parameters created in the Burgers super class instead of this one

  @Override
  public void addition1(String name, double price) {
    System.out.println("Cannot add additional items");
  }

  @Override
  public void addition2(String name, double price) {
    System.out.println("Cannot add additional items");
  }

  @Override
  public void addition3(String name, double price) {
    System.out.println("Cannot add additional items");;
  }

  @Override
  public void addition4(String name, double price) {
    System.out.println("Cannot add additional items");
  }
}
