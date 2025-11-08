package JewelsAndStones;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }

        int total = 0;
        for (int i = 0; i < stones.length(); i++) {

            Character letter = stones.charAt(i);
            if (set.contains(stones.charAt(i))) {
                total += 1;
            }
        }

        return total;
    }
}