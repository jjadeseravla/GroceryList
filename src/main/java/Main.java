import java.util.ArrayList;
import java.util.Scanner;

public class Main {
//    private static Scanner scanner = new Scanner(System.in);
//    private static GroceryList groceryList = new GroceryList();
//
//    public static void main(String[] args) {
//    boolean quit = false;
//    int choice = 0;
//    printInstruction();
//        while(!quit) {
//            System.out.println("Enter your choice: ");
//            choice = scanner.nextInt();
//            scanner.nextLine();
//
//            switch(choice) {
//                case 0:
//                    printInstruction();
//                    break;
//                case 1:
//                    groceryList.printGroceryList();
//                    break;
//                case 2:
//                    addItem();
//                    break;
//                case 3:
//                    modifyItem();
//                    break;
//                case 4:
//                    removeItem();
//                    break;
//                case 5:
//                    searchForItem();
//                    break;
//                case 6:
//                    processArrayList();
//                    break;
//                case 7:
//                    quit = true;
//                    break;
//            }
//         }
//    }
//
//    public static void printInstruction() {
//        System.out.println("\n press:");
//        System.out.println("\t 0- print choice options");
//        System.out.println("\t 1- list grocery items");
//        System.out.println("\t 2- add item to list");
//        System.out.println("\t 3- modify item");
//        System.out.println("\t 4- remove item");
//        System.out.println("\t 5- search for an item in list");
//        System.out.println("\t 6- quit application");
//    }
//
//    public static  void addItem() {
//        System.out.println("please enter the grocert item: ");
//        groceryList.addGroceryItem(scanner.nextLine());
//    }
//
//    public static void modifyItem() {
//        System.out.println("Current item name: ");
//        String itemName = scanner.nextLine();
//        System.out.println("Enter new item: ");
//        String newItem = scanner.nextLine();
//        groceryList.modifyGroceryItem(itemName, newItem);
//    }
//
//    public static void removeItem() {
//        System.out.println("Enter item number: ");
//        int itemNumber = scanner.nextInt();
//        scanner.nextLine();
//        groceryList.removeGroceryItem(itemNumber);
//    }
//
//    public static void searchForItem() {
//        System.out.println("Enter item to search for: ");
//        String searchItem = scanner.nextLine();
//        if(groceryList.onFile(searchItem)) {
//            System.out.println("Found " + searchItem + "in our grocery list");
//        } else {
//            System.out.println(searchItem + " is not in the shopping list");
//        }
//    }
//
//    public static void processArrayList() {
//        //ArrayList<String newArray> = new ArrayList<String>();
//        //newArray.addAll(groceryList.getGroceryList());
//
//        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList()); //same as the 2 lines above
//
////        String[] myArray = new String[groceryList].getGroceryList().size();
////        myArray = groceryList.getGroceryList().toArray(myArray); // doing same things as line above
//    }


//    private static Scanner scanner = new Scanner(System.in);
//    private static MobilePhone mobilePhone = new MobilePhone("07969100968");
//
//    public static void main(String[]args){
//        boolean quit = false;
//        startPhone();
//        printActions();
//        while(!quit) {
//            System.out.println("\nEnter action: (6 to show available actions)");
//            int action = scanner.nextInt();
//            scanner.nextLine();
//
//            switch(action) {
//                case 0:
//                    System.out.println("\nShutting down...");
//                    quit = true;
//                    break;
//                case 1:
//                    mobilePhone.printContacts();
//                    break;
//                case 2:
//                    addNewContact();
//                    break;
//                case 3:
//                    updateContact();
//                    break;
//                case 4:
//                    removeContact();
//                    break;
//                case 5:
//                    queryContact();
//                    break;
//                case 6:
//                    printActions();
//                    break;
//            }
//        }
//    }
//
//    private static void addNewContact() {
//        System.out.println("Enter new contact name: ");
//        String name = scanner.nextLine();
//        System.out.println("Enter phone number: ");
//        String phone = scanner.nextLine();
//        Contacts newContact = Contacts.createContact(name, phone);
//        if(mobilePhone.addNewContact(newContact)) {
//            System.out.println("New contact add: name = " + name + " phone = "+ phone);
//        } else {
//            System.out.println("Cant add, " + name + " already on file");
//        }
//    }
//
//    public static void updateContact() {
//        System.out.println("Enter existing contact name: ");
//        String name = scanner.nextLine();
//        Contacts existingContactRecord = mobilePhone.queryContact(name);
//        if (existingContactRecord == null) {
//            System.out.println("Contact not found");
//            return;
//        }
//        System.out.println("Enter new contact name: ");
//        String newName = scanner.nextLine();
//        System.out.println("Enter new contact phone number: ");
//        String newNumber = scanner.nextLine();
//        Contacts newContact = Contacts.createContact(newName, newNumber);
//        if (mobilePhone.updateContact(existingContactRecord, newContact)) {
//            System.out.println("Successfully updated record");
//        } else {
//            System.out.println("Error updating record");
//        }
//    }
//
//    public static void removeContact() {
//        System.out.println("Enter contact name to remove: ");
//        String name = scanner.nextLine();
//        Contacts existingContactRecord = mobilePhone.queryContact(name);
//        if (existingContactRecord == null) {
//            System.out.println("Contact not found");
//            return;
//        }
//        if (mobilePhone.removeContact(existingContactRecord)) {
//            System.out.println("Successfully removed record");
//        } else {
//            System.out.println("Error deleting contact");
//        }
//    }
//
//    public static void queryContact() {
//        System.out.println("Enter contact name to remove: ");
//        String name = scanner.nextLine();
//        Contacts existingContactRecord = mobilePhone.queryContact(name);
//        if (existingContactRecord == null) {
//            System.out.println("Contact not found");
//            return;
//        }
//        System.out.println("Name: " + existingContactRecord.getName());
//    }
//
//    private static void startPhone() {
//        System.out.println("starting phone ...");
//    }
//
//    private static void printActions() {
//        System.out.println("\n Available actions: \npress");
//        System.out.println("0 - to shutdown\n" +
//                "1 - to print contacts\n" +
//                "2 - to add a new contact\n" +
//                "3 - to update an existing contact\n" +
//                "4 - to remove an existing contact\n" +
//                "5 - query if an existing contact exists\n" +
//                "6 - to print a list of available actions.");
//        System.out.println("choose you action: ");
//    }
}


