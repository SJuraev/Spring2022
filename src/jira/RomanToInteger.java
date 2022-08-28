package jira;

import java.util.Locale;
import java.util.Scanner;

/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II.
 The number 27 is written as XXVII, which is XX + V + II.
Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
Instead, the number four is written as IV. Because the one is before the five we subtract it making four.
The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.


Constraints:

1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 */
public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println("It is guaranteed that input is a valid roman numeral in the range [1, 3999].");
        System.out.println("If your input is not a valid roman numeral, the program will convert it to 0.");
        System.out.println("Please input Roman numbers to convert to integer: ");
        Scanner scanner = new Scanner(System.in);
        String romanNumbers = scanner.nextLine();
        System.out.println(romanNumbers + " converts to " + romanToInteger(romanNumbers));
    }
    //I V X L C D M
    public static int romanToInteger(String roman) {


        int number = 0;
        for (int i = 0; i < roman.length(); i++) {
            char c = roman.charAt(i);
            switch (c) {
                case 'I':
                    number = (i != roman.length() - 1 && (roman.charAt(i + 1) == 'V' || roman.charAt(i + 1) == 'X'))
                            ? number - 1
                            : number + 1;
                    break;
                case 'V':
                    number += 5;
                    break;
                case 'X':
                    number = (i != roman.length() - 1 && (roman.charAt(i + 1) == 'L' || roman.charAt(i + 1) == 'C'))
                            ? number - 10
                            : number + 10;
                    break;
                case 'L':
                    number += 50;
                    break;
                case 'C':
                    number = (i != roman.length() - 1 && (roman.charAt(i + 1) == 'D' || roman.charAt(i + 1) == 'M'))
                            ? number - 100
                            : number + 100;
                    break;
                case 'D':
                    number += 500;
                    break;
                case 'M':
                    number += 1000;
                    break;
            }
        }

        return number;
    }
}
