package string_methods;

public class CharAtMethod {

    public static void main(String[] args) {
        //[]
        String str = "Elon Musk";
        str.charAt(0);
        char firstInitial = str.charAt(0);
        char secondInitial = str.charAt(5);
        System.out.println(firstInitial + secondInitial);//sum of ASCII table decimal values =>E=69 & M=77(E+M=146)
        /**ASCII stands for American Standard Code for Information Interchange.*/
        System.out.println(firstInitial + "." + secondInitial + ".");//It works out when we put some String
        //inside the (), and it should be at the first operation

        //find the character of a String.
        String city = "New York";
        char letter = city.charAt(7);
        System.out.println(letter);

        int length = city.length();//8
        char letterk = city.charAt(length-2);
        System.out.println(letterk);

        //what happens if we put a negative number to charAt()
//        char negative = city.charAt(-10); //=>throws StringIndexOutOfBoundsException error;
//        System.out.println(negative);


    }


}
