// Problem: Remove Duplicates from Sorted Array
// Platform: LeetCode / DSA Practice
// Description: Given a sorted array, remove duplicates in-place so that each element appears only once.
// Time Complexity: O(n)
// Space Complexity: O(1)


import java.util.*;

class Solution {
    public int removeDuplicates(int[] a) {
        int n = a.length;
        if(n == 0) return 0;

        int i = 0;
        for(int j = 1; j < n; j++){
            if(a[j] != a[i]){
                i++;
                a[i] = a[j];
            }
        }

        // After i+1 elements are unique
        return i + 1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: size of array
        int n = sc.nextInt();
        int[] nums = new int[n];

        // Input: sorted array elements
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        int k = sol.removeDuplicates(nums);

        // Output: first k unique elements
        System.out.println("Unique count: " + k);
        System.out.print("Array after removal: ");
        for(int i = 0; i < k; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
