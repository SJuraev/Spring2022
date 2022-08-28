package arithmetic_operators;

public class MathExpression2 {
    public static void main(String[] args) {
        int num = 300;
        int num1 = 30;

        //addition
        int sum = num+num1;
        int sum1 = 300+30;

        System.out.println(sum);
        System.out.println(sum1);

        int difference = num - num1;
        System.out.println(difference);

        int multiplication = num * num1;
        System.out.println(multiplication);

        int division = num / num1;
        System.out.println(division);

        //Grocery store
        double priceOfAnOrange = 0.99;
        int amountOfOranges = 2;

        double implicitCasting = amountOfOranges;
        System.out.println(implicitCasting);

        int totalInt = (int) (priceOfAnOrange * amountOfOranges); // casting takes place before math operations
        //that's why we need to put (priceOfAnOrange * amountOfOranges) in parentheses
        System.out.println(totalInt);

        //int explicitCasting = (int) (priceOfAnOrange * amountOfOranges);


        double total = priceOfAnOrange * amountOfOranges;
        System.out.println(total);

        System.out.println("Price of an Item: $"+ priceOfAnOrange);
        System.out.println("Amount of Items: EA "+ amountOfOranges);
        System.out.println("Total:\t\t\t $" + total);

        //precedence => priority, order.

    }
    //Math operations we usually use between two number variables.
    //implicit(skritiy) => indirect
    //explicit(yavniy) => direct

}
