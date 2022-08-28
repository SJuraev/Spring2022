package string_methods;

import java.util.Locale;

public class SubstringMethod {
    public static void main(String[] args) {
        String str = "Hello";
        String result = str.substring(2);
        System.out.println(result);

        String str1 = "United States of America";
        System.out.println(str1.substring(7));

        System.out.println(str1.length());
        System.out.println(str1.substring(str1.length()-7));
        System.out.println(str1.substring(24-7));
        System.out.println(str1.substring(17));

        String item = "INFO account #124 is buying GOLD";
        String gold = item.substring(item.length()-4);
        boolean isGold = gold.equals("GOLD");
        System.out.println(gold);
        System.out.println(isGold);



        String school = "DevX School";
        String str5 = school.substring(0,4);
        System.out.println(str5);

        System.out.println(school.substring(5));

        String number = item.substring(14,17);
        System.out.println(number);
        int num = Integer.parseInt(number);
        int i = num * 20;
        System.out.println(i);

        String senior = "Senior SDET";
        int output = senior.indexOf("Seniorita");
        System.out.println(output);
        String devX = "DevXSchool";
        int out = devX.indexOf("S");
        System.out.println(out);
        String learn = "Learn Share Learn";
        int output1 = learn.indexOf("Share");
        System.out.println(output1);

    }
}
