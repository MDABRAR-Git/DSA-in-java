// Problem: 152. Maximum Product Subarray
// Platform: LeetCode / DSA Practice
// Description: Return the maximum product of a contiguous subarray.
// Time Complexity: O(n)
// Space Complexity: O(1)


import java.util.*;

class Solution {
    public int maxProduct(int[] a) {
        int res = Integer.MIN_VALUE;

        // In case all are negative and no multiplication helps, track max element
        for (int x : a) {
            res = Math.max(res, x);
        }

        int cmax = 1, cmin = 1;

        for (int x : a) {
            int temp = cmax * x;

            cmax = Math.max(x, Math.max(temp, cmin * x));
            cmin = Math.min(x, Math.min(temp, cmin * x));

            res = Math.max(res, cmax);
        }

        return res;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: size of array
        int n = sc.nextInt();
        int[] nums = new int[n];

        // Input: array values
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        System.out.println(sol.maxProduct(nums));
    }
}
