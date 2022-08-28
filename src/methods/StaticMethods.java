package methods;

public class StaticMethods {

    public static void main(String[] args) {

    }
    //Get an integer and return the absolute number.
    //Absolute number is the distance from the 0 to the number neither it's negative or positive
    //=> -10 => 10 same

    //static methods can be called without creating an object.
    //just by using ClassName.methodName();
    public static int absolute(int i){
       return i<0 ? i*-1 : i;
    }
}
