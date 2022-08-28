package methods;

import java.util.Scanner;

//only package statement and import statement can be outside of method
public class MethodDesign1 {

    //any method have to be outside main method but inside a class,
    //except of static methods
    public static void main(String[] args) {

        /**
         * we can call methods inside other methods.
         * in this case we are calling printSumOfTwoNumbers method inside main method.
         * main method is a static method, so we can call printSumOfTwoNumbers method directly.
         */
        printSumOfTwoNumbers(4, 10);

        double result = multiply(3.0, 6.0);
        System.out.println(result);
        System.out.println(multiply(5, 2.9));
        double F = convertCtoF(24);
        System.out.println(F);
        login("NotDemo", "BadPass");
        login("Demo", "TestPassword");

    }

    /**
     * We don't have to put return statement bc the return type is void
     */
    public static void printSumOfTwoNumbers(int num1, int num2) {
        //in method body we can put as many statements as we need to.
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num1 + num2);


    }

    public static double multiply(double mult1, double mult2) {
        double product = mult1 * mult2;
        return product;
    }

    public static double convertCtoF(double c) {
        double f = (c * 9 / 5) + 32;
        return f;
    }

    //when do you print inside vs return
    //it totally depends on your task(requirements).

    //but usually if you have a task to print out something you will just use void
    //but if you have a task to calculate something and give the result then you will need return.
    public static void login(String username, String password) {
        //Success if username = Demo and password = TestPassword,
        //Otherwise => Failure

        if (username.equals("Demo") && password.equals("TestPassword")) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }
    }
}

