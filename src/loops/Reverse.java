package loops;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        System.out.println("Please input the word: ");
        Scanner sc = new Scanner(System.in);
        System.out.println(reverse(sc.nextLine()));
    }

    //write a method that takes a String and returns
    //a reversed String.

    //ex: public static String reverse(String str){
    //}
    //ex: reverse("Hello") -> olleH
    //without using StringBuilder reverse method.

    public static String reverse(String str) {
        String result = "";

       for(int i = str.length()-1; i >= 0; i--){
           result += str.charAt(i);
       }
       return result;
    }
}
