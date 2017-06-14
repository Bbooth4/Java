public class Account {
  private int accountNumber;
  private double balance;
  private String customerName;
  private int phoneNumber;

  public Account() {
    this(123, 0.00, "default name", 1234567890);
  }

  public Account(int accountNumber, double balance, String customerName, int phoneNumber) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.customerName = customerName;
    this.phoneNumber = phoneNumber;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public void setBalance(double balance) {
    this.balance = balance; 
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }  

  public void setPhoneNumber(int phoneNumber) {
    this.phoneNumber = phoneNumber;
  }  

  public int getAccountNumber() {
    return this.accountNumber;
  }

  public double getBalance() {
    return this.balance;
  }

  public String getCustomerName() {
    return this.customerName;
  }

  public int getPhoneNumber() {
    return this.phoneNumber;
  }

  public void deposit(double amount) {
    this.balance += amount;
  }

  public void withdraw(double amount) {
    if (amount <= this.balance) {
      this.balance -= amount;
    } else {
      System.out.println("You do not have enough money to withdraw.");
    }
  }
}