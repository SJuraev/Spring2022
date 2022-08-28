package maps;

import java.util.HashMap;
import java.util.Map;

public class CountNumOfCharOccurrences {
    //Create a program which will calculate the number of occurrences of each character in a String
    /*ex: apple => a: 1
                   p: 2
                   l: 1
                   e: 1
     */
    public static void main(String[] args) {

        String word = "Hello World";
        Map<Character, Integer> occurrences = new HashMap<>();

        int counter = 0;
        for (int i = 0; i < word.length(); i++){

            if(!occurrences.containsKey(word.charAt(i))) {
                occurrences.put(word.charAt(i), 1);
            }else{
                int lastOccurrenceNum = occurrences.get(word.charAt(i));
                    occurrences.put(word.charAt(i),lastOccurrenceNum + 1);
                }

//            if(word.charAt(i) ==){
//                counter++;
//            }

        }
        System.out.println(counter);
        System.out.println(occurrences);
    }

}
