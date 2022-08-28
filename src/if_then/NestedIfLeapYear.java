package if_then;

import java.util.Scanner;

public class NestedIfLeapYear {
    public static void main(String[] args) {


        //Write a program which will find out,
        // if the given year is leap or not

        //leap years are the ones that have 366days

        //To be a leap year, the year number must be divisible by four
        // – except for end-of-century years, which must be divisible by 400.
        //This means that the year 2000 was a leap year,
        // although 1900 was not. 2020, 2024 and 2028 are all leap years.

        System.out.println("Please input the year: ");
        Scanner leap = new Scanner(System.in);
        int inputYear = leap.nextInt();

        if (inputYear % 4 == 0 && inputYear % 100 != 0 || (inputYear % 100 == 0 && inputYear % 400 == 0)) {
            System.out.println(inputYear + " is a leap Year");
        } else {
            System.out.println(inputYear + "is not a leap Year");

        }
    }
}
