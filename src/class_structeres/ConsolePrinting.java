package class_structeres;

public class ConsolePrinting {
    //println()-> will print and jump the cursor to the next line

    //Java ignores white spaces. White spaces between statements are not part of the code.

    public static void main(String[] args) {
        //print() -> print the current line
        System.out.println("My Favorite Two Books:");
        System.out.println ("Malcolm Gladwell - Outliers");
        System.out.println("10X Rule - Grant Cardone");


/*
        We need to precede special characters with a \ (back slash)
        For example - \$ or \" or \\ etc

        Is there a way to make tabs.
        tabs -> three spaces.
        \t -> tab
        \n -> new line, enter
        \b -> blanks previous space

 */


        System.out.println("Description of an item\n$20");
        System.out.println("Description of an item\t\t\t$20");
        System.out.println("Description of an item 123\b$20"); // In this case it blanks 3

        System.err.println("This is an error message created by me");

    }

}

//redundant - extra