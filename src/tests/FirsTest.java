package tests;

//import from Junit library we imported to the project
import org.junit.Test;
/**
 * We are only learning the FLOW of the Junit.
 */
public class FirsTest {

    @Test//without the annotation @Test it will be just an instance method. not
    public void test1(){//it must be public void

        System.out.println("First test method");
        System.out.println("Hello world!");
    }

    @Test
    public void test2(){
        System.out.println("Second test method");
    }

    @Test
    public void abc(){//Junit is going to run @Tests in alphabetic order, but sometimes it's unpredictable.
        int i =20;
        int sum = i + 2;
        System.out.println("ABC" + i);
        System.out.println("Sum is: " + sum);
    }
    @Test
    public  void firstTest() {
        System.out.println("Will it run first?");
    }

}
