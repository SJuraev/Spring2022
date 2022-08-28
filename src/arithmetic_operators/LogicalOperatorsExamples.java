package arithmetic_operators;

public class LogicalOperatorsExamples {
    public static void main(String[] args) {

        //Write an expression for all unmarried male,
        // age between 21 and 35,
        // with height above 180,
        // and weight between 70 and 80

        boolean notMarried = false;
        int age = 30;
        int height = 181;
        int weight = 77;

        boolean isJamesBond = age >= 21 && age <= 35 && height > 180 && weight >=70 && weight <=80 && !notMarried;
        System.out.println( "The man is fit expressions: " + isJamesBond);

        //with booleans we don't use == signs
        // be true == true => true;
        //true

        // false == true => false;
        //false;

    }
}
