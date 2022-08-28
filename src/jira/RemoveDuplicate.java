package jira;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate {

    public static void main(String[] args) {

        System.out.println("Please input your number or words");
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();

        System.out.println(removeDuplicates(str));


    }

    public static StringBuilder removeDuplicates(String string) {

        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        String str = string.toLowerCase(Locale.ROOT);

        for(int i=0; i<str.length(); i++){
            Character character = str.charAt(i);

            if(!set.contains(character)){
                set.add(character);
                sb.append(character);
            }

        }

        return sb;
    }

}