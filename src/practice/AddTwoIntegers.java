package practice;

import java.util.Scanner;

public class AddTwoIntegers {

    public static void main(String [] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Please input first number: ");

        int num1 = sc.nextInt();

        System.out.println("Please input second number: ");

        int num2 = sc.nextInt();
        AddTwoIntegers sum = new AddTwoIntegers();
        System.out.println(sum.sumOfTwo(num1, num2));
    }




        public int sumOfTwo(int first, int second){
            int sum = first+second;
            return sum;
        }




    }


