package oop.classes;

public class ConstuctorTest {

    public static void main(String[] args) {
        Candidate johnDoe = new Candidate("John Doe", "johnDoe@devxschool.com", 10);
        //every time you are creating a new object
        //every object creation is a very similar process
        System.out.println(johnDoe.name);
        System.out.println(johnDoe.email);
        System.out.println(johnDoe.yearsOfExperience);


        Candidate elon = new Candidate("Elon Musk", "elon@spacex.com", 12);


    }
}
