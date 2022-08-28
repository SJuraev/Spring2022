package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayHomework {
    public static void main(String[] args) {

        //create a method which takes
        // int[],double[] or String[].
        //and return a String
        //it should return a String which content of the array
        //in the following format
        //String[] animals = {"Beetle", "Horse", "Cat"};
        // <Cat -> Horse -> Beetle>
        //int[] arr = {12,433,556,77}
        //<77 -> 556 -> 433 -> 12>
        int[] integer = {1, 4, 9, 16, 25, 36, 49, 64, 81};
        System.out.println(Arrays.toString(integer));

        double[] doubles = {0.0, 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9};
        System.out.println(Arrays.toString(doubles));

        String[] strings = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        System.out.println(Arrays.toString(strings));

        String[] students = {"Elon Musk", "Melanie Perkins", "Steve Jobs", "Jane Doe", "Steve Jobs"};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));


        String[] arr = {"Hello", "Hello", "World", "World"};
        String[] arr1 = new String[]{"Hello", "Hello", "World", "World", "a", "a"};
        String[] arr2 = {"A", "A", "B", "B", "C", "C"};

        System.out.println(
                Arrays.toString(
                        getUnique(arr))
        );
        System.out.println(Arrays.toString(getUnique(arr1)));
        System.out.println(Arrays.toString(getUnique(new String[]{"1", "1", "2", "2", "2", "3"})));

        System.out.println("");

        String[] result = getUnique(arr2);
        System.out.println(Arrays.toString(result));
        System.out.println(result.length);


        //printStars(6);
    }

    // "hello world and java".split(" ") -> ["hello", "world", "and", "java"]
    // String.join(" ", a ); -> joins array into the string
    // Given an array arr, and we need to return an array that contains only unique values from given array
    public static String[] getUnique(String[] arr) {
        //1) We don't know the size of the new array

        String s = ""; // store unique values and separate by space

        for (int i = 0; i < arr.length; i++) {
            String cur = arr[i];
            if (!s.contains(cur)) s = s.concat(cur).concat(" ");
        }
        return s.split(" ");
    }

    //      * * * *
    //       * * * *
    //      * * * *
    //       * * * *

    public static void printStars(int size) {
        for (int i = 0; i < size; i++) {//row
            if (i % 2 == 1) System.out.print(" ");//every second row will get a space in front
            for (int j = 0; j < size; j++) {
                System.out.print("* "); // print given number of stars
            }
            System.out.println();
        }

    }
}
