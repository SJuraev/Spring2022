package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Remove {
        public static void main(String[] args) {
            System.out.println("Please input number or words");
            Scanner sc = new Scanner(System.in);
            String[] remove = {sc.nextLine()};
            StringBuilder fromArray = new StringBuilder(Arrays.toString(remove));
            System.out.println(fromArray);
            System.out.println(removeDuplicateInArray(fromArray));
        }
        public static StringBuilder removeDuplicateInArray(StringBuilder stringBuilder){

            for (int i = 1; i<stringBuilder.length();i++){
                if(stringBuilder.charAt(i) == stringBuilder.charAt(i-1)){
                    stringBuilder.deleteCharAt(i-1);
                }
            }
            return stringBuilder;
        }
}
