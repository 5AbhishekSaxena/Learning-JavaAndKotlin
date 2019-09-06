package in.abhisheksaxena.java.leetCode.DynamicProgramming;

/**
 * @author Abhishek Saxena
 * @since 31/07/19 11:37 PM
 */

class MaxProfit {
    private int maxProfit(int[] prices) {
        int start = prices[0];
        int tempProfit = 0;
        int profit = 0;

        for(int i=1;i<prices.length;i++){
            if(start>prices[i]){
                start = prices[i];
                tempProfit = 0;
            }else{
                tempProfit = prices[i] - start;
            }
            profit = Math.max(tempProfit, profit);
        }
        return profit;

    }

    public static void main(String[] args) {
        System.out.println(new MaxProfit().maxProfit(new int[]/*{7,1,5,3,6,4}*/{7,6,5,4,3,2,1}));
    }
}
