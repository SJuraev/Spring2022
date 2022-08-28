package input_from_user;

import java.util.Scanner;

public class RectangleAreaCalculator {
    public static void main(String[] args) {

        Scanner rectangle = new Scanner(System.in);
        //Perimeter of a rectangle P = 2(a+b)
        //Area of rectangle A=a*b
        System.out.println("Please enter side A: ");
        double sideA = rectangle.nextDouble();
        System.out.println("Please enter side B: ");
        double sideB = rectangle.nextDouble();
        double perimeter = 2*(sideA+sideB);
        System.out.println("Perimeter of a rectangle is: " + perimeter + "cm");
        double area = sideA*sideB;
        System.out.println("Area of a rectangle is: " + area + " cm^2");
    }
}
