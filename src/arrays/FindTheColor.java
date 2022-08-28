package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTheColor {
    public static void main(String[] args) {
        List<String> colors;
        colors = Arrays.asList("Red", "Green", "Orange", "White", "Black");
        List<String> redGreen;
        redGreen = Arrays.asList("Red", "Green");
        findTheColor(colors);
        System.out.println(redGreen);
        changeGreenToWhite(redGreen);
    }
    /*Please write a program that prints all elements of the ArrayList then try to find "Red" color,
         and print out:Found the element or there is no such elements.
         */
    public static void findTheColor(List<String> colorList){
        System.out.println(colorList);
        List<String> foundColor = new ArrayList<>();
        for(String list : colorList){
            if(list.equals("Red")){
                foundColor.add(list);
            }
        }
        System.out.println("Found The Element: " + foundColor);
    }
    public static void changeGreenToWhite(List<String> redGreen){
        redGreen.set(1, "White");
        System.out.println(redGreen);
    }

}
