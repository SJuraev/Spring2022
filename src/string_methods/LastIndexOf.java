package string_methods;

//String manipulation methods
public class LastIndexOf {

    public static void main(String[] args) {

        //ERROR This is wrong credit card info - transactionId: 11234557;
        //findCustomer(String transactionId) {
        //}

        String errorMessage = "ERROR This is wrong credit card info - transactionId:11234557";
        //pseudocode => your solution to the task
        //need to find the index of":".
        //using the index of ":" => get the substring starting right after ':'
        //note that an error messages might have the ':' as well, so use lastIndexOf method
        //just in words



        int indexOfId = errorMessage.lastIndexOf(":")+1;
        System.out.println(indexOfId);

        String transactionId = errorMessage.substring(indexOfId);
        System.out.println(transactionId);

        //find first letter of the last word in String
        int lastIndexOfSpace = errorMessage.lastIndexOf(" ");
        System.out.println(lastIndexOfSpace);//38 => sout(errorMessage.charAt(39);
        System.out.println(errorMessage.charAt(lastIndexOfSpace+1));
        System.out.println(errorMessage.charAt(39));
        System.out.println(errorMessage.substring(lastIndexOfSpace+1));


        //Given a full US address:
        String fullCustomerAddress = "3333 Green Bay Rd, North Chicago, IL, 60064";
        //#1 create a method to return zipcode.
        int zipcode  = fullCustomerAddress.lastIndexOf(" ");
        System.out.println(fullCustomerAddress.substring(zipcode+1));
        //#2 create a method to return a State
        int state = fullCustomerAddress.lastIndexOf(",");
        System.out.println(fullCustomerAddress.substring(state-2,state));
        //#3 create a method to return a City
        //int city = fullCustomerAddress.

        //#4 create a method to return an Address Line.


    }









}
