package if_then;

import java.util.Scanner;

public class Balance {
    //zelle application
    //write a logic to approve money transfer
    //reqs:must have enough balance
    //transfer amount should not be more that 800
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Input transfer amount: ");
        double balance = 10000;
        double transactionLimit = 2000;
        double transactionAmount = sc.nextDouble();
        if (transactionAmount > transactionLimit) {
            System.out.println("Your transaction exceeds allowed amount $2000 ");
        }

        if (transactionAmount <=transactionLimit && balance >=transactionAmount) {
            System.out.println("Transfer success! ");
            balance -= transactionAmount;
        } else {
        System.out.println("Transfer declined");
        }
        System.out.println("Your Balance is: " + balance);

    }
}
