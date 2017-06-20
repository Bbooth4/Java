public class PC {
  private Case theCase;
  private Monitor monitor;
  private Motherboard motherboard;

  public PC(Monitor monitor, Motherboard motherboard) {
    this.thecase = theCase;
    this.monitor = monitor;
    this.motherboard = motherboard;
  }

  public Case getTheCase() {
    return theCase;
  }

  public Monitor getMonitor() {
    return monitor;
  }

  public Motherboard getMotherboard() {
    return motherboard;
  }
}