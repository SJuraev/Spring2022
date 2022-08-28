package arithmetic_operators;

public class AssignmentOperators {

    public static void main(String[] args) {

        String str = "Hello World!";
        System.out.println(str);

        str = "Hello Mars";
        System.out.println(str);

        //compound assignment operators can only be used with numbers
        //only += can be used with String

        int carMileage = 1000;
        int milesUntilHome = 50;

        int finalMileageToHome =carMileage + milesUntilHome;
        System.out.println( "Car's total mileage is " + finalMileageToHome);

        int milesUntilFriends = 28;
        int mileageWhenShowingToFriends = finalMileageToHome + milesUntilFriends;

        System.out.println( "Mileage when showing to friends " + mileageWhenShowingToFriends);

        carMileage+=milesUntilHome;

        System.out.println("Mileage when got hom from the dealership " + carMileage);
        //We could also do it the way it's shown below
        //System.out.println("Mileage when got hom from the dealership " + (carMileage+=milesUntilHome));

        carMileage+=milesUntilFriends;
        //carMileage+=milesUntilFriends; this line means -->
        // --> carMileage = carMileage + milesUntilFriends;
        System.out.println("Mileage when got to friends "+ carMileage);

        //given that salary raises 3% yearly
        //find how much the salary will be in 5 years.
        int currentYear = 2020;
        int periodOfYears = 5;
        double currentSalary = 100_000;

        double salaryInOneYear = currentSalary + currentSalary*0.03;
        double salaryInTwoYears = salaryInOneYear + salaryInOneYear*0.03;
        double salaryInThreeYears = salaryInTwoYears + salaryInTwoYears*0.03;
        double salaryInFourYears = salaryInThreeYears + salaryInThreeYears*0.03;
        double salaryInFiveYears = salaryInFourYears + salaryInFourYears*0.03;
        System.out.println("Salary in five years will be: " + salaryInFiveYears);
        System.out.println("Salary in one year: " + salaryInOneYear);
        System.out.println("Salary in two years: " + salaryInTwoYears);

        double salaryAfterOneYear = currentSalary * 1.03;
        double salaryAfterTwoYears = salaryAfterOneYear * 1.03;
        double salaryAfterThreeYears = salaryAfterTwoYears * 1.03;
        double salaryAfterFourYears = salaryAfterThreeYears * 1.03;
        double salaryAfterFiveYears = salaryAfterFourYears * 1.03;
        System.out.println(salaryAfterOneYear);
        System.out.println("Salary after five years will be: " + salaryAfterFiveYears);

        double salaryIncrease = 1.03;
        currentSalary *= salaryIncrease;
        System.out.println( currentSalary);









    }
}
