package P_125;



public class Solution {
    public static boolean isPalindrome(String s) {
        String alpha = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isTrue = true;
        System.out.println("alpha = " + alpha);
        int start = 0;
        int end = alpha.length() - 1;
        while (start <= end) {
            System.out.println("alpha.charAt(start) = " + alpha.charAt(start));
            System.out.println("alpha.charAt(end) = " + alpha.charAt(end));

            if (alpha.charAt(start) != alpha.charAt(end)) {
                isTrue = false;
                break;
            }
            start++;
            end--;
        }
        return isTrue;
    }

    public static void main(String[] args) {
        isPalindrome("ab_a");
    }
}