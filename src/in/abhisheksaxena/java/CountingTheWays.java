package in.abhisheksaxena.java;

/**
 * Created by Abhishek Saxena on 13-07-2019.
 */

import static in.abhisheksaxena.java.Utils.printMemo;
import static in.abhisheksaxena.java.Utils.println;

/**
 * Question:
 * Little Walter likes playing with his toy scales. He has N types of weights. The ith weight type has weight ait. There are infinitely many weights of each type.
 * <p>
 * Recently, Walter defined a function, F(X), denoting the number of different ways to combine several weights so their total weight is equal to X.
 * Ways are considered to be different if there is a type which has a different number of weights used in these two ways.
 * <p>
 * For example, if there are 3 types of weights with corresponding weights 1, 1, and 2, then there are 4 ways to get a total weight of 2:
 * <p>
 * Use 2 weights of type 1.
 * Use 2 weights of type 2.
 * Use 1 weight of type 1 and 1 weight of type 2.
 * Use 1 weight of type 3.
 * Given N, L, R, and a1, a2, a3,...,aN, can you find the value of F(L) + F(L+1)+...+F(R)?
 * <p>
 * Input Format
 * <p>
 * The first line contains a single integer, N, denoting the number of types of weights.
 * The second line contains N space-separated integers describing the values of a1, a2, ..., aN, respectively
 * The third line contains two space-separated integers denoting the respective values of L and R.
 * <p>
 * Constraints
 * 1. 1<= N <= 10
 * 2. 0 < ai <= 10^5
 * 3. a1*a2*...*aN <= 10^5
 * 4. 1 <= L <= R <= 10^17
 * <p>
 * Note: The time limit for C/C++ is 1 second, and for in.abhisheksaxena.Java it's 2 seconds.
 * <p>
 * Output Format
 * <p>
 * Print a single integer denoting the answer to the question. As this value can be very large, your answer must be modulo 10^9 + 7.
 * <p>
 * Sample Input
 * <p>
 * 3
 * 1 2 3
 * 1 6
 * Sample Output
 * <p>
 * 22
 * Explanation
 * F(1) = 1
 * F(2) = 2
 * F(3) = 3
 * F(4) = 4
 * F(5) = 5
 * F(6) = 6
 */

public class CountingTheWays {

    private static long countWays(int[] numbers, int l, int r) {
        int[][] memo = new int[numbers.length][r + 1];
        long total = 0;

        for (int i = 0; i < numbers.length; i++)
            memo[i][0] = 1;

        for (int i = 0; i < numbers.length; i++) {
            total = 0;
            for (int j = 1; j < r + 1; j++) {
                if (numbers[i] > j) {
                    memo[i][j] = i - 1 >= 0 ? memo[i - 1][j] : memo[i][j - numbers[i]];
                }else{
                    memo[i][j] = i-1>=0? memo[i-1][j] + memo[i][j-numbers[i]] : memo[i][j-numbers[i]];
                }
                if (j>=l && j <=r)
                    total += memo[i][j];
            }
        }

        printMemo(memo, numbers, r);

        return total;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int l = 1;
        int r = 6;
        println(countWays(numbers, l, r));
    }
}
