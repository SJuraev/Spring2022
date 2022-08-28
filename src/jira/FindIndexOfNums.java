package jira;

// TODO
//        Write a method to find indexes of two numbers such that their sum matches to target num
//        For example
//              numbers = {12, 23, 2, 3, 7, 5} & target=9
//              Output should be index1 = 2 & index2 = 4 as if we add 7 and 2 result is 9

//        Another example
//              numbers = {3, 5, 8, 12, 10, 1} & target=15
//              Output should be index1 = 1 & index2 = 4 as if we add 5 and 10 result is 15

import java.util.Arrays;

public class FindIndexOfNums {

    public static void main(String[] args) {
//        System.out.println("Please choose the size of the array: ");
//        Scanner scanner = new Scanner(System.in);
//        int size = scanner.nextInt();
//        int[] numbers = new int[size];
//        System.out.println("Please input the numbers");
        int[] numbers = {12, 23, 2, 3, 7, 5};
        int target = 9;
        System.out.println(Arrays.toString(twoSumTarget(numbers, target)));
    }

    public static int[] twoSumTarget(int[]numbers, int target){

        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                int secondIndex = target - numbers[i];
                if(numbers[j] == secondIndex){
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No sum for the target number" + target);
    }

}
