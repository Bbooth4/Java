public class Main {
  public static void main(String[] args) {

    Dimensions dimensions = new Dimensions(20, 20, 5);
    Case theCase = new Case("2200", "Dell", "240", dimensions);

    Monitor theMonitor = new Monitor("27 inch beast", "Dell", 27, new Resolution(1000, 2000));

    Motherboard theMotherboard = new Motherboard("B3-200", "Asus", 4, 6, "v2.64");

    PC thePC = new PC(theCase, theMonitor, theMotherboard);
    thePC.powerUp();
    
    // the below can only happen if the getters are public 
    // thePC.getMonitor().drawPixelAt(1500, 1500, "red");
    // thePC.getMotherboard().loadProgram("Windows 1.0");
    // thePC.getTheCase().pressPowerButton();

    Home theHome = new Home("blue", new Couch(4, "Swede", new Cushions("swede", "green")), new Table(4, "oak"));
  }
}