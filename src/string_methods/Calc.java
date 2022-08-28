package string_methods;

public class Calc {

    public static void main(String[] args) {
        System.out.println(multiply(12,10));

        System.out.println(multiply(12.3,10.5));

        System.out.println(multiply("12.3","10.5"));


    }

    //method overloading allows us to use same method name for multiple methods with different parameter.

    //multiply two doubles
    public static double multiply(double num1, double num2){
        return num1*num2;
    }
    //multiply two integers
    public static int multiply(int num1, int num2){
        return num1*num2;
    }
    //multiply two integers
    public static double multiply(String num1, String num2){
        return Double.parseDouble(num1)*Double.parseDouble(num2);

    }

}
