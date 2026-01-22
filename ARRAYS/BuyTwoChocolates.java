// Problem: Buy Two Chocolates
// Platform: LeetCode / DSA Practice
// Description: Buy exactly two chocolates with minimum cost such that leftover money >= 0.
// Time Complexity: O(n log n) due to sort
// Space Complexity: O(1)
 

import java.util.*;

class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);

        int sum = prices[0] + prices[1];
        if(sum <= money) {
            return money - sum;
        }
        return money;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         
        int n = sc.nextInt();
        int[] prices = new int[n];

        for(int i = 0; i < n; i++){
            prices[i] = sc.nextInt();
        }

        
        int money = sc.nextInt();

        Solution sol = new Solution();
        int leftover = sol.buyChoco(prices, money);

         
        System.out.println(leftover);
    }
}
