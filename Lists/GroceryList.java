import java.util.ArrayList;

public class GroceryList {
  private int[] numbers = new int[50];
  private ArrayList<String> groceryList = new ArrayList<String>();
  // can hold objects
  
  public void addItem(String item) {
    groceryList.add(item);
  }

  public void printList() {
    System.out.println("you have " + groceryList.size() + " items in your list.");
    for(int i=0; i<groceryList.size(); i++) {
      System.out.println((i+1) + ". " + groceryList.get(i));
    }
  }

  public void modifyItem(String currentItem, String newItem) {
    int position = findItem(currentItem);
    if (position >= 0) {
      modifyItem(position, newItem);
    }
  }

  private void modifyItem(int position, String newItem) {
    groceryList.set(position, newItem);
    System.out.println("Grovery item " + (position + 1) + " has been modified.");
  }

  public void removeItem(String item) {
    int position = findItem(item);
    if (position >= 0) {
      removeItem(position);
    }
  }

  private void removeItem(int position) {
    groceryList.remove(position);
  }

  public int findItem(String searchItem) {
    return groceryList.indexOf(searchItem);
  }

  public boolean onFile(String searchItem) {
    int position = findItem(searchItem);
    if (position >= 0) {
      return true;
    }
    return false; 
  }
}