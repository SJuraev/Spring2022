package lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ArrayListIntro {

    public static Map<Integer, String> map;

    public static void main(String[] args) {
        //shortcut for import -> alt + enter for windows
        //option + enter for mac

        //<String> -> Generics. are used to force certain data types
        //for all elements in the arrayList.
        //
        ArrayList<String> firstList = new ArrayList<>();
        ArrayList<String> secondList = new ArrayList<>();

        secondList.add("Football");
        secondList.add("JiuJitsu");
        secondList.add("Swimming");
        secondList.add("Gymnastics");

        System.out.println(secondList);

        //how do we add new elements to our list?
        //Adds to the end of the collection.
        firstList.add("BMW");
        firstList.add("Mercedes");
        firstList.add("Lambo");

        System.out.println(firstList);

        firstList.add("Ferrari");
        System.out.println(firstList);

        //it's  flexible method that add the elements at the given index.
        firstList.add(1,"Dodge");
        System.out.println(firstList);

        ArrayList<Integer> nums = new ArrayList<>();//Lists can only store non-primitive data types (Objects),
        // so we can not store primitives like int,double, char rather we have to use Wrapper-class for each primitive data type.

        nums.add(10);
        nums.add(12);
        nums.add(-10);
        nums.add(1,19);

        System.out.println(nums);

        //instead of [] lists use .get(int index) method to access
        //specific elements
        System.out.println(firstList.get(4));

        //.size is same as arr.length.
        System.out.println(firstList.size());

        firstList.add(0, "Toyota");
        System.out.println(firstList);

        List<String> names = new ArrayList<>();
        names.add("Lisa");
        names.add("Kevin");
        names.add("Roger");
        for (int i = 0; i < names.size(); i++){
            String name = names.get(i);
            if(i>0){
                System.out.print(", ");
            }
            System.out.print(name);
        }
    }
}
