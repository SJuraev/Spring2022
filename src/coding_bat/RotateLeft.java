package coding_bat;

import java.util.Arrays;
import java.util.Collections;

public class RotateLeft {

    public static void main(String[] args) {
        int[] rotateToLeft = {1, 22, 3};;
        System.out.println(Arrays.toString(rotateToLeft));

        RotateLeft rotate = new RotateLeft();
        System.out.println(Arrays.toString(rotate.rotateLeft3(rotateToLeft)));
        System.out.println(Arrays.toString(rotate.maxAmong3(rotateToLeft)));
        System.out.println(Arrays.toString(rotate.maxEnd3(rotateToLeft)));
    }

    public int[] rotateLeft3(int[] nums) {
        //[1, 2, 3] → [2, 3, 1]
        return new int[] {nums[1], nums[2], nums[0]};
    }

    public int[] maxAmong3(int[] nums) {
        int max = 0;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return new int[] {max, max, max};
    }

    public int[] maxEnd3(int[] nums) {
        if(nums[0] >= nums[2]){
            return new int[] {nums[0], nums[0], nums[0]};
        }
        return new int[] {nums[2], nums[2], nums[2]};
    }
}
