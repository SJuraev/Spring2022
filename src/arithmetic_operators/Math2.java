package arithmetic_operators;

public class Math2 {
    public static void main(String[] args) {
        int km = 10;
        double miles = km / 1.6;

        System.out.println(km + "km " + "equals " + miles + "miles");

        int num1 = 10;
        int num2 = 99;
        int sum = num1 + num2;

        System.out.println("num1 + num2 = " + sum);

        //modulo modulus
        //% -> modulo operator
        //Which stands for a remainder(ostatok) of a division
        int i = 77 % 5;
        System.out.println(i); //When you divide 77 by 5 the reminder is 2 -> this is modulo

        //real life use cases of modulo
        int num = 25;

        int result = num%2;
        System.out.println(result);
        System.out.println( num + num1 + num2 + " result");
        System.out.println(num + " " + num1 + num2 + "result");//

        int a = 10;
        int b = 11;
        System.out.println(" " + a + b); //=> 1011 because there is no parentheses after " " +
        System.out.println(" " + (a + b)); //=> 21 after we add parenthesis next to the " " +
        System.out.println(" "+ a*b); //=> 110 if we multiply a and b it will multiply it before printing it out to console







    }
}
