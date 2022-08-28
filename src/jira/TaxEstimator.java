package jira;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TaxEstimator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double annualSalary;
        do {
            System.out.println("Please enter your annual salary: ");
            annualSalary = sc.nextDouble();
            if (annualSalary < 0) {
                System.out.println("Your salary cant be negative");
            }
        } while (annualSalary < 0);


        System.out.println("What is your marital status?(married or single)");
        String maritalStatus = sc.next();
        marriedOrSingle(maritalStatus, annualSalary, sc);
    }


    public static void marriedOrSingle(String maritalStatus, double annualSalary, Scanner sc) {

        if (maritalStatus.equalsIgnoreCase("married")) {
            jointlySeparate(annualSalary, sc);
        } else if (maritalStatus.equalsIgnoreCase("single")) {
            singleCalculate(annualSalary);
        } else {
            System.out.println("married or single input only");
            maritalStatus = sc.next();
            marriedOrSingle(maritalStatus, annualSalary, sc);
        }
    }

    public static void jointlySeparate(double annualSalary, Scanner sc) {
        DecimalFormat df = new DecimalFormat("0.00");

        double taxAmount = 0;

        System.out.println("jointly or separate: ");
        String answ = sc.next();
        if (answ.equalsIgnoreCase("jointly")) {
            if (annualSalary >= 0 && annualSalary < 19400) {
                taxAmount = annualSalary * 0.1;
            } else if (annualSalary >= 19400 && annualSalary < 78950) {
                taxAmount = annualSalary * 0.12;
            } else if (annualSalary >= 78950 && annualSalary < 168400) {
                taxAmount = annualSalary * 0.22;
            } else if (annualSalary >= 168400 && annualSalary < 321450) {
                taxAmount = annualSalary * 0.24;
            } else if (annualSalary >= 321450 && annualSalary < 408200) {
                taxAmount = annualSalary * 0.32;
            } else if (annualSalary >= 408200 && annualSalary < 612350) {
                taxAmount = annualSalary * 0.35;
            } else if (annualSalary >= 612350) {
                taxAmount = annualSalary * 0.37;
            }
        } else if (answ.equalsIgnoreCase("separate")) {
            if (annualSalary >= 0 && annualSalary < 9700) {
                taxAmount = annualSalary * 0.1;
            } else if (annualSalary >= 9700 && annualSalary < 39475) {
                taxAmount = annualSalary * 0.12;
            } else if (annualSalary >= 39475 && annualSalary < 84200) {
                taxAmount = annualSalary * 0.22;
            } else if (annualSalary >= 84200 && annualSalary < 160725) {
                taxAmount = annualSalary * 0.24;
            } else if (annualSalary >= 160725 && annualSalary < 204100) {
                taxAmount = annualSalary * 0.32;
            } else if (annualSalary >= 204100 && annualSalary < 306175) {
                taxAmount = annualSalary * 0.35;
            } else if (annualSalary >= 306175) {
                taxAmount = annualSalary * 0.37;
            } else {
                jointlySeparate(annualSalary, sc);
            }
            if (answ.equalsIgnoreCase("jointly") || answ.equalsIgnoreCase("separate")) {
                System.out.println("Your tax amount for married filing " + answ + " is " + df.format(taxAmount));

            }
        }
    }


        public static void singleCalculate ( double annualSalary){
            DecimalFormat df = new DecimalFormat("0.00");

            double taxAmount = 0;
            if (annualSalary >= 0 && annualSalary < 9700) {
                taxAmount = annualSalary * 0.1;
            } else if (annualSalary >= 9700 && annualSalary < 39475) {
                taxAmount = annualSalary * 0.12;
            } else if (annualSalary >= 39475 && annualSalary < 84200) {
                taxAmount = annualSalary * 0.22;
            } else if (annualSalary >= 84200 && annualSalary < 160725) {
                taxAmount = annualSalary * 0.24;
            } else if (annualSalary >= 160725 && annualSalary < 204100) {
                taxAmount = annualSalary * 0.32;
            } else if (annualSalary >= 204100 && annualSalary < 510300) {
                taxAmount = annualSalary * 0.35;
            } else if (annualSalary >= 510300) {
                taxAmount = annualSalary * 0.37;
            }
            if (taxAmount != 0) {
                System.out.println("Your tax amount for a single is " + df.format(taxAmount));
            } else if (taxAmount == 0) {
                System.out.println("You're tax amount owed is 0");
            }
        }

    }


