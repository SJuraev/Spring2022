package coding_bat;

import java.util.Scanner;

public class WithoutX {

    public static void main(String[] args) {
        /*Given a string, if the first or last chars are 'x', return the string without those 'x' chars, 
        and otherwise return the string unchanged.

        withoutX("xHix") → "Hi"
        withoutX("xHi") → "Hi"
        withoutX("Hxix") → "Hxi"
         */
        System.out.println("Please enter the word: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println("The word without 'x' is: " + withoutX(word));


    }

    public static String withoutX(String str){
        if (str.length() > 0 && str.charAt(0) == 'x') {
            str = str.substring(1);
        }

        if (str.length() > 0 && str.charAt(str.length()-1) == 'x') {
            str = str.substring(0, str.length()-1);
        }
        return str;
    }
}
