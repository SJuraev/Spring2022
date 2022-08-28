package data_types;

public class PrimitiveDataTypes {

    public static void main(String[] args) {
        //variables are some data type information name
        //Every piece of info will have a name (variable);
        //and every variable must have a data type.
        //The type of date type depends on the size and type of variable

        //Creating variables is called variable declaration
        //for example: declare a variable with int data type
        //Variables have naming convention as well
        //And it is the same as for class naming convention except the 1st letter
        //It should start from lowerCase
        //example of declaring variables.
        //1
        byte numberLikes;
        int numberOfComments;
        double decimalNumbersUpTo15;
        char gender;
        long numberOfViews;
        float sixToSevenDecimalNumbers;

        //Initializing created variables
        numberLikes = 120;
        System.out.println(numberLikes);

        //2 declaration + initialization(assigning a value to a variable for the first time)
        byte elonMuskAge = 52;
        short mObamaAge = 50;
        int johnDoeAge =28;
        double liters = 1.5;

        //3 declare multiple variables with same data type in one line
        int miles, kilometres, weight; //the line is equivalent to ->
        int exampleMiles;
        int exampleKilometres;
        int exampleWeight;

        miles = 52;
        kilometres = 84;
        weight = 85;


        System.out.println(elonMuskAge); //Elon Musk
        System.out.println(mObamaAge); //Michel Obama
        System.out.println(johnDoeAge); //John Doe
        System.out.println(liters); //liters


    }
}
