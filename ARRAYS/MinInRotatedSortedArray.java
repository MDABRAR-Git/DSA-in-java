// Problem: 153. Find Minimum in Rotated Sorted Array
// Platform: LeetCode / DSA Practice
// Description: Find the minimum element in a rotated sorted array using binary search.
// Time Complexity: O(log n)
// Space Complexity: O(1)


import java.util.*;

class Solution {
    public int findMin(int[] a) {
        int n = a.length;
        int ans = Integer.MAX_VALUE;

        int l = 0, h = n - 1;

        while (l <= h) {
            int mid = (l + h) / 2;

            // If left part is sorted
            if (a[l] <= a[mid]) {
                ans = Math.min(ans, a[l]);
                l = mid + 1;
            } 
            // Right part is sorted, so minimum is in left unsorted part
            else {
                ans = Math.min(ans, a[mid]);
                h = mid - 1;
            }
        }

        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: size of array
        int n = sc.nextInt();
        int[] nums = new int[n];

        // Input: array elements
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        System.out.println(sol.findMin(nums));
    }
}
