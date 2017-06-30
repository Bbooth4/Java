public class Burgers {
  private String name;
  private String bread;
  private String meat;
  private double price;

  private String addition1Name;
  private double addition1Price;

  private String addition2Name;
  private double addition2Price;

  private String addition3Name;
  private double addition3Price;

  private String addition4Name;
  private double addition4Price;

  public Burgers(String name, String bread, String meat, double price) {
    this.name = name;
    this.bread = bread;
    this.meat = meat;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public void addition1(String name, double price) {
    this.addition1Name = name;
    this.addition1Price = price;
  }

  public void addition2(String name, double price) {
    this.addition2Name = name;
    this.addition2Price = price;
  }

  public void addition3(String name, double price) {
    this.addition3Name = name;
    this.addition3Price = price;
  }

  public void addition4(String name, double price) {
    this.addition4Name = name;
    this.addition4Price = price;
  }

  public double total() {
    double hamburgerPrice = this.price;
    if(this.addition1Name != null) {
      hamburgerPrice += this.addition1Price;
    }
    if(this.addition2Name != null) {
      hamburgerPrice += this.addition2Price;
    }
    if(this.addition3Name != null) {
      hamburgerPrice += this.addition3Price;
    }
    if(this.addition4Name != null) {
      hamburgerPrice += this.addition4Price;
    }
    return hamburgerPrice;
  }

  // public double additions(boolean lettuce, boolean tomato, boolean bacon, boolean cheese) {
  //   double burgerTotal = this.price; 
  //   boolean[] adds = {lettuce, tomato, bacon, cheese};
  //   // adds.forEach((e) -> {
  //   //   if (e == true) {
  //   //     return this.price += 0.5;
  //   //     System.out.println(this.price);
  //   //   } else {
  //   //     return this.price += 0;
  //   //     System.out.println(this.price);
  //   //   }
  //   // });

  //   for(int i=0; i<=adds.length; i++) {
  //      if (i == true) {
  //       burgerTotal += 0.5;
  //     } else {
  //       burgerTotal += 0;
  //     }
  //   }
  //   return burgerTotal;
  // }
}

// make a veggie burger that is always rye and can have an extra 2 toppings
// make a deluxe burger that doesn't have extra toppings but has chips and a drink