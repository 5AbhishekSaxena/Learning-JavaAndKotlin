package in.abhisheksaxena.java.dynamic_programming.CoinChange;

import java.io.BufferedWriter;

import static in.abhisheksaxena.java.Utils.*;

/**
 * Created by Abhishek Saxena on 13-07-2019.
 */

public class CoinChange_TotalWays {

    private static int getWays(int amount, int[] coins) {
        int[][] memo = new int[coins.length][amount+1];
        //initialize
        for(int i=0;i<coins.length;i++){
            //if()
            memo[i][0] = 1;
        }
        //Populate memo
        for(int i=0;i<coins.length;i++){
            for(int j=1;j<=amount;j++){
                if(coins[i]>j)
                    memo[i][j] = (i-1>=0)? memo[i-1][j]:0;
                else{
                    memo[i][j] = (i-1>=0?memo[i-1][j]:0) + memo[i][j - coins[i]];
                }
                println(String.format("memo[%d][%d]: %d", i, j, memo[i][j]));
            }
        }

        printMemo(memo, coins, amount);

        return memo[coins.length-1][amount];
    }

    public static void main(String[] args) {
        int amount = 15;
        int[] coins = {2, 3, 5, 10};

        println(getWays(amount, coins));
    }
}
