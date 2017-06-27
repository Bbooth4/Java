public class Main {
  public static void main(String[] args) {
  // the wrong way to do this
  //   Player p1 = new Player();
  //   p1.name = "Brandon";
  //   p1.hp = 10;
  //   p1.weapon = "Fists";

  //   int damage = 5;
  //   p1.loseHealth(damage);
  //   System.out.println("Reamining health " + p1.healthReamaining());

  //   damage = 6;
  //   p1.loseHealth(damage);
  //   System.out.println("Reamining health " + p1.healthReamaining());

    EnhancedPlayer player = new EnhancedPlayer("Brandon", 50, "Fists");
    // since I am calling the getHealth() method instead of directly grabbing it like from above, if I change the name of the variables here (health to hp), then it will still work, I don't need to know the variable names on this side 
    System.out.println("Initial health is " + player.getHealth());

    Printer printerTrue = new Printer(50, 0, true);
    Printer printerFalse = new Printer(50, 0, false);

    printerTrue.getToner();
    printerTrue.getPages();
    printerTrue.fillToner(7);
    printerTrue.fillToner(5);
    printerTrue.printPages(15);

    printerFalse.getToner();
    printerFalse.getPages();
    printerFalse.fillToner(12);
    printerFalse.printPages(20);
  }
}
