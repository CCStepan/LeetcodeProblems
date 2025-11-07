package LongestCommonPrefix;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] arr = {"dog", "racecar", "car"};
        System.out.println(solution.longestCommonPrefix(arr));
    }

    public String longestCommonPrefix(String[] strs) {
        String total = "";
        boolean isGood = true;
        for (int j = 0; j < 200; j++) {

            if (strs[0].length() < j) {
                break;
            }
            String prefix = strs[0].substring(0, j);

            for (int i = 0; i < strs.length; i++) {
                if (!strs[i].startsWith(prefix)) {
                    isGood = false;
                    break;
                }
            }
            if (isGood) {
                total = prefix;
            }
        }

        return total;
    }
}