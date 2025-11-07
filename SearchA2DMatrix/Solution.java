package SearchA2DMatrix;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 7;
        System.out.println((solution.searchMatrix(arr, target)));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix[0][0] > target) {
            return false;
        }
        int left = 0;
        int right = matrix.length - 1;
        int middle = left + (right - left) / 2;
        boolean f = false;
        int tot = 0;
        while (true) {
            //System.out.println(left + " " + middle + " " + right);
            if (matrix[matrix.length - 1][0] <= target) {
                tot = matrix.length - 1;
                f = true;
                break;
            }
            if (matrix[left][0] <= target && target < matrix[middle][0]) {
                if (left + 1 == middle) {
                    tot = left;
                    f = true;
                    break;
                }
                right = middle;
                middle = left + (right - left) / 2;
            } else if (matrix[middle][0] <= target && target < matrix[right][0]) {
                if (middle + 1 == right) {
                    tot = middle;
                    f = true;
                    break;
                }
                left = middle;
                middle = left + (right - left) / 2;
            }


        }
        if (f) {


            left = 0;
            right = matrix[tot].length - 1;
            middle = left + (right - left) / 2;
            while (left <= right) {



                if (target == matrix[tot][middle]) {
                    return true;
                } else if (target > matrix[tot][middle]) {
                    left = middle+1;
                    middle = left + (right - left) / 2;
                } else if (target < matrix[tot][middle]) {
                    right = middle-1;
                    middle = left + (right - left) / 2;
                }
            }
        }

        return false;


    }
}