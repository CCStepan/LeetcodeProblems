package ValidAnagram;

import java.util.Scanner;

class Solution {


    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }


        int[] letters1 = new int[26];
        int[] letters2 = new int[26];
        for (int i = 0; i < s.length(); i++) {
            letters1[s.charAt(i) - 97]++;
            letters2[t.charAt(i) - 97]++;
        }
        for (int i = 0; i < 26; i++) {

            if (letters1[i] != letters2[i]) {
                return false;
            }
        }


        return true;
    }
}