/* 
  You are given an array prices where prices[i] is the price of a given stock
  on the ith day.
  
  You want to maximize your profit by choosing a single day to buy one stock
  and choosing a different day in the future to sell that stock.
  
  Return the maximum profit you can achieve from this transaction. If you
  cannot achieve any profit, return 0.
 */

public class BuyAndSellStock {

    public static int bestTimeToBuyAndSellStock(int prices[]) {
        // Brute Force Solution

        // int profit = 0;
        // for (int i = 0; i < prices.length - 1; i++) {
        // for (int j = i + 1; j < prices.length; j++) {
        // profit = Math.max(profit, prices[j] - prices[i]);
        // }
        // }

        // Optimized Solution

        int minSoFar = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            minSoFar = Math.min(prices[i], minSoFar);
            maxProfit = Math.max(maxProfit, prices[i] - minSoFar);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        int profit = bestTimeToBuyAndSellStock(prices);
        if (profit == 0) {
            System.out.println("No profit");
        } else {
            System.out.println("Profit of Rs. " + profit);
        }
    }
}