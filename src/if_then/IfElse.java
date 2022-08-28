package if_then;

import java.util.Scanner;
//if statement get compared no matter what
//since it's the beginning of the if and else statement

//else statement's execution will depend on the first if statements result
//so if the first "if" statement returns true then else is skipped
//but in case the first if statement returns false else is executed

public class IfElse {
    //if the number is positive or negative
    public static void main(String[] args) {
        System.out.println("Please input the number: ");
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        if(number>0.1) {
            System.out.println("The number is positive");
        }else
            if(number<0) {
                System.out.println("The number is negative");
            }else
                if(number == 0) {
                    System.out.println("It is zero ");

                }

    }
}
