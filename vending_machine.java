// import java.util.Scanner;

// public class vending_machine {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         while (true) {
//             // Display menu
//             System.out.println("MENU");
//             System.out.println("Item 1: Chips - Rs 20");
//             System.out.println("Item 2: Soda - Rs 30");
//             System.out.println("Item 3: Chocolate - Rs 40");
//             System.out.println("Enter the number of the item you want to buy (or 0 to exit):");

//             // Get item selection
//             int selection = scanner.nextInt();

//             if (selection == 0) {
//                 System.out.println("Exiting the vending machine. Have a nice day!");
//                 break;
//             }

//             int price = 0;
//             switch (selection) {
//                 case 1:
//                     System.out.println("You selected: Chips");
//                     price = 20;
//                     break;
//                 case 2:
//                     System.out.println("You selected: Soda");
//                     price = 30;
//                     break;
//                 case 3:
//                     System.out.println("You selected: Chocolate");
//                     price = 40;
//                     break;
//                 default:
//                     System.out.println("Invalid selection. Please try again.");
//                     continue;
//             }

//             System.out.println("Please insert Rs " + price + ":");
//             int payment = scanner.nextInt();

//             if (payment >= price) {
//                 System.out.println("Dispensing your item.");
//                 if (payment > price) {
//                     System.out.println("Returning change: Rs " + (payment - price));
//                 }
//             } else {
//                 System.out.println("Insufficient payment. Please insert at least Rs " + price);
//             }
//         }

//         scanner.close();
//     }
// }
import java.util.Scanner;

class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int price = 0;
        int item = 0;

        do {
            // Displaying the menu
            System.out.println("\nMenu:");
            System.out.println("Item 1: Rs 20");
            System.out.println("Item 2: Rs 30");
            System.out.println("Item 3: Rs 40");
            System.out.println("Enter 0 to exit.");

            // Asking the user to select an item
            System.out.print("Select the item (1, 2, or 3): ");
            item = scanner.nextInt();

            // If the user wants to exit, break the loop
            if (item == 0) {
                System.out.println("Thank you for using the vending machine. Goodbye!");
                break;
            }

            // Defining the price based on the selected item
            if (item == 1) {
                price = 20;
            } else if (item == 2) {
                price = 30;
            } else if (item == 3) {
                price = 40;
            } else {
                System.out.println("Invalid item selected. Please select a valid item.");
                continue;  // Continue the loop if the selection is invalid
            }

            // Asking the user to input the amount they are paying
            System.out.print("Enter the amount you are paying: Rs ");
            int amountPaid = scanner.nextInt();

            // Checking if the amount paid is sufficient
            if (amountPaid >= price) {
                int change = amountPaid - price;
                System.out.println("Item dispensed. Your change is Rs " + change);
            } else {
                System.out.println("Insufficient amount. Please try again with enough money.");
            }

        } while (item != 0);  // The loop will continue until the user enters 0 to exit

        scanner.close();
    }
}