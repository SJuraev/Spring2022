//Every single Java file should start with package keyword and package name
// So package keyword's purpose is simple - to declare under which package this class is created in.
// This line will be use for comments if you put double slash (//) in the beginning of the line
//Developers can write any comments, even java keywords inside the comments
//In projects devs(developers) use for leaving some notes for other devs.
//it's highly encouraged to use comments for notes


package class_structeres;

//public --> access modifier
//Access modifier --> Keyword which defines in which classes this method can be used.
//Access modifier types:
  //1.Public
  //2.Default ( we don't type anything )
  //3.Protected
  //4.Private

//For classes we can use only 2 access modifiers : Public and Default.
//what is the access level of this class?

//if your class is public, your classes name must match to the fileName. Otherwise program won't run
//order must be as follows:
//access modifier class ClassName { }
public class SecondClass {

    //what is the main method? Every program must have at least one main method.
    //main method is a starting point of an application.
    //methods ar functionalities.
    //When we start the program java behind the scenes(under the hood) it looks for a method with name main.
    public static void main(String[] args) {
        //print out to console
        //semicolons are used to end a statement (think of a statement as a sentence
        System.out.println("I am super excited about becoming a pro programmer");
        System.out.println("My favourite quote: \"Stay hungry, stay foolish\"");
        //println in real world -> For print out any text to console, like clocks at the car's dashboard,
        // text messages and so on


    }
    //we can not to code outside the main method.
}

//file format -> every program uses certain type of formats
//for ex: word -> docx, image -> jpeg, png

//Dynamic -> It can change.
//Static -> It cannot change.

//IDE - Integrated Development Environment
//Out -> result of the program, it goes to console


