package methods;

public class StaticMethods123 {
    public static void main(String[] args) {

       //static methods are called from the className;
        int ab = StaticMethods.absolute(-12);//Here we called static method
        //named "absolute" from the class named "StaticMethods"=>
        /** dataType variableName = className.methodName() */
        System.out.println(ab);

        Calculator c = new Calculator();/**
         In a program, objects are created using an operator called new, which creates an object
         and returns a reference to that object.
         (In fact, the new operator calls a special subroutine called a "constructor" in the class.)
         For example, assuming that std is a variable of type Student, declared as above,the assignment statement

         std = new Student();

         would create a new object which is an instance of the class Student,
         and it would store a reference to that object in the variable std.
         */
        //to instance methods are only called from object variables.
        double tax = c.taxRegardingMarriage(true, 100000);//Here we called
        //instance method named "taxRegardingMarriage" from the class "Calculator",
        // for that we should create =>
        /**ClassName variableName = new ClassName(); =>
        => Calculator c = new Calculator();
         + => dataType variableName2 = variableName.methodName(); */
        System.out.println(tax);

        //We can call any method from this package,
        // to any class in this project, as long as it's the same project
    }
}
