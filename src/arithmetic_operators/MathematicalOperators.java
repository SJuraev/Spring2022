package arithmetic_operators;

import firstclass.HelloWorld;

public class MathematicalOperators {
    public static void main(String[] args) {

        //Strings ar non-primitive data type. Can store any length of text. Should be surrounded by ""
        //primitive -> something super simple, basic

        String myFavBooks = "Outliers - by Malcolm Gladwell. ";

        System.out.println(myFavBooks);

        //+ sign between two Strings means it's concatenation( a series of interconnected things or events or adding two words(text) together)


        String h = "Hello";
        String w = "World";
        String dob = "02/22/2022";

        System.out.println(h + " " + w); //If you need to add a space between them, you should add h + " " + w

        String finalText = "Hello" + " " + w;
        System.out.println(finalText + " Assalamu alaykum"); //Or this way(how to add a space between Hello and World)

        //[]-brackets
        //() - parenthesis
        //{} - curly braces

        System.out.println(h+" " + w + " " + "(" +dob + ")" );
        System.out.println(h+" " + w + " " + "(" +dob + ")" + "\t"+"\b" + "\\" );
        System.out.println(h+" " + w + " " + "(" +dob + ")" + "\t"+"\b" + "{}" );
        //We don't need any backslash(\*) before this characters
        System.out.println("{} "+ "()  [] "+ "* "+ "/ "+ "$ " + "# " + "+ ");





    }
}
