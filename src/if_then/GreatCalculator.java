package if_then;

public class GreatCalculator {
    public static void main(String[] args) {

        //Tell user their grade
        //user needs to input score
        //program should return A, B, C, D,F

        //100-90 => A
        //89-80 => B
        //79-70 => C
        //69-60 => D
        //59-0 => F
        //for all other inputs, print out an error message
        //Wrong Input, Please input between 0-100

        int score = 90;
        String message = "";//empty String


        //code maintainability => is an extremely important
        //practice of good code.
        //Your code should be easy to maintain
        if (score > 89 && score < 101) {
            message = "A";
        }
        else if(score > 79 && score < 90) {
            message = "B";
        }
        else if(score > 69 && score < 80){
            message = "C";
        }
        else if(score > 59 && score < 70) {
            message = "D";
        }
        else if(score>0 && score < 60) {
            message = "F";
        }
        else {
            System.err.println("Wrong input! Please input a score between 0-100!");
        }

        //You are able t use only one print out for all
        //only if all conditions should print out the same message except the variables
        System.out.println("Your Score is: " + message);


    }
}
