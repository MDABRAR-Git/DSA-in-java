// Problem: 35. Search Insert Position
// Platform: LeetCode / DSA Practice
// Description: Return the index if target is found, otherwise return the index where it would be inserted.
// Time Complexity: O(log n)
// Space Complexity: O(1)


import java.util.*;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } 
            else if (nums[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        // low will be the correct insertion position
        return low;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: size of array
        int n = sc.nextInt();
        int[] nums = new int[n];

        // Input: sorted array elements
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input: target value
        int target = sc.nextInt();

        Solution sol = new Solution();
        System.out.println(sol.searchInsert(nums, target));
    }
}
