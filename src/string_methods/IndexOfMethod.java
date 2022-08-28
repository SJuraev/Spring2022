package string_methods;

public class IndexOfMethod {

    public static void main(String[] args) {

        String str = "The beautiful mind";
        //find the index of a 'b'

        int indexOfB = str.indexOf("b");
        System.out.println(indexOfB);

        int indexOfFirstSpace = str.indexOf(" ");
        System.out.println(indexOfFirstSpace);

        int indexOfLastI = str.indexOf("ind");
        System.out.println(indexOfLastI);

        String str1 = "The kind of beautiful mind";
        int indexOfLastIndex = str1.indexOf("mind")+1;

        System.out.println(indexOfLastIndex);

        String str10 = "Mega Mega Megafon";
        System.out.println(str10.indexOf("e",3));
        System.out.println(str10.indexOf("ga",4));
        System.out.println(str10.indexOf(" Me"));


    }
    //Write a method that takes a String and returns the index of the second space.
    public static int indexOfSecondSpace(String str) {
     return 1;
    }


}
