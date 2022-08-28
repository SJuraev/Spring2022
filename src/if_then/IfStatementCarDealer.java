package if_then;

import java.util.Scanner;

public class IfStatementCarDealer {

    public static void main(String[] args) {
        //We have car dealer
        //You have to prompt the user the type of car.

        //When user enters our website
        //they should be asked what they are looking for
        //in the first menu they should see.
        //1.SUV; 2.Sports car; 3.Sedan

        //they can choose by typing SUV, sports car or sedan
        //or by inputting the number. 1 for SUV, 2 sports car

        //second display
        //if they input SUV
        //1. Suburban
        //2. Escalate
        //3. H2
        //if user inputs something not listed then say that you don't have such model of a car.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose one of the car type: SUV (1), Sport cars (2) , Sedan (3) ");
        String carType = sc.nextLine();
        String carNameAndPrice = "";

        if (carType.equals("SUV") || carType.equals("1")) {
            System.out.println("Chose one of the following options: ");
            System.out.println("1 Suburban");
            System.out.println("2 Escalate");
            System.out.println("3 H2");

            String carModel = sc.nextLine();

            if (carModel.equals("1") || carModel.equals("Suburban")) {
                carNameAndPrice = "Suburban 2022 for $20,000";
            } else if (carModel.equals("2") || carModel.equals("Escalate")) {
                carNameAndPrice = "Escalate 2022 for $50,000";
            } else if (carModel.equals("3") || carModel.equals("H2")) {
                carNameAndPrice = "H2 2022 for $40,000";
            }
            System.out.println("Model and the price of the car: " + carNameAndPrice);
        } else
            if(carType.equals("Sedan") || carType.equals("2")) {
                System.out.println("Chose one of the following options: ");
                System.out.println("1 Avalon");
                System.out.println("2 Tesla Model Y");
                System.out.println("3 Camry");

                String carModel = sc.nextLine();
                if (carModel.equals("1") || carModel.equals("Avalon")) {
                    carNameAndPrice = "Avalon 2022 for $40,000";
                } else if (carModel.equals("2") || carModel.equals("Tesla Model Y")) {
                    carNameAndPrice = "Tesla Model Y 2022 for $60,000";
                } else if (carModel.equals("3") || carModel.equals("Camry")) {
                    carNameAndPrice = "Camry 2022 for $30,000";
                }
                System.out.println("Model and the price of the car: " + carNameAndPrice);

            }
        if(carType.equals("Sport cars") || carType.equals("3")) {
            System.out.println("Chose one of the following options: ");
            System.out.println("1 Lamborghini");
            System.out.println("2 Ferrari");
            System.out.println("3 Bugatti");

            String carModel = sc.nextLine();
            if (carModel.equals("1") || carModel.equals("Lamborghini")) {
                carNameAndPrice = "Lamborghini 2022 for $140,000";
            } else if (carModel.equals("2") || carModel.equals("Ferrari")) {
                carNameAndPrice = "Ferrari 2022 for $160,000";
            } else if (carModel.equals("3") || carModel.equals("Bugatti")) {
                carNameAndPrice = "Bugatti 2022 for $230,000";
            }
            System.out.println("Model and the price of the car: " + carNameAndPrice);

        }

        else {
            System.out.println("We don't have this model");
        }


    }
}
