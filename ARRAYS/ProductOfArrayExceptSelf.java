// Problem: 238. Product of Array Except Self
// Platform: LeetCode / DSA Practice
// Description: Return an array output such that output[i] is the product of all elements
//              except nums[i], without using division.
// Time Complexity: O(n)
// Space Complexity: O(1) extra space (output array not counted)


import java.util.*;

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Prefix products
        result[0] = 1;
        for(int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Step 2: Suffix products
        int suffix = 1;
        for(int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * suffix;
            suffix *= nums[i];
        }

        return result;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input: size of array
        int n = sc.nextInt();
        int[] nums = new int[n];

        // Input: array elements
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        int[] ans = sol.productExceptSelf(nums);

        // Output
        for(int x : ans) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
