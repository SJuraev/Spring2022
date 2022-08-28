package input_from_user;

import java.util.Scanner;

public class ScannerWithString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Address: ");
        String address = input.nextLine();

        //difference between input.next() and input.nextLine() for
        //next() => a single word until first whitespace.

        //nextLine() => is for big sentences

        System.out.println("Enter your sex: -> M for Male, F for Female");
        char gender = input.next().charAt(0); //this is how we call char variable input.next().charAt(0);

        System.out.println("Address entered: " + address);
        System.out.println("Gender entered: " + gender);


    }



}
