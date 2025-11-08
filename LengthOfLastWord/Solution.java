package LengthOfLastWord;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWord("luffy is still joyboy"));
    }

    public int lengthOfLastWord(String s) {
        int k=0;
        for (int i = s.length()-1; i >=0 ; i--) {

            if(s.charAt(i)==' '){
                if(k==0){
                    continue;
                }
                return k;
            }else{
                k++;
            }

        }
        return k;
    }
}