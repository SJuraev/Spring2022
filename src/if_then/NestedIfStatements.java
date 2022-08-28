package if_then;

public class NestedIfStatements {
    public static void main(String[] args) { //main open
        //Put day to expire 7 days if product type is Greens,
        //only exception is Cilantro, which expires in 10 days

        String productType = "Vegetables";
        String productName = "Tomatoes";
        int daysToExpire = 0;

        if (productType.equals("Greens")) {     //outer if open
            daysToExpire = 7;
            if(productName.equals("Cilantro")) {      //inner if open
                daysToExpire = 10;
         }//inner if close

    } else                                                                     //outer if close
        if(productType.equals("Vegetables")) {                               //outer 2nd if open
            daysToExpire = 90;
            if(productName.equals("Tomatoes")) {                               //inner if open
                daysToExpire = 20;
            }//inner if close
        }   //outer 2nd if close
        System.out.println("Expire in " + daysToExpire + " days");





    }//main close
}
