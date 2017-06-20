public class Main {
  public static void main(String[] args) {

    Dimensions dimensions = new Dimensions(20, 20, 5);
    Case theCase = new Case("2200", "Dell", "240", dimensions);

    Monitor theMonitor = new monitor("27 inch beast", "Dell", 27, new Resolution(2540, 1440));

    Motherboard theMotherboard = new Motherboard("B3-200", "Asus", 4, 6, "v2.64");

    PC thePC = newPC(theCase, theMonitor, theMotherboard);
    thePC.getMonitor().drawPixelAt(1500, 1500, "red");
    thePC.getMotherboard().loadProgram("Windows 1.0");
    thePC.getTheCase().pressPowerButton();
  }
}