package if_then;

import java.util.Scanner;

public class NestedIfPracticeGroceryStore {

    public static void main(String[] args) {

        //Put day to expire 7 days if product type is Greens,
        //only exception is Cilantro, which expires in 10 days




        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the product type? ");
        String productType = sc.nextLine();
        System.out.println("Product name: ");
        String productName = sc.nextLine();
        int daysToExpire = 0;
        String imported = "";



        if (productType.equals("Greens")) {     //outer if open
            daysToExpire = 7;
            if(productName.equals("Cilantro")) {      //inner if open
                daysToExpire = 10;
            }//inner if close

        } else                                                                     //outer if close
            if(productType.equals("Vegetables")) {                               //outer 2nd if open
                daysToExpire = 60;
                if(productName.equals("Tomatoes")) {                               //inner if open
                    daysToExpire = 20;
                }//inner if close
            }   //outer 2nd if close
        else
            if (productType.equals("Fruits")) {     //outer if open

                if(productName.equals("Banana")) {
                    System.out.println("Bananas imported from: ");
                    imported = sc.nextLine();
                    if (imported.equals("Peru")) {
                        daysToExpire = 11;
                    } else if (imported.equals("Brazil")) {
                        daysToExpire = 14;
                    } else {
                        daysToExpire = 15;
                    }
                }else
                    if(productName.equals("Raspberries")) {
                        daysToExpire = 6;
                    }else {
                        daysToExpire = 30;
                    }


        }


        System.out.println("Expire in " + daysToExpire + " days");


    }
}
