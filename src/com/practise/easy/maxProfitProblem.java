package com.practise.easy;

public class maxProfitProblem {
    public int maxProfit(int[] prices) {
        if (prices.length < 1) {
            return 0;
        }
        int currentBP = prices[0];
        int sumProfit = 0;
        for( int i = 1; i <= prices.length -1 ; i++ ) {
            int currentSP = prices[i];
            int profit = currentSP - currentBP;
            System.out.println("Current Profit here :"+profit);
            if ( profit > 0 ) {
                //sumProfit += sumProfit + profit;
                sumProfit = sumProfit + profit;
                System.out.println("Current Max Profit :"+sumProfit);
                currentBP = prices[i];
            } else {
                currentBP = prices[i];
            }
        }
        return sumProfit;
    }

    public static void main(String args[]){
        maxProfitProblem mp = new maxProfitProblem();
        int prices[] = {1,2,3,4,5};
        System.out.println(mp.maxProfit(prices));
    }
}


