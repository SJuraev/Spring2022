package if_then;

import java.util.Scanner;

public class ExamScore {
    //Write a program which will tell me if I passed the exam
    //Passing score is 70
    //If the user score is more than 70, say - "Great! You passed the test! "

    //If the user score is less than 70, say - "Try again! Keep working hard! "
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the score: ");
        int score = sc.nextInt();
        if(score>=70 && score<90) {
            System.out.println("Great! You passed the test! ");
        }else if(score>=90) {
            System.out.println("Great! You passed the test! ");
            System.out.println("You are on the top! ");
        }else if(score<70) {
            System.out.println("Try again! Keep working hard! ");
        }
    }
}
