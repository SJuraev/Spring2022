package string_methods;

public class ReplaceMethod {

    public static void main(String[] args) {
        String str = "Learn Share Learn";
        String replacedStr = str.replace('e','E');
        System.out.println(replacedStr);

        String str1 = "Hello world";
        String changed = str1.replace("world", "World");
        System.out.println(changed);
    }
}
