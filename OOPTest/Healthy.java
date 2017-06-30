public class Healthy extends Burgers {
  private String addition5Name;
  private double addition5Price;

  private String addition6Name;
  private double addition6Price;

  public Healthy(String meat, double price) {
    super("Healthy Burger", "Rye", meat, price);
  }

  // public double getPrice() {
  //   return price;
  // }

  public void addition5(String name, double price) {
    this.addition5Name = name;
    this.addition5Price = price;
  }

  public void addition6(String name, double price) {
    this.addition6Name = name;
    this.addition6Price = price;
  }

  @Override
  public double total() {
    double hamburgerPrice = super.total();
    if(this.addition5Name != null) {
      hamburgerPrice += this.addition5Price;
    }
    if(this.addition6Name != null) {
      hamburgerPrice += this.addition6Price;
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