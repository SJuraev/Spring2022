package jira;


import java.util.Scanner;

public class ReverseNumbers {
    /*
    Description:
Take an input of any length from a user, digits only. Reverse the number.
If entered anything other than numbers program should not stop and user should be able to input again.

ex: 1234 → 4321

abc → wrong input, try again → 123 → 321
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Input number characters of any amount: ");
        String input = scanner.nextLine();

        System.out.println(reverseNumbers(input));

    }
    public static String reverseNumbers(String input){

        String result = "";
        StringBuilder numbers = new StringBuilder(input);
        if(!input.matches("[0-9]+")){
            result = "Please input only positive digit characters!";
        }
        else
        {
                result = "Reversed output is: " + numbers;
            }

        return result;
    }
}
