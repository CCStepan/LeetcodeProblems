package AddBinary;

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addBinary("1",
                "11"));
    }

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry == 1) {
            if (i >= 0) {
                carry += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                carry += b.charAt(j--) - '0';
            }
            sb.append(carry%2);
            carry=carry/2;
        }
        return sb.reverse().toString();
    }
}