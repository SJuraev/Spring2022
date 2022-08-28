package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveToEnd {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array = Arrays.asList(1,2,3,2,4,2,5,2);
        int move = 2;
        MoveToEnd moveToEnd =new MoveToEnd();
        List<Integer>result = moveToEnd.moveElementToEnd(array,move);
        System.out.println(result);

    }

    public List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        //TODO implement this method
        List<Integer>movedList = new ArrayList<>();
        for (int integer : array) {
            if (integer == toMove) {
                movedList.add(integer);
            } else {
                movedList.add(0, integer);
            }
        }
        return movedList;
    }
}
