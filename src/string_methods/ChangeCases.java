package string_methods;

public class ChangeCases {

    public static void main(String[] args) {
        String str = "Hello world";

        String result = change(str,"world");
        System.out.println(result);

    }
    public static String change(String strOriginal, String subString) {
        //finds the index of the first letter of subString.
        int indexOfFirstLetter = strOriginal.indexOf(subString);

        //using the indexOfFirstLetter call toUpperCase();
        String firstLetterUpperCased =
                strOriginal.substring(indexOfFirstLetter, indexOfFirstLetter + 1).toUpperCase();

        String firstPart = strOriginal.substring(0, indexOfFirstLetter);
        String lastPart = strOriginal.substring(indexOfFirstLetter + 1);

        return firstPart + firstLetterUpperCased + lastPart;
    }
}
