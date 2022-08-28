package arithmetic_operators;

public class ConditionalAndOperator {
    public static void main(String[] args) {

        //You are checking for someone's age
        //We can only have age between 0 and 100;

        int age = 100;

        boolean isValidAge = age <= 100 && age >=0;
        System.out.println("Age is valid => " + isValidAge);

        //password entry

        String userNameSavedInDB = "JohnDoe";
        String userPasswordSavedInDB = "ExtraHard";

        String userNameEntered = "John Doe";
        String userPasswordEntered = "ExtraHard";

        boolean allowToLogin = userPasswordSavedInDB == userPasswordEntered && userNameSavedInDB == userNameEntered;
        System.out.println("User name saved in DB: " + userNameSavedInDB);
        System.out.println("User name entered: " + userNameEntered);

        System.out.println("User password saved in DB: "+ userPasswordSavedInDB);
        System.out.println("User password entered: " + userPasswordEntered );

        System.out.println("Login success? " +  allowToLogin);

        //
        int i = 0;
        int x = 1;

        boolean result = i < x || x++ > i;

        System.out.println(x);
        System.out.println(result);

        int a = 0;
        int y = 1;

        boolean result1 = a > y & a++ < y;
        System.out.println(result1);
        System.out.println("a: " + a);



    }
}
