import java.util.Scanner;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.ExistingAnnotationsType;

import java.util.ArrayList;

public class Main {
  private static Scanner scanner = new Scanner(System.in);
  private static Phone phone = new Phone("111 111 1111");

  public static void main(String[] args) {
    boolean quit = false;
    startPhone();
    printActions();
    while(!quit) {
      System.out.println("/nEnter action: (6 to show available actions)");
      int action = scanner.nextInt();
      scanner.nextLine();

      switch (action) {
        case 0:
          quit = true;
          break;
        case 1:
          phone.printContacts();
          break;
        case 2:
          addContact();
          break;
        case 3:
          updateContact();
          break;
        case 4:
          removeContact();
          break;
        case 5:
          queryContact();
          break;
        case 6: 
          printActions();
          break;
      }
    }
  }

  private static void addContact() {
    String name = scanner.nextLine();
    System.out.println("Enter phone number: ");
    String phones = scanner.nextLine();
    Contact newContact = Contact.createContact(name, phones);
    if (phone.addNewContact(newContact)) {
      System.out.println("New contact added: " + name + " " + phones);
    } else {
      System.out.println("Cannot add " + name);
    }
  }

  private static void updateContact() {
    String name = scanner.nextLine();
    Contact eixstingContactRecord = phone.queryContact(name);
    if (eixstingContactRecord == null) {
      return; 
    }

    System.out.println("Enter new contact name: ");
    String newName = scanner.nextLine();
    System.out.println("Enter new contact phone number: ");
    String newNumber = scanner.nextLine();
    Contact newContact = Contact.createContact(newName, newNumber);
    if (phone.updateContact(eixstingContactRecord, newContact)) {
      System.out.println("Successfully updated record");
    } else {
      System.out.println("Error updating record");
    }
  }

  private static void removeContact() {
    String name = scanner.nextLine();
    Contact eixstingContactRecord = phone.queryContact(name);
    if (eixstingContactRecord == null) {
      return; 
    }

    if (phone.removeContact(eixstingContactRecord)) {
      System.out.println("Successfully deleted");
    } else {
      System.out.println("Failed deletion");
    }
   }

   private static void queryContact() {
    String name = scanner.nextLine();
    Contact eixstingContactRecord = phone.queryContact(name);
    if (eixstingContactRecord == null) {
      return; 
    }

    System.out.println("Name: " + eixstingContactRecord + " phone number is " + eixstingContactRecord.getPhoneNumber());
    if (phone.removeContact(eixstingContactRecord)) {
      System.out.println("Successfully deleted");
    } else {
      System.out.println("Failed deletion");
    }
   }

  private static void startPhone() {
    System.out.println("Starting phone...");
  }

  private static void printActions() {
    System.out.println("\nAvailable actions: \npress");
    System.out.println("0 - to shutdown\n" + 
                       "1 - to print contacts\n" +
                       "2 - to add a new contact\n" +
                       "3 - to update an existing contact\n" +
                       "4 - to remove an existing contact\n" +
                       "5 - query if an existing contact exists\n" +
                       "6 - to print a list of available actions\n" );
    System.out.println("Choose your action.");
  }
}