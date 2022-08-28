package arithmetic_operators;

public class Constants {
    //instance variable are defined on the class level

    static final char GENDER = 'M'; //in order to be able to use variable inside the class level
    //it should be static too, we need to add "static" before "final" or whatever keyword in that particular case
    static final int POPULATION = 100_000;


    public static void main(String[] args) {
        //all variables that are created inside a method
        // (inside a second {} are called local variables;

        //imagine a scenario where you want to assign one value to a variable
        //and you want to make sure that variable carries the same value
        //for the entire life of the program
        
        final int DOB = 1988; //final keyword can be put before the declaration of a variable
        //before the data type
        //final variables can only be initialized once.
        
        
        System.out.println(DOB);
        int dob1 = 1995;
        
        System.out.println(dob1);

        final String SSN; //If we put final name it should be with all capital letters separated by UNDER_SCORE
        //in case of more than one word
        SSN = "123-45-6789"; //able to assign a value bc it's the first time we are doing it

        final char PLUS_SIGN = '+';
        final double PI = 3.14;
        System.out.println(PLUS_SIGN + PI + POPULATION + GENDER + SSN);
        //Constants -> postoyannie

        long x = 5000;
        int y = (int) x;
        y+=x; // y = y + x;
        System.out.println(x);//5000
        System.out.println(y);//10000

        x/=y;//x = x/y
        System.out.println("x");//x
        System.out.println(x);//0 -> because it's 5000/10000=0.5 but as it's int we're going to see only 0



        
    }
}
