package string_methods;

public class HomeworkString {

    public static void main(String[] args) {
        //create a method which check if the format of initials is right
        //take a String, which will be initials.
        //rules: initials must only have two letters.
        //each letter must be followed by a '.'

        //ex:
        //checkInitials("S.J.") => return true
        //checkInitials("SJ.") => return true
        //checkInitials("J.") => return true
        //checkInitials(".J.") => return true
        //checkInitials(".J") => return true
        //checkInitials("SJ") => return true

        //#2
        // checkInitial("") => print out "empty Strings are not allowed", return false
        System.out.println(checkInitials("e.m."));
        System.out.println(checkInitials("S.J"));
        System.out.println(checkInitials("!..@"));
        System.out.println(checkInitials("!.$."));


    }

    public static boolean checkInitials(String initials){

        if (initials.isEmpty()) {
            System.err.println("Empty Strings ar not allowed");
            return false; //return quit the method
        }
        if (initials.length() == 4 && isLetter(initials)//we can call another methods if the method returns boolean
                && initials.charAt(1) == '.'
                && initials.charAt(3) == '.') {
            return true;
        }else {
            return false;
        }
    }
    /**method definition=>creating a method
     *
     *
     *
     */

    public static boolean isLetter (String str){
        if ((str.charAt(0)>=65
                && str.charAt(0)<=90)
                ||
                (str.charAt(0)>=97
                && str.charAt(0)<=122)
                &&
                (str.charAt(2)>=65
                && str.charAt(2)<=90)
                ||
                (str.charAt(2)>=97
                && str.charAt(2)<=122)){
            return true;
        }else {
            return false;
        }

    }
}
