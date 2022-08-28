package data_types;

public class PrimitiveDataTypes2 {

    public static void main(String[] args) {

        byte age = 34; //byte -128 to 127
        short miles = 32000; // short -32768 to 32767
        int population = 2_000_000_000; // int -2147483648 to 2147483647


        System.out.println(age);
         System.out.println(miles);
         System.out.println(population);

         long worldPopulation = 7_800_000_000L; //when you are declaring a big number make sure to put L after the number
        System.out.println(worldPopulation);

        float itemPrice = 12.98f;
        //the decimal pointed numbers are considered to be "double"(data type), so we need to put add f at the end
        System.out.println(itemPrice);

        //boolean is only true or false
        //boolean is little bit special, so we need to put a question like isOn, isCold, isLarge
        //microwave
        boolean isMicrowaveOn = true; //true means - yes (answer to question), and false means no
        boolean has4legs = true;
        boolean has2legs = false;
        System.out.println(isMicrowaveOn);
        System.out.println(has2legs);
        System.out.println(has4legs);

        //any single character
        char gender = 'M';
        char excelentGrade = 'A';
        char goodGrade = 'B';
        System.out.println(gender);
        System.out.println(excelentGrade);
        System.out.println(goodGrade);

        char singleQuote = '\'';
        System.out.println(singleQuote);
        char curlyParentheses = 123; //we put characters inside the singleQuotes because if we just put a random number
        //it will pull out the character which connected to the number(see the ASC II table)
        System.out.println(curlyParentheses);//For example in ASC II table 123 equals to {, 123 -> {


        int num1 = 100;

        //num2 will have the exact same value as num1;
        int num2 = num1;
        System.out.println(num1);
        System.out.println(num2);
         int num10 = 2000;
         int num20 = 1000;
         int temp = num20;
         num20 = num10;
         num10 = temp;

        System.out.println(num10);
        System.out.println(num20);

        //data type casting
        //

        int i = 112323;
        double price = i;

        System.out.println(price);


    }
}
