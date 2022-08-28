package methods;

public class Methods1 {

    public static void main(String[] args) {
        double result = calculateBonus(123000.99,2);
        System.out.println("Your bonus is: " + result);
        System.out.println(calculateBonus(150_000,3));
        System.out.println(calculateBonus(250_000, 31));

        printAnimalType("tiger");
    }
    //Bonus regarding years of service
    //take salary and years of service from the user
    //return their expected bonus

    //expected bonus for
    //less than 2years = 5%
    //more than 2years = 10%
    //more than 30 years = 0%

    //what if the yearOfService is negative?
    //print out error message and return 0;

    //how many years do you want to consider?
    //print out error message and return0;


    //

    public static double calculateBonus(double salary, int yearsOfService){
        if(yearsOfService <= 2){
            return salary*5/100;
        }else if(yearsOfService>30){
            return 0;
        } else {
                return salary*10/100;
            }
    }


    public static void printAnimalType(String animal){
        switch (animal.toLowerCase()){
            //case followed by a constant value:
            case "chicken" :
            case "horse" :
            case  "cat" :
            case "dog" :
                //put the body, block, work.
                System.out.println("Domestic animal");
                //break to finish the body of a case.
                break;

            case "tiger":
            case "snake" :
            case "rhino" :
            case  "hippo":
            case "lion" :
                System.out.println("Wild animal");
                //default is equivalent to "else"
                break;
            default:
                System.out.println("We don't have this animal in the list");
                break; //break is optional
        }
    }

}
