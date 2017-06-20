public class Home {
  private String color;
  private Couch theCouch;
  private Table theTable;

  public Home(String color, Couch theCouch, Table theTable) {
    this.color = color; 
    this.theCouch = theCouch;
    this.theTable = theTable;
  }

  public void talk() {
    speak("Hello");
  }

  private void speak(String speak) {
    System.out.println("The person said " + speak);
  }

  public String getColor() {
    return color;
  }

  public Couch getTheCouch() {
    return theCouch;
  }

  public Table getTheTable() {
    return theTable;
  }
}