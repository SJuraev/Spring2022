package if_then;

import java.util.Scanner;

public class IfElseIfElse {

    public static void main(String[] args) {

        //if else

        //find out if the given number is even or odd?
        //even number is a number dividable by 2 with 0 remainder

        //in if condition we can only have boolean expressions.
        //so whatever you put, eventually what you put inside () must return boolean
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number: ");
        int num = scanner.nextInt();

        if (num % 2==0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
        //Work in labor department
        //We need to write a program which tells
        //if the person is eligible to work

        //people from age 18 to 60 are eligible to work
        //if person younger 18,
        //say You Are a Minor

        //if person is eligible to work
        //say you are eligible to work
        //please fill the application

        //if person is too old
        //say you are a senior
        //Please collect your pension
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = sc.nextInt();
        if(age<18) {
            System.out.println("You are a minor, not eligible to work.");
        }else
            if(age > 18 && age < 60) {
                System.out.println("You are eligible to work, please fill up the application.");
            }else
                if(age>60) {
                    System.out.println("You are a senior, please collect your pension");
                }
    }
}
