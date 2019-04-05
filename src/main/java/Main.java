import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
    boolean quit = false;
    int choice = 0;
    printInstruction();
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGroceryList();
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
                    quit = true;
                    break;
            }
         }
    }

    public static void printInstruction() {
        System.out.println("\n press:");
        System.out.println("\t 0- print choice options");
        System.out.println("\t 1- list grocery items");
        System.out.println("\t 2- add item to list");
        System.out.println("\t 3- modify item");
        System.out.println("\t 4- remove item");
        System.out.println("\t 5- search for an item in list");
        System.out.println("\t 6- quit application");
    }

    public static  void addItem() {
        System.out.println("please enter the grocert item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Current item name: ");
        String itemName = scanner.nextLine();
        System.out.println("Enter new item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemName, newItem);
    }

    public static void removeItem() {
        System.out.println("Enter item number: ");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNumber);
    }

    public static void searchForItem() {
        System.out.println("Enter item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + "in our grocery list");
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }
}
