package input_from_user;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CashierProgram2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Item: ");
        String item = sc.nextLine();

        System.out.println("Enter Price: $");
        double price = sc.nextDouble();

        System.out.println("Enter Amount: ");
        int amount = sc.nextInt();

        double total = amount * price;

        DecimalFormat decimalFormat = new DecimalFormat(".00");

        System.out.println("Total: $" + decimalFormat.format(total));

    }
}
