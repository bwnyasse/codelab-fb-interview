package leetcode.Amazon.easy;

/**
 * BestTimeToBuyAndSellStock
 */
public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {1,4,1,4,3,1 }));
    }

    public static int maxProfitBruteForce(int[] prices) {

        int maxProfit = 0;

        for(int i=0;i<prices.length-1;i++){
            for(int j=1;j<prices.length;j++){
                int profit = prices[j] - prices[i];
                maxProfit = profit > maxProfit ? profit : maxProfit;
            }
        }
        return maxProfit;
    }

    public static int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
}