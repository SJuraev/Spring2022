package if_then;

import java.util.Scanner;

public class FirstIfThen {

    public static void main(String[] args) {

        //if the given our is less than 11
        //print out - "Good Morning! "

        Scanner hour1 = new Scanner(System.in);
        System.out.println("What time is it now? ");
        int hour = hour1.nextInt();
        if (hour<=11) {
            System.out.println("Good morning sir! ");
            System.out.println("Have Good and Productive Day! ");
        }else if(hour>11 && hour<18) {
            System.out.println("Good afternoon sir! ");
            System.out.println("Have Good and Productive Day! ");
        } else if(hour>=18 && hour<21) {
            System.out.println("Good evening sir! ");
            System.out.println("Have a Good One! ");
        }else if(hour>=21) {
            System.out.println("Good night sir! ");
            System.out.println("Good Dreams! ");
        }

    }
}
