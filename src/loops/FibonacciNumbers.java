package loops;

public class FibonacciNumbers {

    public static void main(String[] args) {

        printFib(10);
    }

    public static void printFib(int n) {
        //1 1 2 3 5 8 13 21 34 55

        int num = 0; int num2 = 1;
        System.out.print("1 ");

        for (int f = 0; f<n-1; f++) {

            int sum = num + num2;
            num = num2; num2=sum;
            System.out.print(sum + " ");
        }



    }
}
