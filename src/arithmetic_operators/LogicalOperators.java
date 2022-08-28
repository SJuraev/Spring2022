package arithmetic_operators;

public class LogicalOperators {
    public static void main(String[] args) {
        // || -> conditional OR
        // use cases:
        // SleepIN;
        // you can sleep over if it's Saturday or Sunday;

        String today = "Friday";
        boolean canSleep = today == "Saturday" || today == "Sunday";

        System.out.println("Can I sleep? " + canSleep);

        // Grocery store wants to give a discount to people who are seniors(60)
        // and who spend more than 100$ inclusively

         int age = 50;
         double spending = 199.00;

         boolean discount = age >=60 || spending >= 100;
        System.out.println("Discount: " + discount);













        // let insurance company
        //you want to provide insurance to people who are older than 18 and older than 70
    }

}
