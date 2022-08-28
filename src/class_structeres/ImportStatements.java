package class_structeres;
//we are telling to bring a class from different package.
//import firstclass.HelloWorld;

import java.util.Random;

public class ImportStatements {

    public static void main(String[] args){

        //It is possible to printout numbers with and without any double quotes
        System.out.println(10.34343);

        Random r = new Random();
        //put a bound number. ex: 10 means you want a random from 0 to 10
        System.out.println(r.nextInt(10));

        //HelloWorld d = new HelloWorld();
        //System.out.println(d);



    }
}
