import java.util.ArrayList;

public class Bank {
  private String name; 
  private ArrayList<Branch> branches;

  public Bank(String name) {
    this.name = name; 
    this.branches = new ArrayList<Branch>();
  }

  public boolean addBranch(String branchName) {
    if (findBranch(branchName) == null) {
      this.branches.add(new Branch(branchName));
        return true;
    }
    return false; 
  }

  public boolean addCustomer(String branchName, String customerName, double initialAmount) {
    Branch branch = findBranch(branchName);
    if (branch != null) {
      return branch.newCustomer(customerName, initialAmount);
    }
    return false; 
  }

  public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
    Branch branch = findBranch(branchName);
    if (branch != null) {
      return branch.newTransaction(customerName, amount);
    }
    return false; 
  }

  private Branch findBranch(String branchName) {
      for(int i=0; i<this.branches.size(); i++) {
        if (this.branches.get(i).getName().equals(branchName)) {
          return this.branches.get(i);
        }
      }
      return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions){
      Branch branch = findbranch(branchName);
      if (branch != null) {
        System.out.println("Customer's details for branch " + branch.getName());
      }
      return false; 
    }
}