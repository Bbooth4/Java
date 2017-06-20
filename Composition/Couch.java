public class Couch {
  private int legs;
  private String fabric;
  private Cushions theCushions;

  public Couch(int legs, String fabric, Cushions theCushions) {
    this.legs = legs;
    this.fabric = fabric;
    this.theCushions = theCushions;
  }

  public void sit() {
    System.out.println("They say down.");
  }

  public int getLegs() {
    return legs;
  }

  public String getFabric() {
    return fabric;
  }

  public Cushions getTheCushions() {
    return theCushions;
  }
}