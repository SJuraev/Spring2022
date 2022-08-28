package input_from_user;

import java.util.Scanner;

/**
We want to ask the user(customer
to enter amount of items, and it's price

 we have to print everything out in one line

 4ex:
       2 Cucumbers $1.99 each
        Total: $3.98;
 */
public class CashierProgram {

    public static void main(String[] args) {

        Scanner cashier;
        cashier = new Scanner(System.in);
        System.out.println("Please enter the item: ");
        String item = cashier.nextLine();


        System.out.println("Quantity: ");
        int quantity;
        quantity = cashier.nextInt();


        System.out.println("Price: $");
        double price;
        price = cashier.nextDouble();

        double totalPrice;
        totalPrice = quantity * price;
        System.out.println(quantity + " " + item + " " + "$" + price + "each");
        System.out.println("Total price: $" + totalPrice);

    }
}
