import java.util.*;

class Solution {
    public void sortColors(int[] a) {
        int n = a.length;
        int temp;

        // Bubble Sort (allowed since N <= 300)
        for(int i = n - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(a[j] > a[j + 1]) {
                    temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input length
        int n = sc.nextInt();
        int[] nums = new int[n];

        // Read array values
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call solution
        Solution sol = new Solution();
        sol.sortColors(nums);

        // Print result
        for(int x : nums) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
