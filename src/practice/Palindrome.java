package practice;

import java.util.Scanner;

public class Palindrome {
    /*
    A string is said to be a palindrome if it is the same if we start reading it from left to right or right to left.
     So let us consider a string “str”, now the task is just to find out with its reverse string is the same as it is.

Example:

Input : str = "abba"
Output: Yes

Input : str = "geeks"
Output: No
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the word which you want to check to be Palindrome or not: ");
        String input = scanner.nextLine();
        System.out.println(isPalindrome(input));

    }

    public static boolean isPalindrome(String str){
        boolean palindrome = true;

        for (int i = 0; i < str.length()/2; i ++){
            if (str.charAt(i) != str.charAt(str.length() - (1 + i))) {
                palindrome = false;
                break;
            }
        }
        return palindrome;
    }
}
