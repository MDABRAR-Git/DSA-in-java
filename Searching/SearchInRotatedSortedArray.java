// Problem: 81. Search in Rotated Sorted Array II
// Platform: LeetCode / DSA Practice
// Description: Search target in a rotated sorted array that may contain duplicates.
// Time Complexity: O(log n) average, O(n) worst case (due to duplicates)
// Space Complexity: O(1)


import java.util.*;

class Solution {
    public boolean search(int[] a, int tar) {
        int l = 0, r = a.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            // Target found
            if (a[m] == tar) return true;

            // Handle duplicates
            if (a[l] == a[m] && a[m] == a[r]) {
                l++;
                r--;
            }
            // Left half sorted
            else if (a[l] <= a[m]) {
                if (a[l] <= tar && tar < a[m]) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }
            // Right half sorted
            else {
                if (a[m] < tar && tar <= a[r]) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
        }

        return false;
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

        // Input: target
        int target = sc.nextInt();

        Solution sol = new Solution();
        System.out.println(sol.search(nums, target));
    }
}
