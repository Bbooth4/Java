public class Player {
  // the wrong way to do this 

  public String name;
  public int hp;
  public String weapon;

  public void loseHealth(int damage) {
    this.hp -= damage;
    if (this.hp <= 0) {
      this.hp = 0;
      System.out.println("The Player is knocked out.");
    }
  }

  public int healthReamaining() {
    return this.hp;
  }
}