package CanMakeArithmeticProgressionFromSequence;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {-68, -96, -12, -40, 16};
        System.out.println(solution.canMakeArithmeticProgression(arr));

    }

    public boolean canMakeArithmeticProgression(int[] arr) {
        if (arr.length == 2) {
            return true;
        }
        int t=arr[0];
        int a1 = Integer.MAX_VALUE;
        int b = arr[0];
        int s = b;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < a1) {
                a1 = arr[i];
            }
            System.out.println(arr[i]-t);
            if(arr[i]<t){
                if (arr[i]-t < b) {
                    b = arr[i]-t;
                }
            }else{
                if (t-arr[i]< b) {
                    b = t-arr[i];
                }
            }


            s += arr[i];
        }
        System.out.println(a1);
        System.out.println(b);

        return s == ((a1 + a1 + (arr.length - 1) * b) / 2) * arr.length;
    }
}