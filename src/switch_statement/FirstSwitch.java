package switch_statement;

import java.util.Locale;
import java.util.Scanner;

public class FirstSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the animal name: ");

        //Domestic or wild animal
        //Chicken, Horse, Cat, Dog for Domestic

        //Tiger, Snake, Hippo, Rhino for Wild

        //inside the switch parentheses we need to put a variable that we want to compare.
        String animal = sc.nextLine();
        //after any string variable we can call .toLowerCase() => which will return the whole String lowerCased.
        System.out.println(animal.toLowerCase());
        switch (animal.toLowerCase()){
            //case followed by a constant value:
            case "chicken" :
            case "horse" :
            case  "cat" :
            case "dog" :
                //put the body, block, work.
                System.out.println("Domestic animal");
                //break to finish the body of a case.
                break;

            case "tiger":
            case "snake" :
            case "rhino" :
            case  "hippo":
            case "lion" :
                System.out.println("Wild animal");
                //default is equivalent to "else"
            default:
                System.out.println("We don't have this animal in the list");
                break; //break is optional
        }


    }
}
