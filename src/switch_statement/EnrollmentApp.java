package switch_statement;

import java.util.Scanner;

public class EnrollmentApp {
    public static void main(String[] args) {

        /**
        Tell a student which classes they have to take.
        Which major are you in?
        -Accounting => year 1 and 2 should take Math 1,2. Calculus. 3,4. => Excel, Economics
        -Computer Science => year 1 and 2 should take Math 1,2. Calculus. 3,4. => Java, Intro to Information Science
        -Psychology => year 1 and 2 take Public Speaking, Body Language. 3,4. Psychology, Neuroscience.

        Which college year are you in?

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Which major are you in? ");
        System.out.println("Please input one of the list:");
        System.out.println("1 for Accounting, 2 for Computer Science, 3 for Psychology");
        String major = sc.nextLine();
        System.out.println("Which year are you studying? ");
        int year = sc.nextInt();

        switch (major.toLowerCase()) {
            case "1":
                switch (year) {
                    case 1:
                    case 2:
                        System.out.println("You should should take Math 1,2 and Calculus");
                        break;
                    case 3:
                    case 4:
                        System.out.println("You should take Excel and Economics classes");
                }
                break;

            case "2":
                switch (year) {
                    case 1:
                    case 2:
                        System.out.println("You should should take Math 1,2 and Calculus classes");
                        break;
                    case 3:
                    case 4:
                        System.out.println("You should take Java, Intro to Information Science classes");
                }
                break;

            case "3":
                switch (year) {
                    case 1:
                    case 2:
                        System.out.println("You should should take Public Speaking, Body Language");
                        break;
                    case 3:
                    case 4:
                        System.out.println("You should take Psychology, Neuroscience classes");
                }
            break;
            default:
                System.out.println("Please select major from the list");

        }

    }
}
