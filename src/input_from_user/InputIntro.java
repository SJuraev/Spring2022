package input_from_user;

import java.util.Scanner;

public class InputIntro {

    public static void main(String[] args) {

        //Taking input from users
        //Input is when users enter some values
        //We will have data types and variables but their initialization will be done by users.

        //static ->
        //we want all of our programs to be super dynamic.

        // it can be achieved by using Scanner class from JDK.

        //Scanner sc = new Scanner(System.in);
        //Scanner scanner = new Scanner(System.in);
        //Scanner input = new Scanner(System.in);

        //Create scanner object(variable) only once per class
        Scanner sc = new Scanner(System.in);//This =>(System.in) means input from console,
        // Basically System means-> Console

        System.out.println("Please enter an Integer value: ");
        //green part is executed by scanner class
        int num = sc.nextInt();//if your data type is int on left side, use .nextInt;
        //=> that means, left side data type is the same after .nextXxx
        //besides char, we can use all primitive data types


        //black part by System.out.println
        System.out.println(num);

        //___________________________________________________________________________________________________
        //Write an expression for all unmarried male,
        // age between 21 and 35,
        // with height above 180,
        // and weight between 70 and 80

        System.out.println("Are you married? Enter true for yes and false for no ");
        boolean notMarried = sc.nextBoolean();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Height: ");
        int height = sc.nextInt();
        System.out.println("Weight: ");
        int weight = sc.nextInt();

        boolean isJamesBond = age >= 21 && age <= 35 && height > 180 && weight >=70 && weight <=80 && !notMarried;
        System.out.println( "The man is fit expressions: " + isJamesBond);

    }
}
