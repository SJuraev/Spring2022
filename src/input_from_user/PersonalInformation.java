package input_from_user;

import java.util.Scanner;

public class PersonalInformation {

    public static void main(String[] args) {

        //take first name
        //last name
        //gender
        //age
        //salary

        Scanner sc = new Scanner(System.in);
        System.out.println("First name: ");
        String firstName = sc.nextLine();

        System.out.println("Last name: ");
        String lastName = sc.nextLine();

        System.out.println("Gender: ");
        char gender = sc.next().charAt(0);

        System.out.println("Age: ");
        int age = sc.nextInt();

        System.out.println("Salary: ");
        double salary = sc.nextDouble();

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary + "$" );








    }
}
