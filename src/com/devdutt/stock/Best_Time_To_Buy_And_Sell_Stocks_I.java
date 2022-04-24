package com.devdutt.stock;

import java.util.Arrays;

public class Best_Time_To_Buy_And_Sell_Stocks_I {

    private static int buyAndSellStockI(int[] price) {
        int minSoFor = price[0];
        int maxProfit = 0;
        for (int i = 0; i < price.length; i++) {
            minSoFor = Math.min(minSoFor, price[i]);
            int profit = price[i] - minSoFor;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int price[] = {6, 1, 4, 2, 5, 3};
        int maxProfit = buyAndSellStockI(price);
        System.out.println("Maximum Profit of [ " + Arrays.toString(price) + " ] :- " + maxProfit);
    }//method
}//class
