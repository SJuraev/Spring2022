package math_class;

import java.util.Scanner;

public class MathFunctions {

    public static void main(String[] args) {
        //widely used Math functions
        /*
        Task #1
        Step 1. Ask user to input any number
        Step 2. Display the square root of that number
        Example: Please enter a number: 16
        The square root of 16 is 4

        Hint: use Math.sqrt(double a)
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Input the number to get a square root");
        double num = input.nextDouble();

        System.out.println("The square root of " + num + " is: " + Math.sqrt(num));

        //Task # 2
        //get maximum number from 3 numbers

        System.out.println("Please enter 3 numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        input.nextLine();//eating the Line till the end so next time you call scanner,
        // it will start from the fresh line

        double maximum = Math.max(Math.max(num1,num2),num3);
        System.out.println("Maximum number is: " + maximum);


        /*
        Task #4
        Generate a random one-digit number
        And ask user to guess it. User has 3 tries.
        Give hints to the user if their guess bigger or smaller
        than the random number if not guessed correctly

        Hint: use Math.random() - it returns a number between 0.0 and 1
         */
        int randomNum = (int)(Math.random()*10);
        System.out.println("Guess the number: ");
        int response = input.nextInt();

        if(response == randomNum) {System.out.println("Yay! You guessed it right!");}
        else if (response > randomNum) {
            System.out.println("Too big, try again! ");
            System.out.println("Guess the number: ");
            response = input.nextInt();
            if (response == randomNum)
            System.out.println("Yay! You guessed it right! ");
            else System.out.println("You lost...The number was: " + randomNum);}

        else if (response<randomNum) {
            System.out.println("Too small! Try again! ");
            System.out.println("Guess the number: ");
            response = input.nextInt();
            if (response == randomNum)
                System.out.println("Yay! You guessed it right! ");
            else System.out.println("You lost...The number was: " + randomNum);

        }
    }
}
