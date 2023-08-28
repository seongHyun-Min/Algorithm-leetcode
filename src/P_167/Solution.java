package P_167;

import java.util.*;
public class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        Arrays.sort(numbers);
        int[] result = new int[2];
        int start = 0;
        int end = numbers.length -1;
        while(start <= end){
            int mid = (numbers[start] + numbers[end]);
            if(mid == target){
                result[0] = start+1;
                result[1] = end+1;
                break;
            }else if(mid > target){
                end --;
            }else{
                start ++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[] {5, 25, 75}, 100)));
    }
}