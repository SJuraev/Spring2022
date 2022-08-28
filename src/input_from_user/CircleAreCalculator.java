package input_from_user;

import java.util.Scanner;

public class CircleAreCalculator {

    public static void main(String[] args) {

        //Area of a circle => A=PI*r^2
        Scanner circle = new Scanner(System.in);
        System.out.println("Please enter the radius of a circle: ");
        double radius = circle.nextDouble();
        double PI = 3.14;
        double circleArea = PI*(radius*radius);
        System.out.println("The area of the circle is: " + circleArea + "cm^2");
    }
}
