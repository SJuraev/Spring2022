package oop.practice;
/*
Iryna, [08.06.2022 21:18]
design a vending machine simulator .
it should display all items it has with code and price.

A1  Water  $1.5
A2  Coke  $1.05
A3  Sprite  $1.05
A4  Apple Juice  $1.45

B1  Pretzels  $1.25
B2  Snickers  $1.65
B3  Lay's Potato Chips  $1.35
B4  Peanuts  $0.95

C1  Gummy Bears  $1.5
C2  Skittles  $5.1
C3  Gum-balls  $2.7
C4  Hot Tamales  $7.55

the VM should accept US currency ONLY 25¢, $1, or $5. if entered some other bill program should say "not valid bill" and
 ask to enter again. If entered wrong bill 3 times program should say "You've reached maximum(3) amount of wrong inputs.
  Start over." and give all money back after finish inserting money user should see total money entered and should be
  able to choose an item from selection. If entered wrong item code program should say "Invalid item, try again" and
   let a user enter item code again if price of an item is more that money inserted program should say
    "insufficient funds, please add more money " after choosing item program should give out the item and change

example:
A1 = Water($1.5) A2 = Coke($1.05) A3 = Sprite($1.05) A4 = Apple Juice($1.45)
B1 = Pretzels($1.25) B2 = Snickers($1.65) B3 = Lay's Potato Chips($1.35) B4 = Peanuts($0.95)
C1 = Gummy Bears($1.5) C2 = Skittles($5.1) C3 = Gum-balls($2.7) C4 = Hot Tamales($7.55)

Accepted currency: USD only!
Enter 25¢, $1, or $5
25
Would you like to enter more money ?(Y/N)
y
Accepted currency: USD only!
Enter 25¢, $1, or $5
2
Not valid bill
Would you like to enter more money ?(Y/N)
y
Accepted currency: USD only!
Enter 25¢, $1, or $5
1
Would you like to enter more money ?(Y/N)
n
Total is 1.25
Please chose item using code:
s6
Invalid item, try again
Please chose item using code:
a2
Don't forget your Coke
And your change of 0.20
 */
public class VendingMachine {
}
