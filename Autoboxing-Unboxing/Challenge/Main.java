import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Bank bank = new Bank("BMO");

    bank.addBranch("Saturn");

    bank.addCustomer("Saturn", "Me", 100.50);
    bank.addCustomer("Saturn", "Not me", 55.23);

    bank.addBranch("B");
    bank.addCustomer("B", "Steve", 200.56);

    bank.addCustomerTransaction("Saturn", "Me", 52.47);

    bank.listCustomers("Saturn", false);
    
  }
}