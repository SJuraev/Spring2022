package arithmetic_operators;

public class TextAndNums {
    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        int i = a+b;

        a = 5; //when you rewrite the variable's value it calls reassignment and java will read as the last line
        //SO a equals 5 from the line 9 in this case

        System.out.println("Text " + i); //text 21
        System.out.println( " some text " + a + b);//=> some text 1011
        System.out.println( " " + (a+b)); //=> 21
        // System.out.println( " text " + a - b ); // Strings can only work with +
        System.out.println( " text " + (b-a)); // text 1
        System.out.println( " apples " + a * b); // apples 110, because * has higher precedence than +

        System.out.println("hello " + (double)a/b);//if you have 2 different data types in the operation
        //java is going to cast all variables involved in the operation to the biggest data type.
        System.out.println("hello " + a/(double)b);
        //System.out.println("line 15 " * b ); you can only use + with String.






    }

}
