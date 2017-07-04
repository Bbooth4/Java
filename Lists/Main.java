import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  private static Scanner scanner = new Scanner(System.in);
  private static GroceryList groceryList;

  public static void main(String[] args) {
    boolean quit = false; 
    int choice = 0;
    printInstructions();

    while(!quit) {
      System.out.println("Enter your choice");
      choice = scanner.nextInt();
      scanner.nextLine();

      switch(choice) {
        case 0:
          printInstructions();
          break;
        case 1:
          groceryList.printList();
          break;
        case 2:
          addItem();
          break;
        case 3:
          modifyItem();
          break;
        case 4:
          removeItem();
          break;
        case 5:
          searchForItem();
          break;
        case 6: 
          processArrayList();
          break;
        case 7:
          quit = true; 
          break;
      }
    }
  }

  public static void printInstructions() {
    System.out.println("\n Press");
    System.out.println("\t 0 - To print choice options.");
    System.out.println("\t 1 - To print the list of grocery items.");
    System.out.println("\t 2 - To add an item to the list.");
    System.out.println("\t 3 - To modify an item in the list.");
    System.out.println("\t 4 - To remove an item from the list.");
    System.out.println("\t 5 - To search for an item in the list.");
    System.out.println("\t 6 - To quit the application.");
  }

  public static void addItem() {
    System.out.print("Please enter the grocery item: ");
    groceryList.addItem(scanner.nextLine());
  }

  public static void modifyItem() {
    System.out.print("Enter the item number: ");
    String itemN = scanner.nextLine();
    System.out.print("Enter replacement item: ");
    String newItem = scanner.nextLine();
    groceryList.modifyItem(itemN, newItem);
  }

  public static void removeItem() {
    System.out.print("Enter the item number: ");
    String itemN = scanner.nextLine();
    groceryList.removeItem(itemN);
  }

  public static void searchForItem() {
    System.out.print("Enter the item to serach for: ");
    String searchItem = scanner.nextLine();
    if (groceryList.onFile(searchItem)) {
      System.out.print("Found " + searchItem + " in our grocery list.");
    } else {
      System.out.print(searchItem + " is not in the shopping list.");
    }
  }

  public static void processArrayList() {
    ArrayList<String> newArray = new ArrayList<String>();
    newArray.addAll(groceryList.getGroceryList());

    ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

    String[] myArray = new String[groceryList.getGroceryList().size()];
    myArray = groceryList.getGroceryList().toArray(myArray);

    // both of these lines will copy an array list, the second one does it in one line but hte first one is more versatile because you can put a variable within it to choose what to copy 
  }
}