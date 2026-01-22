// Problem: Rearrange Array Elements by Sign
// Platform: LeetCode / DSA Practice
// Description: Rearrange array so that positive and negative numbers alternate,
//              preserving relative order, starting with a positive.
// Time Complexity: O(n)
// Space Complexity: O(n)
 

import java.util.*;

class Solution {
    public int[] rearrangeArray(int[] c) {
        int n = c.length;
        int[] pos = new int[n/2];
        int[] neg = new int[n/2];
        
        int p = 0, q = 0;

        
        for(int i = 0; i < n; i++){
            if(c[i] > 0) pos[p++] = c[i];
            else neg[q++] = c[i];
        }

       
        p = 0; 
        q = 0;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0) c[i] = pos[p++];
            else c[i] = neg[q++];
        }

        return c;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();
        int[] nums = new int[n];

        
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        int[] result = sol.rearrangeArray(nums);

        
        for(int x : result){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
