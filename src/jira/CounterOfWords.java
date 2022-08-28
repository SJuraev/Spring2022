package jira;
import java.util.Scanner;
/*
As a user, I want to be able to give any text, so that the program will print out an exact number of words.
 All words starting with a letter (“U2” - is a word), one- and more-letter words (“a” - is a word) are taken in count.
  And as a user, I should be able to enter the text as many times as I want to.
To be considered as a word it must have 1st character letter.
Word dividers are: space, ' single quote/apostrophe, “ double quote, - hyphen/minus/dash, . full stop/period/dot,
, coma, : colon, ; semi-colon. @Zhantai Monolbaev

Acceptance Criteria: The user should be asked to input text.

Examples:

Input Text: "" (empty input)
Total Number of Words: 0.
Input Text:

Input Text: 412 123-45-67
Total Number of Words: 0.
Input Text:

Input Text: U2 is an Irish rock band from Dublin, formed in 1976.
Total Number of Words: 10.
Input Text:
(*U2 - is a word, 1976 - is not.)

Input Text: "I'm Doe. John Doe," - said John.
Total Number of Words: 7.
Input Text:
 */
public class CounterOfWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the sentence to count the words: ");
        String sample = scanner.nextLine();

        if(invalidInput(sample)){
            System.out.println("Invalid Input! Please input grammarly correct sentence. ");
        }else {
            System.out.println(wordCounter(sample.trim()));
        }
    }

    public static int wordCounter(String sentence){
        int counter = 0;
        for(int i = 0; i < sentence.length();i++){
            if((wordDivider(sentence.charAt(i)))
                    && (!Character.isDigit(sentence.charAt(i)))
            ){
                counter++;
            }
        }
        return counter;
    }

    public static boolean wordDivider(char divider){
        boolean result = false;
        if(divider == ' ' || divider == ',' || divider == '.' || divider == '\'' || divider == '"' || divider == ';'
                || divider == ':' || divider == '-' || divider == '=' || divider == '<' || divider == '>')
        {
            result = true;
        }
        return result;
    }

    public static boolean invalidInput(String sentence){
        boolean result = false;
        for (int i = 1; i< sentence.length();i++){
            if(sentence.charAt(sentence.length()-1) != '.'){
                result = true;
            }
            if ((sentence.charAt(i) == sentence.charAt(i - 1))
                    &&
                    (wordDivider(sentence.charAt(i)))) {
                result = true;
            }
        }
        return result;
    }
}
