import Items.MyLinkedList;
import Items.ListItem;
import Items.Node;
import Items.NodeList;
import PlayerMonster.ISaveable;
import PlayerMonster.Player;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    //    private static Scanner scanner = new Scanner(System.in);
//    private static GroceryList groceryList = new GroceryList();
//
    public static void main(String[] args) {
        //----------------------------1------------------------------
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


        //-------------------------2------------------------------
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


        //-------------------3-------------------------------------

//        Bank bank = new Bank("Halifax");
//        bank.addBranch("Brixton");
//        bank.addCustomer("Brixton", "Jade", 50.00);
//        bank.addCustomer("Brixton", "Tim", 200.34);
//        bank.addCustomer("Brixton", "Rob", 145.12);
//        bank.addCustomerTransaction(" Brixton", "Jade", 32.23);
//        bank.addCustomerTransaction("Brixton", "Tim", 204.94);
//        bank.addCustomerTransaction("Brixton", "Jade", 90.58);
//        bank.addCustomerTransaction("Brixton", "Tim", 1.21);
//        bank.addCustomerTransaction("Brixton", "Rob", 390.52);
//
//        bank.addBranch("Camden");
//        bank.addCustomer("Camden", "Jade", 400.23);
//        bank.addCustomer("Camden", "Tim", 13.44);
//        bank.addCustomer("Camden", "Rob", 109.65);
//
//        bank.listCustomers("Brixton", true)


        //--------------------------4----------------------------------------
//        Player tim = new Player("tim", 10, 15);
//        System.out.println(tim.toString());
//        saveObject(tim);
//        tim.setHitPoints(9);
//        System.out.println(tim);
//        tim.setWeapon("Stormbringer");
//        saveObject(tim);
//        loadObject(tim);
//        System.out.println(tim);
//
////        ISaveable werewolf = new Monster("Werewolf", 20, 40);
////        System.out.println(werewolf);
////        saveObject(werewolf);
//
//    }
//
//    public static ArrayList<String> readValues() {
//        ArrayList<String> values = new ArrayList<String>();
//
//        Scanner scanner = new Scanner(System.in);
//        boolean quit = false;
//        int index = 0;
//        System.out.println("Choose\n" +
//                "1 to enter a string\n" +
//                "0 to quit");
//
//        while (!quit) {
//            System.out.println("Choose an option: ");
//            int choice = scanner.nextInt();
//            scanner.nextLine();
//            switch (choice) {
//                case 0:
//                    quit = true;
//                    break;
//                case 1:
//                    System.out.println("Enter a string: ");
//                    String stringInput = scanner.nextLine();
//                    values.add(index, stringInput);
//                    index++;
//                    break;
//            }
//        }
//        return values;
//    }
//
//
//    public static void saveObject(ISaveable objectToSave) {
//        for (int i = 0; i < objectToSave.write().size(); i++) { //using .write() to determine the size
//            //.write() returns a list
//            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
//        }
//    }
//
//    public static void loadObject(ISaveable objectToLoad) {
//        ArrayList<String> values = readValues();
//        objectToLoad.read(values); //looking for .read(), which all objects have
//        //here we have the data which we've typed and we're going back to the player object and
//        //extract the read method and extract the necessary data out and save that in the object values for the name etc


        // -----------------------------------------------5-----------------------------------------------


        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());
        //create a string data array to avoid typing loads of addItem instructions
        String stringData = "Darwin, Brisbane, Perth, Melbourne, Canberra, Adelaide, Sydney, Canberra";
        //String stringData = "4 7 1 9 5 6 0 2 3";

        String[] data = stringData.split(" "); //the space is what ive chosen to separate the elements in the array
        for (String s : data) {
            //create new item with value set to the string s
            list.addItem(new Node(s));
        }
        list.traverse(list.getRoot());
    }
}



