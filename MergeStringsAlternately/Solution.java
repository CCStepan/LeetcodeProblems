package MergeStringsAlternately;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mergeAlternately("abcd", "pq"));
    }

    public String mergeAlternately(String word1, String word2) {
        int p1 = 0;
        int p2 = 0;
        StringBuilder sb = new StringBuilder();
        while (p1 < word1.length() || p2 < word2.length()) {
           
            if (p1 < word1.length() && p2 < word2.length()) {
                sb.append(word1.charAt(p1));
                sb.append(word2.charAt(p2));
                p1++;
                p2++;
            } else if (p1 < word1.length()) {
                sb.append(word1.charAt(p1));
                p1++;
            } else if (p2 < word2.length()) {
                sb.append(word2.charAt(p2));
                p2++;
            }
        }
        return sb.toString();
    }
}