package coding_bat;

public class minCat {
    /*
    Given two strings, append them together (known as "concatenation") and return the result.
    However, if the strings are different lengths, omit chars from the longer string so it is
    the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.

    minCat("Hello", "Hi") → "loHi"
    minCat("Hello", "java") → "ellojava"
    minCat("java", "Hello") → "javaello"
     */
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hi";
        minCat minCat = new minCat();

        System.out.println(minCat.minCatmethodethod(a, b));

    }


    public String minCatmethodethod(String a, String b) {
        String result = "";
        if (b.length() < a.length()) {
            result = a.substring(a.length() - b.length()).concat(b);
        } else if (a.length() < b.length()) {
            result = a.concat(b.substring(b.length() - a.length()));
        }
        return result;
    }

}
