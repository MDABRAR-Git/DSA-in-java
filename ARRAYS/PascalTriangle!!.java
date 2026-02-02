// Problem: 119. Pascal's Triangle II
// Platform: LeetCode
// Difficulty: Easy
// Approach: Mathematical Combination (nCr)
// Time Complexity: O(n)
// Space Complexity: O(n)
 

import java.util.*;

class Solution {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();

        long value = 1;      // long to prevent overflow
        ans.add(1);          // C(rowIndex, 0)

        for (int i = 0; i < rowIndex; i++) {
            value = value * (rowIndex - i);
            value = value / (i + 1);
            ans.add((int) value);
        }

        return ans;
    }

   
    public static void main(String[] args) {
        Solution sol = new Solution();

        int rowIndex = 3;   // change this to test
        List<Integer> result = sol.getRow(rowIndex);

        System.out.println("Row " + rowIndex + " of Pascal's Triangle:");
        System.out.println(result);
    }
}
