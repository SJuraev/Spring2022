package loops;

import java.util.Locale;
import java.util.Scanner;

public class Requirement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the word: ");
        String word = sc.nextLine().toLowerCase(Locale.ROOT);
        Requirement requirement = new Requirement();

        System.out.println(requirement.duplicate(word));

    }
    /**
     Write a function which checks if each character in the
     String has at least one duplicate character
     ex:
     Abba => true
     abeeda => false
     noon => true
     Hello => false
     */
    public boolean duplicate (String str){
        boolean hasDublicate = false;

        for (int i = 0; i<str.length(); i++){
            for(int j=i+1; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    hasDublicate = true;
                }
            }
            if(!hasDublicate){
                return false;
            }
        }
        return hasDublicate;
    }

}
