package if_then;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        //Print out -"Too HOT! " if the temp is more than 80 inclusively
        //"We recommend you to turn on your AC "
        //Print out - " Freaking Cold Chicago! Miami wait for me!!! " if it's less than 35

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the temperature: ");
        int temperature = sc.nextInt();
        if(temperature >= 80) {
        System.out.println("Too HOT! ");
        System.out.println("We recommend you to turn on your AC ");
        }else
            if(temperature <=35) {
                System.out.println("Freaking Cold Chicago! Miami wait for me!!! ");
            }else
                if(temperature>35 && temperature<=50) {
                    System.out.println("It is cold out there! ");
                    System.out.println("We highly recommend you to turn on your heater. ");
                }else
                    if(temperature>50 && temperature<=60) {
                        System.out.println("It's little bit cold outside, Please keep warm. ");
                    }else
                        if(temperature>60 && temperature<=75) {
                            System.out.println("It's perfect outside! ");
                        }else
                            if(temperature>75 && temperature<80) {
                                System.out.println("It's pretty hot outside. ");
                            }
    }
}

