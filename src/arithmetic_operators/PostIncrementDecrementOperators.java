package arithmetic_operators;

public class PostIncrementDecrementOperators {

        public static void main (String[] args) {
            int num1=100;
            int num2=200;
            num1++;
            num2--;
            System.out.println("num1++ is: " + num1);
            System.out.println("num2-- is: " + num2);

            //count number of people in the building
            int numberOfPeople = 0;
            numberOfPeople++;
            System.out.println(numberOfPeople);

            //post increment decrement get updated next time you are using it.
            //
            System.out.println(numberOfPeople++);//still 1 bc it gets updated not in the same place
            // rather in the next usage of numbOfPeople
            System.out.println(numberOfPeople);//2
            System.out.println(numberOfPeople++);//still 2
            System.out.println(numberOfPeople++);//3
            System.out.println(numberOfPeople);//4
            numberOfPeople--;
            System.out.println(numberOfPeople--);//3


            //Pre increments updates the value of a variable by 1 on the sam line

            int y = 11;
            int x = 9;
            int a = 11;
            int b = 9;

            --y;
            ++x;
            a--;
            b++;

            System.out.println(y);//10
            System.out.println(x);//10
            System.out.println(a);//10
            System.out.println(b);//10

            System.out.println("pre increment " + ++y);//updates right away ->11
            System.out.println("pre decrement " + --x);//updates right away ->9
            System.out.println("post increment " + a++);//stat same on this line -> 10
            System.out.println("post decrement " + b--);//stays same on this line -> 10

            int number = 20;
            int number2 = number++;

            System.out.println(number2);//20
            System.out.println(number);//21

            int num3 = 1;
            int num4 = --num3;

            System.out.println(num4);//00
        }
    }

