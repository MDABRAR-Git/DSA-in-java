// Problem: Longest subarray with sum K
// Platform:  TakeUForward
// Date: 2026-01-21
// Time Complexity: O(n^2)

import java.util.*;

class Solution {
    public int longestSubarray(int[] a, int k) {
        int n = a.length;
        int ans = 0;

        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += a[j];
                if(sum == k){
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        Solution sol = new Solution();
        System.out.println(sol.longestSubarray(nums, k));
    }
}
