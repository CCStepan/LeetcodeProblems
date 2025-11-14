package ScoreofaString;

public class Solution {
    public int scoreOfString(String s) {
        int k = 0;
        for (int i = 1; i < s.length(); i++) {
            k += Math.abs(s.charAt(i) - s.charAt(i - 1));


        }
        return k;
    }
}