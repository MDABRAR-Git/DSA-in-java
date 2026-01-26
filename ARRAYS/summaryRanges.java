// Problem: 228. Summary Ranges
// Platform: LeetCode / DSA Practice
// Description: Given a sorted unique integer array, return the smallest sorted list of ranges.
// Time Complexity: O(n)
// Space Complexity: O(n)


import java.util.*;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int n = nums.length;
        
        if (n == 0) return result;

        int i = 0;
        while (i < n) {
            int start = nums[i];
            int j = i;

            // expand while consecutive
            while (j + 1 < n && nums[j + 1] == nums[j] + 1) {
                j++;
            }

            // single element
            if (start == nums[j]) {
                result.add(String.valueOf(start));
            } else {
                result.add(start + "->" + nums[j]);
            }

            i = j + 1;
        }
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input size
        int n = sc.nextInt();
        int[] nums = new int[n];

        // input array values
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        List<String> ans = sol.summaryRanges(nums);

        // output
        for (String s : ans) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
