package methods;

public class HomeWorkOnGrade {
    //write a method which give us grade based on the exam score
    //90 and 100 - A
    //80 and 90 -B
    //70 and 80 - C
    //60 and 70 - D
    //anything below 60 - F

    //you need to take an exam score as an int
    //return char
    public static void main(String[] args) {
        char var = grade(100);
        System.out.println("Your grade is: " + var);


    }

    public static char grade(int examScore) {
        char grade = ' ';
        if (examScore <= 100 && examScore >= 90){
            //Grade A
            grade = 'A';
        }
        else if(examScore < 90 && examScore>=80) {
            //Grade B
            grade = 'B';
        }else if(examScore < 80 && examScore>=70) {
            //Grade C
            grade = 'C';
        }else if(examScore < 70 && examScore>=60) {
            //Grade D
            grade = 'D';
        }else if(examScore < 60 && examScore>=0) {
            //Grade F
            grade = 'F';
        }else {
            //Error
            //How do we return an Error if the return type is char?
            //System.err.println()
            System.err.println(examScore + " is not within the range of 0-100");
            System.err.println("Please try again.");
            //then return a value agreed between your team which will specify an error.
            //ex: return 'X', return ' '
            //or you might want to terminate the program entirely.

            //command to quit the program is System.exit(1);
            System.exit(1);

        } return grade;//when java runs return statement, the method execution will end
        //at that point

        //below return statement is unreachable statement

    }


    //Parameters and Arguments
    //Information can be passed to methods as parameter. Parameters act as variables inside the method.
    //
    //Parameters are specified after the method name, inside the parentheses.
    // You can add as many parameters as you want, just separate them with a comma.



}
