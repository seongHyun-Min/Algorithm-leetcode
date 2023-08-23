package P_27;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // 새로운 길이를 카운트하는 변수
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i]; // val과 다른 요소를 앞으로 옮겨 저장하고 k 증가
            }
        }
        return k; // 새로운 길이 반환
    }
}
