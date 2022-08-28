package arithmetic_operators;


//can be used with numbers only
public class GreaterLessThan {
    public static void main(String[] args) {
        int clientCreditScore = 600;
        int requirement = 689;

        System.out.println("Should be this client approved? ");
        System.out.println(clientCreditScore>requirement);//false

        double priceForGasInShell = 1.85;
        double priceInMyGasStation = 1.99;

        //
        boolean shouldIBuyInShell = priceInMyGasStation > priceForGasInShell;
        System.out.println("Should I By In SHell " + shouldIBuyInShell);

        double myGpa = 3.6;
        boolean admitted = myGpa > 3.4;
        System.out.println(admitted);//true




        //< it will return true if left side is less than right side
        //only works with numbers

        double myCurrentBalance = 100.99;
        double priceForTickets = 80.11;

        double myCurrentBalance1 = 100.99;
        double priceForTickets1 = 119.99;

        boolean allowTransaction1 = (myCurrentBalance1-priceForTickets1)> -20;
        System.out.println("Should transation 1 be allowed? " + allowTransaction1);

        boolean allowTransaction = priceForTickets < myCurrentBalance;
        System.out.println("Should transaction be allowed? " + allowTransaction);


    }
}
