package input_from_user;

import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {
        //Convert gallons to liters
        //We take gallons and convert to liters

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input liters: ");
        double liters = scanner.nextDouble();
        double gallons = (liters*3.78);
        System.out.println("Result is: " + gallons + " Gallons");

    }
}
