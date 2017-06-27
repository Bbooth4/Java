public class Printer {
  private int toner;
  private int pages;
  private boolean duplex;

  public Printer(int toner, int pages, boolean duplex) {
    this.toner = toner;
    this.pages = pages;
    this.duplex = duplex;
  }

  public void fillToner(int t) {
    this.toner += t; 
    if (this.toner > 100) {
      this.toner = 100;
      System.out.println("Current toner " + this.toner);      
    } else if (this.toner < 0) {
      this.toner = 0;
      System.out.println("Current toner " + this.toner);      
    }
  }

  public void printPages(int p) {
    if (this.duplex = false) {
      this.pages += p * 2;
      this.toner -= p * 2;
      System.out.println("Current toner " + this.toner + " and current pages " + this.pages);
    } else {
      this.pages += p;
      this.toner -= p;
      System.out.println("Current toner " + this.toner + " and current pages " + this.pages);      
    }
  }

  public int getToner() {
    System.out.println(this.toner);
    return toner;
  }

  public int getPages() {
    System.out.println(this.pages);
    return pages;
  }

  public boolean isDuplex() {
    return duplex;
  }
}