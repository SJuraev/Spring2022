##Lists

- Lists have dynamic size. Size can be dynamically changed at the runtime. (while program is running)
- Lists have many handful methods
- Lists can only store non-primitive data types (Objects), so we can not store primitives like int,double, char
rather we have to use Wrapperclass for each primitive data type.


##Wrapper classes
each primitive data type has a wrapper class which is essentially a workaround for lists to be able to store
data types such as Integer, double.

int -> Integer
double -> Double
char -> Character
boolean -> Boolean
float -> Float


We can still perform all arithmetical operation using Wrapper classes.


All Wrapper classes have static method like parseInt, parseDouble that help us to
convert Strings to Wrapper clases.


####Autoboxing vs Unboxing Wrapper Classes
There is  an automated process of converting primitive and wrapper class data types 
between each other. 

Autoboxing => Autoboxing is the automatic conversion that the Java compiler makes between
the primitive types and their corresponding object wrapper classes.
For example, converting an int to an Integer, a double to a Double, and so on.
If the conversion goes the other way, this is called unboxing.
ex:
     Character ch = 'a';
     Integer num = 1;
     int num2 = 10;
     Integer num3 = num2;
     
     
unboxing => Converting an object of a wrapper type (Integer) to its corresponding
primitive (int) value is called unboxing.
ex:

     Integer num1 = new Integer(12);
     int  num2 = num1;
     
     
     
###Convert Lists to Arrays
There are some problems which would require you to convert Lists to Arrays
it possible in Java List has a method called toArray();


####Object
Object is a data type(class) which is the Adam(Eve) of all classes. Every single class
in java extend(Inheritance) from Object class. 



###Collections class
is a helper class for Lists like an "Arrays" class for arrays.

Home > Articles


###References to Objects
As you work with objects, it's important to understand references.
A reference is an address that indicates where an object's variables and methods are stored.
You aren't actually using objects when you assign an object to a variable or pass an object
to a method as an argument. You aren't even using copies of the objects. Instead, you're using
references to those objects.


     
 