package practice;

import java.util.Scanner;

public class AddUpAllNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        int summa = sc.nextInt();

        AddUpAllNumbers addUpAllNumbers = new AddUpAllNumbers();
        System.out.println(addUpAllNumbers.addAll(summa));

    }
    public int addAll(int sum){

        int result = 0;
        for(int i = 1; i<=sum; i++){
            result += i;
        }
        return result;
    }
}
