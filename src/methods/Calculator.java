package methods;
//when do you print inside vs return
//it totally depends on your task(requirements).

//but usually if you have a task to print out something you will just use void
//but if you have a task to calculate something and give the result then you will need return.
public class Calculator {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println( c.taxRegardingMarriage(true, 100_000));

    }
    //calculateTax
    //if married the tax should be salary * 5/100;
    //if not married the tax should be salary * 30/100;

    //should I write a method??
    //what should be the return type => should I just print out or return tax.
    //Is salary int or double? double
    public double taxRegardingMarriage(boolean isMarried, double salary ) {
        double tax =0;
        if (isMarried) {
            tax = salary * 5 / 100;
        }else {
           tax = salary * 30 / 100;
        }
            return tax;

    }
    /**
     * instance methods can be called inside another instance methods within the same class
     * without creating an object.
     */
    public void printTax(boolean isMarried, double salary) {
        System.out.println(taxRegardingMarriage(isMarried,salary));
    }
    //understand what is return type?
    //memorize method definition syntax.
    //research more on params.

    //write a method which give us grade based on the exam score
    //90 and 100 - A
    //80 and 90 -B
    //70 and 80 - C
    //60 and 70 - D
    //anything below 60 - F

    //you need to take an exam score as an int
    //return char

    //write a function which will convert miles to kilometers
    //get miles return kilometers

    //write a method which will take a Full Name and Job Title and create an email signature

    //John Doe, Sr. SDET
    //Sr. SDET at Google
    //All information is confidential
    //google.com, maps.google.com
    //312-730-2897

    //no return type
}
