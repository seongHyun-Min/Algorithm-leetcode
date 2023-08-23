package P_26;

import java.util.Arrays;

public class Solution {
    public static int removeDuplicates(int[] nums) {

        int prior = nums[0];
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != prior) {
                nums[index] = nums[i];
                index++;
            }
            prior = nums[i];
        }
        System.out.println(Arrays.toString(nums));
        return index;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }
}