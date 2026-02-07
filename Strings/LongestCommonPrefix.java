// Problem: 14. Longest Common Prefix
// Platform: LeetCode / DSA Practice
// Description: Find the longest common prefix among an array of strings.
// Time Complexity: O(n * m)
//   n = number of strings, m = length of smallest string
// Space Complexity: O(1)


import java.util.*;

class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0)
            return "";

        // Compare characters of the first string with others
        for (int i = 0; i < strs[0].length(); i++) {

            char c = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {

                // If string ends or mismatch occurs
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0];
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input: number of strings
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] strs = new String[n];

        // Input: strings
        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine();
        }

        Solution sol = new Solution();
        System.out.println(sol.longestCommonPrefix(strs));
    }
}
