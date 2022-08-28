`###Strings

###How to call String Methods
-we use any String, be it a variable, literal and follow it by a ".";

ex: String str = "Hello";
str. => from here you can access all String methods that are available.

###public String concat(String str)
concat method takes a String and adds it to the original String and return the result.

ex: String str = "Hello";//original String 
String result = str.concat(" World ");


###public int length();
length of the word(String) / number of characters in the String;
ex: String str = "Hello";
    str.length();  => 5;

.length() gets the quantity of characters, has nothing to do with positions.
note: do not start from 0;
all special characters as space, "," are considered as one of single character
as well. So we do count them too.

###public char charArt(int index);

charAt method takes an integer value and uses the value to return one character.

How is int index used? charAt method uses int index as a position of a character
in a String to be returned.

ex: String str = "Hello";
   //which number (integer) you need to provide will
   //depend on the requirements(task);

   //the index must be inside the range of 0 - 4(in case of String "Hello") or
   //0 and str.length;
chat second letter = str.charAt(1);
    str.charAt()
   
What happens if the value is negative in charAt() method - charAt(-10)?
if the index is out of range (both negative or more than length - 1)
then java will throw an Exception() runtime error.
StringIndexOutOfBoundsException.

###public boolean isEmpty()
it returns true if the String is empty;
otherwise false;

ex:
String str = "";
boolean result = str.isEmpty();//true

String str = "Hello";
str.isEmpty()://false

###public String substring(int i)
String substring (int i): Return the substring from the ith index character to end.
"DevXSchool".substring(3); // returns “XSchool”
ex: 
String str = "Hello";
String result = str.substring(2);
System.out.println(result);

String str1 = "United States of America";
System.out.println(str1.substring(7));


###public String substring (int i, int j)
String substring (int i, int j): Returns the substring from i to j-1 index.
"DevXSchool".substring(2, 5); // returns “vXS
i - starting point inclusive
j - ending point exclusive

String str = "DevX School";

str.substring(0,4) => DevX;
str.substring(5) => School;




###public String concat(String str)
String concat( String str): Concatenates specified string to the end of this string.
String s1 = ”DevX”;
String s2 = ”School”;
String output = s1.concat(s2); // returns “DevXSchool”

###public int indexOf(String s)
Takes a String returns an int.
int indexOf (String s): Returns the index within the string of the first occurrence
of the specified string. String s = ”Learn Share Learn”; 
int output = s.indexOf(“Share”); // returns 6

s -> represents a substring of which you want to find the index of. It could also be
just one character.

indexOf returns the index of a given substring.
if the substring doesn't exist in this String then return -1;
ex:
"DevXSchool".indexOf("S") => 4;

String senior = "Senior SDET";
int output = senior.indexOf("Seniorita"); => -1
System.out.println(output);
String devX = "DevXSchool";
int out = devX.indexOf("S"); =>4
System.out.println(out);
String learn = "Learn Share Learn";
int output1 = learn.indexOf("Share");=>6

###public int indexOf (String s, int i)
int indexOf (String s, int i): Returns the index within the string of the first occurrence of the
specified string, starting at the specified index. 
String s = "Learn Share Learn";
int output = s.indexOf("ea",3);// returns 13

s=> substring;
i=> index
return the index of a first occurrence of a substring(s), however start looking for substring from a given index(i).

i => specifies what needs to be skipped. Skip everything until the index, and compare
from there
ex:
String str = "Mega Mega Megaphone";
str.indexOf("e", 3); => 6;

str.indexOf("ga", 1) => 2;

###public int lastIndexOf(String s)
Int lastIndexOf( String s): Returns the index within the string of the last occurrence of the specified
string. 
String s = "Learn Share Learn";
int output = s.lastIndexOf("a"); // returns 14

###public boolean equals(Object otherObj)
boolean equals( Object otherObj): Compares this string to the specified object.
Boolean out = "Geeks".equals("Geeks"); // returns true
Boolean out = “Geeks”.equals(“geeks”); // returns false

###public boolean equalsIgnoreCase(Object otherObj)
boolean  equalsIgnoreCase (String anotherString): Compares string to another string, ignoring
case considerations.
Boolean out= “Geeks”.equalsIgnoreCase(“Geeks”); // returns true
Boolean out = “Geeks”.equalsIgnoreCase(“geeks”); // returns true

###public String toLowerCase()
String toLowerCase(): Converts all the characters in the String to lower case.
String word1 = “HeLLo”;
String word3 = word1.toLowerCase(); // returns “hello"

###public String toUpperCase()
String toUpperCase(): Converts all the characters in the String to upper case.
String word1 = "HeLLo";
String word2 = word1.toUpperCase(); // returns "HELLO"


###public String trim()
String trim(): Returns the copy of the String, by removing whitespaces at both ends.
It does not affect whitespaces in the middle.
String word1 = “ Learn Share Learn “;
String word2 = word1.trim(); // returns “Learn Share Learn”

###public String replace(char oldChar, char newChar)
Returns new string by replacing all occurrences
of oldChar with new Char.
String s1 = “feeksforfeeks“;
String s2 = “feeksforfeeks”.replace(‘f’ ,’g’); // returns “geeksgorgeeks”
Note:- s1 is still feeksforfeeks and s2 is geeksgorgeeks

###public String replace(String oldSubString, char newSubString)
changes the whole substring to a new one, within the original String
and returns the resulting String.

String str1 = "Hello world";
String changed = str1.replace("world", "World");
System.out.println(changed);//return => "Hello World"

###public String replaceFirst(String regex, String replacement)
This method replaces the first substring of this string that matches the given regular
expression with the given replacement.

###public String replaceAll(String regex, String replacement)  
The Java String class replaceAll() method returns a string replacing all the sequence 
of characters matching regex and replacement string.

###public boolean contains(CharSequence chars)
The contains() method checks whether a string contains a sequence of characters.
if yes returns true, otherwise return false
it doesn't have to be a separate word. it can be a part of one word as well. 
Or it can even be multiple words.

String str = "MacBook Pro"
str.contains("Book") -> true.

str.contains("ok Pro"); -> true

str.contains("acb"); -> false; case sensitive

###public boolean startsWith(String str)

return true if the string starts with the given String(str).

String str = "hello World";
str.startsWith("h") // return true
str.startsWith("he") // return true
str.startsWith("hello") // return true
we can use this for sorting.

###Pool vs Heap
String uses a special memory location to reuse of String objects called
String Constant Pool. String objects created without the use of new keyword are stored
in the String Constant Pool part of the heap
####String pool.
String pool is nothing but a storage area in Java heap where string literals stores.
It is just like object allocation. By default, it is empty and privately maintained 
by the Java String class.

Any method that returns a String internally creates a new String in the heap.

ex:

String str = "hello";
String str1 = " hello".trim();
str==str1// false;
str.equals(str1);//true

###Immutability

String values will only change if you actually reassign the value of a String.

String str = "Hello";
String str2 = str.concat(" World);

System.out.println(str)//Hello
System.out.println(str2)//Hello Word
the only way we can make the following statement printout something else is by reassigning.

str = "Mars";
System.out.println(str) -> Mars

###String vs StringBuilder
A String is immutable in Java, while a StringBuilder is mutable in Java. An immutable 
object is an object whose content cannot be changed after it is created. When we try
to concatenate two Java strings, a new String object is created in the string pool.

###StringBuffer vs StringBuilder
No.	StringBuffer	StringBuilder
1) StringBuffer is synchronized i.e. thread safe. 
 It means two threads can't call the methods of StringBuffer simultaneously.
2) StringBuilder is non-synchronized i.e. not thread safe. 
It means two threads can call the methods of StringBuilder simultaneously.

3) StringBuffer is less efficient than StringBuilder.	
4) StringBuilder is more efficient than StringBuffer.

