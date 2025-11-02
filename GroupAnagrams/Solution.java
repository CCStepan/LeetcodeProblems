package GroupAnagrams;

import org.jetbrains.annotations.NotNull;

import java.util.*;


public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println(solution.groupAnagrams(strs));
    }


    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String word = strs[i];
            String key = Arrays.toString(code(word));

            if (!hashMap.containsKey(key)) {

                hashMap.put(key, new ArrayList<>());

            }
            hashMap.get(key).add(word);
        }
        List<List<String>> total = new ArrayList<>();

        for (String key : hashMap.keySet()) {
            total.add(hashMap.get(key));
        }
        return total;
    }

    public int[] code(String s) {
        int[] letters = new int[26];


        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 97]++;


        }
        return letters;
    }
}