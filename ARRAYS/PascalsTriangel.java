// Problem: Pascal's Triangle
// Platform: LeetCode
// Difficulty: Easy
// Time Complexity: O(n^2)
// Space Complexity: O(n^2)

import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numRows = sc.nextInt();

        Solution sol = new Solution();
        List<List<Integer>> result = sol.generate(numRows);

        // Print output
        for (List<Integer> row : result) {
            System.out.println(row);
        }

        sc.close();
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if (numRows <= 0) return result;

        result.add(Arrays.asList(1)); // first row

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev = result.get(i - 1);
            List<Integer> curr = new ArrayList<>();

            curr.add(1);

            for (int j = 1; j < i; j++) {
                curr.add(prev.get(j - 1) + prev.get(j));
            }

            curr.add(1);
            result.add(curr);
        }

        return result;
    }
}
