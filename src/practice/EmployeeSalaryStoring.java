package practice;
//Please put the correct code to the commented places  to get the below output.
import java.util.*;

public class EmployeeSalaryStoring {

    public static void main(String[] args) {

//Below Line will create HashMap with initial size 10 and 0.5 load factor

        Map<String, Integer>empSal = new HashMap<String, Integer>(10, 0.5f);

        //Adding employee name and salary to map

        empSal.put("Ramesh", 10000);

        empSal.put("Suresh", 20000);

        empSal.put("Mahesh", 30000);

        empSal.put("Naresh", 1000);

        empSal.put("Nainesh",15000);

        empSal.put("Rakesh", 10000);
// Duplicate Value also allowed but Keys should not be duplicate

//Value can be null as well

// Printing full Map

//Adding new employee the Map to see ordering of object changes

//Removing one key-value pair


//Printing full Map
        System.out.println("Original Map: " + empSal);

//Printing all Keys
        System.out.println(empSal.keySet());

//Printing all Values
        System.out.println(empSal.values());



    }



}