import java.util.Scanner;

public class ScannerExercise {

    /* A shopkeeper wants to streamline the process of calculating the
    total price of items purchase by a customer and offer discounts based
    on the total amount. Write a java program using the 'Scanner'
    class to assist the shopkeeper in achieving this.

    The shop offers the following items with respective prices:
    Milk - Ksh 67.50
    Bread - Ksh95.00
    Eggs - Ksh20.50
    Sugar - Ksh250.00
    Tea Masala -  Ksh76.99

    The java program should perform the following tasks:
    1. Prompt the shopkeeper to input the quantity of each item
    sold (in integers) using the Scanner class
    2. Calculate the total price of all items
    3. Apply a discount of 10% if the total is over Ksh1000
    4. Display the total price, the applied discount(if any)
       and the final balance payable by the customer
      */

    public static void main(String[] args) {
        // create a scanner object
        Scanner sc = new Scanner(System.in);

        // display the name of your
        System.out.println("==============================================");
        System.out.println("\t\t\t\tCPL Shop");
        System.out.println("==============================================");

        // define the prices of the items
        final double milkPrice = 67.50;
        final double breadPrice = 95.0;
        final double eggPrice = 20.5;
        final double sugarPrice = 250.0;
        final double teaPrice = 76.99;

        // prompt the shopkeeper to enter the quantity of each item
        System.out.print("Enter the quantity of Milk: ");
        int milkQuantity = sc.nextInt();

        System.out.print("Enter the quantity of Bread: ");
        int breadQuantity = sc.nextInt();

        System.out.print("Enter the quantity of Eggs: ");
        int eggsQuantity = sc.nextInt();

        System.out.print("Enter the quantity of Sugar: ");
        int sugarQuantity = sc.nextInt();

        System.out.print("Enter the quantity of Tea Masala: ");
        int teaQuantity = sc.nextInt();

        // calculate the total price of all items
        double totalPrice = (milkPrice * milkQuantity) + (breadPrice * breadQuantity) + (eggPrice * eggsQuantity) + (sugarPrice * sugarQuantity) + (teaPrice * teaQuantity);

        // Apply discount if total price is over Ksh 1000
        double discount = (totalPrice > 1000) ? (totalPrice * 0.10) : 0.0;

        // calculate the final balance payable by the customer
        double finalBalance = totalPrice - discount;

        // display the results
        System.out.println("==============================================");
        System.out.println("Total Price: Ksh. " + totalPrice);
        System.out.println("Discount Applied: Ksh. " + discount);
        System.out.println("Final Balance: Ksh. " + finalBalance);
        System.out.println("==============================================");

        // close the scanner object
        sc.close();
    }
}
