package loops;

public class ForEachLoops {
    // Java program to illustrate
// for-each loop
        public static void main(String[] arg) {
            {
                int[] marks = { 125, 132, 95, 116, 110 };

                int highest_marks = maximum(marks);
                System.out.println("The highest score is " + highest_marks);
            }

            int[] summa = {1,2, 3, 4, 5, 6, 10};
            System.out.println("The sum of array is: " + getSum(summa));

            int[] secondMax = {1, 10, 100, 1000, 9999, 9999};
            System.out.println("The second maximum value of the array is: " + getSecondLargestValue(secondMax));
        }
        public static int maximum(int[] numbers) {
            int maxSoFar = numbers[0];

            // for each loop
            for (int num : numbers)
            {
                if (num > maxSoFar)
                {
                    maxSoFar = num;
                }
            }
            return maxSoFar;
        }

        public static int getSum(int[] arr){
            int sum = 0;
            //we need 3 values
            //1) declaration of a reference (should be the same type as the array), in this case int
            //2) : syntax
            //3) specify the collection
            for (int summa : arr){
                sum += summa;
            }
            return sum;
        }

        public static int getSecondLargestValue (int[] arr) {

            int maxSoFar = arr[0];
            int secondMax = Integer.MIN_VALUE;

            // for each loop
            for (int num : arr) {
                if (num > maxSoFar) {
                    secondMax = maxSoFar;
                    maxSoFar = num;
                    continue;
                }
                if(num > secondMax && num < maxSoFar) secondMax = num;
            }
            return secondMax;
        }

}

