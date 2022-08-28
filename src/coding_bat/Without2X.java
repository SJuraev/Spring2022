package coding_bat;

import java.util.Scanner;

public class Without2X {
    public static void main(String[] args) {
/*
Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars,
and otherwise return the string unchanged. This is a little harder than it looks.

withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"
 */
        System.out.println("Please enter the word: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println("The word without 'x' is: " + without2X(word));

    }

    public static String without2X(String str) {
        if(str.length()>1 && str.charAt(0) == 'x' && str.charAt(1) == 'x' ){
            str = str.substring(2);
        }else
       if(str.length()> 0 && str.charAt(0) == 'x' ){
           str = str.substring(1);
       }else
       if(str.length()>1 && str.charAt(1) == 'x'){
           str = str.substring(0,1).concat(str.substring(2));
       }
        return str;
    }
}
