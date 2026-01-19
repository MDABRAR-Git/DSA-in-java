import java.util.*;

class Solution {

    public boolean check(int[] a) {
        int n = a.length;
        int c = 0;

        for (int i = 1; i < n; i++) {
            if (a[i - 1] > a[i]) {
                c++;
            }
        }

        if (a[n - 1] > a[0]) {
            c++;
        }

        return c <= 1;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] arr1 = {3, 4, 5, 1, 2};
        int[] arr2 = {2, 1, 3, 4};
        int[] arr3 = {1, 2, 3};
        int[] arr4 = {1, 1, 1};

        System.out.println(obj.check(arr1));
        System.out.println(obj.check(arr2));
        System.out.println(obj.check(arr3));
        System.out.println(obj.check(arr4));
    }
}
