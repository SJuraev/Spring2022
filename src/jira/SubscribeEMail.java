package jira;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class SubscribeEMail {
    /*
    As a user I want to be able to subscribe to email marketing service by giving my email addrees, so that the program will verify it and:
(B) - if it's a new one, add to db and print out "You Have Been Successfully Subscribed.".
(A) - if it already exists, then print out "You're Already Subscribed."

DB: [a@gmail.com, b@gmail.com, c@gmail.com]

Examples:
Input: d@gmail.com
Output: You Have Been Successfully Subscribed.

Input: b@gmail.com
Output: You're Already Subscribed.

Input: a@gmail.com
Output: You're Already Subscribed.

Check for valid email address:

can contain letters (a-z), numbers (0-9), periods (.), and only one at (@).

cannot contain other characters, signs, symbols or white spaces.
If invalid email address format - "Invalid Input!".

Input: $50@gmail .com
Output: Invalid Input!
     */
    public static void main(String[] args)
    {
        List<String> dataBase =new ArrayList<>();
        dataBase.add("a@gmail.com");
        dataBase.add("b@gmail.com");
        dataBase.add("c@gmail.com");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the email address: ");
        String eMailAddress = scanner.nextLine();
        if (!onlyOneAt(eMailAddress)){
            System.out.println("Invalid Input! ");
        }else
            if(firstCharacterIsSpecial(eMailAddress)){
                System.out.println("Invalid Input! ");
            }else
                if (specialCharBeforeOrAfterAt(eMailAddress)){
                    System.out.println("Invalid Input! ");
                }else
                    if (!dotCom(eMailAddress)){
                        System.out.println("Invalid Input! ");
                    }else
                    if(dataBase.contains(eMailAddress.toLowerCase(Locale.ROOT))){
            System.out.println("You're Already Subscribed.");
        }
        else {
            dataBase.add(eMailAddress);
            System.out.println("You Have Been Successfully Subscribed.");
        }
        System.out.println(dataBase);
    }

    public static boolean dotCom(String eMailAddress){
        return eMailAddress.startsWith("@gmail.com", eMailAddress.length() - 10);
    }
    public static  boolean onlyOneAt(String eMailAddress){
        boolean result = true;
        int counter = 0;
        for (int i = 0; i < eMailAddress.length(); i++){
            if(eMailAddress.charAt(i) == '@'){
                counter++;
            }
        }
        if(counter>1){
            result = false;
        }
        return result;
    }

    public static boolean firstCharacterIsSpecial(String eMailAddress){
        return eMailAddress.charAt(0) == '!' || eMailAddress.charAt(0) == '@' || eMailAddress.charAt(0) == '#' ||
                eMailAddress.charAt(0) == '%' || eMailAddress.charAt(0) == '^' || eMailAddress.charAt(0) == '&' ||
                eMailAddress.charAt(0) == '*' || eMailAddress.charAt(0) == '(' || eMailAddress.charAt(0) == ')' ||
                eMailAddress.charAt(0) == '-' || eMailAddress.charAt(0) == '+' || eMailAddress.charAt(0) == '.' ||
                eMailAddress.charAt(0) == ',' || eMailAddress.charAt(0) == '<' || eMailAddress.charAt(0) == '>' ||
                eMailAddress.charAt(0) == '/' || eMailAddress.charAt(0) == '\\' || eMailAddress.charAt(0) == '|'
                || eMailAddress.charAt(0) == '=';
    }

    public static boolean specialCharBeforeOrAfterAt(String eMailAddress){
        boolean result = false;
        for (int i = 1; i < eMailAddress.length()-1; i ++){
            if ((eMailAddress.charAt(i) == '@' && (eMailAddress.charAt(i - 1) == '!' || eMailAddress.charAt(i + 1) == '!')) ||
                    (eMailAddress.charAt(i) == '@' && (eMailAddress.charAt(i - 1) == '#' || eMailAddress.charAt(i + 1) == '#')) ||
                    (eMailAddress.charAt(i) == '@' && (eMailAddress.charAt(i - 1) == '%' || eMailAddress.charAt(i + 1) == '%')) ||
                    (eMailAddress.charAt(i) == '@' && (eMailAddress.charAt(i - 1) == '^' || eMailAddress.charAt(i + 1) == '^')) ||
                    (eMailAddress.charAt(i) == '@' && (eMailAddress.charAt(i - 1) == '&' || eMailAddress.charAt(i + 1) == '&')) ||
                    (eMailAddress.charAt(i) == '@' && (eMailAddress.charAt(i - 1) == '*' || eMailAddress.charAt(i + 1) == '*')) ||
                    (eMailAddress.charAt(i) == '@' && (eMailAddress.charAt(i - 1) == '(' || eMailAddress.charAt(i + 1) == '(')) ||
                    (eMailAddress.charAt(i) == '@' && (eMailAddress.charAt(i - 1) == ')' || eMailAddress.charAt(i + 1) == ')')) ||
                    (eMailAddress.charAt(i) == '@' && (eMailAddress.charAt(i - 1) == '-' || eMailAddress.charAt(i + 1) == '-')) ||
                    (eMailAddress.charAt(i) == '@' && (eMailAddress.charAt(i - 1) == '+' || eMailAddress.charAt(i + 1) == '+')) ||
                    (eMailAddress.charAt(i) == '@' && (eMailAddress.charAt(i - 1) == '.' || eMailAddress.charAt(i + 1) == '.')) ||
                    (eMailAddress.charAt(i) == '@' && (eMailAddress.charAt(i - 1) == ',' || eMailAddress.charAt(i + 1) == ',')) ||
                    (eMailAddress.charAt(i) == '@' && (eMailAddress.charAt(i - 1) == '<' || eMailAddress.charAt(i + 1) == '<')) ||
                    (eMailAddress.charAt(i) == '@' && (eMailAddress.charAt(i - 1) == '>' || eMailAddress.charAt(i + 1) == '>')) ||
                    (eMailAddress.charAt(i) == '@' && (eMailAddress.charAt(i - 1) == '/' || eMailAddress.charAt(i + 1) == '/')) ||
                    (eMailAddress.charAt(i) == '@' && (eMailAddress.charAt(i - 1) == '\\' || eMailAddress.charAt(i + 1) == '\\')) ||
                    (eMailAddress.charAt(i) == '@' && (eMailAddress.charAt(i - 1) == '|' || eMailAddress.charAt(i + 1) == '|')) ||
                    (eMailAddress.charAt(i) == '@' && (eMailAddress.charAt(i - 1) == '=' || eMailAddress.charAt(i + 1) == '=')) ||
                    (eMailAddress.charAt(i) == '@' && (eMailAddress.charAt(i - 1) == '_' || eMailAddress.charAt(i + 1) == '_')) ||
                            (eMailAddress.charAt(i) == '@' && (eMailAddress.charAt(i - 1) == ' ' || eMailAddress.charAt(i + 1) == ' '))
            ) {
                result = true;
                break;
            }
        }

        return result;
    }
}
