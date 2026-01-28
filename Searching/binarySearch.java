import java.util.*;

public class Main {

    static class Solution {
        public int search(int[] a, int k) {
            int n = a.length;
            int l = 0, h = n - 1;
            int ans = bin(a, k, l, h);
            return ans;
        }

        int bin(int[] a, int k, int l, int h) {
            int n = a.length; // unused but kept to match your code
            if (l > h)
                return -1;

            int mid = (l + h) / 2;
            if (k == a[mid])
                return mid;
            else if (k < a[mid])
                return bin(a, k, l, mid - 1);
            else
                return bin(a, k, mid + 1, h);
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] a = { -1, 0, 3, 5, 9, 12 };
        int k = 9;

        int result = sol.search(a, k);
        System.out.println(result);
    }
}
