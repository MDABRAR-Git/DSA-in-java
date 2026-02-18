// Problem: Best Time to Buy and Sell Stock
// Platform: LeetCode / DSA Practice
// Description: Find the maximum profit from one buy-sell transaction.
// Time Complexity:O(n)
// Space Complexity:O(1)


import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices) {
            if(price < minPrice) {
                minPrice = price;  // update buying price
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: size
        int n = sc.nextInt();
        int[] prices = new int[n];

        // Input: stock prices
        for(int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        int profit = sol.maxProfit(prices);

        // Output: max profit
        System.out.println(profit);
    }
}
