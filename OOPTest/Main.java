public class Main {
  public static void main(String[] args) {
    Burgers burger = new Burgers("rye", "beef", 4.20);

    // burger.addition1("lettuce", .25);
    // burger.addition2("tomato", .50);
    // burger.addition3("bacon", 1.2);
    // burger.addition4("cheese", 1.12);

    // System.out.println(burger.total());

    System.out.println(burger.additions(true, false, true, false)); 
  }
}