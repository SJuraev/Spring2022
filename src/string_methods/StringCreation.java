package string_methods;

public class StringCreation {

    public static void main(String[] args) {

        String name = "John Doe";
        String carType = "4Dr";

        //redundant - not needed, extra
        String name1 = new String("Elon Musk");
        String carType2 = new String("2dr");

        System.out.println(name);
        System.out.println(carType);
        System.out.println(name1);
        System.out.println(carType2);

        //two ways for concatenation(and two Strings together)

        String message = name + " drives " + carType + " car ";
        System.out.println(message);

        String elonMuskMessage = name1 + " drives " + carType2 + " car ";
        System.out.println(elonMuskMessage);

        int num = 10;
        String str = 10 + num + name;
        String str1 = name + 10 + num;
        System.out.println(str);
        System.out.println(str1);

        //no other class but String can be initialized with literals.

        //how to call String methods?
        String strHello = "Hello";

        //concat add to the end of the String.
        String result = strHello.concat(" World ");
        System.out.println(result);
        //static or instance method?
        //is instance.

        //let's add 2022 to Hello World => Hello World 2021
        String newYear = result.concat(" 2022");
        System.out.println(newYear);

        int year = 2022;
        //(String) => #1 rule of casting - both data types must be same type
        String newYear1 = result.concat(" 2023");
        System.out.println(newYear1);

        //compound operators are also allowed
        //update the original value of newYear1
        newYear1 += " year";
        System.out.println(newYear1);






    }
}
