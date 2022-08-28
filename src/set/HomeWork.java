package set;

import java.util.HashSet;
import java.util.Set;

public class HomeWork {
    public static void main(String[] args) {
        Set<Integer> leapYear = new HashSet<>();
        leapYear.add(2020);
        leapYear.add(2021);
        leapYear.add(2022);
        leapYear.add(2023);
        leapYear.add(1900);
        System.out.println(leapYear);
        findTheLeapYear(leapYear);

    }
    //Create a Collection which will store unique years
    //you need to print out years that are leap.

    //ex: Set<Integer> years = new HashSet();
    //years.add(2020);
    //years.add(2021);
    //years.add(2022);
    //years.add(2023);

    //create a method to check if the year is leap or not.

    //output
    //2020
    public static void findTheLeapYear(Set<Integer> year){

        for (int i : year){
            if((i%4 == 0 && i%100 != 0) || (i%100 == 0 && i % 400 == 0)){
                System.out.println("The leap year is: " + i);
            }
        }

    }




    //Write a program which asks a user to create username.
    //Ex: Please enter a username

    //Usernames must be unique, if the username has already been taken
    //print out -> UserName has already been taken. Please choose another one.
    //You should repeat process.

    //You can create collection of userNames that are already taken before
    //the program runs.

}
