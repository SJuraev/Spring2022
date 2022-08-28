package practice;

import java.util.Scanner;

public class Permission {
    public static void main(String[] args) {
        System.out.println("Please input your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>0 && age < 16){
            System.out.println("You can't drive");
        }else if(age>=16 && age <18){
                System.out.println("You can drive, but not vote");
        }else if(age>17 && age<25){
            System.out.println("You can vote, but not rent a car");
        }else if(age>=25){
            System.out.println("You can do pretty much anything");
        }
    }
}
