package BinarySearch;

public class Solution {


    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int x = 0;
        while (left <= right) {

            int middle = left + (right - left) / 2;

            if (target == nums[middle]) {
                return middle;
            } else if (target < nums[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }


        }
        return -1;
    }
}