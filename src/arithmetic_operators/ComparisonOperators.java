package arithmetic_operators;

public class ComparisonOperators {

    public static void main(String[] args) {
        System.out.println(10==10);//true
        System.out.println(10==-10);//false
        System.out.println(9==10);//false

       int myLotteryTicketNumber = 12345;
       int winnerLotteryTicketNumber = 12345;

       boolean didWin = myLotteryTicketNumber==winnerLotteryTicketNumber;

        System.out.println(" Did I win the lottery? ");
        //System.out.println(myLotteryTicketNumber==winnerLotteryTicketNumber);
        System.out.println(didWin);//true

        boolean areEqual = 10-10 == -20+20;
        System.out.println(areEqual);//true

        int a = 10;
        int b = 20;
        boolean areEqual2 = ++a == b++;//11 and 20 are not equal
        System.out.println(areEqual2);//false

        //in order to String == String to return true
        //both values must be the same case-sensitive
        //we can only use == and != comparison operators with String data type
        String str = "apple";
        String str2 = "apple";
        System.out.println(str == str2);//true

        String str1 = "apple";
        String str3 = "Apple";
        System.out.println(str1 == str3);//false

        //use cases: passwords, card numbers, zip, expiration.

        int a1 = 1;
        int a2 = 2;
        int a3 = 3;
        //boolean -> false == false; true
        //false == true; false
        //true == false; false
        //true == true; true

        boolean result = (a1==a2) == (a2==a3);//true
        System.out.println("line 48: " + result);

        boolean result1 = (a1==a2) != (a2==a3);//false
        System.out.println("line 51: " + result1);

    }
}
