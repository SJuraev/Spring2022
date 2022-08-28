package switch_statement;

import java.util.Scanner;

public class SwitchStatementRestrictions {

    public static void main(String[] args) {
        //
        System.out.println("Enter an animal");
        Scanner sc = new Scanner(System.in);
        String animal = sc.nextLine();

        //String chckn = "Chicken";

        switch (animal) {
            case "Chicken":// chckn: =>not allowed only constant values are allowed in cases
                System.out.println("Domestic");
                break;
        }
        //list of constant values: literals, and final variables, ENUMs.
        //literals => values that are used to initialize a variable
        //4,5,612, 'c', "somethingSomething", true or false





    }
}
