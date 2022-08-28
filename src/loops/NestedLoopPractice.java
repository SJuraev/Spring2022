package loops;

import java.util.Locale;
import java.util.Scanner;

public class NestedLoopPractice {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = sc.nextLine().toLowerCase(Locale.ROOT);
        System.out.println(checkIfAllCharsHaveDuplicates(word));

    }

    //Write a function which checks if each character in the
    //String has at least one duplicate character.

    //abecedarian -> false
    //Abba -> true
    //noon -> true
    //Caucasus -> true
    //Hello -> false

    //aaabc


    public static boolean checkIfAllCharsHaveDuplicates(String str) {
        //abba -> true => a == b, a == b, a == a
        //false
        //Hello ->  false => h == e, h == l, h==l, h == o. h == h
        //e == l, e ==l, e == o; e == e

        //Caucasus -> true

        //aabcd -> false

        boolean hasDuplicate = false;

        String checkedCharacters = "";

        for (int i = 0; i < str.length(); i++) {

            if (!checkedCharacters.contains("" + str.charAt(i))) {
                hasDuplicate = false;

                //you can use the current value of an outer loop
                for (int x = i + 1; x < str.length(); x++) {

                    if (str.charAt(i) == str.charAt(x)) {
                        hasDuplicate = true;
                    }
                }
            }
            else {
                continue;
            }

            checkedCharacters += str.charAt(i);
            if (!hasDuplicate) {
                return false;
            }
        }

        return true;
    }
        //String str = "AC";
        //str.contains("A")


    //Solve same problem
    //by counting occurrence of each character
}
