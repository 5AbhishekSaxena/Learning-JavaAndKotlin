package in.abhisheksaxena.java.dynamic_programming;

import static in.abhisheksaxena.java.Utils.*;

/**
 * Created by Abhishek Saxena on 13-07-2019.
 */

public class ModifiedKnapsack {

    private static int max(int a, int b) {
        return a > b ? a : b;
    }

    private static int max(int a, int b, int c) {
        if (a == b || a == c)
            return max(b, c);
        else if (b == c)
            return max(a, c);

        if (a > b && a > c)
            return a;
        else if (b > c)
            return b;
        else
            return c;
    }

    private static int getClosestSum(int[] numbers, int sum) {
        int[][] memo = new int[numbers.length][sum + 1];

        for (int i = 0; i < numbers.length; i++) {
            memo[i][0] = 0;
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j <= sum; j++) {
                if (numbers[i] > j)
                    memo[i][j] = i - 1 >= 0 ? memo[i - 1][j] : 0;
                else {
                    if (j % numbers[i] == 0)
                        memo[i][j] = j;
                    else {
                        if (i - 1 >= 0)
                            memo[i][j] = max(memo[i - 1][j], memo[i][j - numbers[i]] + numbers[i], memo[i][j - 1]);
                        else
                            memo[i][j] = max(memo[i][j - numbers[i]] + numbers[i], memo[i][j - 1]);
                    }
                }
            }
        }
        printMemo(memo, numbers, sum);

        return memo[numbers.length - 1][sum];
    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 4};
        int sum = 10;

        println("Sum: " + getClosestSum(numbers, sum));
    }
}
