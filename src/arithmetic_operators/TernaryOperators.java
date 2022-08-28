package arithmetic_operators;

public class TernaryOperators {

    public static void main(String[] args) {


    /*For ex:
    I want to know where I should go
    If Morning => Go to Gym
    If Evening => Go to DevX Class

     */

        String time = "Morning";

        String whereShouldIGo = time == "Morning" ? "Gym" : "DevX Class";
        System.out.println(whereShouldIGo);

        System.out.println( time == "Morning" ? "Gym" : "DevX Class");

        //the data type of variable on the left will define what you need to after '?'
        //or :

        //if time equals to Morning
        //then return "Gym"
        //: (:=>means otherwise) return "DevX Class"

        String carOffered = "Ferrari";
        boolean buy = carOffered == "Ferrari" ? true : false;
        System.out.println("The car is Ferrari: " + buy);

        //Write my name in upper or lowercase based on my selection

        String casee = "";
        String name = casee == "upper" ? "JOHN" : "john";
        System.out.println(name);

        int num1 = 500;
        int num2 = 645;

        int num3 = 700;

        int max = num1>num2 ? num1 : num2;
        System.out.println("The greater number is: " + max);

        //nested ternary operators.
        int max2 = num1 > num2 && num1 > num3 ? num1 : (num2 > num3 ? num2 : num3);
        System.out.println("The greater number is: " + max2);

        //not used much.
        boolean isExpensive = true;
        boolean isGoodQuality = true;
        boolean buy1 = false;
        buy1 &= isGoodQuality; // => buy1 = buy1 & isGoodQuality
        // buy1 = false & true;
        //buy1 = false;
        System.out.println(buy1);

        int a = 10, b = 5, c = 1, result;
        result = a - ++c - ++b;
        System.out.println(result);







    /*
    int day = xx;
    int month = xx;
    int year = xx;

    boolean gregorianCalendarCutOverDate = day <= 15 && month <=10 && year <=2010;
    System.out.println( "Gregorian calendar cut-over date:  " + gregorianCalendarCutOverDate);
     */


    }
}
