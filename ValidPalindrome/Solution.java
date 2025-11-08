package ValidPalindrome;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome("0P"));
    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if ((letter - 0 >= 97 && letter - 0 <= 122) || (letter - 0 >= 48 && letter - 0 <= 57)) {
                sb.append(letter);
            }

        }

        String total = sb.toString();

        for (int i = 0; i < total.length(); i++) {
            if (total.charAt(i) != total.charAt(total.length() - i - 1)) {

                return false;
            }
        }
        return true;
    }
}
