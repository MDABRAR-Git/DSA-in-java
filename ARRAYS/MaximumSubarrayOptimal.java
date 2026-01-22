// Problem: Maximum Subarray (Kadane's Algorithm)
// Platform: LeetCode 
// Description: Find the maximum sum of any contiguous subarray.
// Time Complexity: O(n)
// Space Complexity: O(1)


import java.util.*;

class Solution {
    public int maxSubArray(int[] a) {
        int n = a.length;
        int ans = Integer.MIN_VALUE;
        int s = 0;

        for(int j = 0; j < n; j++) {
            s += a[j];
            ans = Math.max(ans, s);
            if(s < 0) s = 0;
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();
        int[] nums = new int[n];

       
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        int result = sol.maxSubArray(nums);

       
        System.out.println(result);
    }
}
