// Problem: Set Matrix Zeroes
// Platform: LeetCode (Problem 73)
// Date: 2026-01-29
// Time Complexity: O(n * m)
// Space Complexity: O(n + m)

import java.util.*;

class Solution {

    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        boolean[] zeroRow = new boolean[n];
        boolean[] zeroCol = new boolean[m];

        // Mark rows and columns that contain zero
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    zeroRow[i] = true;
                    zeroCol[j] = true;
                }
            }
        }

        // Set matrix cells to zero
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (zeroRow[i] || zeroCol[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    // Driver code for local testing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        Solution sol = new Solution();
        sol.setZeroes(matrix);

        // Print updated matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
