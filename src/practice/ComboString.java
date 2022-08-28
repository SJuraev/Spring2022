package practice;

import java.util.Scanner;

public class ComboString {

    public static void main(String[] args) {
        ComboString combo = new ComboString();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input word a: ");
        String a = sc.nextLine();
        System.out.println("Input word b: ");
        String b = sc.nextLine();
        System.out.println(combo.comboString(a,b));
    }
    public String comboString(String a, String b) {
        if(a.length()>b.length()){
            return b.concat(a).concat(b);
        }
            return a.concat(b).concat(a);
        }

    }

