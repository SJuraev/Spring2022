##Loops

Loops are a process in java that helps us solve
repeated actions in an elegant way. Loops
help us avoid repeated codes. 

Loops help us execute one set of statements multiple times.


####Problem
Imagine a scenario where you need to get 10 exam
scores from the user and calculate the average
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter exam score 1");
    int score = 0;
    score += sc.nextInt();
    System.out.println("Enter exam score 2");
    score += sc.nextInt();
    System.out.println("Enter exam score 3");
    score += sc.nextInt();
    System.out.println("Enter exam score 4");
    score += sc.nextInt();
    System.out.println("Enter exam score 5");
    score += sc.nextInt();

Loops to the rescue. With the help of Loops we can design our code to repeat the 
given action until certain condition is met.

###While Loop
1. It's  a type of loop which is not guaranteed to run at all. 
2. While loop condition must be updated in the body of the loop. 
   a. It can enter infinite loop if the condition is not updated in the body of the loop.
3. Execution of while loop is as follows: first evaluate the conditions if it's true 
then execute the body. After the last statement of the body java will go back to the
condition and reevaluate the condition and execute the body all over again until the
condition will be false.


####Usage
While loop Should be used if the amount of iterations is not fixed.
In other words the user will decide how many times it will iterate.


###Do While Loop

1. It should be used if the number of iteration is not fixed, however you need to run it
at least once for sure.

Only difference between While and Do While is that Do While is guaranteed to run 
at least once

###For Loop
If the number of iteration is fixed, you can use for loop. 
ex: You need to loop though a String. Since String has a set amount of characters you should 
use for loop.

ex: Do something for 10 times. use for loop again bc, the amount of iteration you need to 
perform is pre-set.

###For Each Loop (Enhanced for loop)
Best suitable to retrieve the elements of an arrays & collections(Array Lists).
It iterates values, not indexes. When we know the values, we use - for each loop:
ex:
//We need to get sum of all values in the array

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